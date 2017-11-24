package wandrlove.external.api.finnair.Offers.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class SearchParameters {

    @ApiModelProperty(value = "")
    private Integer adults = null;
    @ApiModelProperty(value = "")
    private String cabin = null;
    @ApiModelProperty(value = "")
    private Integer children = null;
    @ApiModelProperty(value = "")
    private List<String> commercialFareFamilies = new ArrayList<String>();
    @ApiModelProperty(value = "")
    private String departureDate = null;
    @ApiModelProperty(value = "")
    private String departureLocationCode = null;
    @ApiModelProperty(value = "")
    private String destinationLocationCode = null;
    @ApiModelProperty(value = "")
    private Integer infants = null;
    @ApiModelProperty(value = "")
    private Boolean oneway = null;
    @ApiModelProperty(value = "")
    private String returnDate = null;
    @ApiModelProperty(value = "")
    private String travelers = null;

    /**
     * Get adults
     *
     * @return adults
     **/
    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    public SearchParameters adults(Integer adults) {
        this.adults = adults;
        return this;
    }

    /**
     * Get cabin
     *
     * @return cabin
     **/
    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public SearchParameters cabin(String cabin) {
        this.cabin = cabin;
        return this;
    }

    /**
     * Get children
     *
     * @return children
     **/
    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public SearchParameters children(Integer children) {
        this.children = children;
        return this;
    }

    /**
     * Get commercialFareFamilies
     *
     * @return commercialFareFamilies
     **/
    public List<String> getCommercialFareFamilies() {
        return commercialFareFamilies;
    }

    public void setCommercialFareFamilies(List<String> commercialFareFamilies) {
        this.commercialFareFamilies = commercialFareFamilies;
    }

    public SearchParameters commercialFareFamilies(List<String> commercialFareFamilies) {
        this.commercialFareFamilies = commercialFareFamilies;
        return this;
    }

    public SearchParameters addCommercialFareFamiliesItem(String commercialFareFamiliesItem) {
        this.commercialFareFamilies.add(commercialFareFamiliesItem);
        return this;
    }

    /**
     * Get departureDate
     *
     * @return departureDate
     **/
    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public SearchParameters departureDate(String departureDate) {
        this.departureDate = departureDate;
        return this;
    }

    /**
     * Get departureLocationCode
     *
     * @return departureLocationCode
     **/
    public String getDepartureLocationCode() {
        return departureLocationCode;
    }

    public void setDepartureLocationCode(String departureLocationCode) {
        this.departureLocationCode = departureLocationCode;
    }

    public SearchParameters departureLocationCode(String departureLocationCode) {
        this.departureLocationCode = departureLocationCode;
        return this;
    }

    /**
     * Get destinationLocationCode
     *
     * @return destinationLocationCode
     **/
    public String getDestinationLocationCode() {
        return destinationLocationCode;
    }

    public void setDestinationLocationCode(String destinationLocationCode) {
        this.destinationLocationCode = destinationLocationCode;
    }

    public SearchParameters destinationLocationCode(String destinationLocationCode) {
        this.destinationLocationCode = destinationLocationCode;
        return this;
    }

    /**
     * Get infants
     *
     * @return infants
     **/
    public Integer getInfants() {
        return infants;
    }

    public void setInfants(Integer infants) {
        this.infants = infants;
    }

    public SearchParameters infants(Integer infants) {
        this.infants = infants;
        return this;
    }

    /**
     * Get oneway
     *
     * @return oneway
     **/
    public Boolean getOneway() {
        return oneway;
    }

    public void setOneway(Boolean oneway) {
        this.oneway = oneway;
    }

    public SearchParameters oneway(Boolean oneway) {
        this.oneway = oneway;
        return this;
    }

    /**
     * Get returnDate
     *
     * @return returnDate
     **/
    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public SearchParameters returnDate(String returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    /**
     * Get travelers
     *
     * @return travelers
     **/
    public String getTravelers() {
        return travelers;
    }

    public void setTravelers(String travelers) {
        this.travelers = travelers;
    }

    public SearchParameters travelers(String travelers) {
        this.travelers = travelers;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchParameters {\n");

        sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
        sb.append("    cabin: ").append(toIndentedString(cabin)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    commercialFareFamilies: ").append(toIndentedString(commercialFareFamilies)).append("\n");
        sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
        sb.append("    departureLocationCode: ").append(toIndentedString(departureLocationCode)).append("\n");
        sb.append("    destinationLocationCode: ").append(toIndentedString(destinationLocationCode)).append("\n");
        sb.append("    infants: ").append(toIndentedString(infants)).append("\n");
        sb.append("    oneway: ").append(toIndentedString(oneway)).append("\n");
        sb.append("    returnDate: ").append(toIndentedString(returnDate)).append("\n");
        sb.append("    travelers: ").append(toIndentedString(travelers)).append("\n");
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

