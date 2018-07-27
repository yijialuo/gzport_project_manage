package com.example.demo.controller;

import com.example.demo.mapper.FkbMapper;
import com.example.demo.mapper.HtbMapper;
import com.example.demo.pojo.Fkb;
import com.example.demo.pojo.Htb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by yijialuo on 2018/7/24.
 */
@RestController
@RequestMapping("/api/fk")
public class FkbController {
    @Autowired
    private FkbMapper fkbMapper;
    @Autowired
    private HtbMapper htbMapper;


    @RequestMapping("/getfkjl")
    List<Fkb> getfkjl(String xmid){
        Fkb fkb = new Fkb();
        fkb.setXmid(xmid);
        return fkbMapper.select(fkb);
    }

    @RequestMapping("/addfkb")
    void addfkb (@RequestBody Fkb fkb){
        Example example = new Example(Fkb.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("xmid", fkb.getXmid());
        List<Fkb> fkbs=fkbMapper.selectByExample(example);
        //付款总百分比  付款总额
        int fkzbfb=Integer.valueOf(fkb.getFkebfb()),fkze=Integer.valueOf(fkb.getFke());
        for(Fkb fkb1:fkbs){
            fkzbfb+=Integer.valueOf(fkb1.getFkebfb());
            fkze+=Integer.valueOf(fkb1.getFke());
        }
        Htb htb=new Htb();
        htb.setXmid(fkb.getXmid());
        int htje= Integer.valueOf(htbMapper.select(htb).get(0).getHtje());
        int sye=htje-fkze;
        fkb.setSye(sye+"");
        fkb.setSyebfb((100-fkzbfb)+"");
        fkbMapper.insert(fkb);
    }
}
