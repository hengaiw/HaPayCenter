package com.hengaiw.controller.base;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hengaiw.mq.Mq4PayNotify;
import com.hengaiw.pay.model.dao.model.HaMerchant;
import com.hengaiw.pay.model.dao.model.HaPayOrder;
import com.hengaiw.pay.service.HaMerchantService;
import com.hengaiw.pub.constant.HaConstants;
import com.hengaiw.pub.utils.HaDigestUtil;
import com.hengaiw.pub.utils.HaLog;
import com.hengaiw.pub.utils.HaUtil;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description: 支付通知处理基类

 */
@Component
public class PayNotifyBase {

	private static final HaLog _log = HaLog.getLog(PayNotifyBase.class);
	@Autowired
	private Mq4PayNotify mq4PayNotify;
	@Autowired
	private HaMerchantService merchantService;

	/**
	 * 创建响应URL
	 * @param payOrder
	 * @param backType 1：前台页面；2：后台接口
	 * @return
	 */
	public String createNotifyUrl(HaPayOrder payOrder, String backType) {
		int merchant_id=payOrder.getMerchant_id();
		HaMerchant merchant=merchantService.selectByPrimaryKey(merchant_id);
		String resKey = merchant.getMerchant_res_key();
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("pay_order_sn", payOrder.getPay_order_sn()==null?"":payOrder.getPay_order_sn());          // 支付订单号
		paramMap.put("merchant_no", payOrder.getMerchant_no() == null ? "" : payOrder.getMerchant_no());                      	// 商户ID
		paramMap.put("trade_type_nickname", payOrder.getTrade_type_nickname() == null ? "" : payOrder.getTrade_type_nickname());       	// 商户订单号
		paramMap.put("merchant_rate", payOrder.getMerchant_rate() == null ? "" : payOrder.getMerchant_rate());              // 渠道ID
		paramMap.put("merchant_charge", payOrder.getMerchant_charge() == null ? "" : payOrder.getMerchant_charge());                      	// 支付金额
		paramMap.put("merchant_order_no", payOrder.getMerchant_order_no() == null ? "" : payOrder.getMerchant_order_no());                 // 货币类型
		paramMap.put("order_amount", payOrder.getOrder_amount() == null ? "" : payOrder.getOrder_amount());               		// 支付状态
		paramMap.put("order_currency", payOrder.getOrder_currency()==null ? "" : payOrder.getOrder_currency());   				// 客户端IP
		paramMap.put("order_clientIp", payOrder.getOrder_clientIp()==null ? "" : payOrder.getOrder_clientIp());               			// 设备
		paramMap.put("order_device", payOrder.getOrder_device()==null ? "" : payOrder.getOrder_device());     	   				// 商品标题
		paramMap.put("order_subject", payOrder.getOrder_subject()==null ? "" : payOrder.getOrder_subject()); // 渠道订单号
		paramMap.put("order_body", payOrder.getOrder_body()==null ? "" : payOrder.getOrder_body());               		   	// 扩展参数1
		paramMap.put("order_extra", payOrder.getOrder_extra()==null ? "" : payOrder.getOrder_extra());               		   	// 扩展参数2
		paramMap.put("pay_succ_time", payOrder.getPay_succ_time()==null ? "" : payOrder.getPay_succ_time());			// 支付成功时间
		// 先对原文签名
		String reqSign = HaDigestUtil.getSign(paramMap, resKey);
		paramMap.put("sign", reqSign);   // 签名
		// 签名后再对有中文参数编码
		try {
			paramMap.put("order_device", URLEncoder.encode(payOrder.getOrder_device()==null ? "" : payOrder.getOrder_device(),HaConstants.RESP_UTF8));
			paramMap.put("order_subject", URLEncoder.encode(payOrder.getOrder_subject()==null ? "" :payOrder.getOrder_subject(), HaConstants.RESP_UTF8));
			paramMap.put("order_body", URLEncoder.encode(payOrder.getOrder_body()==null ? "" : payOrder.getOrder_body(), HaConstants.RESP_UTF8));
			paramMap.put("order_extra", URLEncoder.encode(payOrder.getOrder_extra()==null ? "" : payOrder.getOrder_extra(), HaConstants.RESP_UTF8));
		}catch (UnsupportedEncodingException e) {
			_log.error("URL Encode exception.", e);
			return null;
		}
		_log.info("回调参数:{},商品标题:{}", JSON.toJSONString(paramMap),payOrder.getOrder_subject());
		String param = HaUtil.genUrlParams(paramMap);
		StringBuffer sb = new StringBuffer();
		sb.append(payOrder.getNotify_url()).append("?").append(param);
		return sb.toString();
	}


	/**
	 * 处理支付结果后台服务器通知
	 */
	public void doNotify(HaPayOrder payOrder) {
		_log.info(">>>>>> PAY开始回调通知业务系统 <<<<<<");
		// 发起后台通知业务系统
		JSONObject object = createNotifyInfo(payOrder);
		try {
			/**
			 * 此处编写通知给商户的代码，可选方案多种，可以使用消息中间件。也可以直接对商户提交的消息接收地址发送。
			 */
			_log.info("回调参数:{}", object.toJSONString());
			//String result=HaPayUtil.call4Post(payOrder.getNotifyUrl() + "?params=" + createNotify(payOrder));
			mq4PayNotify.send(object.toJSONString());
			//_log.info("回调结果:{}",result);
		} catch (Exception e) {
			_log.error("payOrderId={},sendMessage error.", payOrder != null ? payOrder.getPay_order_sn() : "", e);
		}
		_log.info(">>>>>> PAY回调通知业务系统完成 <<<<<<");
	}

	public JSONObject createNotifyInfo(HaPayOrder payOrder) {
		JSONObject object = new JSONObject();
		object.put("method", "POST");
		object.put("url", createNotifyUrl(payOrder, "2"));
		object.put("pay_order_id", payOrder.getPay_order_id());
		object.put("count", payOrder.getNotify_count());
		object.put("createTime", System.currentTimeMillis());
		return object;
	}

	
}
