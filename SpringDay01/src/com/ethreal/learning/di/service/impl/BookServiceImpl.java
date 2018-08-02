package com.ethreal.learning.di.service.impl;

import com.ethreal.learning.di.dao.BookDao;
import com.ethreal.learning.di.service.BookService;

public class BookServiceImpl implements BookService {
	
	private BookDao bookDao;
	
	public BookServiceImpl() {
		System.out.println("service层构造函数");
	}

	@Override
	public void addBook() {
		bookDao.save();
	}
	
	public void setBookDao(BookDao bookDao){
		this.bookDao = bookDao;
	}

}
