
package com.ebay.services.finding;

import java.io.Serializable;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 						Base response container for all service operations. Contains error
 * 						information associated with the request.
 * 					
 * 
 * <p>Java class for BaseServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseServiceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ack" type="{http://www.ebay.com/marketplace/search/v1/services}AckValue"/>
 *         &lt;element name="errorMessage" type="{http://www.ebay.com/marketplace/search/v1/services}ErrorMessage" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseServiceResponse", propOrder = {
    "ack",
    "errorMessage",
    "version",
    "timestamp"
})
@XmlSeeAlso({
    GetSearchKeywordsRecommendationResponse.class,
    GetHistogramsResponse.class,
    GetVersionResponse.class,
    BaseFindingServiceResponse.class
})
public abstract class BaseServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected AckValue ack;
    protected ErrorMessage errorMessage;
    protected String version;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar timestamp;

    /**
     * Gets the value of the ack property.
     * 
     * @return
     *     possible object is
     *     {@link AckValue }
     *     
     */
    public AckValue getAck() {
        return ack;
    }

    /**
     * Sets the value of the ack property.
     * 
     * @param value
     *     allowed object is
     *     {@link AckValue }
     *     
     */
    public void setAck(AckValue value) {
        this.ack = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessage }
     *     
     */
    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessage }
     *     
     */
    public void setErrorMessage(ErrorMessage value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(Calendar value) {
        this.timestamp = value;
    }

}
