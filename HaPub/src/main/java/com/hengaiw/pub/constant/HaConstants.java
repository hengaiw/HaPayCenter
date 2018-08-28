package com.hengaiw.pub.constant;

import java.io.File;

public class HaConstants {
	public static final String RETURN_PARAM_RETURN_CODE = "returnCode";
	public static final String RETURN_PARAM_RETURN_MSG = "returnMsg";
	public static final String RETURN_PARAM_RETURN_OBJ="returnObject";
	public static final String RESULT_PARAM_RESCODE = "resCode";
	public static final String RESULT_PARAM_ERRCODE = "errCode";
	public static final String RESULT_PARAM_ERRCODEDES = "errCodeDes";
	public static final String RESULT_PARAM_SIGN="sign";
	public static final String RETURN_VALUE_SUCCESS = "SUCCESS";
	public static final String RETURN_VALUE_FAIL = "FAIL";
	public static final String RETURN_ALIPAY_VALUE_SUCCESS = "success";
	public static final String RETURN_ALIPAY_VALUE_FAIL = "fail";
	public final static String PAY_CHANNEL_WX_JSAPI = "WX.JSAPI"; // 微信公众号支付
	public final static String PAY_CHANNEL_WX_NATIVE = "WX.NATIVE"; // 微信原生扫码支付
	public final static String PAY_CHANNEL_WX_APP = "WX.APP"; // 微信APP支付
	public final static String PAY_CHANNEL_WX_MWEB = "WX.MWEB"; // 微信H5支付
	public final static String PAY_CHANNEL_IAP = "IAP"; // 苹果应用内支付
	public final static String PAY_CHANNEL_ALIPAY_APP = "ALIPAY.APP"; // 支付宝移动支付
	public final static String PAY_CHANNEL_ALIPAY_PC = "ALIPAY.PC"; // 支付宝PC支付
	public final static String PAY_CHANNEL_ALIPAY_WAP = "ALIPAY.WAP"; // 支付宝WAP支付
	public final static String PAY_CHANNEL_ALIPAY_QR = "ALIPAY.QR"; // 支付宝当面付之生成二维码
	public final static String PAY_CHANNEL_ALIPAY_FACE = "ALIPAY.FACE"; // 支付宝当面付
	public final static String RESP_UTF8 = "UTF-8"; // 通知业务系统使用的编码
	public final static byte PAY_STATUS_EXPIRED = -2; // 订单过期
	public final static byte PAY_STATUS_FAILED = -1; // 支付失败
	public final static byte PAY_STATUS_INIT = 0; // 初始态
	public final static byte PAY_STATUS_PAYING = 1; // 支付中
	public final static byte PAY_STATUS_SUCCESS = 2; // 支付成功
	public final static byte PAY_STATUS_COMPLETE = 3; // 业务完成
	public final static byte PAY_STATUS_REFUND = 4; // 已申请退款
	public final static byte TRANS_STATUS_INIT = 0; // 初始态
	public final static byte TRANS_STATUS_TRANING = 1; // 转账中
	public final static byte TRANS_STATUS_SUCCESS = 2; // 成功
	public final static byte TRANS_STATUS_FAIL = 3; // 失败
	public final static byte TRANS_STATUS_COMPLETE = 4; // 业务完成
	public static class AlipayConstant {
		public final static String CONFIG_PATH = "alipay" + File.separator + "alipay"; // 支付宝移动支付
		public final static String TRADE_STATUS_WAIT = "WAIT_BUYER_PAY"; // 交易创建,等待买家付款
		public final static String TRADE_STATUS_CLOSED = "TRADE_CLOSED"; // 交易关闭
		public final static String TRADE_STATUS_SUCCESS = "TRADE_SUCCESS"; // 交易成功
		public final static String TRADE_STATUS_FINISHED = "TRADE_FINISHED"; // 交易成功且结束
	}
	
}
