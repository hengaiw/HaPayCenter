package com.hengaiw.model.mq;

import org.springframework.jms.core.MessagePostProcessor;
import javax.jms.JMSException;
import javax.jms.Message;
import org.apache.activemq.ScheduledMessage;
import org.apache.commons.lang3.StringUtils;
/**
* MQ延时投递处理器（注：ActiveMQ的配置文件中，要配置schedulerSupport="true"，否则不起作用）
* by: 杨俊明 2016-06-16
*/
public class ScheduleMessagePostProcessor implements MessagePostProcessor {

   private long delay = 0l;

   private String corn = null;

   public ScheduleMessagePostProcessor(long delay) {
       this.delay = delay;
   }

   public ScheduleMessagePostProcessor(String cron) {
       this.corn = cron;
   }

   public Message postProcessMessage(Message message) throws JMSException {
       if (delay > 0) {
           message.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_DELAY, delay);
       }
       if (!StringUtils.isEmpty(corn)) {
           message.setStringProperty(ScheduledMessage.AMQ_SCHEDULED_CRON, corn);
       }
       return message;
   }

}