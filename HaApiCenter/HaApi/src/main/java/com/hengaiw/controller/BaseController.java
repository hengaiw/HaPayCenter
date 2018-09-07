package com.hengaiw.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hengaiw.pub.constant.HaConstants;
import com.hengaiw.pub.utils.HaDigestUtil;
import com.hengaiw.pub.utils.HaJsonFormat;
import com.hengaiw.pub.utils.HaLog;
import com.hengaiw.pub.utils.HaUtil;
import com.hengaiw.serviceclient.PayBaseServiceClient;

public class BaseController {
	public final HaLog _log = HaLog.getLog(BaseController.class);
	@Autowired
	public DiscoveryClient client;
	@Autowired
	public PayBaseServiceClient payBaseServiceClient;
	/**
	 * 检查商户信息和验证提交的数据是否正确，正确返回商户信息，否则返回错误信息
	 * 
	 * @param params
	 * @return
	 */
	public Object validateMchInfoParams(JSONObject params) {
		String merchant_no = params.getString("merchant_no");
		String trade_type_nickname=params.getString("trade_type_nickname");
		String errorMessage = "";
		if (StringUtils.isBlank(merchant_no)) {
			errorMessage = "请求参数错误，必须有商户ID";
			return errorMessage;
		}
		// 查询商户信息
		String retStr = payBaseServiceClient.doMerchantInfoReq(HaJsonFormat.getJsonParam(new String[] { "merchant_no", "trade_type_nickname" },
				new Object[] { merchant_no, trade_type_nickname }));
		_log.info("返回结果:{}", retStr);
		JSONObject retObj = JSON.parseObject(retStr);
		JSONObject merchantInfo=null;
		if (HaConstants.RETURN_VALUE_SUCCESS.equals(retObj.getString(HaConstants.RETURN_PARAM_RETURN_CODE))) {
			JSONObject returnObject=retObj.getJSONObject(HaConstants.RETURN_PARAM_RETURN_OBJ);
			merchantInfo = returnObject.getJSONObject("merchantInfo");
			if (merchantInfo == null) {
				errorMessage = "返回商户[merchant_no=" + merchant_no + "]信息为空";
				return errorMessage;
			}
			
		} else {
			errorMessage = "返回商户[merchant_no=" + merchant_no + "]信息错误";
			return errorMessage;
		}

		String merchant_req_key = merchantInfo.getString("merchant_req_key");
		if (StringUtils.isBlank(merchant_req_key)) {
			errorMessage = "商户[merchant_no=" + merchant_no + "] 密钥为空";
			return errorMessage;
		}
		// 验证签名数据
		boolean verifyFlag = HaUtil.verifyPaySign(params, merchant_req_key);
		if (!verifyFlag) {
			errorMessage = "商户[merchant_no=" + merchant_no + "]验签失败";
			return errorMessage;
		}
		return merchantInfo;

	}
}
