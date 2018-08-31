package com.hengaiw.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hengaiw.pub.utils.HttpClient;


public class TestAlipay {

//	@Test
//	public void testAlipayFace() {
//		String createOrderUrl="https://www.hengaikj.com/api/pay/order/create?";
//		JSONObject paramMap = new JSONObject();
//		paramMap.put("merchant_no", "844df47735689e50847ba6f89e6b78e8"); // 商户ID
//		paramMap.put("trade_type_nickname", "ALIPAY.FACE"); // 调用的产品简称
//		paramMap.put("merchant_order_no", "M10092200010"); // 商户订单号
//		paramMap.put("order_amount", 1000); // 支付金额
//		paramMap.put("order_clientIp", "192.168.1.34");//客户IP
//		paramMap.put("order_device", "android");//设备名称
//		paramMap.put("order_subject", "胖子小卖的零食");//商品名称
//		paramMap.put("order_body", "胖子小卖部的零食");//商品注释
//		paramMap.put("notify_url", "https://www.hengaikj.com/notify/payNotifyRes.htm");//异步通知地址
//		//paramMap.put("expire_time", "120m");//订单有效时间
//		Map<String, Object> extraMap = new HashMap<String, Object>();//产品其他扩展参数
//		Map<String, Object> extendParamsMap = new HashMap<String, Object>();//产品其他扩展参数
//		
//		extraMap.put("operatorId", "ha_operator_id_001");
//		extraMap.put("storeId", "ha_store_id_001");
//		extraMap.put("authCode", "286718431944971833");
//		extendParamsMap.put("sysServiceProviderId", "2088100200300400500");
//		extraMap.put("extendParams", extendParamsMap);
//		List goodsList=new ArrayList();  
//		Map<String, Object> goodsMap = new HashMap<String, Object>();//产品其他扩展参数
//		goodsMap.put("id", "g001");
//		goodsMap.put("name", "商品001");
//		goodsMap.put("price", 100);
//		goodsMap.put("num", 1);
//		goodsList.add(goodsMap);
//		Map<String, Object> goodsMap1 = new HashMap<String, Object>();//产品其他扩展参数
//		goodsMap1.put("id", "g002");
//		goodsMap1.put("name", "商品002");
//		goodsMap1.put("price", 100);
//		goodsMap1.put("num", 1);
//		goodsList.add(goodsMap1);
//		extraMap.put("goodsDetail", goodsList);
//		paramMap.put("order_extra", JSON.toJSONString(extraMap));
//		System.out.println(paramMap.toJSONString());
//		String reqData = "params=" + paramMap.toJSONString();
//		String result = HttpClient.callHttpsPost(createOrderUrl + reqData);
//		System.out.println(result);
//	}
	
	
	@Test
	public void testAlipayQr() {
		String createOrderUrl="https://www.hengaikj.com/api/pay/order/create?";
		JSONObject paramMap = new JSONObject();
		paramMap.put("merchant_no", "844df47735689e50847ba6f89e6b78e8"); // 商户ID
		paramMap.put("trade_type_nickname", "WX.MWEB"); // 调用的产品简称
		paramMap.put("merchant_order_no", "M10092200010"); // 商户订单号
		paramMap.put("order_amount", 1000); // 支付金额
		paramMap.put("order_clientIp", "192.168.1.34");//客户IP
		paramMap.put("order_device", "android");//设备名称
		paramMap.put("order_subject", "网络购物");//商品名称
		paramMap.put("order_body", "网络购物");//商品注释
		paramMap.put("notify_url", "https://www.hengaikj.com/notify/payNotifyRes.htm");//异步通知地址
		//paramMap.put("expire_time", "120m");//订单有效时间
		Map<String, Object> extraMap = new HashMap<String, Object>();//产品其他扩展参数
		Map<String, Object> extendParamsMap = new HashMap<String, Object>();//产品其他扩展参数
		
		extraMap.put("productId", "133");
		extraMap.put("storeId", "ha_store_id_001");
		//extraMap.put("authCode", "286718431944971833");
		extendParamsMap.put("sysServiceProviderId", "2088100200300400500");
		extraMap.put("extendParams", extendParamsMap);
		List goodsList=new ArrayList();  
		Map<String, Object> goodsMap = new HashMap<String, Object>();//产品其他扩展参数
		goodsMap.put("id", "g001");
		goodsMap.put("name", "商品001");
		goodsMap.put("price", 100);
		goodsMap.put("num", 1);
		goodsList.add(goodsMap);
		Map<String, Object> goodsMap1 = new HashMap<String, Object>();//产品其他扩展参数
		goodsMap1.put("id", "g002");
		goodsMap1.put("name", "商品002");
		goodsMap1.put("price", 100);
		goodsMap1.put("num", 1);
		goodsList.add(goodsMap1);
		extraMap.put("goodsDetail", goodsList);
		paramMap.put("order_extra", JSON.toJSONString(extraMap));
		System.out.println(paramMap.toJSONString());
		String reqData = "params=" + paramMap.toJSONString();
		String result = HttpClient.callHttpsPost(createOrderUrl + reqData);
		System.out.println(result);
	}
	
	
}
