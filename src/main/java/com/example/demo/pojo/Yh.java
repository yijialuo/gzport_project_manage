package com.example.demo.pojo;

import javax.persistence.*;

public class Yh {
    /**
     * 用户名称
     */
    @Id
    private String yhmc;

    /**
     * 用户密码
     */
    private String yhmm;

    /**
     * 获取用户名称
     *
     * @return yhmc - 用户名称
     */
    public String getYhmc() {
        return yhmc;
    }

    /**
     * 设置用户名称
     *
     * @param yhmc 用户名称
     */
    public void setYhmc(String yhmc) {
        this.yhmc = yhmc;
    }

    /**
     * 获取用户密码
     *
     * @return yhmm - 用户密码
     */
    public String getYhmm() {
        return yhmm;
    }

    /**
     * 设置用户密码
     *
     * @param yhmm 用户密码
     */
    public void setYhmm(String yhmm) {
        this.yhmm = yhmm;
    }
}