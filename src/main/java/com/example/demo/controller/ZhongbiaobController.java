package com.example.demo.controller;

import com.example.demo.mapper.ZhongbiaobMapper;
import com.example.demo.pojo.Zhongbiaob;
import com.example.demo.service.ZhongbiaobService;
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
@RequestMapping("/api/zhongbiaob")
public class ZhongbiaobController {
    @Autowired
    private ZhongbiaobService zhongbiaobService;
    @Autowired
    private ZhongbiaobMapper zhongbiaobMapper;
    @RequestMapping("/addZhongbiaob")
    public void addZhongbiaob(@RequestBody Zhongbiaob zhongbiaob){
        zhongbiaob.setZhongbiaoid(IdCreate.id());
        if(zhongbiaob.getZbfbsj().length()>10){
            zhongbiaob.setZbfbsj(zhongbiaob.getZbfbsj().substring(0,10));
        }
        if(zhongbiaob.getZbsj().length()>10){
            zhongbiaob.setZbsj(zhongbiaob.getZbsj().substring(0,10));
        }
        zhongbiaobService.insertZhongbiaob(zhongbiaob);
    }

    @RequestMapping("/selectZhongbiaob")
    public List<Zhongbiaob> selectZbb(String zbxmid){
        Zhongbiaob zhongbiaob=new Zhongbiaob();
        zhongbiaob.setZbxmid(zbxmid);
        return zhongbiaobMapper.select(zhongbiaob);
    }

    @RequestMapping("/updataZhongbiaob")
    public void updataZhongbiaob(@RequestBody Zhongbiaob zhongbiaob){
        zhongbiaobMapper.updateByPrimaryKey(zhongbiaob);
    }

    @RequestMapping("/deletZhongbiaob")
    public void deletZhongbiaob(String zhongbiaoid){
        zhongbiaobMapper.deleteByPrimaryKey(zhongbiaoid);
    }
}
