package com.example.demo.controller;

import com.example.demo.mapper.ZbjlbMapper;
import com.example.demo.pojo.Zbjlb;
import com.example.demo.task.IdCreate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yijialuo on 2018/7/19.
 */
@RestController
@RequestMapping("/api/zbjl")
public class ZbjlController {
    @Autowired
    ZbjlbMapper zbjlbMapper;



    @RequestMapping("/addzbjl")
    public int addZbjl(@RequestBody Zbjlb zbjlb){
        zbjlb.setZbjlid(IdCreate.id());
        return zbjlbMapper.insert(zbjlb);
    }

    @RequestMapping("/selectzbjl")
    public List<Zbjlb> selectZbjl(String xmid){
        Zbjlb zbjlb=new Zbjlb();
        zbjlb.setXmid(xmid);
        return  zbjlbMapper.select(zbjlb);
    }

    @RequestMapping("/deletezbjl")
    public int deletezbjl(String zbjlid){
        System.out.println(zbjlid);
        return zbjlbMapper.deleteByPrimaryKey(zbjlid);
    }

    @RequestMapping("/updatazhongbiao")
    public int updatazhongbiao(String zbjlid){
        Zbjlb zbjlb=new Zbjlb();
        zbjlb.setZbjlid(zbjlid);
        zbjlb.setSfzb("是");
        return zbjlbMapper.updateByPrimaryKeySelective(zbjlb);
    }

    @RequestMapping("/updataweizhongbiao")
    public int updataweizhongbiao(String zbjlid){
        Zbjlb zbjlb=new Zbjlb();
        zbjlb.setZbjlid(zbjlid);
        zbjlb.setSfzb("否");
        return zbjlbMapper.updateByPrimaryKeySelective(zbjlb);
    }

    @RequestMapping("/updatazbjl")
    public int updatazbjl(@RequestBody Zbjlb zbjlb){
        return zbjlbMapper.updateByPrimaryKeySelective(zbjlb);
    }
}
