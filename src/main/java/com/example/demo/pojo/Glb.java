package com.example.demo.pojo;

import javax.persistence.*;

public class Glb {
    /**
     * 项目id
     */
    private String xmid;

    /**
     * 关联项目id
     */
    private String glxmid;

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
     * 获取关联项目id
     *
     * @return glxmid - 关联项目id
     */
    public String getGlxmid() {
        return glxmid;
    }

    /**
     * 设置关联项目id
     *
     * @param glxmid 关联项目id
     */
    public void setGlxmid(String glxmid) {
        this.glxmid = glxmid;
    }
}