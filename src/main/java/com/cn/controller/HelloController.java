package com.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.db.dao.PersionMapper;

@Controller
public class HelloController {
    
	@Autowired
	PersionMapper persionMapper; 
	
    @RequestMapping("/hello")
    public @ResponseBody String hello() {
        return persionMapper.selectPersion(1).getName_test();
    }
}
