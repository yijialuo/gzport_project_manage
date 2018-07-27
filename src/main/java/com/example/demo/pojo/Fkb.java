package com.example.demo.pojo;

import javax.persistence.*;

public class Fkb {
    /**
     * 项目id
     */
    private String xmid;

    /**
     * 付款时间
     */
    private String fksj;

    /**
     * 付款类型
     */
    private String fklx;

    /**
     * 付款额
     */
    private String fke;

    /**
     * 付款额百分比
     */
    private String fkebfb;

    /**
     * 剩余额
     */
    private String sye;

    /**
     * 剩余额百分比
     */
    private String syebfb;

    /**
     * 获取项目id
     *
     * @return xmid - 项目id
     */
    public String getXmid() {
        return xmid;
    }

    /**
     * 设置项目id
     *
     * @param xmid 项目id
     */
    public void setXmid(String xmid) {
        this.xmid = xmid;
    }

    /**
     * 获取付款时间
     *
     * @return fksj - 付款时间
     */
    public String getFksj() {
        return fksj;
    }

    /**
     * 设置付款时间
     *
     * @param fksj 付款时间
     */
    public void setFksj(String fksj) {
        this.fksj = fksj;
    }

    /**
     * 获取付款类型
     *
     * @return fklx - 付款类型
     */
    public String getFklx() {
        return fklx;
    }

    /**
     * 设置付款类型
     *
     * @param fklx 付款类型
     */
    public void setFklx(String fklx) {
        this.fklx = fklx;
    }

    /**
     * 获取付款额
     *
     * @return fke - 付款额
     */
    public String getFke() {
        return fke;
    }

    /**
     * 设置付款额
     *
     * @param fke 付款额
     */
    public void setFke(String fke) {
        this.fke = fke;
    }

    /**
     * 获取付款额百分比
     *
     * @return fkebfb - 付款额百分比
     */
    public String getFkebfb() {
        return fkebfb;
    }

    /**
     * 设置付款额百分比
     *
     * @param fkebfb 付款额百分比
     */
    public void setFkebfb(String fkebfb) {
        this.fkebfb = fkebfb;
    }

    /**
     * 获取剩余额
     *
     * @return sye - 剩余额
     */
    public String getSye() {
        return sye;
    }

    /**
     * 设置剩余额
     *
     * @param sye 剩余额
     */
    public void setSye(String sye) {
        this.sye = sye;
    }

    /**
     * 获取剩余额百分比
     *
     * @return syebfb - 剩余额百分比
     */
    public String getSyebfb() {
        return syebfb;
    }

    /**
     * 设置剩余额百分比
     *
     * @param syebfb 剩余额百分比
     */
    public void setSyebfb(String syebfb) {
        this.syebfb = syebfb;
    }
}