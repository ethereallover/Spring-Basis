package com.ethereal.learning.aop.jdkproxy.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;

import com.ethereal.learning.aop.jdkproxy.bean.UserBean;
import com.ethereal.learning.aop.jdkproxy.dao.UserDao;

public class UserDaoImpl implements UserDao {
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<UserBean> findAll() {
		List<UserBean> query = jdbcTemplate.query("select * from user", ParameterizedBeanPropertyRowMapper.newInstance(UserBean.class));
		return query;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}

}
