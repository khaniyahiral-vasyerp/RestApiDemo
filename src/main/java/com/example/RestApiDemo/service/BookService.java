package com.example.RestApiDemo.service;

import java.util.List;

import com.example.RestApiDemo.model.Book;

public interface BookService {

	// save operation
	Book saveBook(Book book);

	// read operation
	List<Book> getAllBooks();

	// update operation
	Book updateBook(Book book, Integer id);
	// delete operation
	void deletebookbyid(Integer id);

}
