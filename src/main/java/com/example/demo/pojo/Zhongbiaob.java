package com.example.demo.pojo;

import javax.persistence.*;

public class Zhongbiaob {
    /**
     * 中标id
     */
    @Id
    private String zhongbiaoid;

    /**
     * 中标项目id
     */
    private String zbxmid;

    /**
     * 中标单位名称
     */
    private String zbdwmc;

    /**
     * 中标项目名称
     */
    private String zbxmmc;

    /**
     * 中标报价
     */
    private String zbbj;

    /**
     * 中标得分
     */
    private String zbdf;

    /**
     * 中标发标时间
     */
    private String zbfbsj;

    /**
     * 中标时间
     */
    private String zbsj;

    /**
     * 备注
     */
    private String bz;

    /**
     * 是否最终中标单位
     */
    private String sfzzzbdw;

    /**
     * 获取中标id
     *
     * @return zhongbiaoid - 中标id
     */
    public String getZhongbiaoid() {
        return zhongbiaoid;
    }

    /**
     * 设置中标id
     *
     * @param zhongbiaoid 中标id
     */
    public void setZhongbiaoid(String zhongbiaoid) {
        this.zhongbiaoid = zhongbiaoid;
    }

    /**
     * 获取中标项目id
     *
     * @return zbxmid - 中标项目id
     */
    public String getZbxmid() {
        return zbxmid;
    }

    /**
     * 设置中标项目id
     *
     * @param zbxmid 中标项目id
     */
    public void setZbxmid(String zbxmid) {
        this.zbxmid = zbxmid;
    }

    /**
     * 获取中标单位名称
     *
     * @return zbdwmc - 中标单位名称
     */
    public String getZbdwmc() {
        return zbdwmc;
    }

    /**
     * 设置中标单位名称
     *
     * @param zbdwmc 中标单位名称
     */
    public void setZbdwmc(String zbdwmc) {
        this.zbdwmc = zbdwmc;
    }

    /**
     * 获取中标项目名称
     *
     * @return zbxmmc - 中标项目名称
     */
    public String getZbxmmc() {
        return zbxmmc;
    }

    /**
     * 设置中标项目名称
     *
     * @param zbxmmc 中标项目名称
     */
    public void setZbxmmc(String zbxmmc) {
        this.zbxmmc = zbxmmc;
    }

    /**
     * 获取中标报价
     *
     * @return zbbj - 中标报价
     */
    public String getZbbj() {
        return zbbj;
    }

    /**
     * 设置中标报价
     *
     * @param zbbj 中标报价
     */
    public void setZbbj(String zbbj) {
        this.zbbj = zbbj;
    }

    /**
     * 获取中标得分
     *
     * @return zbdf - 中标得分
     */
    public String getZbdf() {
        return zbdf;
    }

    /**
     * 设置中标得分
     *
     * @param zbdf 中标得分
     */
    public void setZbdf(String zbdf) {
        this.zbdf = zbdf;
    }

    /**
     * 获取中标发标时间
     *
     * @return zbfbsj - 中标发标时间
     */
    public String getZbfbsj() {
        return zbfbsj;
    }

    /**
     * 设置中标发标时间
     *
     * @param zbfbsj 中标发标时间
     */
    public void setZbfbsj(String zbfbsj) {
        this.zbfbsj = zbfbsj;
    }

    /**
     * 获取中标时间
     *
     * @return zbsj - 中标时间
     */
    public String getZbsj() {
        return zbsj;
    }

    /**
     * 设置中标时间
     *
     * @param zbsj 中标时间
     */
    public void setZbsj(String zbsj) {
        this.zbsj = zbsj;
    }

    /**
     * 获取备注
     *
     * @return bz - 备注
     */
    public String getBz() {
        return bz;
    }

    /**
     * 设置备注
     *
     * @param bz 备注
     */
    public void setBz(String bz) {
        this.bz = bz;
    }

    /**
     * 获取是否最终中标单位
     *
     * @return sfzzzbdw - 是否最终中标单位
     */
    public String getSfzzzbdw() {
        return sfzzzbdw;
    }

    /**
     * 设置是否最终中标单位
     *
     * @param sfzzzbdw 是否最终中标单位
     */
    public void setSfzzzbdw(String sfzzzbdw) {
        this.sfzzzbdw = sfzzzbdw;
    }
}