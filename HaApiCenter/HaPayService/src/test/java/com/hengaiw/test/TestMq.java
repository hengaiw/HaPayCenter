package com.hengaiw.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hengaiw.mq.Mq4PayNotify;

public class TestMq {
	@Autowired
	private Mq4PayNotify mq4PayNotify;
	@Test
	public void main() {
		mq4PayNotify.send("sfsdfsf");
	}

}
