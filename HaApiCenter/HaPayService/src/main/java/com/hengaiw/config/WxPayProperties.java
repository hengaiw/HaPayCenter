package com.hengaiw.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@RefreshScope
@Service
public class WxPayProperties {

	@Value("${wx.cert.root.path}")
	private String certRootPath;
	@Value("${wx.notify_url}")
	private String notifyUrl;

	private byte[] certData;
	
	public String getCertRootPath() {
		return certRootPath;
	}

	public void setCertRootPath(String certRootPath) {
		this.certRootPath = certRootPath;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public byte[] getCertData() {
		return certData;
	}

	public void setCertData(byte[] certData) {
		this.certData = certData;
	}
}
