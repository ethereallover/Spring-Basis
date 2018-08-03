package com.ethereal.learning.aop.jdkproxy.dao.daoImpl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ethereal.learning.aop.jdkproxy.bean.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/applicationjdbctemplate.xml")
public class JdbcTPTest {
	
	@Autowired
	@Qualifier("UserDao")
	private C3p0UserDaoImpl userDao;
	
	@Test
	public void testDemo1(){
		List<User> query = userDao.query();
		for(User user : query){
			System.out.println(user.toString());
		}
	}
}
