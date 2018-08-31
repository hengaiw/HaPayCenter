package com.hengaiw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

//@EnableDiscoveryClient
@SpringBootApplication
@PropertySource({ 
		"file:./config/freemarker.properties",// 数据库配置
		"file:./config/mchInfo.properties",// 数据库配置
		"file:./config/admin_db.properties"// 数据库配置
})
@MapperScan(value = "com.hengaiw.pay.model.dao.mapper")
public class Admin extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(Admin.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		application.listeners();
		return application.sources(applicationClass);
	}

	private static Class<Admin> applicationClass = Admin.class;
}
