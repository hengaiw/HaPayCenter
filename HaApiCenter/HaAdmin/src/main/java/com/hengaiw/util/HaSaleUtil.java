package com.hengaiw.util;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * 日期工具类
 * 
 */

public class HaSaleUtil {
	public static String HaMakeSuccessRet(String returnMsg,Object returnData) {
		JSONObject retJson = new JSONObject();
		retJson.put("returnCode", "SUCCESS");
		retJson.put("returnMsg", returnMsg);
		retJson.put("returnData", returnData);
		return retJson.toJSONString();
	}
	
	public static String HaMakeSuccessRet(String returnMsg) {
		JSONObject retJson = new JSONObject();
		retJson.put("returnCode", "SUCCESS");
		retJson.put("returnMsg", returnMsg);
		return retJson.toJSONString();
	}
	
	public static String HaMakeErrorRet(String returnMsg,Object returnData) {
		JSONObject retJson = new JSONObject();
		retJson.put("returnCode", "ERROR");
		retJson.put("returnMsg", returnMsg);
		retJson.put("returnData", returnData);
		return retJson.toJSONString();
	}
	
	public static String HaMakeErrorRet(String returnMsg) {
		JSONObject retJson = new JSONObject();
		retJson.put("returnCode", "ERROR");
		retJson.put("returnMsg", returnMsg);
		return retJson.toJSONString();
	}
	
}

