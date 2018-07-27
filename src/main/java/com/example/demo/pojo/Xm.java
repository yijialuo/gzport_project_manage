package com.example.demo.pojo;

import javax.persistence.*;

public class Xm {
    /**
     * 项目id
     */
    @Id
    private String xmid;

    /**
     * 项目编号
     */
    private String xmbh;

    /**
     * 项目名称
     */
    private String xmmc;

    /**
     * 子项目名称
     */
    private String zxmmc;

    /**
     * 收付类型
     */
    private String sflx;

    /**
     * 项目类型
     */
    private String xmlx;

    /**
     * 项目工期
     */
    private String xmgq;

    /**
     * 资金来源
     */
    private String zjly;

    /**
     * 预算金额
     */
    private String ysje;

    /**
     * 项目负责人
     */
    private String xmfzr;

    /**
     * 项目内容概要
     */
    private String xmnrgy;

    /**
     * 配套硬件及系统软件
     */
    private String ptyjjxtrj;

    /**
     * 备注
     */
    private String bz;

    /**
     * 创建时间
     */
    private String cjsj;

    /**
     * 创建人
     */
    private String cjr;

    /**
     * 修改时间
     */
    private String xgsj;

    /**
     * 修改人
     */
    private String xgr;

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
     * 获取项目编号
     *
     * @return xmbh - 项目编号
     */
    public String getXmbh() {
        return xmbh;
    }

    /**
     * 设置项目编号
     *
     * @param xmbh 项目编号
     */
    public void setXmbh(String xmbh) {
        this.xmbh = xmbh;
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
     * 获取子项目名称
     *
     * @return zxmmc - 子项目名称
     */
    public String getZxmmc() {
        return zxmmc;
    }

    /**
     * 设置子项目名称
     *
     * @param zxmmc 子项目名称
     */
    public void setZxmmc(String zxmmc) {
        this.zxmmc = zxmmc;
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
     * 获取项目类型
     *
     * @return xmlx - 项目类型
     */
    public String getXmlx() {
        return xmlx;
    }

    /**
     * 设置项目类型
     *
     * @param xmlx 项目类型
     */
    public void setXmlx(String xmlx) {
        this.xmlx = xmlx;
    }

    /**
     * 获取项目工期
     *
     * @return xmgq - 项目工期
     */
    public String getXmgq() {
        return xmgq;
    }

    /**
     * 设置项目工期
     *
     * @param xmgq 项目工期
     */
    public void setXmgq(String xmgq) {
        this.xmgq = xmgq;
    }

    /**
     * 获取资金来源
     *
     * @return zjly - 资金来源
     */
    public String getZjly() {
        return zjly;
    }

    /**
     * 设置资金来源
     *
     * @param zjly 资金来源
     */
    public void setZjly(String zjly) {
        this.zjly = zjly;
    }

    /**
     * 获取预算金额
     *
     * @return ysje - 预算金额
     */
    public String getYsje() {
        return ysje;
    }

    /**
     * 设置预算金额
     *
     * @param ysje 预算金额
     */
    public void setYsje(String ysje) {
        this.ysje = ysje;
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
     * 获取项目内容概要
     *
     * @return xmnrgy - 项目内容概要
     */
    public String getXmnrgy() {
        return xmnrgy;
    }

    /**
     * 设置项目内容概要
     *
     * @param xmnrgy 项目内容概要
     */
    public void setXmnrgy(String xmnrgy) {
        this.xmnrgy = xmnrgy;
    }

    /**
     * 获取配套硬件及系统软件
     *
     * @return ptyjjxtrj - 配套硬件及系统软件
     */
    public String getPtyjjxtrj() {
        return ptyjjxtrj;
    }

    /**
     * 设置配套硬件及系统软件
     *
     * @param ptyjjxtrj 配套硬件及系统软件
     */
    public void setPtyjjxtrj(String ptyjjxtrj) {
        this.ptyjjxtrj = ptyjjxtrj;
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
     * 获取创建时间
     *
     * @return cjsj - 创建时间
     */
    public String getCjsj() {
        return cjsj;
    }

    /**
     * 设置创建时间
     *
     * @param cjsj 创建时间
     */
    public void setCjsj(String cjsj) {
        this.cjsj = cjsj;
    }

    /**
     * 获取创建人
     *
     * @return cjr - 创建人
     */
    public String getCjr() {
        return cjr;
    }

    /**
     * 设置创建人
     *
     * @param cjr 创建人
     */
    public void setCjr(String cjr) {
        this.cjr = cjr;
    }

    /**
     * 获取修改时间
     *
     * @return xgsj - 修改时间
     */
    public String getXgsj() {
        return xgsj;
    }

    /**
     * 设置修改时间
     *
     * @param xgsj 修改时间
     */
    public void setXgsj(String xgsj) {
        this.xgsj = xgsj;
    }

    /**
     * 获取修改人
     *
     * @return xgr - 修改人
     */
    public String getXgr() {
        return xgr;
    }

    /**
     * 设置修改人
     *
     * @param xgr 修改人
     */
    public void setXgr(String xgr) {
        this.xgr = xgr;
    }
}