package com.cn.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.db.dao.PersionMapper;

@Controller
public class LoginController {
    
	@Resource
	PersionMapper persionMapper; 

    @RequestMapping("/login")
    public ModelAndView test() {
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("url", "1111");
    	mv.setViewName("homePage");
        return mv;
    }
}
