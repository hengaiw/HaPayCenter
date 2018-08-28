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
public class PayBaseServiceClient {

    @Autowired
    RestTemplate restTemplate;
    /**
     * 获取商户信息
     * @param jsonParam
     * @return
     */
    @HystrixCommand(fallbackMethod = "doMerchantInfoReqFallback")
    public String doMerchantInfoReq(String jsonParam) {
        return restTemplate.getForEntity("http://HAPAYSERVICE/merchant/info?jsonParam=" + HaBase64.encode(jsonParam.getBytes()), String.class).getBody();
    }

    public String doMerchantInfoReqFallback(String jsonParam) {
        return "请求失败";
    }
    
    /**
     * 下订单
     * @param jsonParam
     * @return
     */
    @HystrixCommand(fallbackMethod = "doOrderCreateReqFallback")
    public String doOrderCreateReq(String jsonParam) {
        return restTemplate.getForEntity("http://HAPAYSERVICE/payorder/create?jsonParam=" + HaBase64.encode(jsonParam.getBytes()), String.class).getBody();
    }

    public String doOrderCreateReqFallback(String jsonParam) {
        return "请求失败";
    }
    
}