package wandrlove.external.api.finnair.InstantOffers.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class LowestPriceOfPeriod  {
  
  @ApiModelProperty(value = "")
  private CallDetails callDetails = null;
  @ApiModelProperty(value = "Currency code")
  private String currency = null;
  @ApiModelProperty(value = "Departure location's IATA code")
  private String dep = null;
  @ApiModelProperty(value = "Destination location's IATA code")
  private String dest = null;
  @ApiModelProperty(value = "")
  private String errorCode = null;
  @ApiModelProperty(value = "")
  private String errorMessage = null;
  @ApiModelProperty(value = "Cheapest prices per date")
  private List<Price> prices = new ArrayList<Price>();

 /**
   * Get callDetails
   * @return callDetails
  **/
  public CallDetails getCallDetails() {
    return callDetails;
  }

  public void setCallDetails(CallDetails callDetails) {
    this.callDetails = callDetails;
  }

  public LowestPriceOfPeriod callDetails(CallDetails callDetails) {
    this.callDetails = callDetails;
    return this;
  }

 /**
   * Currency code
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public LowestPriceOfPeriod currency(String currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Departure location&#39;s IATA code
   * @return dep
  **/
  public String getDep() {
    return dep;
  }

  public void setDep(String dep) {
    this.dep = dep;
  }

  public LowestPriceOfPeriod dep(String dep) {
    this.dep = dep;
    return this;
  }

 /**
   * Destination location&#39;s IATA code
   * @return dest
  **/
  public String getDest() {
    return dest;
  }

  public void setDest(String dest) {
    this.dest = dest;
  }

  public LowestPriceOfPeriod dest(String dest) {
    this.dest = dest;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public LowestPriceOfPeriod errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get errorMessage
   * @return errorMessage
  **/
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public LowestPriceOfPeriod errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

 /**
   * Cheapest prices per date
   * @return prices
  **/
  public List<Price> getPrices() {
    return prices;
  }

  public void setPrices(List<Price> prices) {
    this.prices = prices;
  }

  public LowestPriceOfPeriod prices(List<Price> prices) {
    this.prices = prices;
    return this;
  }

  public LowestPriceOfPeriod addPricesItem(Price pricesItem) {
    this.prices.add(pricesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LowestPriceOfPeriod {\n");
    
    sb.append("    callDetails: ").append(toIndentedString(callDetails)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dep: ").append(toIndentedString(dep)).append("\n");
    sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

