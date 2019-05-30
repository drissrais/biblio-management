package com.project7.soap.webservices.bibliomanagement.entities;

import java.io.Serializable;

public class Copy implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Book book;
	
	public Copy() {
		super();
	}
	
	public Copy(Book book) {
		super();
		this.book = book;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

}
