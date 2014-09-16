
package com.ebay.services.finding;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Condition"/>
 *     &lt;enumeration value="Currency"/>
 *     &lt;enumeration value="EndTimeFrom"/>
 *     &lt;enumeration value="ModTimeFrom"/>
 *     &lt;enumeration value="EndTimeTo"/>
 *     &lt;enumeration value="ExcludeAutoPay"/>
 *     &lt;enumeration value="BestOfferOnly"/>
 *     &lt;enumeration value="FeaturedOnly"/>
 *     &lt;enumeration value="FeedbackScoreMax"/>
 *     &lt;enumeration value="FeedbackScoreMin"/>
 *     &lt;enumeration value="FreeShippingOnly"/>
 *     &lt;enumeration value="GetItFastOnly"/>
 *     &lt;enumeration value="HideDuplicateItems"/>
 *     &lt;enumeration value="AvailableTo"/>
 *     &lt;enumeration value="LocatedIn"/>
 *     &lt;enumeration value="LocalPickupOnly"/>
 *     &lt;enumeration value="LocalSearchOnly"/>
 *     &lt;enumeration value="ListingType"/>
 *     &lt;enumeration value="LotsOnly"/>
 *     &lt;enumeration value="MaxBids"/>
 *     &lt;enumeration value="MinBids"/>
 *     &lt;enumeration value="MaxPrice"/>
 *     &lt;enumeration value="MinPrice"/>
 *     &lt;enumeration value="PaymentMethod"/>
 *     &lt;enumeration value="MaxQuantity"/>
 *     &lt;enumeration value="MinQuantity"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="ExcludeSeller"/>
 *     &lt;enumeration value="ExcludeCategory"/>
 *     &lt;enumeration value="WorldOfGoodOnly"/>
 *     &lt;enumeration value="MaxDistance"/>
 *     &lt;enumeration value="SellerBusinessType"/>
 *     &lt;enumeration value="TopRatedSellerOnly"/>
 *     &lt;enumeration value="SoldItemsOnly"/>
 *     &lt;enumeration value="CharityOnly"/>
 *     &lt;enumeration value="ListedIn"/>
 *     &lt;enumeration value="ExpeditedShippingType"/>
 *     &lt;enumeration value="MaxHandlingTime"/>
 *     &lt;enumeration value="ReturnsAcceptedOnly"/>
 *     &lt;enumeration value="ValueBoxInventory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFilterType")
@XmlEnum
public enum ItemFilterType {

    @XmlEnumValue("Condition")
    CONDITION("Condition"),
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),
    @XmlEnumValue("EndTimeFrom")
    END_TIME_FROM("EndTimeFrom"),
    @XmlEnumValue("ModTimeFrom")
    MOD_TIME_FROM("ModTimeFrom"),
    @XmlEnumValue("EndTimeTo")
    END_TIME_TO("EndTimeTo"),
    @XmlEnumValue("ExcludeAutoPay")
    EXCLUDE_AUTO_PAY("ExcludeAutoPay"),
    @XmlEnumValue("BestOfferOnly")
    BEST_OFFER_ONLY("BestOfferOnly"),
    @XmlEnumValue("FeaturedOnly")
    FEATURED_ONLY("FeaturedOnly"),
    @XmlEnumValue("FeedbackScoreMax")
    FEEDBACK_SCORE_MAX("FeedbackScoreMax"),
    @XmlEnumValue("FeedbackScoreMin")
    FEEDBACK_SCORE_MIN("FeedbackScoreMin"),
    @XmlEnumValue("FreeShippingOnly")
    FREE_SHIPPING_ONLY("FreeShippingOnly"),
    @XmlEnumValue("GetItFastOnly")
    GET_IT_FAST_ONLY("GetItFastOnly"),
    @XmlEnumValue("HideDuplicateItems")
    HIDE_DUPLICATE_ITEMS("HideDuplicateItems"),
    @XmlEnumValue("AvailableTo")
    AVAILABLE_TO("AvailableTo"),
    @XmlEnumValue("LocatedIn")
    LOCATED_IN("LocatedIn"),
    @XmlEnumValue("LocalPickupOnly")
    LOCAL_PICKUP_ONLY("LocalPickupOnly"),
    @XmlEnumValue("LocalSearchOnly")
    LOCAL_SEARCH_ONLY("LocalSearchOnly"),
    @XmlEnumValue("ListingType")
    LISTING_TYPE("ListingType"),
    @XmlEnumValue("LotsOnly")
    LOTS_ONLY("LotsOnly"),
    @XmlEnumValue("MaxBids")
    MAX_BIDS("MaxBids"),
    @XmlEnumValue("MinBids")
    MIN_BIDS("MinBids"),
    @XmlEnumValue("MaxPrice")
    MAX_PRICE("MaxPrice"),
    @XmlEnumValue("MinPrice")
    MIN_PRICE("MinPrice"),
    @XmlEnumValue("PaymentMethod")
    PAYMENT_METHOD("PaymentMethod"),
    @XmlEnumValue("MaxQuantity")
    MAX_QUANTITY("MaxQuantity"),
    @XmlEnumValue("MinQuantity")
    MIN_QUANTITY("MinQuantity"),
    @XmlEnumValue("Seller")
    SELLER("Seller"),
    @XmlEnumValue("ExcludeSeller")
    EXCLUDE_SELLER("ExcludeSeller"),
    @XmlEnumValue("ExcludeCategory")
    EXCLUDE_CATEGORY("ExcludeCategory"),
    @XmlEnumValue("WorldOfGoodOnly")
    WORLD_OF_GOOD_ONLY("WorldOfGoodOnly"),
    @XmlEnumValue("MaxDistance")
    MAX_DISTANCE("MaxDistance"),
    @XmlEnumValue("SellerBusinessType")
    SELLER_BUSINESS_TYPE("SellerBusinessType"),
    @XmlEnumValue("TopRatedSellerOnly")
    TOP_RATED_SELLER_ONLY("TopRatedSellerOnly"),
    @XmlEnumValue("SoldItemsOnly")
    SOLD_ITEMS_ONLY("SoldItemsOnly"),
    @XmlEnumValue("CharityOnly")
    CHARITY_ONLY("CharityOnly"),
    @XmlEnumValue("ListedIn")
    LISTED_IN("ListedIn"),
    @XmlEnumValue("ExpeditedShippingType")
    EXPEDITED_SHIPPING_TYPE("ExpeditedShippingType"),
    @XmlEnumValue("MaxHandlingTime")
    MAX_HANDLING_TIME("MaxHandlingTime"),
    @XmlEnumValue("ReturnsAcceptedOnly")
    RETURNS_ACCEPTED_ONLY("ReturnsAcceptedOnly"),
    @XmlEnumValue("ValueBoxInventory")
    VALUE_BOX_INVENTORY("ValueBoxInventory");
    private final String value;

    ItemFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFilterType fromValue(String v) {
        for (ItemFilterType c: ItemFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
