package wandrlove.external.api.finnair.Offers.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;

public class Offer {

    @ApiModelProperty(value = "")
    private FareFamilyCode inboundFareFamily = null;
    @ApiModelProperty(value = "")
    private SequentialBoundId inboundId = null;
    @ApiModelProperty(value = "")
    private BigDecimal inboundPrice = null;
    @ApiModelProperty(value = "")
    private String offerId = null;
    @ApiModelProperty(value = "")
    private FareFamilyCode outboundFareFamily = null;
    @ApiModelProperty(value = "")
    private SequentialBoundId outboundId = null;
    @ApiModelProperty(value = "")
    private BigDecimal outboundPrice = null;
    @ApiModelProperty(value = "")
    private BigDecimal totalPrice = null;

    /**
     * Get inboundFareFamily
     *
     * @return inboundFareFamily
     **/
    public FareFamilyCode getInboundFareFamily() {
        return inboundFareFamily;
    }

    public void setInboundFareFamily(FareFamilyCode inboundFareFamily) {
        this.inboundFareFamily = inboundFareFamily;
    }

    public Offer inboundFareFamily(FareFamilyCode inboundFareFamily) {
        this.inboundFareFamily = inboundFareFamily;
        return this;
    }

    /**
     * Get inboundId
     *
     * @return inboundId
     **/
    public SequentialBoundId getInboundId() {
        return inboundId;
    }

    public void setInboundId(SequentialBoundId inboundId) {
        this.inboundId = inboundId;
    }

    public Offer inboundId(SequentialBoundId inboundId) {
        this.inboundId = inboundId;
        return this;
    }

    /**
     * Get inboundPrice
     *
     * @return inboundPrice
     **/
    public BigDecimal getInboundPrice() {
        return inboundPrice;
    }

    public void setInboundPrice(BigDecimal inboundPrice) {
        this.inboundPrice = inboundPrice;
    }

    public Offer inboundPrice(BigDecimal inboundPrice) {
        this.inboundPrice = inboundPrice;
        return this;
    }

    /**
     * Get offerId
     *
     * @return offerId
     **/
    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public Offer offerId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    /**
     * Get outboundFareFamily
     *
     * @return outboundFareFamily
     **/
    public FareFamilyCode getOutboundFareFamily() {
        return outboundFareFamily;
    }

    public void setOutboundFareFamily(FareFamilyCode outboundFareFamily) {
        this.outboundFareFamily = outboundFareFamily;
    }

    public Offer outboundFareFamily(FareFamilyCode outboundFareFamily) {
        this.outboundFareFamily = outboundFareFamily;
        return this;
    }

    /**
     * Get outboundId
     *
     * @return outboundId
     **/
    public SequentialBoundId getOutboundId() {
        return outboundId;
    }

    public void setOutboundId(SequentialBoundId outboundId) {
        this.outboundId = outboundId;
    }

    public Offer outboundId(SequentialBoundId outboundId) {
        this.outboundId = outboundId;
        return this;
    }

    /**
     * Get outboundPrice
     *
     * @return outboundPrice
     **/
    public BigDecimal getOutboundPrice() {
        return outboundPrice;
    }

    public void setOutboundPrice(BigDecimal outboundPrice) {
        this.outboundPrice = outboundPrice;
    }

    public Offer outboundPrice(BigDecimal outboundPrice) {
        this.outboundPrice = outboundPrice;
        return this;
    }

    /**
     * Get totalPrice
     *
     * @return totalPrice
     **/
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Offer totalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Offer {\n");

        sb.append("    inboundFareFamily: ").append(toIndentedString(inboundFareFamily)).append("\n");
        sb.append("    inboundId: ").append(toIndentedString(inboundId)).append("\n");
        sb.append("    inboundPrice: ").append(toIndentedString(inboundPrice)).append("\n");
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    outboundFareFamily: ").append(toIndentedString(outboundFareFamily)).append("\n");
        sb.append("    outboundId: ").append(toIndentedString(outboundId)).append("\n");
        sb.append("    outboundPrice: ").append(toIndentedString(outboundPrice)).append("\n");
        sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
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

