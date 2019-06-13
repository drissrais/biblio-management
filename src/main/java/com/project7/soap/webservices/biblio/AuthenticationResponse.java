//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.06.13 à 03:21:31 PM WET 
//


package com.project7.soap.webservices.biblio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberDetails" type="{http://webservices.soap.project7.com/biblio}MemberDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "memberDetails"
})
@XmlRootElement(name = "AuthenticationResponse")
public class AuthenticationResponse {

    @XmlElement(name = "MemberDetails", required = true)
    protected MemberDetails memberDetails;

    /**
     * Obtient la valeur de la propriété memberDetails.
     * 
     * @return
     *     possible object is
     *     {@link MemberDetails }
     *     
     */
    public MemberDetails getMemberDetails() {
        return memberDetails;
    }

    /**
     * Définit la valeur de la propriété memberDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberDetails }
     *     
     */
    public void setMemberDetails(MemberDetails value) {
        this.memberDetails = value;
    }

}
