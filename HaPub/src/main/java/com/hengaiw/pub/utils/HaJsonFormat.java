package com.hengaiw.pub.utils;

import com.alibaba.fastjson.JSONObject;

public class HaJsonFormat {
	
	public static String getJsonParam(String[] names, Object[] values) {
		JSONObject jsonParam = new JSONObject();
		for (int i = 0; i < names.length; i++) {
			jsonParam.put(names[i], values[i]);
		}
		return jsonParam.toJSONString();
	}

	public static String getJsonParam(String name, Object value) {
		JSONObject jsonParam = new JSONObject();
		jsonParam.put(name, value);
		return jsonParam.toJSONString();
	}
}
