package com.naresh.bankapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.naresh.bankapp.model.Book;

@Service
public interface BookService {

	void addBook(Book book) ;

	void updateBook(Book book);

	void deleteBook(Integer id) ;

	List<Book> findAll() ;

	Book findBook(Integer id);

	void updateBookTitle(Book book);

	List<Book> findByCategory(String category);
}
