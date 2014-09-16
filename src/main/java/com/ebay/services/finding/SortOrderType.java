
package com.ebay.services.finding;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BestMatch"/>
 *     &lt;enumeration value="CurrentPriceHighest"/>
 *     &lt;enumeration value="DistanceNearest"/>
 *     &lt;enumeration value="EndTimeSoonest"/>
 *     &lt;enumeration value="PricePlusShippingLowest"/>
 *     &lt;enumeration value="PricePlusShippingHighest"/>
 *     &lt;enumeration value="StartTimeNewest"/>
 *     &lt;enumeration value="BidCountMost"/>
 *     &lt;enumeration value="BidCountFewest"/>
 *     &lt;enumeration value="CountryAscending"/>
 *     &lt;enumeration value="CountryDescending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortOrderType")
@XmlEnum
public enum SortOrderType {

    @XmlEnumValue("BestMatch")
    BEST_MATCH("BestMatch"),
    @XmlEnumValue("CurrentPriceHighest")
    CURRENT_PRICE_HIGHEST("CurrentPriceHighest"),
    @XmlEnumValue("DistanceNearest")
    DISTANCE_NEAREST("DistanceNearest"),
    @XmlEnumValue("EndTimeSoonest")
    END_TIME_SOONEST("EndTimeSoonest"),
    @XmlEnumValue("PricePlusShippingLowest")
    PRICE_PLUS_SHIPPING_LOWEST("PricePlusShippingLowest"),
    @XmlEnumValue("PricePlusShippingHighest")
    PRICE_PLUS_SHIPPING_HIGHEST("PricePlusShippingHighest"),
    @XmlEnumValue("StartTimeNewest")
    START_TIME_NEWEST("StartTimeNewest"),
    @XmlEnumValue("BidCountMost")
    BID_COUNT_MOST("BidCountMost"),
    @XmlEnumValue("BidCountFewest")
    BID_COUNT_FEWEST("BidCountFewest"),
    @XmlEnumValue("CountryAscending")
    COUNTRY_ASCENDING("CountryAscending"),
    @XmlEnumValue("CountryDescending")
    COUNTRY_DESCENDING("CountryDescending");
    private final String value;

    SortOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortOrderType fromValue(String v) {
        for (SortOrderType c: SortOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
