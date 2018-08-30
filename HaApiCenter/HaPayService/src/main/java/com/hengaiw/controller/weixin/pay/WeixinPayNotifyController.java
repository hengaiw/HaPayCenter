package com.hengaiw.controller.weixin.pay;

import com.github.binarywang.wxpay.bean.notify.WxPayNotifyResponse;
import com.github.binarywang.wxpay.bean.notify.WxPayOrderNotifyResult;
import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.service.impl.WxPayServiceImpl;
import com.hengaiw.config.WxPayProperties;
import com.hengaiw.config.WxPayUtil;
import com.hengaiw.controller.base.PayNotifyBase;
import com.hengaiw.pay.model.dao.model.HaMerchantProduct;
import com.hengaiw.pay.model.dao.model.HaPayOrder;
import com.hengaiw.pay.service.HaMerchantProductService;
import com.hengaiw.pay.service.HaPayOrderService;
import com.hengaiw.pub.constant.HaConstants;
import com.hengaiw.pub.utils.HaLog;
import com.hengaiw.pub.utils.HaUtil;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 接收处理微信通知
 */
@RestController
public class WeixinPayNotifyController extends PayNotifyBase {

	private static final HaLog _log = HaLog.getLog(WeixinPayNotifyController.class);

	@Autowired
	private HaPayOrderService payOrderService;
	@Autowired
	private HaMerchantProductService merchantProductService;
	@Resource
	private WxPayProperties wxPayProperties;
	/**
	 * 微信支付(统一下单接口)后台通知响应
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
     */
	@RequestMapping("/notify/wx/payNotifyRes.htm")
	@ResponseBody
	public String wxPayNotifyRes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return doWxPayRes(request, response);
	}

	public String doWxPayRes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String logPrefix = "【微信支付回调通知】";
		_log.info("====== 开始接收微信支付回调通知 ======");
		try {
			String xmlResult = IOUtils.toString(request.getInputStream(), request.getCharacterEncoding());
			WxPayService wxPayService = new WxPayServiceImpl();
			WxPayOrderNotifyResult result = WxPayOrderNotifyResult.fromXML(xmlResult);
			Map<String, Object> payContext = new HashMap();
			payContext.put("parameters", result);
			// 验证业务数据是否正确,验证通过后返回PayOrder和WxPayConfig对象
			if(!verifyWxPayParams(payContext)) {
				return WxPayNotifyResponse.fail((String) payContext.get("retMsg"));
			}
			HaPayOrder payOrder = (HaPayOrder) payContext.get("payOrder");
			WxPayConfig wxPayConfig = (WxPayConfig) payContext.get("wxPayConfig");
			wxPayService.setConfig(wxPayConfig);
			// 这里做了签名校验(这里又做了一次xml转换对象,可以考虑优化)
			wxPayService.parseOrderNotifyResult(xmlResult);
			// 处理订单
			byte payStatus = payOrder.getOrder_status(); // 0：订单生成，1：支付中，-1：支付失败，2：支付成功，3：业务处理完成，-2：订单过期
			if (payStatus != HaConstants.PAY_STATUS_SUCCESS && payStatus != HaConstants.PAY_STATUS_COMPLETE) {
				payOrder.setOrder_status(HaConstants.PAY_STATUS_SUCCESS);
				int updatePayOrderRows = payOrderService.updateByPrimaryKeySelective(payOrder);
				if (updatePayOrderRows != 1) {
					_log.error("{}更新支付状态失败,将payOrderId={},更新payStatus={}失败", logPrefix, payOrder.getPay_order_sn(), HaConstants.PAY_STATUS_SUCCESS);
					return WxPayNotifyResponse.fail("处理订单失败");
				}
				_log.error("{}更新支付状态成功,将payOrderId={},更新payStatus={}成功", logPrefix, payOrder.getPay_order_sn(), HaConstants.PAY_STATUS_SUCCESS);
				//payOrder.setOrder_status(HaConstants.PAY_STATUS_SUCCESS);
			}
			// 业务系统后端通知
			doNotify(payOrder);
			_log.info("====== 完成接收微信支付回调通知 ======");
			return WxPayNotifyResponse.success("处理成功");
		} catch (WxPayException e) {
			//出现业务错误
			_log.error(e, "微信回调结果异常,异常原因");
			_log.info("{}请求数据result_code=FAIL", logPrefix);
			_log.info("err_code:", e.getErrCode());
			_log.info("err_code_des:", e.getErrCodeDes());
			return WxPayNotifyResponse.fail(e.getMessage());
		} catch (Exception e) {
			_log.error(e, "微信回调结果异常,异常原因");
			return WxPayNotifyResponse.fail(e.getMessage());
		}
	}
	
	/**
	 * 验证微信支付通知参数
	 * @return
	 */
	public boolean verifyWxPayParams(Map<String, Object> payContext) {
		WxPayOrderNotifyResult params = (WxPayOrderNotifyResult)payContext.get("parameters");

		//校验结果是否成功
		if (!HaConstants.RETURN_VALUE_SUCCESS.equalsIgnoreCase(params.getResultCode())
				|| !HaConstants.RETURN_VALUE_SUCCESS.equalsIgnoreCase(params.getResultCode())) {
			_log.error("returnCode={},resultCode={},errCode={},errCodeDes={}", params.getReturnCode(), params.getResultCode(), params.getErrCode(), params.getErrCodeDes());
			payContext.put("retMsg", "notify data failed");
			return false;
		}

		Integer total_fee = params.getTotalFee();   			// 总金额
		String out_trade_no = params.getOutTradeNo();			// 商户系统订单号

		// 查询payOrder记录
		String pay_order_sn = out_trade_no;
		HaPayOrder payOrder = payOrderService.selectByOrderSn(pay_order_sn);
		if (payOrder==null) {
			_log.error("Can't found payOrder form db. payOrderId={}, ", pay_order_sn);
			payContext.put("retMsg", "Can't found payOrder");
			return false;
		}

		// 查询payChannel记录
		String merchant_no = payOrder.getMerchant_no();
		int merchant_product_id = payOrder.getMerchant_product_id();
		HaMerchantProduct merchantProduct = merchantProductService.selectByPrimaryKey(merchant_product_id);
		if(merchantProduct == null) {
			_log.error("Can't found merchantProduct form db. merchant_product_id={}  ", merchant_product_id);
			payContext.put("retMsg", "Can't found merchantProduct");
			return false;
		}
		String tradeType=payOrder.getTrade_type_nickname().split("\\.")[1];
		WxPayConfig wxPayConfig = WxPayUtil.getWxPayConfig(merchantProduct.getMerchant_product_params(), tradeType,
				wxPayProperties.getCertRootPath(), wxPayProperties.getNotifyUrl());
		payContext.put("wxPayConfig", wxPayConfig);

		// 核对金额
		long wxPayAmt = new BigDecimal(total_fee).longValue();
		long dbPayAmt = payOrder.getOrder_amount().longValue();
		if (dbPayAmt != wxPayAmt) {
			_log.error("db payOrder record payPrice not equals total_fee. total_fee={},payOrderId={}", total_fee, pay_order_sn);
			payContext.put("retMsg", "total_fee is not the same");
			return false;
		}

		payContext.put("payOrder", payOrder);
		return true;
	}

}
