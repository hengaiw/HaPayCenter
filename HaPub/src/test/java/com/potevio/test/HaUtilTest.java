package com.potevio.test;

import org.junit.Test;

import com.hengaiw.pub.utils.HaDigestUtil;

public class HaUtilTest {

	@Test
	public void main() {
		String pass=HaDigestUtil.md5("admin888", "UTF-8");
		System.out.println(pass);
	}
}
