package com.ethereal.learning.aop.jdkproxy;

/**
 * 切面类
 * @author hspcadmin
 *
 */
public class MyAspect {
	
	public void before(){
		System.out.println("jdk_proxy前。。。");
	}
	
	public void after(){
		System.out.println("jdk_proxy后。。。");
	}
}
