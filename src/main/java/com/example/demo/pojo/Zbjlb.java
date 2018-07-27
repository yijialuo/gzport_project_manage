package com.example.demo.pojo;

import javax.persistence.*;

public class Zbjlb {
    /**
     * 招标记录id
     */
    @Id
    private String zbjlid;

    /**
     * 招标类型
     */
    private String zblx;

    /**
     * 项目id
     */
    private String xmid;

    /**
     * 单位名称
     */
    private String dwmc;

    /**
     * 报价
     */
    private String bj;

    /**
     * 是否中标
     */
    private String sfzb;

    /**
     * 发标时间
     */
    private String fbsj;

    /**
     * 获取招标记录id
     *
     * @return zbjlid - 招标记录id
     */
    public String getZbjlid() {
        return zbjlid;
    }

    /**
     * 设置招标记录id
     *
     * @param zbjlid 招标记录id
     */
    public void setZbjlid(String zbjlid) {
        this.zbjlid = zbjlid;
    }

    /**
     * 获取招标类型
     *
     * @return zblx - 招标类型
     */
    public String getZblx() {
        return zblx;
    }

    /**
     * 设置招标类型
     *
     * @param zblx 招标类型
     */
    public void setZblx(String zblx) {
        this.zblx = zblx;
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
     * 获取单位名称
     *
     * @return dwmc - 单位名称
     */
    public String getDwmc() {
        return dwmc;
    }

    /**
     * 设置单位名称
     *
     * @param dwmc 单位名称
     */
    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }

    /**
     * 获取报价
     *
     * @return bj - 报价
     */
    public String getBj() {
        return bj;
    }

    /**
     * 设置报价
     *
     * @param bj 报价
     */
    public void setBj(String bj) {
        this.bj = bj;
    }

    /**
     * 获取是否中标
     *
     * @return sfzb - 是否中标
     */
    public String getSfzb() {
        return sfzb;
    }

    /**
     * 设置是否中标
     *
     * @param sfzb 是否中标
     */
    public void setSfzb(String sfzb) {
        this.sfzb = sfzb;
    }

    /**
     * 获取发标时间
     *
     * @return fbsj - 发标时间
     */
    public String getFbsj() {
        return fbsj;
    }

    /**
     * 设置发标时间
     *
     * @param fbsj 发标时间
     */
    public void setFbsj(String fbsj) {
        this.fbsj = fbsj;
    }
}