package com.ethreal.learning.di.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.ethreal.learning.di.service.BookService;

public class DITest {
	
	@Test
	public void demoTest1(){
		String xmlPath = "/applicationContext.xml";
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		
		BookService bookService = applicationContext.getBean("bookServiceId", BookService.class);
		bookService.addBook();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void demoTest2(){
		String xmlPath = "/applicationContext.xml";
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(xmlPath));
		BookService bookService = beanFactory.getBean("bookServiceId", BookService.class);
		bookService.addBook();
	}
}
