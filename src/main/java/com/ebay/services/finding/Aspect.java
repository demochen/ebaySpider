
package com.ebay.services.finding;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;


/**
 * 
 * 						Characteristic of an item in a domain. For example, "Shoes Size" or "Style"
 * 						might be aspects of the Men's Shoes domain, while "Genre" and "Album Type"
 * 						could be aspects of the Music CDs domain.
 * 						<br><br>
 * 						This container is not returned if there are no matching aspects for the
 * 						associated domain.
 * 					
 * 
 * <p>Java class for Aspect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Aspect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valueHistogram" type="{http://www.ebay.com/marketplace/search/v1/services}AspectValueHistogram" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="delimiter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;any/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aspect", propOrder = {
    "valueHistogram",
    "delimiter",
    "any"
})
public class Aspect
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected List<AspectValueHistogram> valueHistogram;
    protected String delimiter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(required = true)
    protected String name;

    /**
     * Gets the value of the valueHistogram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueHistogram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueHistogram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AspectValueHistogram }
     * 
     * 
     */
    public List<AspectValueHistogram> getValueHistogram() {
        if (valueHistogram == null) {
            valueHistogram = new ArrayList<AspectValueHistogram>();
        }
        return this.valueHistogram;
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

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
