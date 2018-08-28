package com.hengaiw.config;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
@RefreshScope
@Service
public class AlipayConfig {
	
    private  String openApiDomain;   // 支付宝openapi域名
    private  String pid;             // 商户partner id
    private  String appid;           // 商户应用id

    private  String privateKey;      // RSA私钥，用于对商户请求报文加签
    private  String publicKey;       // RSA公钥，仅用于验证开发者网关
    private  String alipayPublicKey; // 支付宝RSA公钥，用于验签支付宝应答
    private  String signType;     // 签名类型  
    

    @Value("${ali.notify_url}")
    private String notify_url;    //异步通知地址
    private String charset;
    private String format;
    
    /**
     * 初始化支付宝配置
     * @param configParam
     * @return
     */
    public AlipayConfig init(String configParam) {
    		Assert.notNull(configParam, "init alipay config error");
        JSONObject paramObj = JSON.parseObject(configParam);
    		this.setAppid(paramObj.getString("appid"));
    		if (StringUtils.isNotBlank(paramObj.getString("pid"))) {
    			this.setPid(paramObj.getString("pid"));
    		}
    		this.setPrivateKey(paramObj.getString("privateKey"));
    		this.setAlipayPublicKey(paramObj.getString("alipayPublicKey"));
    		if (StringUtils.isNotBlank(paramObj.getString("signType"))) {
    			this.setSignType(paramObj.getString("signType"));
    		}else {
    			this.setSignType("RSA2");
    		}
    		if(StringUtils.isNotBlank(paramObj.getString("charset"))) {
    			this.setCharset(paramObj.getString("charset"));
    		}else {
    			this.setCharset("UTF-8");
    		}
    		if(StringUtils.isNotBlank(paramObj.getString("format"))) {
    			this.setFormat(paramObj.getString("format"));
    		}else {
    			this.setFormat("json");
    		}
    		if (StringUtils.isNotBlank(paramObj.getString("openApiDomain"))) {
    			this.setOpenApiDomain(paramObj.getString("openApiDomain"));
    		}else {
    			this.setOpenApiDomain("https://openapi.alipay.com/gateway.do");
    		}
    		return this;
    }
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getOpenApiDomain() {
		return openApiDomain;
	}
	public void setOpenApiDomain(String openApiDomain) {
		this.openApiDomain = openApiDomain;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getPrivateKey() {
		return privateKey;
	}
	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}
	public String getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	public String getAlipayPublicKey() {
		return alipayPublicKey;
	}
	public void setAlipayPublicKey(String alipayPublicKey) {
		this.alipayPublicKey = alipayPublicKey;
	}
	public String getSignType() {
		return signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}
	public String getNotify_url() {
		return notify_url;
	}
	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}
	public String getCharset() {
		return charset;
	}
	public void setCharset(String charset) {
		this.charset = charset;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	
    
}
