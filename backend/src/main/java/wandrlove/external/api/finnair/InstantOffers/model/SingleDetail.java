package wandrlove.external.api.finnair.InstantOffers.model;


import io.swagger.annotations.ApiModelProperty;

public class SingleDetail  {
  
  @ApiModelProperty(value = "")
  private Long duration = null;
  @ApiModelProperty(value = "")
  private String messageId = null;
  @ApiModelProperty(value = "")
  private String sessionId = null;

 /**
   * Get duration
   * @return duration
  **/
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public SingleDetail duration(Long duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Get messageId
   * @return messageId
  **/
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public SingleDetail messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

 /**
   * Get sessionId
   * @return sessionId
  **/
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public SingleDetail sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleDetail {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

