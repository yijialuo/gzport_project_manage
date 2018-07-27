package com.example.demo.controller;

import com.example.demo.pojo.Yh;
import com.example.demo.service.YhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yijialuo on 2018/4/14.
 */
@RestController
@RequestMapping("/yh")
public class YhController {
    @Autowired
    YhService yhService;
    @RequestMapping("/login")
    public String YhLogin(@RequestBody Yh yh){

        if(yhService.selectYh(yh)!=null) {
            System.out.println(yhService.selectYh(yh).getYhmc()+" "+yhService.selectYh(yh).getYhmm());
            return "ok";
        }
        else
            return "error";
    }
}
