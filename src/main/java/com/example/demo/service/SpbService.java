package com.example.demo.service;

import com.example.demo.pojo.Spb;

import java.util.List;

/**
 * Created by yijialuo on 2018/4/19.
 */
public interface SpbService {
    public void insertSpb(Spb spb);
    public Spb selectSpbOne(Spb spb);
    public List<Spb> selectSpb(Spb spb);
    public int deletSpbById(String id);
}
