package wandrlove.external.api.finnair.InstantOffers.model;

import io.swagger.annotations.ApiModelProperty;

public class Price  {
  
  @ApiModelProperty(value = "Date for the price record (yyyy-MM-dd)")
  private String date = null;
  @ApiModelProperty(value = "")
  private DebugInfo departureDebugInfo = null;
  @ApiModelProperty(value = "")
  private Boolean noFlight = null;
  @ApiModelProperty(value = "")
  private Integer price = null;
  @ApiModelProperty(value = "")
  private DebugInfo returnDebugInfo = null;

 /**
   * Date for the price record (yyyy-MM-dd)
   * @return date
  **/
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Price date(String date) {
    this.date = date;
    return this;
  }

 /**
   * Get departureDebugInfo
   * @return departureDebugInfo
  **/
  public DebugInfo getDepartureDebugInfo() {
    return departureDebugInfo;
  }

  public void setDepartureDebugInfo(DebugInfo departureDebugInfo) {
    this.departureDebugInfo = departureDebugInfo;
  }

  public Price departureDebugInfo(DebugInfo departureDebugInfo) {
    this.departureDebugInfo = departureDebugInfo;
    return this;
  }

 /**
   * Get noFlight
   * @return noFlight
  **/
  public Boolean getNoFlight() {
    return noFlight;
  }

  public void setNoFlight(Boolean noFlight) {
    this.noFlight = noFlight;
  }

  public Price noFlight(Boolean noFlight) {
    this.noFlight = noFlight;
    return this;
  }

 /**
   * Get price
   * @return price
  **/
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Price price(Integer price) {
    this.price = price;
    return this;
  }

 /**
   * Get returnDebugInfo
   * @return returnDebugInfo
  **/
  public DebugInfo getReturnDebugInfo() {
    return returnDebugInfo;
  }

  public void setReturnDebugInfo(DebugInfo returnDebugInfo) {
    this.returnDebugInfo = returnDebugInfo;
  }

  public Price returnDebugInfo(DebugInfo returnDebugInfo) {
    this.returnDebugInfo = returnDebugInfo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    departureDebugInfo: ").append(toIndentedString(departureDebugInfo)).append("\n");
    sb.append("    noFlight: ").append(toIndentedString(noFlight)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    returnDebugInfo: ").append(toIndentedString(returnDebugInfo)).append("\n");
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

