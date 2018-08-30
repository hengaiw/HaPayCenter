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
public class WeixinPayServiceClient {

    @Autowired
    RestTemplate restTemplate;
    
    /**
     * 微信统一下单接口
     * @param jsonParam
     * @return
     */
    @HystrixCommand(fallbackMethod = "doWeixinPayReqFallback")
    public String doWeixinPayReq(String jsonParam) {
        return restTemplate.getForEntity("http://HAPAYSERVICE/weixin/pay/unifiedorder?jsonParam=" + HaBase64.encode(jsonParam.getBytes()), String.class).getBody();
    }

    public String doWeixinPayReqFallback(String jsonParam) {
        return "请求失败";
    }
    
    
    
   
    
}