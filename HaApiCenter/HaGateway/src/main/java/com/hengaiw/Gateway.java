package com.hengaiw;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class Gateway {
	public static void main(String[] args) {
		new SpringApplicationBuilder(Gateway.class).web(true).run(args);
	}
}
