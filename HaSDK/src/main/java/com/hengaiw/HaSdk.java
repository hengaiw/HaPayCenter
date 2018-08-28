package com.hengaiw;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HaSdk {
	public static void main(String[] args) {
		new SpringApplicationBuilder(HaSdk.class).web(true).run(args);
	}
}