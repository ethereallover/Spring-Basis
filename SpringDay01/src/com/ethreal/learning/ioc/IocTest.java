package com.ethreal.learning.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
	
	@Test
	public void testDemo(){
		String xmlPath = "/applicationContext.xml";
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		
		UserService service = (UserService) applicationContext.getBean("userServiceId");
		service.addUser();
	}
	
	/*public static void main(String[] args){
		IocTest iocTest = new IocTest();
		iocTest.testDemo();
	}*/
}
