package com.project7.bibliomanagement.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.project7.bibliomanagement.entities.Author;
import com.project7.bibliomanagement.entities.Book;
import com.project7.bibliomanagement.entities.Copy;
import com.project7.bibliomanagement.entities.Editor;
import com.project7.bibliomanagement.entities.Genre;
import com.project7.bibliomanagement.entities.Language;
import com.project7.bibliomanagement.entities.Member;
import com.project7.bibliomanagement.service.AuthenticationService;
import com.project7.bibliomanagement.service.BookService;
import com.project7.soap.webservices.biblio.AuthenticationRequest;
import com.project7.soap.webservices.biblio.AuthenticationResponse;
import com.project7.soap.webservices.biblio.AuthorDetails;
import com.project7.soap.webservices.biblio.BookDetails;
import com.project7.soap.webservices.biblio.CopyDetails;
import com.project7.soap.webservices.biblio.EditorDetails;
import com.project7.soap.webservices.biblio.GenreDetails;
import com.project7.soap.webservices.biblio.GetAllBooksRequest;
import com.project7.soap.webservices.biblio.GetAllBooksResponse;
import com.project7.soap.webservices.biblio.LanguageDetails;
import com.project7.soap.webservices.biblio.MemberDetails;
import com.project7.soap.webservices.biblio.SignUpRequest;
import com.project7.soap.webservices.biblio.SignUpResponse;

@Endpoint
public class BiblioDetailsEndpoint {

	@Autowired
	AuthenticationService authenticationService;

	@Autowired
	BookService bookService;

	@PayloadRoot(namespace = "http://webservices.soap.project7.com/biblio", localPart = "AuthenticationRequest")
	@ResponsePayload
	public AuthenticationResponse processAuthenticationRequest(@RequestPayload AuthenticationRequest request) {
		Member member = authenticationService.authenticate(request.getEmail(), request.getPassword());
		AuthenticationResponse response = new AuthenticationResponse();
		response.setMemberDetails(mapMember(member));
		return response;
	}

	@PayloadRoot(namespace = "http://webservices.soap.project7.com/biblio", localPart = "SignUpRequest")
	@ResponsePayload
	public SignUpResponse processSignUpRequest(@RequestPayload SignUpRequest request) {
		Member member = new Member();
		member.setFirstName(request.getFirstName());
		member.setLastName(request.getLastName());
		member.setEmail(request.getEmail());
		member.setPasswd(request.getPassword());
		Member newMember = authenticationService.signUp(member);
		SignUpResponse response = new SignUpResponse();
		response.setMemberDetails(mapMember(newMember));
		return response;
	}

	@PayloadRoot(namespace = "http://webservices.soap.project7.com/biblio", localPart = "GetAllBooksRequest")
	@ResponsePayload
	public GetAllBooksResponse processGetAllBooksRequest(@RequestPayload GetAllBooksRequest request) {
		GetAllBooksResponse response = new GetAllBooksResponse();
		List<BookDetails> bookDetailsList = response.getBookDetails();
		List<Book> books = bookService.getAllBooks();
		for (Book book : books) {
			bookDetailsList.add(mapBook(book));
		}
		return response;
	}

	// It maps a @Member to a @MemberDetails
	private MemberDetails mapMember(Member member) {
		MemberDetails memberDetails = new MemberDetails();
		memberDetails.setId(member.getId());
		memberDetails.setFirstName(member.getFirstName());
		memberDetails.setLastName(member.getLastName());
		memberDetails.setEmail(member.getEmail());
		memberDetails.setPassword(member.getPasswd());
		return memberDetails;
	}

	// It maps a @Book to a @BookDetails
	private BookDetails mapBook(Book book) {
		BookDetails bookDetails = new BookDetails();
		bookDetails.setId(book.getId());
		bookDetails.setTitle(book.getTitle());
		bookDetails.setImage(book.getImage());
		bookDetails.setSummary(book.getSummary());
		bookDetails.setIsbn(book.getIsbn());
		bookDetails.setLanguageDetails(mapLanguage(book.getLanguage()));
		bookDetails.setEditorDetails(mapEditor(book.getEditor()));
		for (Author author : book.getAuthors()) {
			bookDetails.getAuthors().add(mapAuthor(author));
		}
		for (Copy copy : book.getCopies()) {
			bookDetails.getCopies().add(mapCopy(copy));
		}
		for (Genre genre : book.getGenres()) {
			bookDetails.getGenres().add(mapGenre(genre));
		}
		return bookDetails;
	}

	// It maps a @Author to a @AuthorDetails
	private AuthorDetails mapAuthor(Author author) {
		AuthorDetails authorDetails = new AuthorDetails();
		authorDetails.setId(author.getId());
		authorDetails.setFirstName(author.getFirstName());
		authorDetails.setLastName(author.getLastName());
		return authorDetails;
	}

	// It maps a @Language to a @LanguageDetails
	private LanguageDetails mapLanguage(Language language) {
		LanguageDetails languageDetails = new LanguageDetails();
		languageDetails.setId(language.getId());
		languageDetails.setLanguage(language.getLanguage());
		languageDetails.setCode(language.getCode());
		return languageDetails;
	}

	// It maps a @Editor to a @EditorDetails
	private EditorDetails mapEditor(Editor editor) {
		EditorDetails editorDetails = new EditorDetails();
		editorDetails.setId(editor.getId());
		editorDetails.setName(editor.getName());
		return editorDetails;
	}

	// It maps a @Copy to a @CopyDetails
	private CopyDetails mapCopy(Copy copy) {
		CopyDetails copyDetails = new CopyDetails();
		copyDetails.setId(copy.getId());
		return copyDetails;
	}

	// It maps a @Genre to a @GenreDetails
	private GenreDetails mapGenre(Genre genre) {
		GenreDetails genreDetails = new GenreDetails();
		genreDetails.setId(genre.getId());
		genreDetails.setGenre(genre.getGenre());
		return genreDetails;
	}

}
