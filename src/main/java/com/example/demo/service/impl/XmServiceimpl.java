package com.example.demo.service.impl;

import com.example.demo.mapper.XmMapper;
import com.example.demo.pojo.Xm;
import com.example.demo.service.XmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yijialuo on 2018/4/12.
 */
@Service
public class XmServiceimpl implements XmService{
    @Autowired
    private XmMapper xmMapper;

    //插入
    @Override
    public void saveXm(Xm xm) {
        xmMapper.insert(xm);
    }

    //选择所有
    @Override
    public List<Xm> selectAllXm() {
        return xmMapper.selectAll();
    }

    //选择一条
    @Override
    public Xm selectXmById(String xmid) {
        return xmMapper.selectByPrimaryKey(xmid);
    }

    //修改项目
    @Override
    public int updataXmById(Xm xm) {
        //有值得字段更新,没值得字段不变,updateByPrimaryKey,没有设定值的字段变为null,一般用updateByPrimaryKeySelective
        return xmMapper.updateByPrimaryKeySelective(xm);
    }
}
