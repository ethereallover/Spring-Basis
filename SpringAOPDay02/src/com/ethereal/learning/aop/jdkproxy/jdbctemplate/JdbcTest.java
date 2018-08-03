package com.ethereal.learning.aop.jdkproxy.jdbctemplate;

import org.junit.Test;

public class JdbcTest {
	
	@Test
	public void jdbcTestDemo1(){
		int insert = OriginalJdbcOp.insert("中国银行","12","201808031046220");
		System.out.println("受影响的行数："+insert);
		
		OriginalJdbcOp.query();
	}
}
