package com.hengaiw.conrtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hengaiw.pub.constant.HaConstants;
import com.hengaiw.pub.constant.HaReturnCodeEnum;
import com.hengaiw.pub.utils.HaUtil;
import com.hengaiw.serviceclient.AlipayTradeServiceClient;
import com.hengaiw.serviceclient.PayBaseServiceClient;
import com.hengaiw.serviceclient.WeixinPayServiceClient;

@RestController
@RequestMapping(value = "/pay/order")
public class PayOrderContriller extends BaseController{
	@Autowired
	private PayBaseServiceClient payBaseServiceClient;
	@Autowired
	private AlipayTradeServiceClient alipayTradeServiceClient;
	@Autowired
	private WeixinPayServiceClient weixinPayServiceClient;
	/**
	 * 创建订单
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
			_log.info("{}开始添加订单", logPrefix);
			String result=payBaseServiceClient.doOrderCreateReq(po.toJSONString());
			_log.info("{}添加订单返回结果{}", logPrefix,result);
			JSONObject resObj = JSON.parseObject(result);
			if (resObj == null || !HaConstants.RETURN_VALUE_SUCCESS.equals(resObj.getString(HaConstants.RETURN_PARAM_RETURN_CODE))) {
				return result;
			}
			JSONObject order=JSONObject.parseObject(resObj.getString(HaConstants.RETURN_PARAM_RETURN_OBJ));
			_log.info("{}选择对应产品添加订单{}", logPrefix,order.toJSONString());
			String trade_type_nickname=order.getString("trade_type_nickname");
			String payRes="";
			switch (trade_type_nickname) {
				case HaConstants.PAY_CHANNEL_ALIPAY_APP:
					payRes=alipayTradeServiceClient.doAlipayAppPayReq(order.toJSONString());
					_log.info("{}添加支付宝手机支付返回结果{}", logPrefix,payRes);
				break;
				case HaConstants.PAY_CHANNEL_ALIPAY_WAP:
					payRes=alipayTradeServiceClient.doAlipayWapPayReq(order.toJSONString());
					_log.info("{}添加支付宝WAP支付返回结果{}", logPrefix,payRes);
				break;
				case HaConstants.PAY_CHANNEL_ALIPAY_PC:
					payRes=alipayTradeServiceClient.doAlipayPagePayReq(order.toJSONString());
					_log.info("{}添加支付宝PC支付返回结果{}", logPrefix,payRes);
				break;
				case HaConstants.PAY_CHANNEL_ALIPAY_QR:
					payRes=alipayTradeServiceClient.doAlipayTradePrecreateReq(order.toJSONString());
					_log.info("{}添加支付宝二维码返回结果{}", logPrefix,payRes);
				break;
				case HaConstants.PAY_CHANNEL_ALIPAY_FACE:
					payRes=alipayTradeServiceClient.doAlipayTradePayReq(order.toJSONString());
					_log.info("{}当面付返回结果{}", logPrefix,payRes);
				break;
				case HaConstants.PAY_CHANNEL_WX_NATIVE:
					payRes=weixinPayServiceClient.doWeixinPayReq(order.toJSONString());
					_log.info("{}微信二维码返回结果{}", logPrefix,payRes);
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
	
	
}
