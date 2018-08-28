package com.hengaiw.conrtroller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import com.alibaba.fastjson.JSONObject;
import com.hengaiw.pub.utils.HaLog;

public class BaseController {
	public final HaLog _log = HaLog.getLog(BaseController.class);
	@Autowired
	public DiscoveryClient client;
	/**
	 * 检查商户信息和验证提交的数据是否正确，正确返回商户信息，否则返回错误信息
	 * 
	 * @param params
	 * @return
	 */
	public Object validateMerchantInfoParams(JSONObject params) {
		String merchant_no = params.getString("merchant_no");
		String errorMessage = "";
		if (StringUtils.isBlank(merchant_no)) {
			errorMessage = "请求参数错误，必须有商户ID";
			return errorMessage;
		}
		// 查询商户信息
		return params;
	}

}
