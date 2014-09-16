
package com.ebay.services.finding;

import java.io.Serializable;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 						Reserved for future use.
 * 					
 * 
 * <p>Java class for FindItemsForFavoriteSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindItemsForFavoriteSearchRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BaseServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="searchId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="searchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="paginationInput" type="{http://www.ebay.com/marketplace/search/v1/services}PaginationInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindItemsForFavoriteSearchRequest", propOrder = {
    "searchId",
    "searchName",
    "startTimeFrom",
    "paginationInput"
})
public class FindItemsForFavoriteSearchRequest
    extends BaseServiceRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Long searchId;
    protected String searchName;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startTimeFrom;
    protected PaginationInput paginationInput;

    /**
     * Gets the value of the searchId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSearchId() {
        return searchId;
    }

    /**
     * Sets the value of the searchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSearchId(Long value) {
        this.searchId = value;
    }

    /**
     * Gets the value of the searchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchName() {
        return searchName;
    }

    /**
     * Sets the value of the searchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchName(String value) {
        this.searchName = value;
    }

    /**
     * Gets the value of the startTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartTimeFrom() {
        return startTimeFrom;
    }

    /**
     * Sets the value of the startTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeFrom(Calendar value) {
        this.startTimeFrom = value;
    }

    /**
     * Gets the value of the paginationInput property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationInput }
     *     
     */
    public PaginationInput getPaginationInput() {
        return paginationInput;
    }

    /**
     * Sets the value of the paginationInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationInput }
     *     
     */
    public void setPaginationInput(PaginationInput value) {
        this.paginationInput = value;
    }

}
