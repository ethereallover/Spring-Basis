package com.ethereal.learning.aop.jdkproxy.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ethereal.learning.aop.jdkproxy.bean.UserBean;
import com.ethereal.learning.aop.jdkproxy.dao.UserDao;

public class UserDaoSupport extends JdbcDaoSupport implements UserDao {

	@Override
	public List<UserBean> findAll() {
		List<UserBean> list = getJdbcTemplate().query("select * from user", ParameterizedBeanPropertyRowMapper.newInstance(UserBean.class));
		return list;
	}

}
