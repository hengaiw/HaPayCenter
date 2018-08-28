package com.hengaiw.serviceclient;

import com.hengaiw.pub.utils.HaBase64;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
/**
 * 处理支付类的服务请求
 * @author jianhuizhang
 *
 */

@Service
public class AlipayTradeServiceClient {

    @Autowired
    RestTemplate restTemplate;
    
    /**
     * 支付宝手机APP支付
     * @param jsonParam
     * @return
     */
    @HystrixCommand(fallbackMethod = "doAlipayAppPayReqFallback")
    public String doAlipayAppPayReq(String jsonParam) {
        return restTemplate.getForEntity("http://HAPAYSERVICE/alipay/trade/appPay?jsonParam=" + HaBase64.encode(jsonParam.getBytes()), String.class).getBody();
    }

    public String doAlipayAppPayReqFallback(String jsonParam) {
        return "请求失败";
    }
    
    /**
     * 支付宝WAP支付
     * @param jsonParam
     * @return
     */
    @HystrixCommand(fallbackMethod = "doAlipayWapPayReqFallback")
    public String doAlipayWapPayReq(String jsonParam) {
        return restTemplate.getForEntity("http://HAPAYSERVICE/alipay/trade/wapPay?jsonParam=" + HaBase64.encode(jsonParam.getBytes()), String.class).getBody();
    }

    public String doAlipayWapPayReqFallback(String jsonParam) {
        return "请求失败";
    }
    
    /**
     * 支付宝PC支付
     * @param jsonParam
     * @return
     */
    @HystrixCommand(fallbackMethod = "doAlipayPagePayReqFallback")
    public String doAlipayPagePayReq(String jsonParam) {
        return restTemplate.getForEntity("http://HAPAYSERVICE/alipay/trade/pagePay?jsonParam=" + HaBase64.encode(jsonParam.getBytes()), String.class).getBody();
    }

    public String doAlipayPagePayReqFallback(String jsonParam) {
        return "请求失败";
    }
    
    /**
     * 支付宝生成二维码下订单
     * @param jsonParam
     * @return
     */
    @HystrixCommand(fallbackMethod = "doAlipayTradePrecreateReqFallback")
    public String doAlipayTradePrecreateReq(String jsonParam) {
        return restTemplate.getForEntity("http://HAPAYSERVICE/alipay/trade/tradePrecreate?jsonParam=" + HaBase64.encode(jsonParam.getBytes()), String.class).getBody();
    }

    public String doAlipayTradePrecreateReqFallback(String jsonParam) {
        return "请求失败";
    }
    
    /**
     * 支付宝当面付
     * @param jsonParam
     * @return
     */
    @HystrixCommand(fallbackMethod = "doAlipayTradePayReqFallback")
    public String doAlipayTradePayReq(String jsonParam) {
        return restTemplate.getForEntity("http://HAPAYSERVICE/alipay/trade/tradePay?jsonParam=" + HaBase64.encode(jsonParam.getBytes()), String.class).getBody();
    }

    public String doAlipayTradePayReqFallback(String jsonParam) {
        return "请求失败";
    }
    
}