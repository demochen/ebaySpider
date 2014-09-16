
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
 * 						Container for a top-level set of aspect histograms.
 * 					
 * 
 * <p>Java class for AspectHistogramContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AspectHistogramContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domainDisplayName" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="aspect" type="{http://www.ebay.com/marketplace/search/v1/services}Aspect" maxOccurs="unbounded"/>
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
@XmlType(name = "AspectHistogramContainer", propOrder = {
    "domainName",
    "domainDisplayName",
    "aspect",
    "delimiter",
    "any"
})
public class AspectHistogramContainer
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected String domainName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String domainDisplayName;
    @XmlElement(required = true)
    protected List<Aspect> aspect;
    protected String delimiter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the domainDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainDisplayName() {
        return domainDisplayName;
    }

    /**
     * Sets the value of the domainDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainDisplayName(String value) {
        this.domainDisplayName = value;
    }

    /**
     * Gets the value of the aspect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aspect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAspect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aspect }
     * 
     * 
     */
    public List<Aspect> getAspect() {
        if (aspect == null) {
            aspect = new ArrayList<Aspect>();
        }
        return this.aspect;
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
