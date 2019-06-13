package com.project7.bibliomanagement.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project7.bibliomanagement.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	
	@Override
	List<Book> findAll();

}
