package com.hengaiw.controller;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hengaiw.pub.constant.HaConstants;
import com.hengaiw.pub.constant.HaReturnCodeEnum;
import com.hengaiw.pub.utils.HaSerial;
import com.hengaiw.pub.utils.HaUtil;
import com.hengaiw.serviceclient.AlipayTradeServiceClient;
import com.hengaiw.serviceclient.PayBaseServiceClient;
import com.hengaiw.serviceclient.WeixinPayServiceClient;

@RestController
@RequestMapping(value = "/pay/order")
public class PayOrderController extends BaseController {
	@Autowired
	private PayBaseServiceClient payBaseServiceClient;
	@Autowired
	private AlipayTradeServiceClient alipayTradeServiceClient;
	@Autowired
	private WeixinPayServiceClient weixinPayServiceClient;

	/**
	 * 创建订单
	 * 
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "create")
	public String doMerchantInfoReq(@RequestParam String params) {
		_log.info("###### 开始接收商户添加订单请求 ######");
		String logPrefix = "【商户添加订单】";
		ServiceInstance instance = client.getLocalServiceInstance();
		_log.info("{}/pay/order/create, host:{}, service_id:{}, params:{}", logPrefix, instance.getHost(),
				instance.getServiceId(), params);
		try {
			JSONObject po = JSONObject.parseObject(params);
			// 验证参数有效性
			Object object = validateParams(po);
			if (object instanceof String) {
				_log.info("{}参数校验不通过:{}", logPrefix, object);
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, object.toString(),
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.PRO_ERR_000001));
			}
			_log.info("{}开始添加订单", logPrefix);
			String result = payBaseServiceClient.doOrderCreateReq(po.toJSONString());
			_log.info("{}添加订单返回结果{}", logPrefix, result);
			JSONObject resObj = JSON.parseObject(result);
			if (resObj == null || !HaConstants.RETURN_VALUE_SUCCESS
					.equals(resObj.getString(HaConstants.RETURN_PARAM_RETURN_CODE))) {
				return result;
			}
			JSONObject order = JSONObject.parseObject(resObj.getString(HaConstants.RETURN_PARAM_RETURN_OBJ));
			_log.info("{}选择对应产品添加订单{}", logPrefix, order.toJSONString());
			String trade_type_nickname = order.getString("trade_type_nickname");
			String payRes = "";
			switch (trade_type_nickname) {
			case HaConstants.PAY_CHANNEL_ALIPAY_APP:
				payRes = alipayTradeServiceClient.doAlipayAppPayReq(order.toJSONString());
				_log.info("{}添加支付宝手机支付返回结果{}", logPrefix, payRes);
				break;
			case HaConstants.PAY_CHANNEL_ALIPAY_WAP:
				payRes = alipayTradeServiceClient.doAlipayWapPayReq(order.toJSONString());
				_log.info("{}添加支付宝WAP支付返回结果{}", logPrefix, payRes);
				break;
			case HaConstants.PAY_CHANNEL_ALIPAY_PC:
				payRes = alipayTradeServiceClient.doAlipayPagePayReq(order.toJSONString());
				_log.info("{}添加支付宝PC支付返回结果{}", logPrefix, payRes);
				break;
			case HaConstants.PAY_CHANNEL_ALIPAY_QR:
				payRes = alipayTradeServiceClient.doAlipayTradePrecreateReq(order.toJSONString());
				_log.info("{}添加支付宝二维码返回结果{}", logPrefix, payRes);
				break;
			case HaConstants.PAY_CHANNEL_ALIPAY_FACE:
				payRes = alipayTradeServiceClient.doAlipayTradePayReq(order.toJSONString());
				_log.info("{}当面付返回结果{}", logPrefix, payRes);
				break;
			case HaConstants.PAY_CHANNEL_WX_NATIVE:
			case HaConstants.PAY_CHANNEL_WX_MWEB:
			case HaConstants.PAY_CHANNEL_WX_APP:
			case HaConstants.PAY_CHANNEL_WX_JSAPI:
				payRes = weixinPayServiceClient.doWeixinPayReq(order.toJSONString());
				_log.info("{}微信二维码返回结果{}", logPrefix, payRes);
				break;
			default:
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.PRO_ERR_000001));
			}
			return payRes;
		} catch (Exception e) {
			_log.error(e, "");
			return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
					HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.PRO_ERR_000001));
		}
	}
	/**
	 * 验证创建订单请求参数,参数通过返回JSONObject对象,否则返回错误文本信息
	 * 
	 * @param params
	 * @return
	 */
	private Object validateParams(JSONObject params) {
		// 验证请求参数,参数有问题返回错误提示
		String errorMessage;
		// 支付参数
		String merchant_no = params.getString("merchant_no"); // 商户ID
		String merchant_order_no = params.getString("merchant_order_no"); // 商户订单号
		String trade_type_nickname = params.getString("trade_type_nickname"); // 渠道ID
		String order_amount = params.getString("order_amount"); // 支付金额（单位分）
		String order_clientIp = params.getString("order_clientIp"); // 客户端IP
		String order_device = params.getString("order_device"); // 设备
		String order_extra = params.getString("order_extra"); // 特定渠道发起时额外参数
		String notify_url = params.getString("notify_url"); // 支付结果回调URL
		String sign = params.getString("sign"); // 签名
		String order_subject = params.getString("order_subject"); // 商品主题
		String order_body = params.getString("order_body"); // 商品描述信息
		// 验证请求参数有效性（必选项）
		if (StringUtils.isBlank(merchant_no)) {
			errorMessage = "request params[merchant_no] error.";
			return errorMessage;
		}
		if (StringUtils.isBlank(merchant_order_no)) {
			errorMessage = "request params[merchant_order_no] error.";
			return errorMessage;
		}
		if (StringUtils.isBlank(trade_type_nickname)) {
			errorMessage = "request params[trade_type_nickname] error.";
			return errorMessage;
		}
		if (!NumberUtils.isNumber(order_amount)) {
			errorMessage = "request params[order_amount] error.";
			return errorMessage;
		}
		
		if (StringUtils.isBlank(notify_url)) {
			errorMessage = "request params[notify_url] error.";
			return errorMessage;
		}
		if (StringUtils.isBlank(order_subject)) {
			errorMessage = "request params[order_subject] error.";
			return errorMessage;
		}
		if (StringUtils.isBlank(order_body)) {
			errorMessage = "request params[order_body] error.";
			return errorMessage;
		}
		// 根据不同渠道,判断extra参数
		switch (trade_type_nickname) {

		case HaConstants.PAY_CHANNEL_WX_JSAPI:
			if (StringUtils.isEmpty(order_extra)) {
				errorMessage = "request params[order_extra] error.";
				return errorMessage;
			}
			JSONObject extraObject = JSON.parseObject(order_extra);
			String openId = extraObject.getString("openId");
			if (StringUtils.isBlank(openId)) {
				errorMessage = "request params[order_extra.openId] error.";
				return errorMessage;
			}
			break;
		case HaConstants.PAY_CHANNEL_WX_NATIVE:
			if (StringUtils.isEmpty(order_extra)) {
				errorMessage = "request params[order_extra] error.";
				return errorMessage;
			}
			JSONObject native_extraObject = JSON.parseObject(order_extra);
			String productId = native_extraObject.getString("product_id");
			if (StringUtils.isBlank(productId)) {
				errorMessage = "request params[extra.product_id] error.";
				return errorMessage;
			}
			break;
		case HaConstants.PAY_CHANNEL_WX_MWEB:
			if (StringUtils.isEmpty(order_extra)) {
				errorMessage = "request params[order_extra] error.";
				return errorMessage;
			}
			JSONObject h5_extraObject = JSON.parseObject(order_extra);
			String scene_info = h5_extraObject.getString("scene_info");
			if (StringUtils.isBlank(scene_info)) {
				errorMessage = "request params[extra.h5_extraObject] error.";
				return errorMessage;
			}
			if (StringUtils.isEmpty(order_clientIp)) {
				errorMessage = "request params[order_clientIp] error.";
				return errorMessage;
			}
			break;
		}
		// 签名信息
		if (StringUtils.isEmpty(sign)) {
			errorMessage = "request params[sign] error.";
			return errorMessage;
		}
		// 验证商户信息和签名
		Object valResult = validateMchInfoParams(params);
		if (valResult instanceof String) {
			errorMessage = valResult.toString();
			return errorMessage;
		}
		// 验证参数通过,返回JSONObject对象
		JSONObject payOrder = new JSONObject();
		payOrder.put("pay_order_sn", HaSerial.getPay());
		payOrder.put("merchant_no", merchant_no);
		payOrder.put("merchant_order_no", merchant_order_no);
		payOrder.put("trade_type_nickname", trade_type_nickname);
		payOrder.put("order_amount", Long.parseLong(order_amount));
		payOrder.put("order_clientIp", order_clientIp);
		payOrder.put("order_device", order_device);
		payOrder.put("order_subject", order_subject);
		payOrder.put("order_body", order_body);
		payOrder.put("order_extra", order_extra);
		payOrder.put("notify_url", notify_url);
		return payOrder;
	}
}
