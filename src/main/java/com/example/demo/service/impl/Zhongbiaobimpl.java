package com.example.demo.service.impl;

import com.example.demo.mapper.ZhongbiaobMapper;
import com.example.demo.pojo.Zhongbiaob;
import com.example.demo.service.ZhongbiaobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yijialuo on 2018/7/15.
 */
@Service
public class Zhongbiaobimpl implements ZhongbiaobService {
    @Autowired
    ZhongbiaobMapper zhongbiaobMapper;
    @Override
    public void insertZhongbiaob(Zhongbiaob zhongbiaob) {
        zhongbiaobMapper.insert(zhongbiaob);
    }
}
