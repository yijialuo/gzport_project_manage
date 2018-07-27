package com.example.demo.controller;

import com.example.demo.pojo.File;
import com.example.demo.pojo.Spb;
import com.example.demo.service.SpbService;
import com.example.demo.task.DeleteFileUtil;
import com.example.demo.task.IdCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created by yijialuo on 2018/4/19.
 */
@RestController
@RequestMapping("/spb")
public class SpbController {
    @Autowired
    private SpbService spbService;

    //审批表信息保存到数据库
    @RequestMapping(value = "/save")
    public Spb save(String xmid, String spbmc) {
        Spb spb = new Spb();
        spb.setSpbid(IdCreate.id());
        spb.setXmid(xmid);
        spb.setSpbmc(spbmc);
        spb.setSpburl("http://localhost:8080/static/images/" + xmid + "/审批表/" + spbmc);
        spbService.insertSpb(spb);
        return spbService.selectSpbOne(spb);
    }

    @RequestMapping(value = "/deletSqb")
    public void deletSqb(String spbid) throws FileNotFoundException {
        System.out.println(spbid);
        Spb spb = new Spb();
        spb.setSpbid(spbid);
        spb = spbService.selectSpbOne(spb);
        //获取项目路径
        java.io.File path = new java.io.File(ResourceUtils.getURL("classpath:").getPath());
        if (!path.exists()) path = new java.io.File("");
        System.out.println("path:" + path.getAbsolutePath());

        //获取删除文件路径
        java.io.File deletpath = new java.io.File(path.getAbsolutePath(), "/target/classes/static/images//" + spb.getXmid() + "//审批表//" + spb.getSpbmc());
        if (!deletpath.exists()) deletpath.mkdirs();

        //删除数据库记录
        spbService.deletSpbById(spbid);
        //删除文件
        DeleteFileUtil.delete(deletpath.getAbsolutePath());
    }

    //获取审批表相关信息,名称,url
    @RequestMapping(value = "/getSpb")
    public List<Spb> getSpn(String xmid) {
        Spb spb = new Spb();
        spb.setXmid(xmid);
        return spbService.selectSpb(spb);
    }

}
