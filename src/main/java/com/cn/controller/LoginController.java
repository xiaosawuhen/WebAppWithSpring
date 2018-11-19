package com.cn.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.db.model.Persion;
import com.cn.service.PersonServie;

@Controller
public class LoginController {
	
	private static Logger logger =LoggerFactory.getLogger(LoginController.class);
    
	@Autowired
	private PersonServie personServie;

    @RequestMapping("/login")
    public ModelAndView test() {
    	ModelAndView mv = new ModelAndView();

        String name = personServie.getPersionById(1).getName_test();
    	
        logger.info("testLog");
        
    	mv.addObject("name", name);
    	
    	List<String> testValueList = new ArrayList<String>();
    	testValueList.add("testvalue01");
    	testValueList.add("testvalue02");
    	testValueList.add("testvalue03");
    	testValueList.add("testvalue04");
    	
    	System.out.println("=====================wnn=========================");
    	
    	
    	Persion persion01 = new Persion();
    	persion01.setName_test("test01");
    	
    	personServie.addPersion(persion01);
    	
    	
    	mv.addObject("vaueList", testValueList);
    	
    	mv.setViewName("homePage");
        return mv;
    }
}
