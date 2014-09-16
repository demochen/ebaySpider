
package com.ebay.services.finding;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ebay.services.finding package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetHistogramsRequest_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "getHistogramsRequest");
    private final static QName _FindItemsIneBayStoresResponse_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "findItemsIneBayStoresResponse");
    private final static QName _FindItemsByProductResponse_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "findItemsByProductResponse");
    private final static QName _GetVersionResponse_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "getVersionResponse");
    private final static QName _FindItemsForFavoriteSearchRequest_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "findItemsForFavoriteSearchRequest");
    private final static QName _FindItemsIneBayStoresRequest_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "findItemsIneBayStoresRequest");
    private final static QName _FindCompletedItemsResponse_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "findCompletedItemsResponse");
    private final static QName _FindItemsAdvancedRequest_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "findItemsAdvancedRequest");
    private final static QName _GetVersionRequest_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "getVersionRequest");
    private final static QName _FindItemsForFavoriteSearchResponse_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "findItemsForFavoriteSearchResponse");
    private final static QName _GetHistogramsResponse_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "getHistogramsResponse");
    private final static QName _FindCompletedItemsRequest_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "findCompletedItemsRequest");
    private final static QName _FindItemsAdvancedResponse_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "findItemsAdvancedResponse");
    private final static QName _GetSearchKeywordsRecommendationResponse_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "getSearchKeywordsRecommendationResponse");
    private final static QName _FindItemsByKeywordsRequest_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "findItemsByKeywordsRequest");
    private final static QName _FindItemsByKeywordsResponse_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "findItemsByKeywordsResponse");
    private final static QName _FindItemsByCategoryResponse_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "findItemsByCategoryResponse");
    private final static QName _FindItemsByProductRequest_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "findItemsByProductRequest");
    private final static QName _GetSearchKeywordsRecommendationRequest_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "getSearchKeywordsRecommendationRequest");
    private final static QName _FindItemsByCategoryRequest_QNAME = new QName("http://www.ebay.com/marketplace/search/v1/services", "findItemsByCategoryRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ebay.services.finding
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SellingStatus }
     * 
     */
    public SellingStatus createSellingStatus() {
        return new SellingStatus();
    }

    /**
     * Create an instance of {@link PaginationOutput }
     * 
     */
    public PaginationOutput createPaginationOutput() {
        return new PaginationOutput();
    }

    /**
     * Create an instance of {@link FindItemsIneBayStoresResponse }
     * 
     */
    public FindItemsIneBayStoresResponse createFindItemsIneBayStoresResponse() {
        return new FindItemsIneBayStoresResponse();
    }

    /**
     * Create an instance of {@link FindCompletedItemsResponse }
     * 
     */
    public FindCompletedItemsResponse createFindCompletedItemsResponse() {
        return new FindCompletedItemsResponse();
    }

    /**
     * Create an instance of {@link SearchItem }
     * 
     */
    public SearchItem createSearchItem() {
        return new SearchItem();
    }

    /**
     * Create an instance of {@link ErrorData }
     * 
     */
    public ErrorData createErrorData() {
        return new ErrorData();
    }

    /**
     * Create an instance of {@link ItemFilter }
     * 
     */
    public ItemFilter createItemFilter() {
        return new ItemFilter();
    }

    /**
     * Create an instance of {@link Distance }
     * 
     */
    public Distance createDistance() {
        return new Distance();
    }

    /**
     * Create an instance of {@link GetVersionRequest }
     * 
     */
    public GetVersionRequest createGetVersionRequest() {
        return new GetVersionRequest();
    }

    /**
     * Create an instance of {@link FindItemsByProductResponse }
     * 
     */
    public FindItemsByProductResponse createFindItemsByProductResponse() {
        return new FindItemsByProductResponse();
    }

    /**
     * Create an instance of {@link Condition }
     * 
     */
    public Condition createCondition() {
        return new Condition();
    }

    /**
     * Create an instance of {@link ConditionHistogramContainer }
     * 
     */
    public ConditionHistogramContainer createConditionHistogramContainer() {
        return new ConditionHistogramContainer();
    }

    /**
     * Create an instance of {@link SellerInfo }
     * 
     */
    public SellerInfo createSellerInfo() {
        return new SellerInfo();
    }

    /**
     * Create an instance of {@link ExtensionType }
     * 
     */
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link GetHistogramsRequest }
     * 
     */
    public GetHistogramsRequest createGetHistogramsRequest() {
        return new GetHistogramsRequest();
    }

    /**
     * Create an instance of {@link GetSearchKeywordsRecommendationResponse }
     * 
     */
    public GetSearchKeywordsRecommendationResponse createGetSearchKeywordsRecommendationResponse() {
        return new GetSearchKeywordsRecommendationResponse();
    }

    /**
     * Create an instance of {@link Aspect }
     * 
     */
    public Aspect createAspect() {
        return new Aspect();
    }

    /**
     * Create an instance of {@link Storefront }
     * 
     */
    public Storefront createStorefront() {
        return new Storefront();
    }

    /**
     * Create an instance of {@link ProductId }
     * 
     */
    public ProductId createProductId() {
        return new ProductId();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link FindItemsAdvancedResponse }
     * 
     */
    public FindItemsAdvancedResponse createFindItemsAdvancedResponse() {
        return new FindItemsAdvancedResponse();
    }

    /**
     * Create an instance of {@link PaginationInput }
     * 
     */
    public PaginationInput createPaginationInput() {
        return new PaginationInput();
    }

    /**
     * Create an instance of {@link GetVersionResponse }
     * 
     */
    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    /**
     * Create an instance of {@link AspectHistogramContainer }
     * 
     */
    public AspectHistogramContainer createAspectHistogramContainer() {
        return new AspectHistogramContainer();
    }

    /**
     * Create an instance of {@link AspectFilter }
     * 
     */
    public AspectFilter createAspectFilter() {
        return new AspectFilter();
    }

    /**
     * Create an instance of {@link GetHistogramsResponse }
     * 
     */
    public GetHistogramsResponse createGetHistogramsResponse() {
        return new GetHistogramsResponse();
    }

    /**
     * Create an instance of {@link ConditionHistogram }
     * 
     */
    public ConditionHistogram createConditionHistogram() {
        return new ConditionHistogram();
    }

    /**
     * Create an instance of {@link AspectValueHistogram }
     * 
     */
    public AspectValueHistogram createAspectValueHistogram() {
        return new AspectValueHistogram();
    }

    /**
     * Create an instance of {@link GetSearchKeywordsRecommendationRequest }
     * 
     */
    public GetSearchKeywordsRecommendationRequest createGetSearchKeywordsRecommendationRequest() {
        return new GetSearchKeywordsRecommendationRequest();
    }

    /**
     * Create an instance of {@link FindItemsIneBayStoresRequest }
     * 
     */
    public FindItemsIneBayStoresRequest createFindItemsIneBayStoresRequest() {
        return new FindItemsIneBayStoresRequest();
    }

    /**
     * Create an instance of {@link ErrorParameter }
     * 
     */
    public ErrorParameter createErrorParameter() {
        return new ErrorParameter();
    }

    /**
     * Create an instance of {@link CategoryHistogramContainer }
     * 
     */
    public CategoryHistogramContainer createCategoryHistogramContainer() {
        return new CategoryHistogramContainer();
    }

    /**
     * Create an instance of {@link DomainFilter }
     * 
     */
    public DomainFilter createDomainFilter() {
        return new DomainFilter();
    }

    /**
     * Create an instance of {@link FindItemsByKeywordsResponse }
     * 
     */
    public FindItemsByKeywordsResponse createFindItemsByKeywordsResponse() {
        return new FindItemsByKeywordsResponse();
    }

    /**
     * Create an instance of {@link FindItemsByCategoryRequest }
     * 
     */
    public FindItemsByCategoryRequest createFindItemsByCategoryRequest() {
        return new FindItemsByCategoryRequest();
    }

    /**
     * Create an instance of {@link FindItemsAdvancedRequest }
     * 
     */
    public FindItemsAdvancedRequest createFindItemsAdvancedRequest() {
        return new FindItemsAdvancedRequest();
    }

    /**
     * Create an instance of {@link FindItemsForFavoriteSearchRequest }
     * 
     */
    public FindItemsForFavoriteSearchRequest createFindItemsForFavoriteSearchRequest() {
        return new FindItemsForFavoriteSearchRequest();
    }

    /**
     * Create an instance of {@link FindItemsByKeywordsRequest }
     * 
     */
    public FindItemsByKeywordsRequest createFindItemsByKeywordsRequest() {
        return new FindItemsByKeywordsRequest();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link FindItemsByCategoryResponse }
     * 
     */
    public FindItemsByCategoryResponse createFindItemsByCategoryResponse() {
        return new FindItemsByCategoryResponse();
    }

    /**
     * Create an instance of {@link Amount }
     * 
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link FindItemsForFavoriteSearchResponse }
     * 
     */
    public FindItemsForFavoriteSearchResponse createFindItemsForFavoriteSearchResponse() {
        return new FindItemsForFavoriteSearchResponse();
    }

    /**
     * Create an instance of {@link ErrorMessage }
     * 
     */
    public ErrorMessage createErrorMessage() {
        return new ErrorMessage();
    }

    /**
     * Create an instance of {@link ListingInfo }
     * 
     */
    public ListingInfo createListingInfo() {
        return new ListingInfo();
    }

    /**
     * Create an instance of {@link Affiliate }
     * 
     */
    public Affiliate createAffiliate() {
        return new Affiliate();
    }

    /**
     * Create an instance of {@link ShippingInfo }
     * 
     */
    public ShippingInfo createShippingInfo() {
        return new ShippingInfo();
    }

    /**
     * Create an instance of {@link FindItemsByProductRequest }
     * 
     */
    public FindItemsByProductRequest createFindItemsByProductRequest() {
        return new FindItemsByProductRequest();
    }

    /**
     * Create an instance of {@link FindCompletedItemsRequest }
     * 
     */
    public FindCompletedItemsRequest createFindCompletedItemsRequest() {
        return new FindCompletedItemsRequest();
    }

    /**
     * Create an instance of {@link CategoryHistogram }
     * 
     */
    public CategoryHistogram createCategoryHistogram() {
        return new CategoryHistogram();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistogramsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "getHistogramsRequest")
    public JAXBElement<GetHistogramsRequest> createGetHistogramsRequest(GetHistogramsRequest value) {
        return new JAXBElement<GetHistogramsRequest>(_GetHistogramsRequest_QNAME, GetHistogramsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemsIneBayStoresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "findItemsIneBayStoresResponse")
    public JAXBElement<FindItemsIneBayStoresResponse> createFindItemsIneBayStoresResponse(FindItemsIneBayStoresResponse value) {
        return new JAXBElement<FindItemsIneBayStoresResponse>(_FindItemsIneBayStoresResponse_QNAME, FindItemsIneBayStoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemsByProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "findItemsByProductResponse")
    public JAXBElement<FindItemsByProductResponse> createFindItemsByProductResponse(FindItemsByProductResponse value) {
        return new JAXBElement<FindItemsByProductResponse>(_FindItemsByProductResponse_QNAME, FindItemsByProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "getVersionResponse")
    public JAXBElement<GetVersionResponse> createGetVersionResponse(GetVersionResponse value) {
        return new JAXBElement<GetVersionResponse>(_GetVersionResponse_QNAME, GetVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemsForFavoriteSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "findItemsForFavoriteSearchRequest")
    public JAXBElement<FindItemsForFavoriteSearchRequest> createFindItemsForFavoriteSearchRequest(FindItemsForFavoriteSearchRequest value) {
        return new JAXBElement<FindItemsForFavoriteSearchRequest>(_FindItemsForFavoriteSearchRequest_QNAME, FindItemsForFavoriteSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemsIneBayStoresRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "findItemsIneBayStoresRequest")
    public JAXBElement<FindItemsIneBayStoresRequest> createFindItemsIneBayStoresRequest(FindItemsIneBayStoresRequest value) {
        return new JAXBElement<FindItemsIneBayStoresRequest>(_FindItemsIneBayStoresRequest_QNAME, FindItemsIneBayStoresRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCompletedItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "findCompletedItemsResponse")
    public JAXBElement<FindCompletedItemsResponse> createFindCompletedItemsResponse(FindCompletedItemsResponse value) {
        return new JAXBElement<FindCompletedItemsResponse>(_FindCompletedItemsResponse_QNAME, FindCompletedItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemsAdvancedRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "findItemsAdvancedRequest")
    public JAXBElement<FindItemsAdvancedRequest> createFindItemsAdvancedRequest(FindItemsAdvancedRequest value) {
        return new JAXBElement<FindItemsAdvancedRequest>(_FindItemsAdvancedRequest_QNAME, FindItemsAdvancedRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "getVersionRequest")
    public JAXBElement<GetVersionRequest> createGetVersionRequest(GetVersionRequest value) {
        return new JAXBElement<GetVersionRequest>(_GetVersionRequest_QNAME, GetVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemsForFavoriteSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "findItemsForFavoriteSearchResponse")
    public JAXBElement<FindItemsForFavoriteSearchResponse> createFindItemsForFavoriteSearchResponse(FindItemsForFavoriteSearchResponse value) {
        return new JAXBElement<FindItemsForFavoriteSearchResponse>(_FindItemsForFavoriteSearchResponse_QNAME, FindItemsForFavoriteSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistogramsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "getHistogramsResponse")
    public JAXBElement<GetHistogramsResponse> createGetHistogramsResponse(GetHistogramsResponse value) {
        return new JAXBElement<GetHistogramsResponse>(_GetHistogramsResponse_QNAME, GetHistogramsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCompletedItemsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "findCompletedItemsRequest")
    public JAXBElement<FindCompletedItemsRequest> createFindCompletedItemsRequest(FindCompletedItemsRequest value) {
        return new JAXBElement<FindCompletedItemsRequest>(_FindCompletedItemsRequest_QNAME, FindCompletedItemsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemsAdvancedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "findItemsAdvancedResponse")
    public JAXBElement<FindItemsAdvancedResponse> createFindItemsAdvancedResponse(FindItemsAdvancedResponse value) {
        return new JAXBElement<FindItemsAdvancedResponse>(_FindItemsAdvancedResponse_QNAME, FindItemsAdvancedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSearchKeywordsRecommendationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "getSearchKeywordsRecommendationResponse")
    public JAXBElement<GetSearchKeywordsRecommendationResponse> createGetSearchKeywordsRecommendationResponse(GetSearchKeywordsRecommendationResponse value) {
        return new JAXBElement<GetSearchKeywordsRecommendationResponse>(_GetSearchKeywordsRecommendationResponse_QNAME, GetSearchKeywordsRecommendationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemsByKeywordsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "findItemsByKeywordsRequest")
    public JAXBElement<FindItemsByKeywordsRequest> createFindItemsByKeywordsRequest(FindItemsByKeywordsRequest value) {
        return new JAXBElement<FindItemsByKeywordsRequest>(_FindItemsByKeywordsRequest_QNAME, FindItemsByKeywordsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemsByKeywordsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "findItemsByKeywordsResponse")
    public JAXBElement<FindItemsByKeywordsResponse> createFindItemsByKeywordsResponse(FindItemsByKeywordsResponse value) {
        return new JAXBElement<FindItemsByKeywordsResponse>(_FindItemsByKeywordsResponse_QNAME, FindItemsByKeywordsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemsByCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "findItemsByCategoryResponse")
    public JAXBElement<FindItemsByCategoryResponse> createFindItemsByCategoryResponse(FindItemsByCategoryResponse value) {
        return new JAXBElement<FindItemsByCategoryResponse>(_FindItemsByCategoryResponse_QNAME, FindItemsByCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemsByProductRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "findItemsByProductRequest")
    public JAXBElement<FindItemsByProductRequest> createFindItemsByProductRequest(FindItemsByProductRequest value) {
        return new JAXBElement<FindItemsByProductRequest>(_FindItemsByProductRequest_QNAME, FindItemsByProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSearchKeywordsRecommendationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "getSearchKeywordsRecommendationRequest")
    public JAXBElement<GetSearchKeywordsRecommendationRequest> createGetSearchKeywordsRecommendationRequest(GetSearchKeywordsRecommendationRequest value) {
        return new JAXBElement<GetSearchKeywordsRecommendationRequest>(_GetSearchKeywordsRecommendationRequest_QNAME, GetSearchKeywordsRecommendationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemsByCategoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/search/v1/services", name = "findItemsByCategoryRequest")
    public JAXBElement<FindItemsByCategoryRequest> createFindItemsByCategoryRequest(FindItemsByCategoryRequest value) {
        return new JAXBElement<FindItemsByCategoryRequest>(_FindItemsByCategoryRequest_QNAME, FindItemsByCategoryRequest.class, null, value);
    }

}
