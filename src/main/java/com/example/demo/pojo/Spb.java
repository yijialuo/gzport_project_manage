package com.example.demo.pojo;

import javax.persistence.*;

public class Spb {
    /**
     * 审批表id
     */
    @Id
    private String spbid;

    /**
     * 项目id
     */
    private String xmid;

    /**
     * 申请表名称
     */
    private String spbmc;

    /**
     * 审批表url
     */
    private String spburl;

    /**
     * 状态
     */
    private String zt;

    /**
     * 获取审批表id
     *
     * @return spbid - 审批表id
     */
    public String getSpbid() {
        return spbid;
    }

    /**
     * 设置审批表id
     *
     * @param spbid 审批表id
     */
    public void setSpbid(String spbid) {
        this.spbid = spbid;
    }

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
     * 获取申请表名称
     *
     * @return spbmc - 申请表名称
     */
    public String getSpbmc() {
        return spbmc;
    }

    /**
     * 设置申请表名称
     *
     * @param spbmc 申请表名称
     */
    public void setSpbmc(String spbmc) {
        this.spbmc = spbmc;
    }

    /**
     * 获取审批表url
     *
     * @return spburl - 审批表url
     */
    public String getSpburl() {
        return spburl;
    }

    /**
     * 设置审批表url
     *
     * @param spburl 审批表url
     */
    public void setSpburl(String spburl) {
        this.spburl = spburl;
    }

    /**
     * 获取状态
     *
     * @return zt - 状态
     */
    public String getZt() {
        return zt;
    }

    /**
     * 设置状态
     *
     * @param zt 状态
     */
    public void setZt(String zt) {
        this.zt = zt;
    }
}