package com.example.demo.controller;

import com.example.demo.mapper.HtbMapper;
import com.example.demo.pojo.Htb;
import com.example.demo.task.IdCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yijialuo on 2018/7/22.
 */
@RestController
@RequestMapping("/api/htb")
public class HtbController {
    @Autowired
    private HtbMapper htbMapper;

    @RequestMapping("/addhtjl")
    public int addhtjl(@RequestBody Htb htb) {
        if (htb.getHtid() == "" || htb.getHtid() == null) {
            htb.setHtid(IdCreate.id());
        }
        return htbMapper.insert(htb);
    }
    @RequestMapping("/updatahtjl")
    public int updatahtjl(@RequestBody Htb ht){
        Htb htb=new Htb();
        htb.setXmid(ht.getXmid());
        htbMapper.delete(htb);
        return htbMapper.insert(ht);
    }

    @RequestMapping("/selecthtjl")
    public List<Htb> selecthtjl(String xmid) {
        Htb htb = new Htb();
        htb.setXmid(xmid);
        return htbMapper.select(htb);
    }

    @RequestMapping("/delethtjl")
    public int delethtjl(Htb htb){
        return htbMapper.delete(htb);
    }
}
