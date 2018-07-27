package com.example.demo.pojo;

import javax.persistence.*;

public class Zbb {
    /**
     * 招标表id
     */
    @Id
    private String zbbid;
    /**
     * 项目id
     */
    private String xmid;
    /**
     * 单位名称
     */
    private String dwmc;
    /**
     * 项目名称
     */
    private String xmmc;
    /**
     * 报价
     */
    private String bj;
    /**
     * 得分
     */
    private String df;
    /**
     * 发标时间
     */
    private String fbsj;
    /**
     * 评标时间
     */
    private String pbsj;

    /**
     * 获取招标表id
     *
     * @return zbbid - 招标表id
     */
    public String getZbbid() {
        return zbbid;
    }

    /**
     * 设置招标表id
     *
     * @param zbbid 招标表id
     */
    public void setZbbid(String zbbid) {
        this.zbbid = zbbid;
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
     * 获取项目名称
     *
     * @return xmmc - 项目名称
     */
    public String getXmmc() {
        return xmmc;
    }

    /**
     * 设置项目名称
     *
     * @param xmmc 项目名称
     */
    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
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
     * 获取得分
     *
     * @return df - 得分
     */
    public String getDf() {
        return df;
    }

    /**
     * 设置得分
     *
     * @param df 得分
     */
    public void setDf(String df) {
        this.df = df;
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

    /**
     * 获取评标时间
     *
     * @return pbsj - 评标时间
     */
    public String getPbsj() {
        return pbsj;
    }

    /**
     * 设置评标时间
     *
     * @param pbsj 评标时间
     */
    public void setPbsj(String pbsj) {
        this.pbsj = pbsj;
    }
}