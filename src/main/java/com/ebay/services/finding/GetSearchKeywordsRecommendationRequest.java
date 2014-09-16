
package com.ebay.services.finding;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Checks specified keywords for spelling errors and returns corrected keywords
 * 						that will provide better search results. If you make a keyword query search
 * 						that returns no results, use this call to check the keywords for
 * 						misspellings. The call checks the words in context of the entire query. For
 * 						example, if you submit "arry potter" in the request, the response will
 * 						recommend "harry potter." However, if you submit "potter arry" in the
 * 						request, the response will recommend "potter army." <br><br>
 * 						The response will not return recommended keywords in the following 
 * 						conditions:
 * 						<ul>
 * 						<li>
 * 							Keywords value returns results (even a single item) in either 
 * 							findItemsByKeywords or findItemsAdvanced.
 * 						</li>
 * 						<li>
 * 							Keywords value contains no misspelled words
 * 							(even if the keywords query returns no items).
 * 						</li>
 * 						</ul>
 * 					
 * 
 * <p>Java class for GetSearchKeywordsRecommendationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSearchKeywordsRecommendationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BaseServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSearchKeywordsRecommendationRequest", propOrder = {
    "keywords"
})
public class GetSearchKeywordsRecommendationRequest
    extends BaseServiceRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected String keywords;

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

}
