package com.hengaiw.test;

import org.junit.Test;

public class TestMain {

	@Test
	public void main() {
		String respUrl="https://www.hengaikj.com/notify/payNotifyRes.htm?merchant_no=844df47735689e50847ba6f89e6b78e8&order_clientIp=192.168.1.34&trade_type_nickname=ALIPAY.QR&order_currency=cny&order_extra=%7B%22extendParams%22%3A%7B%22sysServiceProviderId%22%3A%222088100200300400500%22%7D%2C%22storeId%22%3A%22ha_store_id_001%22%2C%22operatorId%22%3A%22ha_operator_id_001%22%2C%22goodsDetail%22%3A%5B%7B%22price%22%3A100%2C%22num%22%3A1%2C%22name%22%3A%22%E5%95%86%E5%93%81001%22%2C%22id%22%3A%22g001%22%7D%2C%7B%22price%22%3A100%2C%22num%22%3A1%2C%22name%22%3A%22%E5%95%86%E5%93%81002%22%2C%22id%22%3A%22g002%22%7D%5D%7D&merchant_charge=0&order_device=android&sign=846E0C13CE383F1022952F81EF3B2828&pay_order_sn=P0020180717131111915000000&merchant_order_no=M10092200010&order_subject=%E8%83%96%E5%AD%90%E5%B0%8F%E5%8D%96%E7%9A%84%E9%9B%B6%E9%A3%9F&order_amount=1&merchant_rate=50&order_body=%E8%83%96%E5%AD%90%E5%B0%8F%E5%8D%96%E9%83%A8%E7%9A%84%E9%9B%B6%E9%A3%9F&pay_succ_time=1531804316476";
		String[] urlArray = respUrl.split("\\?");
		System.out.println(urlArray[0]);
	}
}
