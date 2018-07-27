package com.example.demo.service;

import com.example.demo.pojo.Zbb;

import java.util.List;

/**
 * Created by yijialuo on 2018/7/15.
 */
public interface ZbbService {
    public void insertZbb(Zbb zbb);
    public List<Zbb> selectZbb(Zbb zbb);
}
