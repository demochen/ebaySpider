
package com.ebay.services.finding;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Response container for the getVersion call. 
 * 					
 * 
 * <p>Java class for GetVersionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVersionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BaseServiceResponse">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetVersionResponse")
public class GetVersionResponse
    extends BaseServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;

}
