package com.example.demo.controller;

/**
 * Created by yijialuo on 2018/5/15.
 */
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SseController {

    //服务器端SSE支持输出媒体类型为text/event-stream
    @RequestMapping(value="/push",produces="text/event-stream")
    public @ResponseBody String push(){
        Random r=new Random();
        try{
            Thread.sleep(5000); //睡眠5秒
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:Test"+r.nextInt()+"\n\n";
    }

}