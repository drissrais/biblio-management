package com.project7.soap.webservices.bibliomanagement.entities;

import java.io.Serializable;

public class Status implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String status;
	
	public Status() {
		super();
	}

	public Status(String status) {
		super();
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
