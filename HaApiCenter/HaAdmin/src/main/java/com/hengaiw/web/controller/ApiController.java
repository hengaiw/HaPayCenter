package com.hengaiw.web.controller;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hengaiw.pub.utils.AmountUtil;
import com.hengaiw.pub.utils.HaDigestUtil;
import com.hengaiw.pub.utils.HaLog;
import com.hengaiw.pub.utils.HaUtil;
import com.hengaiw.util.DateUtil;
import com.hengaiw.util.IPUtility;
import com.hengaiw.util.vx.WxApi;
import com.hengaiw.util.vx.WxApiClient;


@Controller
@RequestMapping("/web/api/")
public class ApiController {
	private final static HaLog _log = HaLog.getLog(ApiController.class);
	@Value("${wx.appId}")
	private String appId;
	@Value("${wx.appSecret}")
	private String appSecret;
	@Value("${mch.merchant_no}")
	private String merchant_no;
	@Value("${mch.merchant_req_key}")
	private String merchant_req_key;
	@Value("${mch.merchant_res_key}")
	private String merchant_res_key;
	@Value("${mch.notifyUrl}")
	private String notifyUrl;
	@Value("${pay.createOrderUrl}")
	private String createOrderUrl;
	@Value("${site.baseUrl}")
	private String baseUrl;
	private AtomicLong seq = new AtomicLong(0L);
	private final String QR_PAY_URL = "/web/api/cash.html";
	private final String CASH_PAY_URL = "/web/api/payQrCode.html";
	private final String GetOpenIdURL = "/web/api/getOpenId.html";
	
	@RequestMapping("index.html")
    public String listTpl(ModelMap model) {
		model.put("baseUrl", baseUrl);
        return "web/index";
    }
	
	
	/**
	 * 获取code
	 * 
	 * @return
	 */
	@RequestMapping("/getOpenId.html")
	public void getOpenId(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String logPre = "【微信获取openId】";
		_log.info("====== 开始进行获取openId的请求 ======");
		String redirectUrl = request.getParameter("redirectUrl");
		String code = request.getParameter("code");
		String openId = "";
		if (!StringUtils.isBlank(code)) {// 如果request中包括code，则是微信回调
			try {
				openId = WxApiClient.getOAuthOpenId(appId, appSecret, code);
				_log.info("{}成功获取openId={}", logPre, openId);
			} catch (Exception e) {
				_log.error(e, "调用微信查询openId异常");
			}
			if (!StringUtils.isBlank(openId) && !openId.equals("")) {
				if (redirectUrl.indexOf("?") > 0) {
					redirectUrl += "&openId=" + openId;
				} else {
					redirectUrl += "?openId=" + openId;
				}
			}
			_log.info("====== 结束获取openId的请求 ======");
			response.sendRedirect(redirectUrl);
		} else {// oauth获取code
			// String redirectUrl4Vx =baseUrl+ GetOpenIdURL + "?redirectUrl=" + redirectUrl;
			// String state = OAuth2RequestParamHelper.prepareState(request);
			// String url = WxApi.getOAuthCodeUrl(appId, redirectUrl4Vx, "snsapi_base",
			// state);
			// _log.info("{}获取openId跳转URL={}",logPre, url);
			// response.sendRedirect(url);
			String redirectUrl4Vx = baseUrl + GetOpenIdURL + "?redirectUrl=" + redirectUrl;
			String url = String.format(
					"http://weixin.hengaikj.com/get-weixin-code.html?appid=%s&scope=snsapi_base&state=hello-world&redirect_uri=%s",
					appId, WxApi.urlEnodeUTF8(redirectUrl4Vx));
			_log.info("跳转URL={}", url);
			response.sendRedirect(url);
		}
	}
	
