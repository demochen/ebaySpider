
package com.ebay.services.finding;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3c.dom.Element;


/**
 * 
 * 						Container for the data of a single item that matches the search criteria.
 * 					
 * 
 * <p>Java class for SearchItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="globalId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="subtitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryCategory" type="{http://www.ebay.com/marketplace/search/v1/services}Category" minOccurs="0"/>
 *         &lt;element name="secondaryCategory" type="{http://www.ebay.com/marketplace/search/v1/services}Category" minOccurs="0"/>
 *         &lt;element name="galleryURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="viewItemURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="charityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.ebay.com/marketplace/search/v1/services}ProductId" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="autoPay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="storeInfo" type="{http://www.ebay.com/marketplace/search/v1/services}Storefront" minOccurs="0"/>
 *         &lt;element name="sellerInfo" type="{http://www.ebay.com/marketplace/search/v1/services}SellerInfo" minOccurs="0"/>
 *         &lt;element name="shippingInfo" type="{http://www.ebay.com/marketplace/search/v1/services}ShippingInfo" minOccurs="0"/>
 *         &lt;element name="sellingStatus" type="{http://www.ebay.com/marketplace/search/v1/services}SellingStatus" minOccurs="0"/>
 *         &lt;element name="listingInfo" type="{http://www.ebay.com/marketplace/search/v1/services}ListingInfo" minOccurs="0"/>
 *         &lt;element name="returnsAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="galleryPlusPictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="compatibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distance" type="{http://www.ebay.com/marketplace/search/v1/services}Distance" minOccurs="0"/>
 *         &lt;element name="condition" type="{http://www.ebay.com/marketplace/search/v1/services}Condition" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="delimiter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;any/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchItem", propOrder = {
    "itemId",
    "title",
    "globalId",
    "subtitle",
    "primaryCategory",
    "secondaryCategory",
    "galleryURL",
    "viewItemURL",
    "charityId",
    "productId",
    "paymentMethod",
    "autoPay",
    "postalCode",
    "location",
    "country",
    "storeInfo",
    "sellerInfo",
    "shippingInfo",
    "sellingStatus",
    "listingInfo",
    "returnsAccepted",
    "galleryPlusPictureURL",
    "compatibility",
    "distance",
    "condition",
    "delimiter",
    "any"
})
public class SearchItem
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected String itemId;
    @XmlElement(required = true)
    protected String title;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String globalId;
    protected String subtitle;
    protected Category primaryCategory;
    protected Category secondaryCategory;
    @XmlSchemaType(name = "anyURI")
    protected String galleryURL;
    @XmlSchemaType(name = "anyURI")
    protected String viewItemURL;
    protected String charityId;
    protected ProductId productId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paymentMethod;
    protected Boolean autoPay;
    protected String postalCode;
    protected String location;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String country;
    protected Storefront storeInfo;
    protected SellerInfo sellerInfo;
    protected ShippingInfo shippingInfo;
    protected SellingStatus sellingStatus;
    protected ListingInfo listingInfo;
    protected Boolean returnsAccepted;
    @XmlSchemaType(name = "anyURI")
    protected List<String> galleryPlusPictureURL;
    protected String compatibility;
    protected Distance distance;
    protected Condition condition;
    protected String delimiter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the title property.
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
     * Sets the value of the title property.
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
     * Gets the value of the globalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalId() {
        return globalId;
    }

    /**
     * Sets the value of the globalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalId(String value) {
        this.globalId = value;
    }

    /**
     * Gets the value of the subtitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * Sets the value of the subtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtitle(String value) {
        this.subtitle = value;
    }

    /**
     * Gets the value of the primaryCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getPrimaryCategory() {
        return primaryCategory;
    }

    /**
     * Sets the value of the primaryCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setPrimaryCategory(Category value) {
        this.primaryCategory = value;
    }

    /**
     * Gets the value of the secondaryCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getSecondaryCategory() {
        return secondaryCategory;
    }

    /**
     * Sets the value of the secondaryCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setSecondaryCategory(Category value) {
        this.secondaryCategory = value;
    }

    /**
     * Gets the value of the galleryURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGalleryURL() {
        return galleryURL;
    }

    /**
     * Sets the value of the galleryURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGalleryURL(String value) {
        this.galleryURL = value;
    }

    /**
     * Gets the value of the viewItemURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewItemURL() {
        return viewItemURL;
    }

    /**
     * Sets the value of the viewItemURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewItemURL(String value) {
        this.viewItemURL = value;
    }

    /**
     * Gets the value of the charityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharityId() {
        return charityId;
    }

    /**
     * Sets the value of the charityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharityId(String value) {
        this.charityId = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link ProductId }
     *     
     */
    public ProductId getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductId }
     *     
     */
    public void setProductId(ProductId value) {
        this.productId = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaymentMethod() {
        if (paymentMethod == null) {
            paymentMethod = new ArrayList<String>();
        }
        return this.paymentMethod;
    }

    /**
     * Gets the value of the autoPay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoPay() {
        return autoPay;
    }

    /**
     * Sets the value of the autoPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPay(Boolean value) {
        this.autoPay = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the storeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Storefront }
     *     
     */
    public Storefront getStoreInfo() {
        return storeInfo;
    }

    /**
     * Sets the value of the storeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Storefront }
     *     
     */
    public void setStoreInfo(Storefront value) {
        this.storeInfo = value;
    }

    /**
     * Gets the value of the sellerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SellerInfo }
     *     
     */
    public SellerInfo getSellerInfo() {
        return sellerInfo;
    }

    /**
     * Sets the value of the sellerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerInfo }
     *     
     */
    public void setSellerInfo(SellerInfo value) {
        this.sellerInfo = value;
    }

    /**
     * Gets the value of the shippingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingInfo }
     *     
     */
    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    /**
     * Sets the value of the shippingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingInfo }
     *     
     */
    public void setShippingInfo(ShippingInfo value) {
        this.shippingInfo = value;
    }

    /**
     * Gets the value of the sellingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SellingStatus }
     *     
     */
    public SellingStatus getSellingStatus() {
        return sellingStatus;
    }

    /**
     * Sets the value of the sellingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingStatus }
     *     
     */
    public void setSellingStatus(SellingStatus value) {
        this.sellingStatus = value;
    }

    /**
     * Gets the value of the listingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ListingInfo }
     *     
     */
    public ListingInfo getListingInfo() {
        return listingInfo;
    }

    /**
     * Sets the value of the listingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingInfo }
     *     
     */
    public void setListingInfo(ListingInfo value) {
        this.listingInfo = value;
    }

    /**
     * Gets the value of the returnsAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnsAccepted() {
        return returnsAccepted;
    }

    /**
     * Sets the value of the returnsAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnsAccepted(Boolean value) {
        this.returnsAccepted = value;
    }

    /**
     * Gets the value of the galleryPlusPictureURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the galleryPlusPictureURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGalleryPlusPictureURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGalleryPlusPictureURL() {
        if (galleryPlusPictureURL == null) {
            galleryPlusPictureURL = new ArrayList<String>();
        }
        return this.galleryPlusPictureURL;
    }

    /**
     * Gets the value of the compatibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibility() {
        return compatibility;
    }

    /**
     * Sets the value of the compatibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibility(String value) {
        this.compatibility = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setDistance(Distance value) {
        this.distance = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setCondition(Condition value) {
        this.condition = value;
    }

    /**
     * Gets the value of the delimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the value of the delimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
