package com.project7.soap.webservices.bibliomanagement.entities;

import java.io.Serializable;

public class Editor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public Editor() {
		super();
	}

	public Editor(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
