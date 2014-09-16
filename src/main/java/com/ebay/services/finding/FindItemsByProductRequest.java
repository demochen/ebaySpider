
package com.ebay.services.finding;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						You can use product IDs (such as an ISBN, UPC, EAN, or eBay Product Reference
 * 						ID) to find associated items listed on eBay.
 * 					
 * 
 * <p>Java class for FindItemsByProductRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindItemsByProductRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BaseFindingServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="productId" type="{http://www.ebay.com/marketplace/search/v1/services}ProductId"/>
 *         &lt;element name="itemFilter" type="{http://www.ebay.com/marketplace/search/v1/services}ItemFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outputSelector" type="{http://www.ebay.com/marketplace/search/v1/services}OutputSelectorType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindItemsByProductRequest", propOrder = {
    "productId",
    "itemFilter",
    "outputSelector"
})
public class FindItemsByProductRequest
    extends BaseFindingServiceRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected ProductId productId;
    protected List<ItemFilter> itemFilter;
    protected List<OutputSelectorType> outputSelector;

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
     * Gets the value of the itemFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemFilter }
     * 
     * 
     */
    public List<ItemFilter> getItemFilter() {
        if (itemFilter == null) {
            itemFilter = new ArrayList<ItemFilter>();
        }
        return this.itemFilter;
    }

    /**
     * Gets the value of the outputSelector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputSelector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputSelector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputSelectorType }
     * 
     * 
     */
    public List<OutputSelectorType> getOutputSelector() {
        if (outputSelector == null) {
            outputSelector = new ArrayList<OutputSelectorType>();
        }
        return this.outputSelector;
    }

}
