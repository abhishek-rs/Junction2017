package wandrlove.external.api.finnair.InstantOffers.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class DebugInfo  {
  
  @ApiModelProperty(value = "")
  private List<String> fareBasis = new ArrayList<String>();
  @ApiModelProperty(value = "")
  private List<String> flightNumbers = new ArrayList<String>();

 /**
   * Get fareBasis
   * @return fareBasis
  **/
  public List<String> getFareBasis() {
    return fareBasis;
  }

  public void setFareBasis(List<String> fareBasis) {
    this.fareBasis = fareBasis;
  }

  public DebugInfo fareBasis(List<String> fareBasis) {
    this.fareBasis = fareBasis;
    return this;
  }

  public DebugInfo addFareBasisItem(String fareBasisItem) {
    this.fareBasis.add(fareBasisItem);
    return this;
  }

 /**
   * Get flightNumbers
   * @return flightNumbers
  **/
  public List<String> getFlightNumbers() {
    return flightNumbers;
  }

  public void setFlightNumbers(List<String> flightNumbers) {
    this.flightNumbers = flightNumbers;
  }

  public DebugInfo flightNumbers(List<String> flightNumbers) {
    this.flightNumbers = flightNumbers;
    return this;
  }

  public DebugInfo addFlightNumbersItem(String flightNumbersItem) {
    this.flightNumbers.add(flightNumbersItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugInfo {\n");
    
    sb.append("    fareBasis: ").append(toIndentedString(fareBasis)).append("\n");
    sb.append("    flightNumbers: ").append(toIndentedString(flightNumbers)).append("\n");
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

