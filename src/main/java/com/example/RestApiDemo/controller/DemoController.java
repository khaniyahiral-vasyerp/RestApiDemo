package com.example.RestApiDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestApiDemo.model.Book;
import com.example.RestApiDemo.service.BookService;

@RestController
public class DemoController {
	@Autowired
	private BookService bookservice1;

//save operation  
	@PostMapping("/books")
	public Book saveBoook(@Validated @RequestBody Book book) {
		return bookservice1.saveBook(book);

	}

//read operation 
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookservice1.getAllBooks();

	}

//update
	@PutMapping("/books/{id}")
	public Book updateBook(@RequestBody Book boook, @PathVariable("id") Integer id) {
		return bookservice1.updateBook(boook, id);
	}

	// delete
	@DeleteMapping("books/{id}")
	public String deletebookbyid(@PathVariable("id") Integer id) {
		bookservice1.deletebookbyid(id);
		return "deleted";
	}
}
