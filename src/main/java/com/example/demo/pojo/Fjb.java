package com.example.demo.pojo;

import javax.persistence.*;

public class Fjb {
    /**
     * 附件id
     */
    @Id
    private String fjid;

    /**
     * 项目id
     */
    private String xmid;

    /**
     * 附件名称
     */
    private String fjmc;

    /**
     * 附件url
     */
    private String fjurl;

    /**
     * 状态
     */
    private String zt;

    /**
     * 获取附件id
     *
     * @return fjid - 附件id
     */
    public String getFjid() {
        return fjid;
    }

    /**
     * 设置附件id
     *
     * @param fjid 附件id
     */
    public void setFjid(String fjid) {
        this.fjid = fjid;
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
     * 获取附件名称
     *
     * @return fjmc - 附件名称
     */
    public String getFjmc() {
        return fjmc;
    }

    /**
     * 设置附件名称
     *
     * @param fjmc 附件名称
     */
    public void setFjmc(String fjmc) {
        this.fjmc = fjmc;
    }

    /**
     * 获取附件url
     *
     * @return fjurl - 附件url
     */
    public String getFjurl() {
        return fjurl;
    }

    /**
     * 设置附件url
     *
     * @param fjurl 附件url
     */
    public void setFjurl(String fjurl) {
        this.fjurl = fjurl;
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