package com.naresh.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.naresh.bankapp.dao.BookDAO;
import com.naresh.bankapp.model.Book;

public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;
	
	public void addBook(Book book) {
		
	}

	public void updateBook(Book book) {
		
	}

	public void deleteBook(Integer id) {
		
	}

	public List<Book> findAll() {
		return null;
	}

	public Book findBook(Integer id) {
		return null;
	}

	public void updateBookTitle(Book book) {
		
	}

	public List<Book> findByCategory(String category) {
		return null;
	}

	
}
