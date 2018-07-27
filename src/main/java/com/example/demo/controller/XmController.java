package com.example.demo.controller;

import com.example.demo.mapper.HtbMapper;
import com.example.demo.mapper.XmMapper;
import com.example.demo.mapper.ZbbMapper;
import com.example.demo.mapper.ZhongbiaobMapper;
import com.example.demo.pojo.Htb;
import com.example.demo.pojo.Xm;
import com.example.demo.pojo.Zbb;
import com.example.demo.pojo.Zhongbiaob;
import com.example.demo.service.XmService;
import com.example.demo.task.IdCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yijialuo on 2018/4/12.
 */
@RestController
@RequestMapping("/api/xm")
public class XmController {
    @Autowired
    private XmService xmService;
    @Autowired
    private ZbbMapper zbbMapper;
    @Autowired
    private ZhongbiaobMapper zhongbiaobMapper;
    @Autowired
    private XmMapper xmMapper;
    @Autowired
    private HtbMapper htbMapper;

    @RequestMapping("/updataXm")
    public int updataXm(@RequestBody Xm xm) {
        Zbb zbb = new Zbb();
        Zhongbiaob zhongbiaob = new Zhongbiaob();
        //修改zzb和zhongbiaob的项目名称
        if (xm.getZxmmc() != "") {
            zbb.setXmmc(xm.getZxmmc());
            Example example = new Example(Zbb.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("xmid", xm.getXmid());
            zbbMapper.updateByExampleSelective(zbb, example);

            zhongbiaob.setZbxmmc(xm.getZxmmc());
            Example example1 = new Example(Zhongbiaob.class);
            Example.Criteria criteria1 = example1.createCriteria();
            criteria1.andEqualTo("zbxmid", xm.getXmid());
            zhongbiaobMapper.updateByExampleSelective(zhongbiaob, example1);
        } else {
            zbb.setXmmc(xm.getXmmc());
            Example example = new Example(Zbb.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("xmid", xm.getXmid());
            zbbMapper.updateByExampleSelective(zbb, example);

            zhongbiaob.setZbxmmc(xm.getXmmc());
            Example example1 = new Example(Zhongbiaob.class);
            Example.Criteria criteria1 = example1.createCriteria();
            criteria1.andEqualTo("zbxmid", xm.getXmid());
            zhongbiaobMapper.updateByExampleSelective(zhongbiaob, example1);
        }
        return xmService.updataXmById(xm);
    }

    @RequestMapping("/getAllXm")
    public List<Xm> getAllXm() {
        return xmService.selectAllXm();
    }

    @RequestMapping("/getXmByXmid")
    public Xm getXmByXmid(String xmid) {
        return xmService.selectXmById(xmid);
    }

    @RequestMapping("/addxm")
    public String addxm(@RequestBody Xm xm) {
        xm.setXmid(IdCreate.id());
        if (xm.getCjsj().length() > 10) {
            xm.setCjsj(xm.getCjsj().substring(0, 10));
        }
        if (xm.getCjsj() == "" || xm.getCjsj() == null)
            xm.setCjsj(IdCreate.id());
        try {
            xmService.saveXm(xm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xm.getXmid();
    }

    @RequestMapping("/selectSK")
    public List<Xm> getSk() {
        Xm xm = new Xm();
        xm.setSflx("收款");
        return xmMapper.select(xm);
    }

    @RequestMapping("/selectFK")
    public List<Xm> selectFK() {
        Xm xm = new Xm();
        xm.setSflx("付款");
        return xmMapper.select(xm);
    }

    @RequestMapping("/selectXmmcByXmid")
    public List<String> selectXmmcByXmid(String Xmids) throws JSONException {
        List<String> Results = new ArrayList<>();
        JSONArray zdXmids = new JSONArray(Xmids);
        for (int i = 0; i < zdXmids.length(); i++) {
            Xm xm = xmMapper.selectByPrimaryKey(zdXmids.get(i));
            Results.add(xm.getXmmc() == "" ? xm.getZxmmc() : xm.getXmmc());
        }
        return Results;
    }

    //总收款
    @RequestMapping("/selectZSK")
    public int selectZSK(String xmids) throws JSONException {
        JSONArray zdxmids = new JSONArray(xmids);
        List<String> SK = new ArrayList<>();
        Htb htb = new Htb();
        //合同表循环收款合同,取合同金额
        for (int i = 0; i < zdxmids.length(); i++) {
            htb.setXmid(zdxmids.get(i).toString());
            htb.setSflx("收款");
            if (htbMapper.selectOne(htb) != null)
                SK.add(htbMapper.selectOne(htb).getHtje());
        }
        int jg = 0;
        //累加合同收款金额
        for (String x : SK) {
            jg = jg + Integer.valueOf(x);
            System.out.println("jg:" + jg);
        }
        return jg;
    }

    //总付款
    @RequestMapping("/selectZFK")
    public int selectZFK(String xmids) throws JSONException {
        JSONArray zdxmids = new JSONArray(xmids);
        List<String> SK = new ArrayList<>();
        Htb htb = new Htb();
        //合同表循环找付款合同,取合同金额
        for (int i = 0; i < zdxmids.length(); i++) {
            htb.setXmid(zdxmids.get(i).toString());
            htb.setSflx("付款");
            if (htbMapper.selectOne(htb) != null)
                SK.add(htbMapper.selectOne(htb).getHtje());
        }
        int jg = 0;
        //累加合同收款金额
        for (String x : SK) {
            jg = jg + Integer.valueOf(x);
            System.out.println("jg:" + jg);
        }
        return jg;
    }
}
