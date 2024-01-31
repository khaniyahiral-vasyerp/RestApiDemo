package com.example.RestApiDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;

import com.example.RestApiDemo.model.Book;
import com.example.RestApiDemo.repository.BookRepository;

@Service
public class BookServiceimpl implements BookService {
	@Autowired
	private BookRepository bookrepository;

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookrepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return (List<Book>)bookrepository.findAll();
	}

	@Override
	public Book updateBook(Book book, Integer id) {
		// TODO Auto-generated method stub
		Book b=bookrepository.findById(id).get();
		if(Objects.nonNull(book.getBooknanme())&&! "".equalsIgnoreCase(book.getBooknanme()))
		{
			b.setBooknanme(book.getBooknanme());
		}
		return b;
	}

	@Override
	public void deletebookbyid(Integer id) {
		bookrepository.deleteById(id);
		
	}
	
}
