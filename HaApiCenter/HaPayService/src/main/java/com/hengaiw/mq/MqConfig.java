package com.hengaiw.mq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * @Description:
 
 */
@Configuration
public class MqConfig {
	
    public static final String PAY_NOTIFY_QUEUE_NAME = "pay.alipay.notify.queue";

    @Bean
    public Queue payNotifyQueue() {
        return new ActiveMQQueue(PAY_NOTIFY_QUEUE_NAME);
    }

}
