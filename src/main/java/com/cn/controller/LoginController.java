package com.cn.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cn.db.model.Persion;
import com.cn.service.PersonServie;

@Controller
@RequestMapping("/persion")
public class LoginController {
	
	private static Logger logger =LoggerFactory.getLogger(LoginController.class);
    
	@Autowired
	private PersonServie personServie;

    @RequestMapping("/init")
    public ModelAndView init() {
    	ModelAndView mv = new ModelAndView();
    	
    	// 获取所有的用户列表
    	List<Persion> persionList = personServie.getAllPersion();
    	
    	// 将用户数据传递到前端
    	mv.addObject("persionList", persionList);
    	
    	// 设置返回页面
    	mv.setViewName("homePage");
        return mv;
    }

    @RequestMapping(value="/insert/string")
    public ModelAndView insert(String name, String phone, HttpServletRequest request) {
    	ModelAndView mv = new ModelAndView();
    	
    	Persion persion = new Persion();
    	persion.setName(name);
    	persion.setPhone(phone);
    	
    	// 添加一条Persion数据
    	Integer cnt = personServie.addPersion(persion);
    	
    	// 获取所有的用户列表
    	List<Persion> persionList = personServie.getAllPersion();
    	
    	// 将用户数据传递到前端
    	mv.addObject("persionList", persionList);
    	
    	// 设置返回页面
    	mv.setViewName("homePage");
        return mv;
    }

    @RequestMapping(value="/insert")
    public ModelAndView insert(Persion persion, HttpServletRequest request) {
    	ModelAndView mv = new ModelAndView();
    	
    	// 添加一条Persion数据
    	Integer cnt = personServie.addPersion(persion);
    	
    	// 获取所有的用户列表
    	List<Persion> persionList = personServie.getAllPersion();
    	
    	// 将用户数据传递到前端
    	mv.addObject("persionList", persionList);
    	
    	// 设置返回页面
    	mv.setViewName("homePage");
        return mv;
    }

    @RequestMapping(value="/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Integer id, HttpServletRequest request) {
    	ModelAndView mv = new ModelAndView();
    	
    	// 获取所有的用户
    	Persion persion = personServie.getPersionById(id);
    	
    	// 将用户数据传递到前端
    	mv.addObject("persion", persion);
    	
    	// 设置返回页面
    	mv.setViewName("persionDetail");
        return mv;
    }

    @RequestMapping(value="/update")
    public ModelAndView update(Persion persion, HttpServletRequest request) {
    	ModelAndView mv = new ModelAndView();
    	
    	// 添加一条Persion数据
    	Integer cnt = personServie.updatePersionById(persion);
    	
    	// 设置返回页面
    	mv.setViewName("redirect:/persion/init");
        return mv;
    }

    @RequestMapping(value="/delete/{id}")
    public @ResponseBody String update(@PathVariable("id") Integer id, HttpServletRequest request) {
    	// 删除一条Persion数据
    	Integer cnt = personServie.deletePersionById(id);
    	
    	// 设置返回页面
        return "{\"status\":20000}";
    }
}
