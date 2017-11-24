package wandrlove.external.api.finnair.Offers.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class OfferList {

    @ApiModelProperty(value = "")
    private Map<AirlineCode, Airline> airlines = null;
    @ApiModelProperty(value = "")
    private List<Object> cancellationPolicy = new ArrayList<Object>();
    @ApiModelProperty(value = "")
    private String currency = null;
    @ApiModelProperty(value = "")
    private Map<FareFamilyCode, FareFamily> fareFamilies = null;
    @ApiModelProperty(value = "")
    private Boolean hasFlightsInUnitedStates = null;
    @ApiModelProperty(value = "")
    private String hash = null;
    @ApiModelProperty(value = "")
    private Map<String, List<SequentialBoundId>> inbounds = null;
    @ApiModelProperty(value = "")
    private Object locations = null;
    @ApiModelProperty(value = "")
    private List<RestError> messages = new ArrayList<RestError>();
    @ApiModelProperty(value = "")
    private List<Offer> offers = new ArrayList<Offer>();
    @ApiModelProperty(value = "")
    private Map<String, List<SequentialBoundId>> outbounds = null;
    @ApiModelProperty(value = "")
    private SearchParameters searchParameters = null;
    @ApiModelProperty(value = "")
    private Sorting sorting = null;

    @XmlType(name = "StatusEnum")
    @XmlEnum(String.class)
    public enum StatusEnum {

        @XmlEnumValue("OK") OK(String.valueOf("OK")), @XmlEnumValue("NO_FLIGHTS_FOUND") NO_FLIGHTS_FOUND(String.valueOf("NO_FLIGHTS_FOUND")), @XmlEnumValue("INVALID_INPUT") INVALID_INPUT(String.valueOf("INVALID_INPUT")), @XmlEnumValue("OTHER_ERROR") OTHER_ERROR(String.valueOf("OTHER_ERROR")), @XmlEnumValue("NO_FLIGHTS_LEFT_FOR_TODAY") NO_FLIGHTS_LEFT_FOR_TODAY(String.valueOf("NO_FLIGHTS_LEFT_FOR_TODAY"));


        private String value;

        StatusEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String v) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            return null;
        }
    }

    @ApiModelProperty(value = "")
    private StatusEnum status = null;

    /**
     * Get airlines
     *
     * @return airlines
     **/
    public Object getAirlines() {
        return airlines;
    }

    public void setAirlines(Map<AirlineCode, Airline> airlines) {
        this.airlines = airlines;
    }

    public OfferList airlines(Map<AirlineCode, Airline> airlines) {
        this.airlines = airlines;
        return this;
    }

    /**
     * Get cancellationPolicy
     *
     * @return cancellationPolicy
     **/
    public List<Object> getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(List<Object> cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public OfferList cancellationPolicy(List<Object> cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
        return this;
    }

    public OfferList addCancellationPolicyItem(Object cancellationPolicyItem) {
        this.cancellationPolicy.add(cancellationPolicyItem);
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public OfferList currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get fareFamilies
     *
     * @return fareFamilies
     **/
    public Object getFareFamilies() {
        return fareFamilies;
    }

    public void setFareFamilies(Map<FareFamilyCode, FareFamily> fareFamilies) {
        this.fareFamilies = fareFamilies;
    }

    public OfferList fareFamilies(Map<FareFamilyCode, FareFamily> fareFamilies) {
        this.fareFamilies = fareFamilies;
        return this;
    }

    /**
     * Get hasFlightsInUnitedStates
     *
     * @return hasFlightsInUnitedStates
     **/
    public Boolean getHasFlightsInUnitedStates() {
        return hasFlightsInUnitedStates;
    }

    public void setHasFlightsInUnitedStates(Boolean hasFlightsInUnitedStates) {
        this.hasFlightsInUnitedStates = hasFlightsInUnitedStates;
    }

    public OfferList hasFlightsInUnitedStates(Boolean hasFlightsInUnitedStates) {
        this.hasFlightsInUnitedStates = hasFlightsInUnitedStates;
        return this;
    }

    /**
     * Get hash
     *
     * @return hash
     **/
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public OfferList hash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * Get inbounds
     *
     * @return inbounds
     **/
    public Object getInbounds() {
        return inbounds;
    }

    public void setInbounds(Map<String, List<SequentialBoundId>> inbounds) {
        this.inbounds = inbounds;
    }

    public OfferList inbounds(Map<String, List<SequentialBoundId>> inbounds) {
        this.inbounds = inbounds;
        return this;
    }

    /**
     * Get locations
     *
     * @return locations
     **/
    public Object getLocations() {
        return locations;
    }

    public void setLocations(Object locations) {
        this.locations = locations;
    }

    public OfferList locations(Object locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get messages
     *
     * @return messages
     **/
    public List<RestError> getMessages() {
        return messages;
    }

    public void setMessages(List<RestError> messages) {
        this.messages = messages;
    }

    public OfferList messages(List<RestError> messages) {
        this.messages = messages;
        return this;
    }

    public OfferList addMessagesItem(RestError messagesItem) {
        this.messages.add(messagesItem);
        return this;
    }

    /**
     * Get offers
     *
     * @return offers
     **/
    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    public OfferList offers(List<Offer> offers) {
        this.offers = offers;
        return this;
    }

    public OfferList addOffersItem(Offer offersItem) {
        this.offers.add(offersItem);
        return this;
    }

    /**
     * Get outbounds
     *
     * @return outbounds
     **/
    public Object getOutbounds() {
        return outbounds;
    }

    public void setOutbounds(Map<String, List<SequentialBoundId>> outbounds) {
        this.outbounds = outbounds;
    }

    public OfferList outbounds(Map<String, List<SequentialBoundId>> outbounds) {
        this.outbounds = outbounds;
        return this;
    }

    /**
     * Get searchParameters
     *
     * @return searchParameters
     **/
    public SearchParameters getSearchParameters() {
        return searchParameters;
    }

    public void setSearchParameters(SearchParameters searchParameters) {
        this.searchParameters = searchParameters;
    }

    public OfferList searchParameters(SearchParameters searchParameters) {
        this.searchParameters = searchParameters;
        return this;
    }

    /**
     * Get sorting
     *
     * @return sorting
     **/
    public Sorting getSorting() {
        return sorting;
    }

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }

    public OfferList sorting(Sorting sorting) {
        this.sorting = sorting;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OfferList status(StatusEnum status) {
        this.status = status;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferList {\n");

        sb.append("    airlines: ").append(toIndentedString(airlines)).append("\n");
        sb.append("    cancellationPolicy: ").append(toIndentedString(cancellationPolicy)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    fareFamilies: ").append(toIndentedString(fareFamilies)).append("\n");
        sb.append("    hasFlightsInUnitedStates: ").append(toIndentedString(hasFlightsInUnitedStates)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    inbounds: ").append(toIndentedString(inbounds)).append("\n");
        sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
        sb.append("    outbounds: ").append(toIndentedString(outbounds)).append("\n");
        sb.append("    searchParameters: ").append(toIndentedString(searchParameters)).append("\n");
        sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

