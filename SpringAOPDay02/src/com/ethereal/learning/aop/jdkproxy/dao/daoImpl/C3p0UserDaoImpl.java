package com.ethereal.learning.aop.jdkproxy.dao.daoImpl;

import java.util.List;

import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ethereal.learning.aop.jdkproxy.bean.User;
import com.ethereal.learning.aop.jdkproxy.dao.UserDao;

public class C3p0UserDaoImpl extends JdbcDaoSupport implements UserDao{

	@Override
	public List<User> query() {
		return getJdbcTemplate().query("select * from user where id > 2",ParameterizedBeanPropertyRowMapper.newInstance(User.class));
	}

}
