package com.example.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yijialuo on 2018/3/16.
 */
//加了Component才能被扫描到
@Component
public class TestTask {
    private static final SimpleDateFormat dataFormat=new SimpleDateFormat("HH:mm:ss");
    //每隔3秒执行
   // @Scheduled(fixedRate = 3000)
    //4-40秒的时候执行  网址http://cron.qqe2.com/  不指定年 6位
//    @Scheduled(cron = "4-40 * * * * ?")
//    public void reportCurrentTime(){
//        System.out.println("现在时间:"+dataFormat.format(new Date()));
//    }
}
