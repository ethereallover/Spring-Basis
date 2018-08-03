package com.ethereal.learning.aop.jdkproxy.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ethereal.learning.aop.jdkproxy.inter.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/applicationAnnotation.xml"})
public class AOPAnnotationTest {
	
	@Autowired
	public UserService  userService;
	
	@Test
	public void testDemo(){
		userService.addUser();
		System.out.println("======================");
		userService.updateUser();
		System.out.println("======================");
		userService.getName();
	}
	
}
