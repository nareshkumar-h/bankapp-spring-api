package com.naresh.bankapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.naresh.bankapp.exception.DBException;
import com.naresh.bankapp.model.Book;

@Repository
public interface BookDAO {

	void save(Book book) throws DBException;
	
	void update(Book book) throws DBException;
	
	void delete(Integer id) throws DBException;
	
	List<Book> findAll() throws DBException;
	
	Book findOne(Integer id) throws DBException;
}
