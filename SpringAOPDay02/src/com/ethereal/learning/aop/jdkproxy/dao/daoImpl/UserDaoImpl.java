package com.ethereal.learning.aop.jdkproxy.dao.daoImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;

import com.ethereal.learning.aop.jdkproxy.bean.User;
import com.ethereal.learning.aop.jdkproxy.dao.UserDao;

public class UserDaoImpl implements UserDao{
	
	private JdbcTemplate template;

	@Override
	public List<User> query() {
		List<User> list = template.query("select * from user where id > 2",ParameterizedBeanPropertyRowMapper.newInstance(User.class));
		return list;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
}
