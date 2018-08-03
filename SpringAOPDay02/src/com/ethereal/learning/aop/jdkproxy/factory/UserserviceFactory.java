package com.ethereal.learning.aop.jdkproxy.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.ethereal.learning.aop.jdkproxy.MyAspect;
import com.ethereal.learning.aop.jdkproxy.impl.UserServiceImpl;
import com.ethereal.learning.aop.jdkproxy.inter.BookService;
import com.ethereal.learning.aop.jdkproxy.inter.UserService;

/**
 * 使用JDK动态代理
 * @author hspcadmin
 *
 */
public class UserserviceFactory {
	
	public static UserService createUserService(){
		
		final UserService serviceimpl = new UserServiceImpl();
		
		final MyAspect aspect = new MyAspect();
		
		UserService serviceProxy = (UserService) Proxy.newProxyInstance(UserserviceFactory.class.getClassLoader(), new Class[] {UserService.class,BookService.class}, new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				//前通知
				aspect.before();
				
				Object obj = method.invoke(serviceimpl, args);
				
				//后通知
				aspect.after();
				
				return obj;
			}
		});
		
		return serviceProxy;
	}
	

}
