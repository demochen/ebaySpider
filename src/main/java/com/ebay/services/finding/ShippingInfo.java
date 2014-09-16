
package com.ebay.services.finding;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3c.dom.Element;


/**
 * 
 * 						Container holding the item's shipping details.
 * 					
 * 
 * <p>Java class for ShippingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shippingServiceCost" type="{http://www.ebay.com/marketplace/search/v1/services}Amount" minOccurs="0"/>
 *         &lt;element name="shippingType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="shipToLocations" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expeditedShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="oneDayShippingAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="handlingTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "ShippingInfo", propOrder = {
    "shippingServiceCost",
    "shippingType",
    "shipToLocations",
    "expeditedShipping",
    "oneDayShippingAvailable",
    "handlingTime",
    "delimiter",
    "any"
})
public class ShippingInfo
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Amount shippingServiceCost;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingType;
    protected List<String> shipToLocations;
    protected Boolean expeditedShipping;
    protected Boolean oneDayShippingAvailable;
    protected Integer handlingTime;
    protected String delimiter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the shippingServiceCost property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getShippingServiceCost() {
        return shippingServiceCost;
    }

    /**
     * Sets the value of the shippingServiceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setShippingServiceCost(Amount value) {
        this.shippingServiceCost = value;
    }

    /**
     * Gets the value of the shippingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingType() {
        return shippingType;
    }

    /**
     * Sets the value of the shippingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingType(String value) {
        this.shippingType = value;
    }

    /**
     * Gets the value of the shipToLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipToLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipToLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getShipToLocations() {
        if (shipToLocations == null) {
            shipToLocations = new ArrayList<String>();
        }
        return this.shipToLocations;
    }

    /**
     * Gets the value of the expeditedShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpeditedShipping() {
        return expeditedShipping;
    }

    /**
     * Sets the value of the expeditedShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpeditedShipping(Boolean value) {
        this.expeditedShipping = value;
    }

    /**
     * Gets the value of the oneDayShippingAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneDayShippingAvailable() {
        return oneDayShippingAvailable;
    }

    /**
     * Sets the value of the oneDayShippingAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneDayShippingAvailable(Boolean value) {
        this.oneDayShippingAvailable = value;
    }

    /**
     * Gets the value of the handlingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandlingTime() {
        return handlingTime;
    }

    /**
     * Sets the value of the handlingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandlingTime(Integer value) {
        this.handlingTime = value;
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
