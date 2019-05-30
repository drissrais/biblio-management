package com.project7.soap.webservices.bibliomanagement.entities;

import java.io.Serializable;
import java.util.Collection;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String title;
	private String image;
	private String summary;
	private Long isbn;
	private Language language;
	private Editor editor;
	private Collection<Copy> copies;
	private Collection<Genre> genres;
	
	public Book() {
		super();
	}
	
	public Book(String title, String image, String summary, Long isbn, Language language, Editor editor) {
		super();
		this.title = title;
		this.image = image;
		this.summary = summary;
		this.isbn = isbn;
		this.language = language;
		this.editor = editor;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Long getIsbn() {
		return isbn;
	}
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public Editor getEditor() {
		return editor;
	}
	public void setEditor(Editor editor) {
		this.editor = editor;
	}
	public Collection<Copy> getCopies() {
		return copies;
	}
	public void setCopies(Collection<Copy> copies) {
		this.copies = copies;
	}
	public Collection<Genre> getGenres() {
		return genres;
	}
	public void setGenres(Collection<Genre> genres) {
		this.genres = genres;
	}

}
