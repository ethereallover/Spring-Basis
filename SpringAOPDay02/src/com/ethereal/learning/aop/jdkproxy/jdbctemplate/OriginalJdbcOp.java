package com.ethereal.learning.aop.jdkproxy.jdbctemplate;

import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;

import com.ethereal.learning.aop.jdkproxy.bean.User;

public class OriginalJdbcOp {
	
	private static BasicDataSource dataSource;
	
	private static JdbcTemplate template;
	
	public static int insert(String name,String level,String date){
		dataSource = new BasicDataSource();
		
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://192.168.58.229:3306/epcc?useUnicode=true&characterEncoding=utf-8");
		dataSource.setUsername("root");
		dataSource.setPassword("Yangdong.123");
		
		template = new JdbcTemplate(dataSource);
		/*JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource);*/
		
		int num = template.update("insert into user(acct_nm,acct_lvl,createts) values (?,?,?)",name,level,date);
		
		return num;
	}
	
	public static void query(){
		List<User> list = template.query("select * from user where 1=1", ParameterizedBeanPropertyRowMapper.newInstance(User.class));
		System.out.println(list.size());
	}
}
