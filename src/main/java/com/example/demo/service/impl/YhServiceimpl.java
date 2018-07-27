package com.example.demo.service.impl;

import com.example.demo.mapper.YhMapper;
import com.example.demo.pojo.Yh;
import com.example.demo.service.YhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yijialuo on 2018/4/14.
 */
@Service
public class YhServiceimpl implements YhService {
    @Autowired
    YhMapper yhMapper;
    @Override
    public Yh selectYh(Yh yh) {
        return yhMapper.selectOne(yh);
    }
}
