package com.hengaiw.config;

import java.io.File;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.binarywang.wxpay.config.WxPayConfig;

public class WxPayUtil {

    /**
     * 获取微信支付配置
     * @param configParam
     * @param tradeType
     * @param certRootPath
     * @param notifyUrl
     * @return
     */
    public static WxPayConfig getWxPayConfig(String configParam, String tradeType, String certRootPath, String notifyUrl) {
        WxPayConfig wxPayConfig = new WxPayConfig();
        JSONObject paramObj = JSON.parseObject(configParam);
        if(!StringUtils.isEmpty(paramObj.getString("sub_mch_id"))) {
        		wxPayConfig.setSubMchId(paramObj.getString("sub_mch_id"));
        }
        if(!StringUtils.isEmpty(paramObj.getString("sub_appid"))) {
	    		wxPayConfig.setSubAppId(paramObj.getString("sub_appid"));
	    }
        wxPayConfig.setMchId(paramObj.getString("mchId"));
        wxPayConfig.setAppId(paramObj.getString("appid"));
        wxPayConfig.setKeyPath(certRootPath + File.separator + paramObj.getString("certLocalPath"));
        wxPayConfig.setMchKey(paramObj.getString("key"));
        wxPayConfig.setNotifyUrl(notifyUrl);
        wxPayConfig.setTradeType(tradeType);
        return wxPayConfig;
    }

    /**
     * 获取微信支付配置
     * @param configParam
     * @return
     */
    public static WxPayConfig getWxPayConfig(String configParam) {
        WxPayConfig wxPayConfig = new WxPayConfig();
        JSONObject paramObj = JSON.parseObject(configParam);
        if(!StringUtils.isEmpty(paramObj.getString("sub_mch_id"))) {
	    		wxPayConfig.setSubMchId(paramObj.getString("sub_mch_id"));
	    }
	    if(!StringUtils.isEmpty(paramObj.getString("sub_appid"))) {
	    		wxPayConfig.setSubAppId(paramObj.getString("sub_appid"));
	    }
        wxPayConfig.setMchId(paramObj.getString("mchId"));
        wxPayConfig.setAppId(paramObj.getString("appid"));
        wxPayConfig.setMchKey(paramObj.getString("key"));
        return wxPayConfig;
    }

}