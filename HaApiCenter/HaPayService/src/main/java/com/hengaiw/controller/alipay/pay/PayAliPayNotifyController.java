package com.hengaiw.controller.alipay.pay;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import com.hengaiw.config.AlipayConfig;
import com.hengaiw.controller.base.PayNotifyBase;
import com.hengaiw.pay.model.dao.model.HaMerchantProduct;
import com.hengaiw.pay.model.dao.model.HaPayNotify;
import com.hengaiw.pay.model.dao.model.HaPayOrder;
import com.hengaiw.pay.model.dao.model.HaProduct;
import com.hengaiw.pay.service.HaMerchantProductService;
import com.hengaiw.pay.service.HaPayNotifyService;
import com.hengaiw.pay.service.HaPayOrderService;
import com.hengaiw.pay.service.HaProductService;
import com.hengaiw.pub.constant.HaConstants;
import com.hengaiw.pub.utils.HaLog;
import com.hengaiw.pub.utils.HaSerial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Description: 接收处理支付宝通知
 * 
 */
@RestController
public class PayAliPayNotifyController extends PayNotifyBase {

	private static final HaLog _log = HaLog.getLog(PayAliPayNotifyController.class);
	@Autowired
	private HaPayOrderService payOrderService;
	@Autowired
	private HaPayNotifyService payNotifyService;
	@Autowired
	private HaMerchantProductService merchantProductService;
	@Autowired
	private AlipayConfig alipayConfig;

