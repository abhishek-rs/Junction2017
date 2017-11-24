package wandrlove.external.api.finnair.Offers.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;

public class ControlData {

    @ApiModelProperty(value = "")
    private String destinationCountryCode = null;
    @ApiModelProperty(value = "")
    private String destinationLocationCode = null;
    @ApiModelProperty(value = "")
    private String market = null;
    @ApiModelProperty(value = "")
    private String officeId = null;
    @ApiModelProperty(value = "")
    private String originCountryCode = null;
    @ApiModelProperty(value = "")
    private String originLocationCode = null;
    @ApiModelProperty(value = "")
    private Boolean sellAncillariesInbound = null;
    @ApiModelProperty(value = "")
    private Boolean sellAncillariesOutbound = null;
    @ApiModelProperty(value = "")
    private Map<String, Boolean> sellAncillariesPerFlight = null;
    @ApiModelProperty(value = "")
    private Boolean sellBagsInbound = null;
    @ApiModelProperty(value = "")
    private Boolean sellBagsOutbound = null;
    @ApiModelProperty(value = "")
    private List<TravelerRequirements> travelers = new ArrayList<TravelerRequirements>();

    /**
     * Get destinationCountryCode
     *
     * @return destinationCountryCode
     **/
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    public ControlData destinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
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

    public ControlData destinationLocationCode(String destinationLocationCode) {
        this.destinationLocationCode = destinationLocationCode;
        return this;
    }

    /**
     * Get market
     *
     * @return market
     **/
    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public ControlData market(String market) {
        this.market = market;
        return this;
    }

    /**
     * Get officeId
     *
     * @return officeId
     **/
    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public ControlData officeId(String officeId) {
        this.officeId = officeId;
        return this;
    }

    /**
     * Get originCountryCode
     *
     * @return originCountryCode
     **/
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    public ControlData originCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
        return this;
    }

    /**
     * Get originLocationCode
     *
     * @return originLocationCode
     **/
    public String getOriginLocationCode() {
        return originLocationCode;
    }

    public void setOriginLocationCode(String originLocationCode) {
        this.originLocationCode = originLocationCode;
    }

    public ControlData originLocationCode(String originLocationCode) {
        this.originLocationCode = originLocationCode;
        return this;
    }

    /**
     * Get sellAncillariesInbound
     *
     * @return sellAncillariesInbound
     **/
    public Boolean getSellAncillariesInbound() {
        return sellAncillariesInbound;
    }

    public void setSellAncillariesInbound(Boolean sellAncillariesInbound) {
        this.sellAncillariesInbound = sellAncillariesInbound;
    }

    public ControlData sellAncillariesInbound(Boolean sellAncillariesInbound) {
        this.sellAncillariesInbound = sellAncillariesInbound;
        return this;
    }

    /**
     * Get sellAncillariesOutbound
     *
     * @return sellAncillariesOutbound
     **/
    public Boolean getSellAncillariesOutbound() {
        return sellAncillariesOutbound;
    }

    public void setSellAncillariesOutbound(Boolean sellAncillariesOutbound) {
        this.sellAncillariesOutbound = sellAncillariesOutbound;
    }

    public ControlData sellAncillariesOutbound(Boolean sellAncillariesOutbound) {
        this.sellAncillariesOutbound = sellAncillariesOutbound;
        return this;
    }

    /**
     * Get sellAncillariesPerFlight
     *
     * @return sellAncillariesPerFlight
     **/
    public Object getSellAncillariesPerFlight() {
        return sellAncillariesPerFlight;
    }

    public void setSellAncillariesPerFlight(Map<String, Boolean> sellAncillariesPerFlight) {
        this.sellAncillariesPerFlight = sellAncillariesPerFlight;
    }

    public ControlData sellAncillariesPerFlight(Map<String, Boolean> sellAncillariesPerFlight) {
        this.sellAncillariesPerFlight = sellAncillariesPerFlight;
        return this;
    }

    /**
     * Get sellBagsInbound
     *
     * @return sellBagsInbound
     **/
    public Boolean getSellBagsInbound() {
        return sellBagsInbound;
    }

    public void setSellBagsInbound(Boolean sellBagsInbound) {
        this.sellBagsInbound = sellBagsInbound;
    }

    public ControlData sellBagsInbound(Boolean sellBagsInbound) {
        this.sellBagsInbound = sellBagsInbound;
        return this;
    }

    /**
     * Get sellBagsOutbound
     *
     * @return sellBagsOutbound
     **/
    public Boolean getSellBagsOutbound() {
        return sellBagsOutbound;
    }

    public void setSellBagsOutbound(Boolean sellBagsOutbound) {
        this.sellBagsOutbound = sellBagsOutbound;
    }

    public ControlData sellBagsOutbound(Boolean sellBagsOutbound) {
        this.sellBagsOutbound = sellBagsOutbound;
        return this;
    }

    /**
     * Get travelers
     *
     * @return travelers
     **/
    public List<TravelerRequirements> getTravelers() {
        return travelers;
    }

    public void setTravelers(List<TravelerRequirements> travelers) {
        this.travelers = travelers;
    }

    public ControlData travelers(List<TravelerRequirements> travelers) {
        this.travelers = travelers;
        return this;
    }

    public ControlData addTravelersItem(TravelerRequirements travelersItem) {
        this.travelers.add(travelersItem);
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ControlData {\n");

        sb.append("    destinationCountryCode: ").append(toIndentedString(destinationCountryCode)).append("\n");
        sb.append("    destinationLocationCode: ").append(toIndentedString(destinationLocationCode)).append("\n");
        sb.append("    market: ").append(toIndentedString(market)).append("\n");
        sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
        sb.append("    originCountryCode: ").append(toIndentedString(originCountryCode)).append("\n");
        sb.append("    originLocationCode: ").append(toIndentedString(originLocationCode)).append("\n");
        sb.append("    sellAncillariesInbound: ").append(toIndentedString(sellAncillariesInbound)).append("\n");
        sb.append("    sellAncillariesOutbound: ").append(toIndentedString(sellAncillariesOutbound)).append("\n");
        sb.append("    sellAncillariesPerFlight: ").append(toIndentedString(sellAncillariesPerFlight)).append("\n");
        sb.append("    sellBagsInbound: ").append(toIndentedString(sellBagsInbound)).append("\n");
        sb.append("    sellBagsOutbound: ").append(toIndentedString(sellBagsOutbound)).append("\n");
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

