package com.hengaiw.pub.constant;

public enum HaReturnCodeEnum {
	HA_SUCCESS("000000","请求成功"),
	HA_ERR_000001("000001", "系统错误，未知错误"), 
	HA_ERR_000002("000002", "参数错误"), 
	HA_ERR_000003("000003", "查询信息不存在"),
	MCH_ERR_000001("000001","未查找到相关商户信息"),
	MCH_ERR_000002("000002","商户状态无效"),
	MCH_ERR_000003("000003","商户密钥无效"),
	MCH_ERR_000004("000004","商户没有符合条件的产品或配额不足"),
	MCH_ERR_000005("000005","商户单笔支付金额超出限制"),
	MCH_ERR_000006("000006","商户配额不足"),
	PRO_ERR_000001("000001","未查找到相关产品信息"),
	ORDER_ERR_000001("000001","未查找到相关订单信息"),
	ALIPAY_TRADE_ERR_000001("000001","支付宝预下单失败!!!"),
	ALIPAY_TRADE_ERROR_000001("000001","商户号不能为空"),
	ALIPAY_TRADE_ERROR_000002("000002","退款请求号不能为空"),
	ALIPAY_TRADE_ERROR_000003("000003","支付宝交易号和商户订单号不能同时为空"),
	ALIPAY_PAY_QR_ERR_000001("000001","支付宝预下单失败!!!"),
	ALIPAY_PAY_QR_ERR_000002("000002","系统异常，预下单状态未知!!!"),
	ALIPAY_PAY_QR_ERR_000003("000003","不支持的交易状态，交易返回异常!!!");
	
	

	private String code;
	private String message;

	HaReturnCodeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
