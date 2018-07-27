package com.example.demo.service;

import com.example.demo.pojo.Xm;

import java.util.List;

/**
 * Created by yijialuo on 2018/4/12.
 */
public interface XmService {
    public void saveXm(Xm xm);
    public List<Xm> selectAllXm();
    public Xm selectXmById(String xmid);
    public int updataXmById(Xm xm);
}
