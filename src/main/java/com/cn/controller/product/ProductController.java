package com.cn.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@RequestMapping("product/List")
	public ModelAndView showProduct(){
		ModelAndView mv = new ModelAndView();
		
		
		mv.setViewName("product/list");
		return mv;
	}
}
