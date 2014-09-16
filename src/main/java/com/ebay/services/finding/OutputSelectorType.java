
package com.ebay.services.finding;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputSelectorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputSelectorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SellerInfo"/>
 *     &lt;enumeration value="StoreInfo"/>
 *     &lt;enumeration value="CategoryHistogram"/>
 *     &lt;enumeration value="AspectHistogram"/>
 *     &lt;enumeration value="ConditionHistogram"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OutputSelectorType")
@XmlEnum
public enum OutputSelectorType {

    @XmlEnumValue("SellerInfo")
    SELLER_INFO("SellerInfo"),
    @XmlEnumValue("StoreInfo")
    STORE_INFO("StoreInfo"),
    @XmlEnumValue("CategoryHistogram")
    CATEGORY_HISTOGRAM("CategoryHistogram"),
    @XmlEnumValue("AspectHistogram")
    ASPECT_HISTOGRAM("AspectHistogram"),
    @XmlEnumValue("ConditionHistogram")
    CONDITION_HISTOGRAM("ConditionHistogram");
    private final String value;

    OutputSelectorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputSelectorType fromValue(String v) {
        for (OutputSelectorType c: OutputSelectorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
