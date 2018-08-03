package com.ethereal.learning.aop.jdkproxy.dao;

import java.util.List;

import com.ethereal.learning.aop.jdkproxy.bean.User;

public interface UserDao {
	
	public List<User> query();

}
