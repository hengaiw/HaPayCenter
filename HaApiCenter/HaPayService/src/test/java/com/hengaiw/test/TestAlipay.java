package com.hengaiw.test;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import com.hengaiw.pub.constant.HaConstants;
import com.hengaiw.pub.utils.HaSerial;

public class TestAlipay {

	@Test
	public void main() {
		String appid="2018082161113033";
		String private_key="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC4s4/7ClY+mfQ8diFwrVAq8/FQdhD3No4Ez1TTovRCjtVFcCgdI0Jvx2WDLcjQHTkSIXPHbZ96ePP/D7N/8/3fjIRpJHxPDqpUKqKbsyZGu0+B81+UTouX06fkuOVH6C8d85umHgfNDe0CnihBzVVFg/GXrreWQr36Qgu5sj4dbm3Tof8q1zNgzmK4NG4uEq1c7TDzhSwtyFgLTnwYCWYu1jaX9j7PvgzxJTRbIMQOKV4hRdPmUENXhwiXBonn0f1IHTkakEGxGFRn2pAmwEtQYtbLgS9Xb6ofxoo0y3cKmwbvp5r/FfvKiqnQjTgQjCYd98ZJzerAp5M5lBin25h5AgMBAAECggEAU+5c7jIbUOU65EK2HXLUbEBgFzUfroce8DabEHULVDd92MkHoX4FUbAlg//JMjElXwTOjQBWqRvPnMcwxWNFqVE8Vl8bEf3TDt40+FXnfdreXWoPs+AhdQPcVoZiwlNTHeQ2hb09xEOgwUDHgGdjaWx0232stV5s4A0lMOQ7b7mY282ZWPJc82CHEBemXTuqUv/vGV7OAWACNQHGiFdwuxxe2fLRfFvj9O3WYrh8ddMpM9qiWER6zpjSID9AJRbwKPq52xcnepAiMZ8gzsXwFtN5VLWKp4i+yZBaoNuTjxLB54sI5MQes+QDCptTTSs9Ivz20hYmd8B5Gsq/y52L0QKBgQDzAQiLiBbN5MDmg/nwoe9qfLHnqEDCILLExWA9Rw7XzoAYHwWuIPGwArSNbKE4nwofBkX/bM5oROLA5iF7SpYhMaKnASe4i+vzIqbqWulTc0YS3G8rmObxSgoqsM3YiFEX8Tuna6056a+UAajEBtU4q8666KH+PApBlt8i83VDFQKBgQDClE7p6/m5fxDXq2ycOlQbpXDUmXvdR7NrkVXtPQyHqqhDd5wzD7LfdunLQzJQ3cP5GUx4kO7e44nS3GwOI3PPOpDuN2rM2bP8O+pLJsEMpHn9EgpTnB7ZkO56YGR+WGxToluvFXwr/zYGFKNLtZ998bVKjUCnI85RW7RYK3Go1QKBgBIhr5uJqfnu6Z3JlyqnSo/tgfDBEyPpAK3B9G5eEPN1SwWBuxDFEIOLkCFFS7pH05+A/lQSsEwDZ8/w2+qxJAaSB4rigS458n8PxNiTs/kwDrh1ji34mLLETYHl81YGxdY9f6/8Ts6Vay5l+Uu3Hs29tA0qMnwfyrweH8Qh2kwJAoGAedzSs5Rz2WYoUTpukkXBqXLrAGuD9OlUCHmEfElw0ILkUSTXMe+SEnxyHjheieDqPNdIWnZC9FtDVUlxb0Vq4Y2HeXpBrDxoif+oVBrYayeTsxiaWRT9CTvI7+Hw7mRIq/SSQUxOcWusFRDV2LPOSN2ZsjBXHpbBP5kUkOfcjmUCgYEAsAKWDiUxBt6/Mv9KuEAq3VzwUqtaG5fFg2ucYha+lPp5OXFwc/Uo8UrTt02xCGRJ17G6luuq9FDqdYh8OtC3E81J8E5tPMvTNWAT81ZITXqHdYDThPIkg4yh4ZfxhK+Oxt7Ve4mOFIcmypPMlYSPfArBszWxYDSPz6/ZmtGCRQY=";
		String alipay_public_key="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA51RXOgwz+DsBJMgNQrKMTFsgNGuhFl/L6OLs0qt24CXbjq3JT2etCLCRu0TXQ284GfnUkbxpovhTFFWMJiU/EZMXdGqwq5c5O/wI7a/RqKI1WLbqD4tvroXFeC+BP0rQYyfFcitnVXS+HZ/mvBaIPkBI/PdtytNBT5LU2Gtu2ZjBtDbkM/6ujcDfTcELZnjPbxtbP3sYGsgR0gc7qQ3/ai8UrSkVyW7dgWd/mIlNkvjuXeqKokl35k5WA8EYioeCDdhAhWcBg/t/aLOw9+yY9+OwDX+RG2zECeQUfe4OmBA5XZq/C/LO72IU5B67CCkiOT5Sovr1ltaeJI51mxEBrQIDAQAB";
		// 进行分帐处理
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", appid,
				private_key, "json", "UTF-8", alipay_public_key, "RSA2");
		AlipayFundTransToaccountTransferRequest transRequest = new AlipayFundTransToaccountTransferRequest();
		transRequest.setBizContent("{" + "\"out_biz_no\":\""+HaSerial.getPay()+"\","
				+ "\"payee_type\":\"ALIPAY_LOGONID\"," + "\"payee_account\":\"feiyinshenlan@hotmail.com\","
				+ "\"amount\":\"0.1\"," + "\"payer_show_name\":\"恒爱测试转帐\"," + "\"payee_real_name\":\"张建辉\","
				+ "\"remark\":\"转账备注\"" + "}");
		AlipayFundTransToaccountTransferResponse transResponse;
		try {
			transResponse = alipayClient.execute(transRequest);
			System.out.println(JSON.toJSONString(transResponse));
			if (transResponse.isSuccess()) {
				System.out.println("调用成功");
			} else {
				System.out.println("调用失败");
			}
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
