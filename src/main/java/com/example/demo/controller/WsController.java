package com.example.demo.controller;

import com.example.demo.pojo.WiselyMessage;
import com.example.demo.pojo.WiselyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * Created by yijialuo on 2018/5/11.
 */
@Controller
public class WsController {
//    @Autowired
//    private SimpMessagingTemplate messagingTemplate;//SimpMessagingTemplate用于向浏览器发送信息

//    @MessageMapping("/chat")
//    public void handleChat(Principal principal, String msg) { // 在spring mvc中，principal包含了登录用户的信息，在这里我们直接用
//        if (principal.getName().equals("dzz")) {//3这里是一段写死的代码，如果登录的用户是dzz,那就将消息发送给zbb，大家根据自己的需求进行修改。通过convertAndSendToUser（）方法进行发送，第一个参数是信息接收的目标，第二个参数是要发送的地址，第三个参数是要发送的信息。
//            messagingTemplate.convertAndSendToUser("zbb",
//                    "/queue/notifications", principal.getName() + "-send:"
//                            + msg);
//        } else {
//            messagingTemplate.convertAndSendToUser("dzz",
//                    "/queue/notifications", principal.getName() + "-send:"
//                            + msg);
//        }
//    }

    @MessageMapping("/publishAnnouncement")//发布公告地址
    @SendTo("/topic/announcement")//注册公告地址
    public String publishAnnouncement(String announcement) throws Exception{
        System.out.println("公告:"+announcement);
        return announcement;//发布公告
    }

    @MessageMapping("/welcome")//@MessageMapping和@RequestMapping功能类似，用于设置URL映射地址，浏览器向服务器发起请求，需要通过该地址。
    @SendTo("/topic/getResponse")//如果服务器接受到了消息，就会对订阅了@SendTo括号中的地址传送消息。
    public WiselyResponse say(WiselyMessage message) throws Exception {
        return new WiselyResponse("Welcome, " + message.getName() + "!");
    }


}
