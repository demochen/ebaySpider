
package com.ebay.services.finding;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Response container for the getHistogram call. 
 * 					
 * 
 * <p>Java class for GetHistogramsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHistogramsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BaseServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="categoryHistogramContainer" type="{http://www.ebay.com/marketplace/search/v1/services}CategoryHistogramContainer" minOccurs="0"/>
 *         &lt;element name="aspectHistogramContainer" type="{http://www.ebay.com/marketplace/search/v1/services}AspectHistogramContainer" minOccurs="0"/>
 *         &lt;element name="conditionHistogramContainer" type="{http://www.ebay.com/marketplace/search/v1/services}ConditionHistogramContainer" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.ebay.com/marketplace/search/v1/services}ExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHistogramsResponse", propOrder = {
    "categoryHistogramContainer",
    "aspectHistogramContainer",
    "conditionHistogramContainer",
    "extension"
})
public class GetHistogramsResponse
    extends BaseServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CategoryHistogramContainer categoryHistogramContainer;
    protected AspectHistogramContainer aspectHistogramContainer;
    protected ConditionHistogramContainer conditionHistogramContainer;
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the categoryHistogramContainer property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryHistogramContainer }
     *     
     */
    public CategoryHistogramContainer getCategoryHistogramContainer() {
        return categoryHistogramContainer;
    }

    /**
     * Sets the value of the categoryHistogramContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryHistogramContainer }
     *     
     */
    public void setCategoryHistogramContainer(CategoryHistogramContainer value) {
        this.categoryHistogramContainer = value;
    }

    /**
     * Gets the value of the aspectHistogramContainer property.
     * 
     * @return
     *     possible object is
     *     {@link AspectHistogramContainer }
     *     
     */
    public AspectHistogramContainer getAspectHistogramContainer() {
        return aspectHistogramContainer;
    }

    /**
     * Sets the value of the aspectHistogramContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AspectHistogramContainer }
     *     
     */
    public void setAspectHistogramContainer(AspectHistogramContainer value) {
        this.aspectHistogramContainer = value;
    }

    /**
     * Gets the value of the conditionHistogramContainer property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionHistogramContainer }
     *     
     */
    public ConditionHistogramContainer getConditionHistogramContainer() {
        return conditionHistogramContainer;
    }

    /**
     * Sets the value of the conditionHistogramContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionHistogramContainer }
     *     
     */
    public void setConditionHistogramContainer(ConditionHistogramContainer value) {
        this.conditionHistogramContainer = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

}
