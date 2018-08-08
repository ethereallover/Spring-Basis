package com.ethereal.learning.aop.jdkproxy.dao;

import java.util.List;

import com.ethereal.learning.aop.jdkproxy.bean.UserBean;

public interface UserDao {
	
	public List<UserBean> findAll();
}
