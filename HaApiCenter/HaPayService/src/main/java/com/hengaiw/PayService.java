package com.hengaiw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
@SpringBootApplication(scanBasePackages = "com.hengaiw")
@PropertySource({    
    "file:./config/db.properties",//数据库配置
    "file:./config/pay.properties",//支付配置
    "file:./config/mq.yml",//支付配置
}) 
@MapperScan(value = "com.hengaiw.pay.model.dao.mapper")
@EnableScheduling
public class PayService {
	public static void main(String[] args) {
		new SpringApplicationBuilder(PayService.class).web(true).run(args);
	}
}
