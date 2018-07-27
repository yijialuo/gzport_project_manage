package com.example.demo.pojo;

/**
 * Created by yijialuo on 2018/5/11.
 * 服务器向浏览器传送消息，用该类进行传送
 */
public class WiselyResponse {
    private String responseMessage;
    public WiselyResponse(String responseMessage){
        this.responseMessage = responseMessage;
    }
    public String getResponseMessage(){
        return responseMessage;
    }
}
