package com.hengaiw.config;

public class Constants {
	private Constants() {
        // No Constructor.
    }

    public static final String SUCCESS = "10000"; // 成功
    public static final String PAYING  = "10003"; // 用户支付中
    public static final String FAILED  = "40004"; // 失败
    public static final String ERROR   = "20000"; // 系统异常
    public static final int RATEBASE=10000;//基准费率按万分之
}
