package com.project7.soap.webservices.bibliomanagement.entities;

import java.io.Serializable;
import java.util.Date;

public class Loan implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Date startDate;
	private Date endDate;
	private User user;
	private Copy copy;
	private Status status;
	private boolean extended;
	
	public Loan() {
		super();
	}

	public Loan(Date startDate, Date endDate, User user, Copy copy, Status status, boolean extended) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.user = user;
		this.copy = copy;
		this.status = status;
		this.extended = extended;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Copy getCopy() {
		return copy;
	}

	public void setCopy(Copy copy) {
		this.copy = copy;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isExtended() {
		return extended;
	}

	public void setExtended(boolean extended) {
		this.extended = extended;
	}

}
