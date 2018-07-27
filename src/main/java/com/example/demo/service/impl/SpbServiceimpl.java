package com.example.demo.service.impl;

import com.example.demo.mapper.SpbMapper;
import com.example.demo.pojo.Spb;
import com.example.demo.service.SpbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yijialuo on 2018/4/19.
 */
@Service
public class SpbServiceimpl implements SpbService{
    @Autowired
    SpbMapper spbMapper;
    @Override
    public void insertSpb(Spb spb) {
        spbMapper.insert(spb);
    }

    @Override
    public Spb selectSpbOne(Spb spb) {
        return spbMapper.selectOne(spb);
    }

    @Override
    public List<Spb> selectSpb(Spb spb) {
        return spbMapper.select(spb);
    }

    @Override
    public int deletSpbById(String id) {
        return spbMapper.deleteByPrimaryKey(id);
    }
}
