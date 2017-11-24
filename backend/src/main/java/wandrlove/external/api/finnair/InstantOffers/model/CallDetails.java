package wandrlove.external.api.finnair.InstantOffers.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class CallDetails  {
  
  @ApiModelProperty(value = "")
  private List<SingleDetail> calls = new ArrayList<SingleDetail>();

 /**
   * Get calls
   * @return calls
  **/
  public List<SingleDetail> getCalls() {
    return calls;
  }

  public void setCalls(List<SingleDetail> calls) {
    this.calls = calls;
  }

  public CallDetails calls(List<SingleDetail> calls) {
    this.calls = calls;
    return this;
  }

  public CallDetails addCallsItem(SingleDetail callsItem) {
    this.calls.add(callsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallDetails {\n");
    
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
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

