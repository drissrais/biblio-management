//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.06.13 à 03:21:31 PM WET 
//


package com.project7.soap.webservices.biblio;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.project7.soap.webservices.biblio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.project7.soap.webservices.biblio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignUpResponse }
     * 
     */
    public SignUpResponse createSignUpResponse() {
        return new SignUpResponse();
    }

    /**
     * Create an instance of {@link MemberDetails }
     * 
     */
    public MemberDetails createMemberDetails() {
        return new MemberDetails();
    }

    /**
     * Create an instance of {@link GetAllBooksRequest }
     * 
     */
    public GetAllBooksRequest createGetAllBooksRequest() {
        return new GetAllBooksRequest();
    }

    /**
     * Create an instance of {@link SignUpRequest }
     * 
     */
    public SignUpRequest createSignUpRequest() {
        return new SignUpRequest();
    }

    /**
     * Create an instance of {@link AuthenticationRequest }
     * 
     */
    public AuthenticationRequest createAuthenticationRequest() {
        return new AuthenticationRequest();
    }

    /**
     * Create an instance of {@link GetAllBooksResponse }
     * 
     */
    public GetAllBooksResponse createGetAllBooksResponse() {
        return new GetAllBooksResponse();
    }

    /**
     * Create an instance of {@link BookDetails }
     * 
     */
    public BookDetails createBookDetails() {
        return new BookDetails();
    }

    /**
     * Create an instance of {@link AuthenticationResponse }
     * 
     */
    public AuthenticationResponse createAuthenticationResponse() {
        return new AuthenticationResponse();
    }

    /**
     * Create an instance of {@link GenreDetails }
     * 
     */
    public GenreDetails createGenreDetails() {
        return new GenreDetails();
    }

    /**
     * Create an instance of {@link LanguageDetails }
     * 
     */
    public LanguageDetails createLanguageDetails() {
        return new LanguageDetails();
    }

    /**
     * Create an instance of {@link EditorDetails }
     * 
     */
    public EditorDetails createEditorDetails() {
        return new EditorDetails();
    }

    /**
     * Create an instance of {@link AuthorDetails }
     * 
     */
    public AuthorDetails createAuthorDetails() {
        return new AuthorDetails();
    }

    /**
     * Create an instance of {@link CopyDetails }
     * 
     */
    public CopyDetails createCopyDetails() {
        return new CopyDetails();
    }

}
