package com.project7.soap.webservices.bibliomanagement.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "title")
	private String title;
	@Column(name = "image")
	private String image;
	@Column(name = "summary", length = 4000)
	private String summary;
	@Column(name = "isbn")
	private Long isbn;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	@ManyToOne
	@JoinColumn(name = "editor_id")
	private Editor editor;
	@OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
	private Collection<Copy> copies;
	@ManyToMany(mappedBy = "books")
	private Collection<Genre> genres;
	@ManyToMany(mappedBy = "books")
	private Collection<Author> authors;
	
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

	public Collection<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Collection<Author> authors) {
		this.authors = authors;
	}

}