	/**
	 * 支付宝移动支付后台通知响应
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	@RequestMapping(value = "/notify/alipay/payNotifyRes.htm")
	public void aliPayNotifyRes(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String result = doAliPayRes(request, response);
		if (result != null) {
			_log.info("alipay notify response: {}", result);
			response.setContentType("text/html");
			PrintWriter pw;
			try {
				pw = response.getWriter();
				pw.print(result);

			} catch (IOException e) {
				_log.error("Pay response write exception.", e);
			}
		}

	}

	public String doAliPayRes(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String logPrefix = "【支付宝支付回调通知】";
		_log.info("====== 开始接收支付宝支付回调通知 ======");
		// 获取支付宝POST过来反馈信息
		Map<String, String> params = new HashMap<String, String>();
		Map requestParams = request.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
			}
			// 乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
			// valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk");
			params.put(name, valueStr);
		}
		_log.info("{}通知请求数据:reqStr={}", logPrefix, params);
		if (params.isEmpty()) {
			_log.error("{}请求参数为空", logPrefix);
			return HaConstants.RETURN_ALIPAY_VALUE_FAIL;
		}

		HaPayNotify notify = new HaPayNotify();
		notify.setNotify_type("ALIPAY");
		notify.setNotify_content(JSON.toJSONString(params));
		payNotifyService.insertSelective(notify);
		Map<String, Object> payContext = new HashMap();
		HaPayOrder payOrder;
		payContext.put("parameters", params);

		if (!verifyAliPayParams(payContext)) {
			return HaConstants.RETURN_ALIPAY_VALUE_FAIL;
		}
		_log.info("{}验证请求数据及签名通过", logPrefix);
		String trade_status = params.get("trade_status"); // 交易状态
		// 支付状态成功或者完成
		if (trade_status.equals(HaConstants.AlipayConstant.TRADE_STATUS_SUCCESS)
				|| trade_status.equals(HaConstants.AlipayConstant.TRADE_STATUS_FINISHED)) {
			int updatePayOrderRows;
			payOrder = (HaPayOrder) payContext.get("payOrder");
			byte payStatus = payOrder.getOrder_status(); // 0：订单生成，1：支付中，-1：支付失败，2：支付成功，3：业务处理完成，-2：订单过期
			if (payStatus != HaConstants.PAY_STATUS_SUCCESS && payStatus != HaConstants.PAY_STATUS_COMPLETE) {
				payOrder.setOrder_status(HaConstants.PAY_STATUS_SUCCESS);
				payOrder.setChannel_orderno(params.get("trade_no"));
				payOrder.setChannel_mchid(params.get("seller_id"));
				payOrder.setPay_succ_time(System.currentTimeMillis());
				updatePayOrderRows = payOrderService.updateByPrimaryKeySelective(payOrder);
//				String appid="2018082161113033";
//				String private_key="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC4s4/7ClY+mfQ8diFwrVAq8/FQdhD3No4Ez1TTovRCjtVFcCgdI0Jvx2WDLcjQHTkSIXPHbZ96ePP/D7N/8/3fjIRpJHxPDqpUKqKbsyZGu0+B81+UTouX06fkuOVH6C8d85umHgfNDe0CnihBzVVFg/GXrreWQr36Qgu5sj4dbm3Tof8q1zNgzmK4NG4uEq1c7TDzhSwtyFgLTnwYCWYu1jaX9j7PvgzxJTRbIMQOKV4hRdPmUENXhwiXBonn0f1IHTkakEGxGFRn2pAmwEtQYtbLgS9Xb6ofxoo0y3cKmwbvp5r/FfvKiqnQjTgQjCYd98ZJzerAp5M5lBin25h5AgMBAAECggEAU+5c7jIbUOU65EK2HXLUbEBgFzUfroce8DabEHULVDd92MkHoX4FUbAlg//JMjElXwTOjQBWqRvPnMcwxWNFqVE8Vl8bEf3TDt40+FXnfdreXWoPs+AhdQPcVoZiwlNTHeQ2hb09xEOgwUDHgGdjaWx0232stV5s4A0lMOQ7b7mY282ZWPJc82CHEBemXTuqUv/vGV7OAWACNQHGiFdwuxxe2fLRfFvj9O3WYrh8ddMpM9qiWER6zpjSID9AJRbwKPq52xcnepAiMZ8gzsXwFtN5VLWKp4i+yZBaoNuTjxLB54sI5MQes+QDCptTTSs9Ivz20hYmd8B5Gsq/y52L0QKBgQDzAQiLiBbN5MDmg/nwoe9qfLHnqEDCILLExWA9Rw7XzoAYHwWuIPGwArSNbKE4nwofBkX/bM5oROLA5iF7SpYhMaKnASe4i+vzIqbqWulTc0YS3G8rmObxSgoqsM3YiFEX8Tuna6056a+UAajEBtU4q8666KH+PApBlt8i83VDFQKBgQDClE7p6/m5fxDXq2ycOlQbpXDUmXvdR7NrkVXtPQyHqqhDd5wzD7LfdunLQzJQ3cP5GUx4kO7e44nS3GwOI3PPOpDuN2rM2bP8O+pLJsEMpHn9EgpTnB7ZkO56YGR+WGxToluvFXwr/zYGFKNLtZ998bVKjUCnI85RW7RYK3Go1QKBgBIhr5uJqfnu6Z3JlyqnSo/tgfDBEyPpAK3B9G5eEPN1SwWBuxDFEIOLkCFFS7pH05+A/lQSsEwDZ8/w2+qxJAaSB4rigS458n8PxNiTs/kwDrh1ji34mLLETYHl81YGxdY9f6/8Ts6Vay5l+Uu3Hs29tA0qMnwfyrweH8Qh2kwJAoGAedzSs5Rz2WYoUTpukkXBqXLrAGuD9OlUCHmEfElw0ILkUSTXMe+SEnxyHjheieDqPNdIWnZC9FtDVUlxb0Vq4Y2HeXpBrDxoif+oVBrYayeTsxiaWRT9CTvI7+Hw7mRIq/SSQUxOcWusFRDV2LPOSN2ZsjBXHpbBP5kUkOfcjmUCgYEAsAKWDiUxBt6/Mv9KuEAq3VzwUqtaG5fFg2ucYha+lPp5OXFwc/Uo8UrTt02xCGRJ17G6luuq9FDqdYh8OtC3E81J8E5tPMvTNWAT81ZITXqHdYDThPIkg4yh4ZfxhK+Oxt7Ve4mOFIcmypPMlYSPfArBszWxYDSPz6/ZmtGCRQY=";
//				String alipay_public_key="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA51RXOgwz+DsBJMgNQrKMTFsgNGuhFl/L6OLs0qt24CXbjq3JT2etCLCRu0TXQ284GfnUkbxpovhTFFWMJiU/EZMXdGqwq5c5O/wI7a/RqKI1WLbqD4tvroXFeC+BP0rQYyfFcitnVXS+HZ/mvBaIPkBI/PdtytNBT5LU2Gtu2ZjBtDbkM/6ujcDfTcELZnjPbxtbP3sYGsgR0gc7qQ3/ai8UrSkVyW7dgWd/mIlNkvjuXeqKokl35k5WA8EYioeCDdhAhWcBg/t/aLOw9+yY9+OwDX+RG2zECeQUfe4OmBA5XZq/C/LO72IU5B67CCkiOT5Sovr1ltaeJI51mxEBrQIDAQAB";
//				// 进行分帐处理
//				AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", appid,
//						private_key, "json", "GBK", alipay_public_key, "RSA2");
//				AlipayFundTransToaccountTransferRequest transRequest = new AlipayFundTransToaccountTransferRequest();
//				transRequest.setBizContent("{" + "\"out_biz_no\":\""+HaSerial.getPay()+"\","
//						+ "\"payee_type\":\"ALIPAY_LOGONID\"," + "\"payee_account\":\"15359688520\","
//						+ "\"amount\":\"0.1\"," + "\"payer_show_name\":\"网络购物\"," + "\"payee_real_name\":\"简银涛\","
//						+ "\"remark\":\"网络购物\"" + "}");
//				AlipayFundTransToaccountTransferResponse transResponse;
//				try {
//					transResponse = alipayClient.execute(transRequest);
//					_log.error("{}转帐返回数据{}", logPrefix, JSON.toJSONString(transResponse),
//							HaConstants.PAY_STATUS_SUCCESS);
//					if (transResponse.isSuccess()) {
//						System.out.println("调用成功");
//					} else {
//						System.out.println("调用失败");
//					}
//				} catch (AlipayApiException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}

				if (updatePayOrderRows != 1) {
					_log.error("{}更新支付状态失败,将payOrderId={},更新payStatus={}失败", logPrefix, payOrder.getPay_order_sn(),
							HaConstants.PAY_STATUS_SUCCESS);
					_log.info("{}响应给支付宝结果：{}", logPrefix, HaConstants.RETURN_ALIPAY_VALUE_FAIL);
					return HaConstants.RETURN_ALIPAY_VALUE_FAIL;
				}
				_log.info("{}更新支付状态成功,将payOrderId={},更新payStatus={}成功", logPrefix, payOrder.getPay_order_sn(),
						HaConstants.PAY_STATUS_SUCCESS);

			}
		} else {
			// 其他状态
			_log.info("{}支付状态trade_status={},不做业务处理", logPrefix, trade_status);
			_log.info("{}响应给支付宝结果：{}", logPrefix, HaConstants.RETURN_ALIPAY_VALUE_SUCCESS);
			return HaConstants.RETURN_ALIPAY_VALUE_SUCCESS;
		}
		doNotify(payOrder);
		_log.info("====== 完成接收支付宝支付回调通知 ======");
		return HaConstants.RETURN_ALIPAY_VALUE_SUCCESS;
	}

	/**
	 * 验证支付宝支付通知参数
	 * 
	 * @return
	 */
	public boolean verifyAliPayParams(Map<String, Object> payContext) {
		Map<String, String> params = (Map<String, String>) payContext.get("parameters");
		String out_trade_no = params.get("out_trade_no"); // 商户订单号
		String total_amount = params.get("total_amount"); // 支付金额
		if (StringUtils.isEmpty(out_trade_no)) {
			_log.error("AliPay Notify parameter out_trade_no is empty. out_trade_no={}", out_trade_no);
			payContext.put("retMsg", "out_trade_no is empty");
			return false;
		}
		if (StringUtils.isEmpty(total_amount)) {
			_log.error("AliPay Notify parameter total_amount is empty. total_fee={}", total_amount);
			payContext.put("retMsg", "total_amount is empty");
			return false;
		}
		String errorMessage;
		// 查询payOrder记录
		String payOrderSn = out_trade_no;
		HaPayOrder payOrder = payOrderService.selectByOrderSn(payOrderSn);
		if (payOrder == null) {
			_log.error("Can't found payOrder form db. payOrderSn={}, ", payOrderSn);
			payContext.put("retMsg", "Can't found payOrder");
			return false;
		}
		// 查询payChannel记录
		int product_id = payOrder.getProduct_id();
		HaMerchantProduct merchantProduct = merchantProductService.selectByMerchantProduct(payOrder.getMerchant_id(),
				product_id);
		if (merchantProduct == null) {
			_log.error("Can't found product form db. product_id={}", product_id);
			payContext.put("retMsg", "Can't found payChannel");
			return false;
		}
		boolean verify_result = false;

		alipayConfig.init(merchantProduct.getMerchant_product_params());
		try {
			verify_result = AlipaySignature.rsaCheckV1(params, alipayConfig.getAlipayPublicKey(), alipayConfig.getCharset(),
					alipayConfig.getSignType());
		} catch (AlipayApiException e) {
			_log.error(e, "AlipaySignature.rsaCheckV1 error");
		}

		// 验证签名
		if (!verify_result) {
			errorMessage = "rsaCheckV1 failed.";
			_log.error("AliPay Notify parameter {}", errorMessage);
			payContext.put("retMsg", errorMessage);
			return false;
		}

		// 核对金额
		long aliPayAmt = new BigDecimal(total_amount).movePointRight(2).longValue();
		long dbPayAmt = payOrder.getOrder_amount().longValue();
		if (dbPayAmt != aliPayAmt) {
			_log.error("db payOrder record payPrice not equals total_amount. total_amount={},payOrderId={}",
					total_amount, payOrderSn);
			payContext.put("retMsg", "");
			return false;
		}
		payContext.put("payOrder", payOrder);
		return true;
	}

}
