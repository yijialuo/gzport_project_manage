package com.example.demo.config;


import com.example.demo.Interceptor.MyChannelInterceptorAdapter;
import com.example.demo.Interceptor.MyHandShakeInterceptor;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.messaging.simp.stomp.StompCommand;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.ChannelInterceptorAdapter;
import org.springframework.messaging.support.MessageHeaderAccessor;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

import java.util.Map;

@Configuration
@EnableWebSocketMessageBroker//@EnableWebSocketMessageBroker注解用于开启使用STOMP协议来传输基于代理（MessageBroker）的消息，这时候控制器（controller）开始支持@MessageMapping,就像是使用@requestMapping一样。
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer{

    @Autowired
    private MyHandShakeInterceptor myHandShakeInterceptor;




    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/endpointWisely").setAllowedOrigins("*").withSockJS(); //注册一个Stomp的节点（endpointWisely）,并指定使用SockJS协议。用于客服端SockJs连接 var sockJs=new SockJs("endpointWisely")
        //registry.addEndpoint("/endpointChat").setAllowedOrigins("*").withSockJS();//1注册一个Stomp的节点（endpointChat）,并指定使用SockJS协议,用于客服端SockJs连接 var sockJs=new SockJs("endpointChat")
        registry.addEndpoint("/endpointAnnouncement").setAllowedOrigins("*").addInterceptors(myHandShakeInterceptor).withSockJS();
    }
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");//配置消息代理（MessageBroker）
    }
}