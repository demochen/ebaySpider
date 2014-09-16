
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
 * 						Reduce the number of items returned by a find request using itemFilters.
 * 						Use the itemFilter container to specify itemFilter Name/Value pairs. 
 * 						You can include multiple itemFilters in a single request.
 * 					
 * 
 * <p>Java class for ItemFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="paramValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.ebay.com/marketplace/search/v1/services}ItemFilterType"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
@XmlType(name = "ItemFilter", propOrder = {
    "paramName",
    "paramValue",
    "name",
    "value",
    "delimiter",
    "any"
})
public class ItemFilter
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paramName;
    protected String paramValue;
    @XmlElement(required = true)
    protected ItemFilterType name;
    @XmlElement(required = true)
    protected List<String> value;
    protected String delimiter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the paramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * Sets the value of the paramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamName(String value) {
        this.paramName = value;
    }

    /**
     * Gets the value of the paramValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * Sets the value of the paramValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamValue(String value) {
        this.paramValue = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFilterType }
     *     
     */
    public ItemFilterType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFilterType }
     *     
     */
    public void setName(ItemFilterType value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
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
