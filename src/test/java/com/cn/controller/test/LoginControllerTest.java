package com.cn.controller.test;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({
	"classpath:spring-context.xml"
//	"/WEB-INF/config/spring-context.xml"
})
public class LoginControllerTest {

	private static Logger LOG = Logger.getLogger(LoginControllerTest.class);
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicatoinContext;
	
	@Test
	public void testFeedback(){
		LOG.info(new Date()+"xxxxxxxxxxxxxxxxx");
		LOG.info("account insert...");
		try {
			
			this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicatoinContext).build();
			MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/login")).andReturn();
//	        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/login"))  
//	                .andExpect(MockMvcResultMatchers.view().name("user/view"))  
//	                .andExpect(MockMvcResultMatchers.model().attributeExists("user"))  
//	                .andDo(MockMvcResultHandlers.print())  
//	                .andReturn();  
	          
	        Assert.assertNotNull(result.getModelAndView().getModel().get("user"));  			
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
	}
}
