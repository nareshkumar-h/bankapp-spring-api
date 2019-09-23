package com.naresh.bankapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.bankapp.model.Book;
import com.naresh.bankapp.service.BookService;

@RestController
@RequestMapping("books")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<Book> getBooks() {

		List<Book> list = bookService.findAll();
		return list;
	}
	
	@GetMapping("searchByCategory")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Book> searchByCategory(@RequestParam("category") String category) {

		List<Book> list = bookService.findByCategory(category);
		return list;
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addBook(@RequestBody Book book) {

		bookService.addBook(book);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void updateBook(@PathVariable("id") Integer id, @RequestBody Book book) {

		bookService.updateBook(book);
	}
	
	@PatchMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void updateBookTitle(@PathVariable("id") Integer id, @RequestBody Book book) {

		bookService.updateBookTitle(book);
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteBook(@PathVariable("id") Integer id) {

		bookService.deleteBook(id);
	}
}

//Reference : Response Codes - https://restfulapi.net/http-methods/