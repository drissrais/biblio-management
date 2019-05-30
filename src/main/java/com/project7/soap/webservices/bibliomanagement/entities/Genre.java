package com.project7.soap.webservices.bibliomanagement.entities;

import java.io.Serializable;


public class Genre implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String genre;
	
	public Genre() {
		super();
	}
	
	public Genre(String genre) {
		super();
		this.genre = genre;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
