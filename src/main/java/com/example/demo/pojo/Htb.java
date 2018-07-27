package com.example.demo.pojo;

import javax.persistence.*;

public class Htb {
    /**
     * 合同id
     */
    @Id
    private String htid;

    /**
     * 项目id
     */
    private String xmid;

    /**
     * 单位名称
     */
    private String dwmc;

    /**
     * 合同金额
     */
    private String htje;

    /**
     * 签约时间
     */
    private String qysj;

    /**
     * 确定单位时间
     */
    private String qddwsj;

    /**
     * 合同状态
     */
    private String htzt;

    /**
     * 对方签约人
     */
    private String dfqyr;

    /**
     * 项目负责人
     */
    private String xmfzr;

    /**
     * 合同类型
     */
    private String htlx;

    /**
     * 有效日期
     */
    private String yxrq;

    /**
     * 收付类型
     */
    private String sflx;

    /**
     * 廉洁合同
     */
    private String ljht;

    /**
     * 安全合同
     */
    private String aqht;

    /**
     * 智慧港口
     */
    private String zhgk;

    /**
     * 备注
     */
    private String bz;

    /**
     * 获取合同id
     *
     * @return htid - 合同id
     */
    public String getHtid() {
        return htid;
    }

    /**
     * 设置合同id
     *
     * @param htid 合同id
     */
    public void setHtid(String htid) {
        this.htid = htid;
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
     * 获取合同金额
     *
     * @return htje - 合同金额
     */
    public String getHtje() {
        return htje;
    }

    /**
     * 设置合同金额
     *
     * @param htje 合同金额
     */
    public void setHtje(String htje) {
        this.htje = htje;
    }

    /**
     * 获取签约时间
     *
     * @return qysj - 签约时间
     */
    public String getQysj() {
        return qysj;
    }

    /**
     * 设置签约时间
     *
     * @param qysj 签约时间
     */
    public void setQysj(String qysj) {
        this.qysj = qysj;
    }

    /**
     * 获取确定单位时间
     *
     * @return qddwsj - 确定单位时间
     */
    public String getQddwsj() {
        return qddwsj;
    }

    /**
     * 设置确定单位时间
     *
     * @param qddwsj 确定单位时间
     */
    public void setQddwsj(String qddwsj) {
        this.qddwsj = qddwsj;
    }

    /**
     * 获取合同状态
     *
     * @return htzt - 合同状态
     */
    public String getHtzt() {
        return htzt;
    }

    /**
     * 设置合同状态
     *
     * @param htzt 合同状态
     */
    public void setHtzt(String htzt) {
        this.htzt = htzt;
    }

    /**
     * 获取对方签约人
     *
     * @return dfqyr - 对方签约人
     */
    public String getDfqyr() {
        return dfqyr;
    }

    /**
     * 设置对方签约人
     *
     * @param dfqyr 对方签约人
     */
    public void setDfqyr(String dfqyr) {
        this.dfqyr = dfqyr;
    }

    /**
     * 获取项目负责人
     *
     * @return xmfzr - 项目负责人
     */
    public String getXmfzr() {
        return xmfzr;
    }

    /**
     * 设置项目负责人
     *
     * @param xmfzr 项目负责人
     */
    public void setXmfzr(String xmfzr) {
        this.xmfzr = xmfzr;
    }

    /**
     * 获取合同类型
     *
     * @return htlx - 合同类型
     */
    public String getHtlx() {
        return htlx;
    }

    /**
     * 设置合同类型
     *
     * @param htlx 合同类型
     */
    public void setHtlx(String htlx) {
        this.htlx = htlx;
    }

    /**
     * 获取有效日期
     *
     * @return yxrq - 有效日期
     */
    public String getYxrq() {
        return yxrq;
    }

    /**
     * 设置有效日期
     *
     * @param yxrq 有效日期
     */
    public void setYxrq(String yxrq) {
        this.yxrq = yxrq;
    }

    /**
     * 获取收付类型
     *
     * @return sflx - 收付类型
     */
    public String getSflx() {
        return sflx;
    }

    /**
     * 设置收付类型
     *
     * @param sflx 收付类型
     */
    public void setSflx(String sflx) {
        this.sflx = sflx;
    }

    /**
     * 获取廉洁合同
     *
     * @return ljht - 廉洁合同
     */
    public String getLjht() {
        return ljht;
    }

    /**
     * 设置廉洁合同
     *
     * @param ljht 廉洁合同
     */
    public void setLjht(String ljht) {
        this.ljht = ljht;
    }

    /**
     * 获取安全合同
     *
     * @return aqht - 安全合同
     */
    public String getAqht() {
        return aqht;
    }

    /**
     * 设置安全合同
     *
     * @param aqht 安全合同
     */
    public void setAqht(String aqht) {
        this.aqht = aqht;
    }

    /**
     * 获取智慧港口
     *
     * @return zhgk - 智慧港口
     */
    public String getZhgk() {
        return zhgk;
    }

    /**
     * 设置智慧港口
     *
     * @param zhgk 智慧港口
     */
    public void setZhgk(String zhgk) {
        this.zhgk = zhgk;
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
}