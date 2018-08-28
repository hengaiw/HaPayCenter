package com.hengaiw.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class OrderQuartzService {
  //  每分钟启动
  @Scheduled(cron = "0 0/5 * * * ?")
  public void orderCheck(){
      System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
  }

}
