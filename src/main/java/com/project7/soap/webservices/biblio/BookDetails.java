//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.06.13 à 03:21:31 PM WET 
//


package com.project7.soap.webservices.biblio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour BookDetails complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BookDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LanguageDetails" type="{http://webservices.soap.project7.com/biblio}LanguageDetails"/>
 *         &lt;element name="EditorDetails" type="{http://webservices.soap.project7.com/biblio}EditorDetails"/>
 *         &lt;element name="authors" type="{http://webservices.soap.project7.com/biblio}AuthorDetails" maxOccurs="unbounded"/>
 *         &lt;element name="genres" type="{http://webservices.soap.project7.com/biblio}GenreDetails" maxOccurs="unbounded"/>
 *         &lt;element name="copies" type="{http://webservices.soap.project7.com/biblio}CopyDetails" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookDetails", propOrder = {
    "id",
    "title",
    "image",
    "summary",
    "isbn",
    "languageDetails",
    "editorDetails",
    "authors",
    "genres",
    "copies"
})
public class BookDetails {

    protected long id;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String image;
    @XmlElement(required = true)
    protected String summary;
    protected long isbn;
    @XmlElement(name = "LanguageDetails", required = true)
    protected LanguageDetails languageDetails;
    @XmlElement(name = "EditorDetails", required = true)
    protected EditorDetails editorDetails;
    @XmlElement(required = true)
    protected List<AuthorDetails> authors;
    @XmlElement(required = true)
    protected List<GenreDetails> genres;
    @XmlElement(required = true)
    protected List<CopyDetails> copies;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propriété image.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Définit la valeur de la propriété image.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Obtient la valeur de la propriété summary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Définit la valeur de la propriété summary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Obtient la valeur de la propriété isbn.
     * 
     */
    public long getIsbn() {
        return isbn;
    }

    /**
     * Définit la valeur de la propriété isbn.
     * 
     */
    public void setIsbn(long value) {
        this.isbn = value;
    }

    /**
     * Obtient la valeur de la propriété languageDetails.
     * 
     * @return
     *     possible object is
     *     {@link LanguageDetails }
     *     
     */
    public LanguageDetails getLanguageDetails() {
        return languageDetails;
    }

    /**
     * Définit la valeur de la propriété languageDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageDetails }
     *     
     */
    public void setLanguageDetails(LanguageDetails value) {
        this.languageDetails = value;
    }

    /**
     * Obtient la valeur de la propriété editorDetails.
     * 
     * @return
     *     possible object is
     *     {@link EditorDetails }
     *     
     */
    public EditorDetails getEditorDetails() {
        return editorDetails;
    }

    /**
     * Définit la valeur de la propriété editorDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link EditorDetails }
     *     
     */
    public void setEditorDetails(EditorDetails value) {
        this.editorDetails = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorDetails }
     * 
     * 
     */
    public List<AuthorDetails> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<AuthorDetails>();
        }
        return this.authors;
    }

    /**
     * Gets the value of the genres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenreDetails }
     * 
     * 
     */
    public List<GenreDetails> getGenres() {
        if (genres == null) {
            genres = new ArrayList<GenreDetails>();
        }
        return this.genres;
    }

    /**
     * Gets the value of the copies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CopyDetails }
     * 
     * 
     */
    public List<CopyDetails> getCopies() {
        if (copies == null) {
            copies = new ArrayList<CopyDetails>();
        }
        return this.copies;
    }

}
