package com.hengaiw.pub.utils;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description: 生成全局唯一序列号工具类
 */
public class HaSerial {

	private static AtomicLong pay_seq = new AtomicLong(0L);
	private static String pay_seq_prefix = "P";
	private static AtomicLong trans_seq = new AtomicLong(0L);
	private static String trans_seq_prefix = "T";
	private static AtomicLong refund_seq = new AtomicLong(0L);
	private static String refund_seq_prefix = "R";
	private static AtomicLong entpay_seq = new AtomicLong(0L);
	private static String entpay_seq_prefix = "E";
	private static String node = "00";
	

	public static String getPay() {
		return getSeq(pay_seq_prefix, pay_seq);
	}

	public static String getTrans() {
		return getSeq(trans_seq_prefix, trans_seq);
	}

	public static String getRefund() {
		return getSeq(refund_seq_prefix, refund_seq);
	}
	
	public static String getEntpay() {
		return getSeq(entpay_seq_prefix, entpay_seq);
	}
	
	private static String getSeq(String prefix, AtomicLong seq) {
//		StringBuffer sb = new StringBuffer();
//        seq.compareAndSet(MAX, 0);
//        numberFormat.format(seq.incrementAndGet(), sb, HELPER_POSITION);
//        return sb.toString();
		prefix += node;
		return String.format("%s%s%06d", prefix, DateUtils.getCurrentTimeStrDefault(), (int) seq.getAndIncrement() % 1000000);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println("pay=" + getPay());
			System.out.println("trans=" + getTrans());
		}

	}

}