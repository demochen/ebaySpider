
package com.ebay.services.finding;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;


/**
 * 
 * 						Statistical (histogram) information about categories that contain items that
 * 						match the query, if any. For categories associated with specific items, see
 * 						items returned in each search result. Shows the distribution of items across
 * 						each category. Not returned if there is no match.
 * 					
 * 
 * <p>Java class for CategoryHistogram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryHistogram">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}Category">
 *       &lt;sequence>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="childCategoryHistogram" type="{http://www.ebay.com/marketplace/search/v1/services}CategoryHistogram" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="delimiter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;any/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryHistogram", propOrder = {
    "count",
    "childCategoryHistogram",
    "delimiter",
    "any"
})
public class CategoryHistogram
    extends Category
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Long count;
    protected List<CategoryHistogram> childCategoryHistogram;
    protected String delimiter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the childCategoryHistogram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childCategoryHistogram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildCategoryHistogram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryHistogram }
     * 
     * 
     */
    public List<CategoryHistogram> getChildCategoryHistogram() {
        if (childCategoryHistogram == null) {
            childCategoryHistogram = new ArrayList<CategoryHistogram>();
        }
        return this.childCategoryHistogram;
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
