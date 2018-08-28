package com.hengaiw.pub.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hengaiw.pub.constant.HaConstants;
import com.hengaiw.pub.constant.HaReturnCodeEnum;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description: 工具类
 */
public class HaUtil {

	private static final HaLog _log = HaLog.getLog(HaUtil.class);
	/**
	 * 返回json串
	 * @param names
	 * @param values
	 * @return
	 */
	public static String makeParamJson(String[] names, Object[] values) {
		JSONObject jsonParam = new JSONObject();
        for (int i = 0; i < names.length; i++) {
            jsonParam.put(names[i], values[i]);
        }
        return jsonParam.toJSONString();
	}
	
	public static String makeParamJson(String names, Object values) {
		JSONObject jsonParam = new JSONObject();
		jsonParam.put(names, values);
        return jsonParam.toJSONString();
	}
	
	public static Map<String, Object> makeReturnMap(String returnCode, String returnMsg, String resCode, HaReturnCodeEnum returnCodeEnum) {
		Map<String, Object> retMap = new HashMap<String, Object>();
		if (returnCode != null)
			retMap.put(HaConstants.RETURN_PARAM_RETURN_CODE, returnCode);
		if (returnMsg != null)
			retMap.put(HaConstants.RETURN_PARAM_RETURN_MSG, returnMsg);
		if (resCode != null)
			retMap.put(HaConstants.RESULT_PARAM_RESCODE, resCode);
		if (returnCodeEnum != null) {
			retMap.put(HaConstants.RESULT_PARAM_ERRCODE, returnCodeEnum.getCode());
			retMap.put(HaConstants.RESULT_PARAM_ERRCODEDES, returnCodeEnum.getMessage());
		}
		return retMap;
	}
	
	public static String makeRetData(Map retMap, String resKey) {
		if (retMap.get(HaConstants.RETURN_PARAM_RETURN_CODE).equals(HaConstants.RETURN_VALUE_SUCCESS)) {
			String sign = HaDigestUtil.getSign(retMap, resKey, "payParams");
			retMap.put(HaConstants.RESULT_PARAM_SIGN, sign);
		}
		_log.info("生成响应数据:{}", retMap);
		return JSON.toJSONString(retMap);
	}

	public static String makeRetFail(Map retMap) {
		_log.info("生成响应数据:{}", retMap);
		return JSON.toJSONString(retMap);
	}

	/**
	 * 验证支付中心签名
	 * 
	 * @param params
	 * @return
	 */
	public static boolean verifyPaySign(Map<String, Object> params, String key) {
		String sign = (String) params.get("sign"); // 签名
		params.remove("sign"); // 不参与签名
		String checkSign = HaDigestUtil.getSign(params, key);
		if (!checkSign.equalsIgnoreCase(sign)) {
			return false;
		}
		return true;
	}

	/**
	 * 验证VV平台支付中心签名
	 * 
	 * @param params
	 * @return
	 */
	public static boolean verifyPaySign(Map<String, Object> params, String key, String... noSigns) {
		String sign = (String) params.get("sign"); // 签名
		params.remove("sign"); // 不参与签名
		if (noSigns != null && noSigns.length > 0) {
			for (String noSign : noSigns) {
				params.remove(noSign);
			}
		}
		String checkSign = HaDigestUtil.getSign(params, key);
		if (!checkSign.equalsIgnoreCase(sign)) {
			return false;
		}
		return true;
	}

	public static String genUrlParams(Map<String, Object> paraMap) {
		if (paraMap == null || paraMap.isEmpty())
			return "";
		StringBuffer urlParam = new StringBuffer();
		Set<String> keySet = paraMap.keySet();
		int i = 0;
		for (String key : keySet) {
			urlParam.append(key).append("=").append(paraMap.get(key));
			if (++i == keySet.size())
				break;
			urlParam.append("&");
		}
		return urlParam.toString();
	}

	/**
	 * 发起HTTP/HTTPS请求(method=POST)
	 * 
	 * @param url
	 * @return
	 */
	public static String call4Post(String url) {
		try {
			URL url1 = new URL(url);
			if ("https".equals(url1.getProtocol())) {
				return HttpClient.callHttpsPost(url);
			} else if ("http".equals(url1.getProtocol())) {
				return HttpClient.callHttpPost(url);
			} else {
				return "";
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 发起HTTP/HTTPS请求(method=GET)
	 * 
	 * @param url
	 * @return
	 */
	public static String call4Get(String url) {
		try {
			URL url1 = new URL(url);
			if ("https".equals(url1.getProtocol())) {
				return HttpClient.callHttpsGet(url);
			} else if ("http".equals(url1.getProtocol())) {
				return HttpClient.callHttpGet(url);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return "";
	}
}
