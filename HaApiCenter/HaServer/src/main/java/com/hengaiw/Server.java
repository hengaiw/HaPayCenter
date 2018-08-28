package com.hengaiw;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Server {
	public static void main(String[] args) {
		new SpringApplicationBuilder(Server.class).web(true).run(args);
	}

}
