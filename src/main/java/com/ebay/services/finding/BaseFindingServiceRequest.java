
package com.ebay.services.finding;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This is the base request container for all Finding Service operations.
 * 					
 * 
 * <p>Java class for BaseFindingServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseFindingServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BaseServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="paginationInput" type="{http://www.ebay.com/marketplace/search/v1/services}PaginationInput" minOccurs="0"/>
 *         &lt;element name="buyerPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliate" type="{http://www.ebay.com/marketplace/search/v1/services}Affiliate" minOccurs="0"/>
 *         &lt;element name="sortOrder" type="{http://www.ebay.com/marketplace/search/v1/services}SortOrderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFindingServiceRequest", propOrder = {
    "paginationInput",
    "buyerPostalCode",
    "affiliate",
    "sortOrder"
})
@XmlSeeAlso({
    FindItemsByKeywordsRequest.class,
    FindCompletedItemsRequest.class,
    FindItemsAdvancedRequest.class,
    FindItemsIneBayStoresRequest.class,
    FindItemsByCategoryRequest.class,
    FindItemsByProductRequest.class
})
public abstract class BaseFindingServiceRequest
    extends BaseServiceRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected PaginationInput paginationInput;
    protected String buyerPostalCode;
    protected Affiliate affiliate;
    protected SortOrderType sortOrder;

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

    /**
     * Gets the value of the buyerPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerPostalCode() {
        return buyerPostalCode;
    }

    /**
     * Sets the value of the buyerPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerPostalCode(String value) {
        this.buyerPostalCode = value;
    }

    /**
     * Gets the value of the affiliate property.
     * 
     * @return
     *     possible object is
     *     {@link Affiliate }
     *     
     */
    public Affiliate getAffiliate() {
        return affiliate;
    }

    /**
     * Sets the value of the affiliate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Affiliate }
     *     
     */
    public void setAffiliate(Affiliate value) {
        this.affiliate = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderType }
     *     
     */
    public SortOrderType getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderType }
     *     
     */
    public void setSortOrder(SortOrderType value) {
        this.sortOrder = value;
    }

}
