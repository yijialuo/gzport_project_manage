package com.example.demo.controller;

import com.example.demo.mapper.ZbbMapper;
import com.example.demo.pojo.Zbb;
import com.example.demo.service.ZbbService;
import com.example.demo.task.IdCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yijialuo on 2018/7/15.
 */
@RestController
@RequestMapping("/api/zbb")
public class ZbbController {
    @Autowired
    ZbbService zbbService;

    @Autowired
    ZbbMapper zbbMapper;

    @RequestMapping("/addzbb")
    public void addZbb(@RequestBody Zbb zbb) {
        zbb.setZbbid(IdCreate.id());
        //时间精确年月日
        if (zbb.getFbsj().length() > 10) {
            zbb.setFbsj(zbb.getFbsj().substring(0, 10));
        }
        if (zbb.getPbsj().length() > 10) {
            zbb.setPbsj(zbb.getPbsj().substring(0, 10));
        }
        zbbService.insertZbb(zbb);
    }

    @RequestMapping("/deletZzb")
    public void deletZzb(String zbbid) {
        zbbMapper.deleteByPrimaryKey(zbbid);
    }

    @RequestMapping("/selectZbb")
    public List<Zbb> selectZbb(String xmid) {
        Zbb zbb = new Zbb();
        zbb.setXmid(xmid);
        return zbbService.selectZbb(zbb);
    }

    @RequestMapping("/updataZbb")
    public void updataZbb(@RequestBody Zbb zbb) {
        System.out.println(zbb.getZbbid());
        //时间精确年月日
        if (zbb.getFbsj().length() > 10) {
            zbb.setFbsj(zbb.getFbsj().substring(0, 10));
        }
        if (zbb.getPbsj().length() > 10) {
            zbb.setPbsj(zbb.getPbsj().substring(0, 10));
        }
        zbbMapper.updateByPrimaryKey(zbb);
    }

}

