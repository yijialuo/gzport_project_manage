package com.example.demo.controller;

import com.example.demo.mapper.GlbMapper;
import com.example.demo.pojo.Glb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yijialuo on 2018/7/23.
 */
@RestController
@RequestMapping("/api/glb")
public class GlbController {
    @Autowired
    private GlbMapper glbMapper;

    @RequestMapping("/addglb")
    public void addglb(String xmid, String glxmids) {
        try {
            JSONArray zdglxmids = new JSONArray(glxmids);
            Glb yl = new Glb();
            yl.setXmid(xmid);
            //查询所有关联项目
            List<Glb> glbs = glbMapper.select(yl);
            //删除关联的xm
            for (int i = 0; i < glbs.size(); i++) {
                Glb glb1 = new Glb();
                glb1.setXmid(glbs.get(i).getGlxmid());
                glb1.setGlxmid(xmid);
                glbMapper.delete(glb1);
            }
            //删除xm
            Glb glb = new Glb();
            glb.setXmid(xmid);
            glbMapper.delete(glb);

            //插入(关联的也要插)
            for (int i = 0; i < zdglxmids.length(); i++) {
                Glb glb1 = new Glb();
                glb1.setXmid(xmid);
                glb1.setGlxmid(zdglxmids.get(i).toString());
                glbMapper.insert(glb1);
                Glb glb2 = new Glb();
                glb1.setXmid(zdglxmids.get(i).toString());
                glb1.setGlxmid(xmid);
                glbMapper.insert(glb1);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping("/selectglxmid")
    public List<String> selectglxmid(String xmid) {
        List<String> Results = new ArrayList<>();
        Glb glb = new Glb();
        glb.setXmid(xmid);
        List<Glb> glbs=glbMapper.select(glb);
        for(int i=0;i<glbs.size();i++){
            Results.add(glbs.get(i).getGlxmid());
        }
        return Results;
    }
}
