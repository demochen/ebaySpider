
package com.ebay.services.finding;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This is the base class container for all service operation requests.
 * 					
 * 
 * <p>Java class for BaseServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseServiceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseServiceRequest")
@XmlSeeAlso({
    GetVersionRequest.class,
    GetHistogramsRequest.class,
    FindItemsForFavoriteSearchRequest.class,
    GetSearchKeywordsRecommendationRequest.class,
    BaseFindingServiceRequest.class
})
public abstract class BaseServiceRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;

}
