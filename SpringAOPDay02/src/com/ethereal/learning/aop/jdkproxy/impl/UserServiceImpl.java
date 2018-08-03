package com.ethereal.learning.aop.jdkproxy.impl;

import com.ethereal.learning.aop.jdkproxy.inter.BookService;
import com.ethereal.learning.aop.jdkproxy.inter.UserService;

public class UserServiceImpl implements UserService,BookService {

	@Override
	public void addUser() {
		System.out.println("添加用户操作");
	}

	@Override
	public void updateUser() {
		System.out.println("更新用户信息操作");
	}

	@Override
	public void haveBook() {
		System.out.println("我有一本书");
	}

	@Override
	public String getName() {
		System.out.println("获取姓名");
		return "Jack";
	}

}