	/**
	 * 扫码支付处理连接
	 * 
	 * @param model
	 * @param request
	 * @param amount
	 * @param goodsId
	 * @return
	 */
	@RequestMapping("/cash.html")
	public String cash(ModelMap model, HttpServletRequest request, Long amount) {
		// 设置流程性的日志前缀
		String logPre = "【微信支付宝收银台扫码测试】";
		_log.info("====== 开始接收二维码扫码支付请求 ======");
		String ua = request.getHeader("User-Agent");// 获取用户的User-Agent，判断用户使用的是微信或是支付宝扫码
		_log.info("{}接收参数:amount={},ua={}", logPre, amount, ua);
		String view = "web/api/cash";
		String client = "alipay";
		String trade_type_nickname = "ALIPAY.WAP";
		if (ua.contains("Alipay")) {// 是否使用支付宝扫描
			_log.info("{}支付宝扫码支付", logPre);
			client = "alipay";
			trade_type_nickname = "ALIPAY.WAP";
		} else if (ua.contains("MicroMessenger")) {// 是否使用微信扫描
			_log.info("{}微信扫码支付", logPre);
			client = "wx";
			trade_type_nickname = "WX.JSAPI";
		} else {// 其他扫描方式
			String errorMessage = "暂时不支持的扫描方式！";
			_log.info("{}扫描出错信息：{}", logPre, errorMessage);
			model.put("result", "failed");
			model.put("resMsg", errorMessage);
			return view;
		}
		// 定义插入订单的对象
		Map params = new HashMap<>();
		
		Map<String, String> orderMap = null;
		params.put("trade_type_nickname", trade_type_nickname);
		// 如果是微信扫码，则需要先获取到用户的openid参数用于后续支付
		if (client.equals("wx")) {
			String openId = request.getParameter("openId");
			if (StringUtils.isBlank(openId)) {// 如果地址中不带openId，则跳转到获取openId的连接地址
				String redirectUrl = baseUrl  + "/web/api/cash.html?amount=" + amount;
				String url = baseUrl + GetOpenIdURL + "?redirectUrl=" + redirectUrl;
				_log.info("{}跳转到获取微信openId的URL={}", logPre, url);
				return "redirect:" + url;
			} else {
				params.put("openId", openId);
			}
		}
		// 支付中心下订单
		orderMap = createPayOrder(params);
		model.put("order_amount", AmountUtil.convertCent2Dollar(amount + ""));
		if (orderMap != null) {
			model.put("orderMap", orderMap);
			String payOrderId = orderMap.get("payOrderId");
			
		}
		model.put("client", client);
		_log.info("====== 结束接收二维码扫码支付请求 ======");
		return view;

	}

//	/**
//	 * 接收支付中心通知
//	 * 
//	 * @param request
//	 * @param response
//	 * @throws Exception
//	 */
//	@RequestMapping("/payNotify")
//	public void payNotify(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		_log.info("====== 开始处理支付中心通知 ======");
//		Map<String, Object> paramMap = request2payResponseMap(request,
//				new String[] { "payOrderId", "mchId", "mchOrderNo", "channelId", "amount", "currency", "status",
//						"clientIp", "device", "subject", "channelOrderNo", "param1", "param2", "paySuccTime",
//						"backType", "sign" });
//		_log.info("支付中心通知请求参数,paramMap={}", paramMap);
//		if (!verifyPayResponse(paramMap)) {
//			String errorMessage = "verify request param failed.";
//			_log.warn(errorMessage);
//			outResult(response, "fail");
//			return;
//		}
//		String payOrderId = (String) paramMap.get("payOrderId");
//		String mchOrderNo = (String) paramMap.get("mchOrderNo");
//		String resStr;
//		try {
//			GoodsOrder goodsOrder = goodsOrderService.getGoodsOrder(mchOrderNo);
//			if (goodsOrder != null && goodsOrder.getStatus() == Constant.GOODS_ORDER_STATUS_COMPLETE) {
//				outResult(response, "success");
//				return;
//			}
//			// 执行业务逻辑
//			int ret = goodsOrderService.updateStatus4Success(mchOrderNo);
//			// ret返回结果
//			// 等于1表示处理成功,返回支付中心success
//			// 其他值,返回支付中心fail,让稍后再通知
//			if (ret == 1) {
//				ret = goodsOrderService.updateStatus4Complete(mchOrderNo);
//				if (ret == 1) {
//					resStr = "success";
//				} else {
//					resStr = "fail";
//				}
//			} else {
//				resStr = "fail";
//			}
//		} catch (Exception e) {
//			resStr = "fail";
//			_log.error(e, "执行业务异常,payOrderId=%s.mchOrderNo=%s", payOrderId, mchOrderNo);
//		}
//		//_log.info("响应支付中心通知结果:{},payOrderId={},mchOrderNo={}", resStr, payOrderId, mchOrderNo);
//		outResult(response, resStr);
//		_log.info("====== 支付中心通知处理完成 ======");
//	}
//	
	/**
	 * 支付中心平台下单
	 * 
	 * @param goodsOrder
	 * @param params
	 * @return
	 */
	Map createPayOrder(Map<String, Object> params) {
		String logPre = "【支付中心下单】";
		_log.info("====== 开始支付中心下单请求 ======");
		JSONObject paramMap = new JSONObject();
		if (StringUtils.isEmpty((String) params.get("mchId"))) {
			paramMap.put("merchant_no", merchant_no); // 商户ID
		} else {
			paramMap.put("merchant_no", (String) params.get("merchant_no")); // 商户ID
		}
		String goodsOrderId = String.format("%s%s%06d", "S", DateUtil.getSeqString(),
				(int) seq.getAndIncrement() % 1000000);
		paramMap.put("merchant_order_no", goodsOrderId); // 商户订单号
		paramMap.put("trade_type_nickname", params.get("trade_type_nickname")); // 支付渠道ID, WX_NATIVE,ALIPAY_WAP
		paramMap.put("order_amount", params.get("order_amount")); // 支付金额,单位分
		
		paramMap.put("order_clientIp", IPUtility.getLocalIP()); // 用户地址,IP或手机号
		paramMap.put("order_device", "WEB"); // 设备
		paramMap.put("order_subject", "测试商品");
		if (StringUtils.isEmpty((String) params.get("body"))) {
			paramMap.put("order_body", "测试商品");
		} else {
			paramMap.put("order_body", (String) params.get("body"));
		}
		paramMap.put("notify_url", notifyUrl); // 回调URL
		
		JSONObject extra = new JSONObject();
		// 根据支付方式添加附加参数
		if (params.get("trade_type_nickname").toString().contains("WX")) {// 如果是微信则添加openid参数
			extra.put("openId", params.get("openId"));
			paramMap.put("order_extra", extra.toJSONString()); // 附加参数
		}
		String reqSign = HaDigestUtil.getSign(paramMap, merchant_req_key);
		paramMap.put("sign", reqSign); // 签名
		String reqData = "params=" + paramMap.toJSONString();
		_log.info("{}支付中心下单参数:params={}", logPre, reqData);
		String result = HaUtil.call4Post(createOrderUrl + reqData);
		_log.info("{}支付中心下单，响应数据:{}", logPre, result);
		Map retMap = JSON.parseObject(result);
		if ("SUCCESS".equals(retMap.get("retCode"))) {
			// 验签
			String checkSign = HaDigestUtil.getSign(retMap, merchant_res_key, "sign", "payParams");
			String retSign = (String) retMap.get("sign");
			if (checkSign.equals(retSign)) {
				_log.info("====== 结束支付中心下单请求,验签成功 ======");
				return retMap;
			} else {
				_log.info("====== 结束支付中心下单请求,验签失败 ======");
				return null;
			}
		} else {
			_log.info("====== 结束支付中心下单请求,下单失败 ======");
			return null;
		}

	}

}
