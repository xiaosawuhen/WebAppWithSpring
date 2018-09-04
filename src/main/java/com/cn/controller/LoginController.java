package com.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.db.dao.PersionMapper;
import com.cn.service.PersonServie;

@Controller
public class LoginController {
    
	@Autowired
	private PersonServie personServie;

    @RequestMapping("/login")
    public ModelAndView test() {
    	ModelAndView mv = new ModelAndView();

        String name = personServie.getPersionById(1).getName_test();
    	
    	mv.addObject("name", name);
    	mv.setViewName("homePage");
        return mv;
    }
}
