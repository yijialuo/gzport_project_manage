package com.example.demo.service.impl;

import com.example.demo.mapper.ZbbMapper;
import com.example.demo.pojo.Zbb;
import com.example.demo.service.ZbbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yijialuo on 2018/7/15.
 */
@Service
public class ZbbServiceimpl implements ZbbService {
    @Autowired
    ZbbMapper zbbMapper;
    @Override
    public void insertZbb(Zbb zbb) {
        zbbMapper.insert(zbb);
    }

    @Override
    public List<Zbb> selectZbb(Zbb zbb) {
        return zbbMapper.select(zbb);
    }
}
