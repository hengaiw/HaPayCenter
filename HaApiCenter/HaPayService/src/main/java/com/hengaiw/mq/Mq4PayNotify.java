package com.hengaiw.mq;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hengaiw.pay.model.dao.model.HaMerchantNotify;
import com.hengaiw.pay.model.dao.model.HaPayOrder;
import com.hengaiw.pay.service.HaMerchantNotifyService;
import com.hengaiw.pay.service.HaPayOrderService;
import com.hengaiw.pub.constant.HaConstants;
import com.hengaiw.pub.utils.HaLog;
import com.hengaiw.pub.utils.HaUtil;

import org.apache.activemq.ScheduledMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.jms.*;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: 业务通知MQ实现
 */
@Component
public class Mq4PayNotify {

	@Autowired
	private Queue payNotifyQueue;

	@Autowired
	private HaPayOrderService payOrderService;
	@Autowired
	private HaMerchantNotifyService haMerchantNotifyService;
	@Autowired
	private JmsTemplate jmsTemplate;

	private static final HaLog _log = HaLog.getLog(Mq4PayNotify.class);

	public void send(String msg) {
		_log.info("发送MQ消息:msg={}", msg);
		this.jmsTemplate.convertAndSend(this.payNotifyQueue, msg);
	}

	/**
	 * 发送延迟消息
	 * 
	 * @param msg
	 * @param delay
	 */
	public void send(String msg, long delay) {
		_log.info("发送MQ延时消息:msg={},delay={}", msg, delay);
		jmsTemplate.send(this.payNotifyQueue, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				TextMessage tm = session.createTextMessage(msg);
				tm.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_DELAY, delay);
				tm.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_PERIOD, 1 * 1000);
				tm.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_REPEAT, 1);
				return tm;
			}
		});
	}

	@JmsListener(destination = MqConfig.PAY_NOTIFY_QUEUE_NAME)
	public void receive(String msg) {
		_log.info("do notify task, msg={}", msg);
		JSONObject msgObj = JSON.parseObject(msg);
		String respUrl = msgObj.getString("url");
		long pay_order_id = msgObj.getLong("pay_order_id");
		int count = msgObj.getInteger("count");
		if (StringUtils.isEmpty(respUrl)) {
			_log.warn("notify url is empty. respUrl={}", respUrl);
			return;
		}
		try {
			_log.info("==>MQ通知业务系统开始[pay_order_id：{}][count：{}][time：{}]", pay_order_id, count,
					new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			String notifyRes = HaUtil.call4Post(respUrl);
			_log.info("<==MQ通知业务系统结束[pay_order_id：{}][count：{}][time：{}]", pay_order_id, count,
					new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			// 验证结果
			_log.info("notify response , pay_order_id={},response={}", pay_order_id, notifyRes);
			// 添加到发送记录表中
			String[] urlArray = respUrl.split("\\?");
			HaMerchantNotify merchantNotify = new HaMerchantNotify();
			merchantNotify.setNotify_url(urlArray[0]);
			merchantNotify.setNotify_content(msg);
			merchantNotify.setNotify_result(notifyRes.toString());
			haMerchantNotifyService.insertSelective(merchantNotify);

			if (notifyRes.toString().trim().equalsIgnoreCase("success")) {
				// 修改订单表
				try {
					HaPayOrder updateOrder = new HaPayOrder();
					updateOrder.setPay_order_id(pay_order_id);
					updateOrder.setOrder_status(HaConstants.PAY_STATUS_COMPLETE);
					updateOrder.setNotify_count((byte) (count + 1));
					updateOrder.setLast_notify_time(System.currentTimeMillis());
					int result = payOrderService.updateByPrimaryKeySelective(updateOrder); // payOrderService.updateStatus4Complete(orderId);
					_log.info("修改pay_order_id={},订单状态为处理完成->{}", pay_order_id, result == 1 ? "成功" : "失败");
				} catch (Exception e) {
					_log.error(e, "修改订单状态为处理完成异常");
				}
				// 此处写微信商家通知的逻辑

				return; // 通知成功结束
			} else {
				// 通知失败，延时再通知
				int cnt = count + 1;
				_log.info("notify count={}", cnt);
				// 修改通知次数
				try {
					HaPayOrder updateOrder = new HaPayOrder();
					updateOrder.setPay_order_id(pay_order_id);
					updateOrder.setNotify_count((byte) (cnt));
					updateOrder.setLast_notify_time(System.currentTimeMillis());
					int result = payOrderService.updateByPrimaryKeySelective(updateOrder);
					_log.info("修改pay_order_id={},通知业务系统次数->{}", pay_order_id, cnt);
				} catch (Exception e) {
					_log.error(e, "修改通知次数异常");
				}

				if (cnt > 5) {
					_log.info("notify count>5 stop. url={}", respUrl);
					return;
				}
				msgObj.put("count", cnt);
				this.send(msgObj.toJSONString(), cnt * 60 * 1000);
			}
			_log.warn("notify failed. url:{}, response body:{}", respUrl, notifyRes.toString());
		} catch (Exception e) {
			_log.info("<==MQ通知业务系统结束[orderId：{}][count：{}][time：{}]", pay_order_id, count,
					new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			_log.error(e, "notify exception. url:%s", respUrl);
		}

	}
}
