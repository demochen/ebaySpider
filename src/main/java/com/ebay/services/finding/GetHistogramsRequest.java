
package com.ebay.services.finding;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Get request for histogram information on the supplied category or aspect.
 * 					
 * 
 * <p>Java class for GetHistogramsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHistogramsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BaseServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHistogramsRequest", propOrder = {
    "categoryId"
})
public class GetHistogramsRequest
    extends BaseServiceRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected String categoryId;

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryId(String value) {
        this.categoryId = value;
    }

}
