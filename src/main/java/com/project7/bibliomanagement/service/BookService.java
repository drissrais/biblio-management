package com.project7.bibliomanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project7.bibliomanagement.dao.BookRepository;
import com.project7.bibliomanagement.entities.Book;

@Component
public class BookService {

	@Autowired
	BookRepository bookRepository;
	
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
}
