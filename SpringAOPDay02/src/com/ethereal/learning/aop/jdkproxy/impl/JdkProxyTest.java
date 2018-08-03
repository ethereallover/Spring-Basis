package com.ethereal.learning.aop.jdkproxy.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ethereal.learning.aop.jdkproxy.factory.UserServiceFactoryCglib;
import com.ethereal.learning.aop.jdkproxy.factory.UserserviceFactory;
import com.ethereal.learning.aop.jdkproxy.inter.UserService;

public class JdkProxyTest {
	
	/*@Test
	public void testDemo1(){
		UserService service = new UserServiceImpl();
		service.addUser();
		System.out.println("======================");
		service.updateUser();
	}
	
	@Test
	public void testDemo2(){
		UserService service = UserserviceFactory.createUserService();
		service.addUser();
		System.out.println("======================");
		service.updateUser();
	}
	
	@Test
	public void testDemo3(){
		UserService service = UserServiceFactoryCglib.createUserService();
		service.addUser();
		System.out.println("======================");
		service.updateUser();
	}
	
	@Test
	public void testDemo4(){
		String xmlPath = "/applicationContext.xml";
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		
		UserService service = (UserService) applicationContext.getBean("UserServiceID");
		service.addUser();
		System.out.println("======================");
		service.updateUser();
		service.getName();
	}*/

	@Test
	public void testDemo5(){
		String xmlPath = "/applicationAnnotation.xml";
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		
		UserService service = (UserService) applicationContext.getBean("UserServiceID");
		service.addUser();
		System.out.println("======================");
		service.updateUser();
		service.getName();
	}
	
}
