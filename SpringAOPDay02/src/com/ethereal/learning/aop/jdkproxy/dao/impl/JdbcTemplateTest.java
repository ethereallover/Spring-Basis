package com.ethereal.learning.aop.jdkproxy.dao.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ethereal.learning.aop.jdkproxy.bean.UserBean;
import com.ethereal.learning.aop.jdkproxy.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/applicationJdbcTemplate.xml")
public class JdbcTemplateTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testDemo1(){
		List<UserBean> list = userDao.findAll();
		System.out.println(list.size());
	}

}
