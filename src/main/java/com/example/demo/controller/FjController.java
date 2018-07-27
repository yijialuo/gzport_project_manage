package com.example.demo.controller;

import com.example.demo.mapper.FjbMapper;
import com.example.demo.pojo.Fjb;
import com.example.demo.task.DeleteFileUtil;
import com.example.demo.task.IdCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created by yijialuo on 2018/7/18.
 */
@RestController
@RequestMapping("/fj")
public class FjController {
    @Autowired
    FjbMapper fjbMapper;

    //审批表信息保存到数据库
    @RequestMapping(value = "/save")
    public Fjb save(String xmid, String fjmc) {
        Fjb fjb = new Fjb();
        fjb.setFjid(IdCreate.id());
        fjb.setXmid(xmid);
        fjb.setFjmc(fjmc);
        fjb.setFjurl("http://localhost:8080/static/images/" + xmid + "/附件/" + fjmc);
        fjbMapper.insert(fjb);
        return fjbMapper.selectByPrimaryKey(fjb);
    }

    @RequestMapping(value = "/deletFj")
    public void deletFjb(String fjid) throws FileNotFoundException {
        Fjb fjb = new Fjb();
        fjb.setFjid(fjid);
        fjb = fjbMapper.selectByPrimaryKey(fjb);
        //获取项目路径
        java.io.File path = new java.io.File(ResourceUtils.getURL("classpath:").getPath());
        if (!path.exists()) path = new java.io.File("");
        System.out.println("path:" + path.getAbsolutePath());
        //获取删除文件路径
        java.io.File deletpath = new java.io.File(path.getAbsolutePath(), "/target/classes/static/images//" + fjb.getXmid() + "//附件//" + fjb.getFjmc());
        if (!deletpath.exists()) deletpath.mkdirs();
        //删除数据库记录
        fjbMapper.deleteByPrimaryKey(fjb);
        //删除文件
        DeleteFileUtil.delete(deletpath.getAbsolutePath());
    }

    //附件表表相关信息,名称,url
    @RequestMapping(value = "/getFjb")
    public List<Fjb> getFjb(String xmid) {
        Fjb fjb=new Fjb();
        fjb.setXmid(xmid);
        return fjbMapper.select(fjb);
    }
}
