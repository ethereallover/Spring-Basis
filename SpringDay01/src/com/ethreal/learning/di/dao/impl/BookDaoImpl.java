package com.ethreal.learning.di.dao.impl;

import com.ethreal.learning.di.dao.BookDao;

public class BookDaoImpl implements BookDao{

	@Override
	public void save() {
		System.out.println("保存书籍内容");
	}

}
