package com.ethereal.learning.aop.jdkproxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class AspectAOP implements MethodInterceptor{

	public String before(){
		System.out.println("AOP_proxy前。。。");
		return "ready!!!";
	}
	
	public void after(){
		System.out.println("AOP_proxy后。。。");
	}

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		before();
		Object proceed = arg0.proceed();
		after();
		return proceed;
	}

}
