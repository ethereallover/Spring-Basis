package com.ethereal.learning.aop.jdkproxy.impl;

import org.springframework.stereotype.Service;

import com.ethereal.learning.aop.jdkproxy.inter.UserService;

@Service
public class UserServiceAnnoImpl implements UserService{

	@Override
	public void addUser() {
		System.out.println("添加用户操作");
	}

	@Override
	public void updateUser() {
		System.out.println("更新用户信息操作");
	}

	@Override
	public String getName() {
		System.out.println("获取姓名");
		return "Jack";
	}


}
