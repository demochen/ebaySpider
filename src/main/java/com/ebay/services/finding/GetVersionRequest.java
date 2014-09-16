
package com.ebay.services.finding;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Returns the current version of the service. This simple call can be used to 
 * 						monitor the service for availability. This call has no input parameters and 
 * 						the response contains only the standard output fields. 
 * 					
 * 
 * <p>Java class for GetVersionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVersionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BaseServiceRequest">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetVersionRequest")
public class GetVersionRequest
    extends BaseServiceRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;

}
