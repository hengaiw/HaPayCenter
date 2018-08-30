package com.hengaiw.controller.weixin.pay;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.bean.result.WxPayUnifiedOrderResult;
import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.constant.WxPayConstants;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.service.impl.WxPayServiceImpl;
import com.github.binarywang.wxpay.util.SignUtils;
import com.hengaiw.config.WxPayProperties;
import com.hengaiw.config.WxPayUtil;
import com.hengaiw.pay.model.dao.model.HaMerchant;
import com.hengaiw.pay.model.dao.model.HaMerchantProduct;
import com.hengaiw.pay.model.dao.model.HaPayOrder;
import com.hengaiw.pay.service.HaMerchantProductService;
import com.hengaiw.pay.service.HaMerchantService;
import com.hengaiw.pay.service.HaPayOrderService;
import com.hengaiw.pub.constant.HaConstants;
import com.hengaiw.pub.constant.HaReturnCodeEnum;
import com.hengaiw.pub.utils.HaBase64;
import com.hengaiw.pub.utils.HaLog;
import com.hengaiw.pub.utils.HaUtil;


/**
 * 微信支付类接口
 * 
 * @author jianhuizhang
 *
 */
@RestController
@RequestMapping(value = "/weixin/pay")
public class WeixinPayController {
	private final HaLog _log = HaLog.getLog(WeixinPayController.class);
	@Autowired
	private HaPayOrderService payOrderService;
	@Autowired
	public HaMerchantProductService haMerchantProductService;
	@Autowired
	public HaMerchantService haMerchantService;
	@Resource
	private WxPayProperties wxPayProperties;
	/**
	 * 统一下单接口
	 */
	@RequestMapping(value = "unifiedorder")
	public String unifiedorderReq(@RequestParam String jsonParam) {
		_log.info("###### 开始接收微信统一下单的请求 ######");
		String logPrefix = "【微信统一下单】";
		_log.info("{}获取参数:{}", logPrefix, new String(HaBase64.decode(jsonParam)));
		try {
			_log.info("{} >>> 下单参数", jsonParam);
			HaPayOrder payOrder = JSON.parseObject(new String(HaBase64.decode(jsonParam)), HaPayOrder.class);
			HaMerchant merchantInfo = haMerchantService.findByMerchantNo(payOrder.getMerchant_no());
			HaMerchantProduct merchantProduct = haMerchantProductService.selectByPrimaryKey(payOrder.getMerchant_product_id());
			String params = merchantProduct.getMerchant_product_params();
			String tradeType=payOrder.getTrade_type_nickname().split("\\.")[1];
			WxPayConfig wxPayConfig = WxPayUtil.getWxPayConfig(params, tradeType,
					wxPayProperties.getCertRootPath(), wxPayProperties.getNotifyUrl());
			WxPayService wxPayService = new WxPayServiceImpl();
			wxPayService.setConfig(wxPayConfig);
			WxPayUnifiedOrderRequest wxPayUnifiedOrderRequest = buildUnifiedOrderRequest(payOrder, wxPayConfig);
			String payOrderId = payOrder.getPay_order_sn();
			WxPayUnifiedOrderResult wxPayUnifiedOrderResult;
			try {
				wxPayUnifiedOrderResult = wxPayService.unifiedOrder(wxPayUnifiedOrderRequest);
				_log.info("{} >>> 下单成功", logPrefix);
				Map<String, Object> map = HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_SUCCESS, "",
						HaConstants.RETURN_VALUE_SUCCESS, null);
				map.put("pay_order_sn", payOrderId);
				map.put("prepayId", wxPayUnifiedOrderResult.getPrepayId());
				payOrder.setOrder_status(HaConstants.PAY_STATUS_PAYING);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				switch (tradeType) {
				case HaConstants.WxConstant.TRADE_TYPE_NATIVE: {
					map.put("codeUrl", wxPayUnifiedOrderResult.getCodeURL()); // 二维码支付链接
					break;
				}
				case HaConstants.WxConstant.TRADE_TYPE_APP: {
					Map<String, String> payInfo = new HashMap<>();
					String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
					String nonceStr = String.valueOf(System.currentTimeMillis());
					// APP支付绑定的是微信开放平台上的账号，APPID为开放平台上绑定APP后发放的参数
					String appId = wxPayConfig.getAppId();
					Map<String, String> configMap = new HashMap<>();
					// 此map用于参与调起sdk支付的二次签名,格式全小写，timestamp只能是10位,格式固定，切勿修改
					String partnerId = wxPayConfig.getMchId();
					configMap.put("prepayid", wxPayUnifiedOrderResult.getPrepayId());
					configMap.put("partnerid", partnerId);
					String packageValue = "Sign=WXPay";
					configMap.put("package", packageValue);
					configMap.put("timestamp", timestamp);
					configMap.put("noncestr", nonceStr);
					configMap.put("appid", appId);
					// 此map用于客户端与微信服务器交互
					payInfo.put("sign", SignUtils.createSign(configMap, wxPayConfig.getMchKey()));
					payInfo.put("prepayId", wxPayUnifiedOrderResult.getPrepayId());
					payInfo.put("partnerId", partnerId);
					payInfo.put("appId", appId);
					payInfo.put("packageValue", packageValue);
					payInfo.put("timeStamp", timestamp);
					payInfo.put("nonceStr", nonceStr);
					map.put("payParams", payInfo);
					break;
				}
				case HaConstants.WxConstant.TRADE_TYPE_JSPAI: {
					Map<String, String> payInfo = new HashMap<>();
					String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
					String nonceStr = String.valueOf(System.currentTimeMillis());
					payInfo.put("appId", wxPayUnifiedOrderResult.getAppid());
					// 支付签名时间戳，注意微信jssdk中的所有使用timestamp字段均为小写。但最新版的支付后台生成签名使用的timeStamp字段名需大写其中的S字符
					payInfo.put("timeStamp", timestamp);
					payInfo.put("nonceStr", nonceStr);
					payInfo.put("package", "prepay_id=" + wxPayUnifiedOrderResult.getPrepayId());
					payInfo.put("signType", WxPayConstants.SignType.MD5);
					payInfo.put("paySign", SignUtils.createSign(payInfo, wxPayConfig.getMchKey()));
					map.put("payParams", payInfo);
					break;
				}
				case HaConstants.WxConstant.TRADE_TYPE_MWEB: {
					map.put("payUrl", wxPayUnifiedOrderResult.getMwebUrl()); // h5支付链接地址
					break;
				}
				}
				return HaUtil.makeRetData(map, merchantInfo.getMerchant_res_key());
			} catch (WxPayException e) {
				_log.error(e, "下单失败");
				// 出现业务错误
				_log.info("{}下单返回失败", logPrefix);
				_log.info("err_code:{}", e.getErrCode());
				_log.info("err_code_des:{}", e.getErrCodeDes());
				_log.info("{}}预下单返回失败",logPrefix);
				payOrder.setOrder_status(HaConstants.PAY_STATUS_FAILED);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.WEIXIN_PAY_ERR_000001));
			}
		} catch (Exception e) {
			_log.error(e, "系统错误");
			return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
					HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.HA_ERR_000001));
		}
		
	}
	
	/**
	 * 构建微信统一下单请求数据
	 * 
	 * @param payOrder
	 * @param wxPayConfig
	 * @return
	 */
	WxPayUnifiedOrderRequest buildUnifiedOrderRequest(HaPayOrder payOrder, WxPayConfig wxPayConfig) {
		String tradeType = wxPayConfig.getTradeType();
		String payOrderId = payOrder.getPay_order_sn();
		Integer totalFee = payOrder.getOrder_amount().intValue();// 支付金额,单位分
		String deviceInfo = payOrder.getOrder_device();
		String body = payOrder.getOrder_body();
		String detail = null;
		String attach = null;
		String outTradeNo = payOrderId;
		String feeType = "CNY";
		String spBillCreateIP = payOrder.getOrder_clientIp();
		String timeStart = null;
		String timeExpire = null;
		String goodsTag = null;
		String notifyUrl = wxPayConfig.getNotifyUrl();
		String productId = null;
		if (tradeType.equals(HaConstants.WxConstant.TRADE_TYPE_NATIVE))
			productId = JSON.parseObject(payOrder.getOrder_extra()).getString("productId");
		String limitPay = null;
		String openId = null;
		if (tradeType.equals(HaConstants.WxConstant.TRADE_TYPE_JSPAI)) {
			openId = JSON.parseObject(payOrder.getOrder_extra()).getString("openId");
		}
		String sceneInfo = null;
		if (tradeType.equals(HaConstants.WxConstant.TRADE_TYPE_MWEB))
			sceneInfo = JSON.parseObject(payOrder.getOrder_extra()).getString("sceneInfo");
		// 微信统一下单请求对象
		WxPayUnifiedOrderRequest request = new WxPayUnifiedOrderRequest();
		request.setDeviceInfo(deviceInfo);
		request.setBody(body);
		if(!StringUtils.isEmpty(wxPayConfig.getSubMchId())) {
			request.setSubMchId(wxPayConfig.getSubMchId());
		}
		if(!StringUtils.isEmpty(wxPayConfig.getSubAppId())) {
			request.setSubAppId(wxPayConfig.getSubAppId());
     		request.setSubOpenid(openId);
		}else {
			request.setOpenid(openId);
		}
		//request.setOpenid("oZ2FfwvgX8o5KoImIG8h6IVuvxB8");
		request.setDetail(detail);
		request.setAttach(attach);
		request.setOutTradeNo(outTradeNo);
		request.setFeeType(feeType);
		request.setTotalFee(totalFee);
		request.setSpbillCreateIp(spBillCreateIP);
		request.setTimeStart(timeStart);
		request.setTimeExpire(timeExpire);
		request.setGoodsTag(goodsTag);
		request.setNotifyURL(notifyUrl);
		request.setTradeType(tradeType);
		request.setProductId(productId);
		request.setLimitPay(limitPay);
		
		request.setSceneInfo(sceneInfo);
		_log.info("统一下单参数:{}", JSON.toJSONString(request));
		return request;
	}
}
