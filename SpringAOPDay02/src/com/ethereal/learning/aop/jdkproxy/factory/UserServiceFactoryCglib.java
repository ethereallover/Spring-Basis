package com.ethereal.learning.aop.jdkproxy.factory;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.ethereal.learning.aop.jdkproxy.MyAspect;
import com.ethereal.learning.aop.jdkproxy.impl.UserServiceImpl;
import com.ethereal.learning.aop.jdkproxy.inter.UserService;

/**
 * 使用CGlib动态代理
 * @author hspcadmin
 *
 */
public class UserServiceFactoryCglib {
	
	public static UserService createUserService(){
		final UserService userService = new UserServiceImpl();
		
		final MyAspect aspect = new MyAspect();
		
		Enhancer enhancer = new Enhancer(); //创建核心类
		enhancer.setSuperclass(userService.getClass());
		enhancer.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] arg2, MethodProxy methodProxy) throws Throwable {
				aspect.before();
				
				Object invoke = methodProxy.invoke(userService, arg2);
				
				//methodProxy.invokeSuper(proxy, arg2); //执行代理目标类的父类
				
				aspect.after();
				return invoke;
			}
		});
		UserService proxyService = (UserService) enhancer.create();
		
		return proxyService;
	}
}
