package wandrlove.external.api.finnair.Offers.model;


import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AmadeusResponse {

    @ApiModelProperty(value = "")
    private Integer httpStatusCode = null;
    @ApiModelProperty(value = "")
    private String messageCode = null;
    @ApiModelProperty(value = "")
    private String messageDetail = null;

    @XmlType(name = "MessageLevelEnum")
    @XmlEnum(String.class)
    public enum MessageLevelEnum {

        @XmlEnumValue("error") ERROR(String.valueOf("error")), @XmlEnumValue("warning") WARNING(String.valueOf("warning")), @XmlEnumValue("info") INFO(String.valueOf("info"));


        private String value;

        MessageLevelEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MessageLevelEnum fromValue(String v) {
            for (MessageLevelEnum b : MessageLevelEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            return null;
        }
    }

    @ApiModelProperty(value = "")
    private MessageLevelEnum messageLevel = null;
    @ApiModelProperty(value = "")
    private String messageSourceParameter = null;
    @ApiModelProperty(value = "")
    private String messageSourcePointer = null;
    @ApiModelProperty(value = "")
    private String messageTitle = null;

    /**
     * Get httpStatusCode
     *
     * @return httpStatusCode
     **/
    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public AmadeusResponse httpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }

    /**
     * Get messageCode
     *
     * @return messageCode
     **/
    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public AmadeusResponse messageCode(String messageCode) {
        this.messageCode = messageCode;
        return this;
    }

    /**
     * Get messageDetail
     *
     * @return messageDetail
     **/
    public String getMessageDetail() {
        return messageDetail;
    }

    public void setMessageDetail(String messageDetail) {
        this.messageDetail = messageDetail;
    }

    public AmadeusResponse messageDetail(String messageDetail) {
        this.messageDetail = messageDetail;
        return this;
    }

    /**
     * Get messageLevel
     *
     * @return messageLevel
     **/
    public MessageLevelEnum getMessageLevel() {
        return messageLevel;
    }

    public void setMessageLevel(MessageLevelEnum messageLevel) {
        this.messageLevel = messageLevel;
    }

    public AmadeusResponse messageLevel(MessageLevelEnum messageLevel) {
        this.messageLevel = messageLevel;
        return this;
    }

    /**
     * Get messageSourceParameter
     *
     * @return messageSourceParameter
     **/
    public String getMessageSourceParameter() {
        return messageSourceParameter;
    }

    public void setMessageSourceParameter(String messageSourceParameter) {
        this.messageSourceParameter = messageSourceParameter;
    }

    public AmadeusResponse messageSourceParameter(String messageSourceParameter) {
        this.messageSourceParameter = messageSourceParameter;
        return this;
    }

    /**
     * Get messageSourcePointer
     *
     * @return messageSourcePointer
     **/
    public String getMessageSourcePointer() {
        return messageSourcePointer;
    }

    public void setMessageSourcePointer(String messageSourcePointer) {
        this.messageSourcePointer = messageSourcePointer;
    }

    public AmadeusResponse messageSourcePointer(String messageSourcePointer) {
        this.messageSourcePointer = messageSourcePointer;
        return this;
    }

    /**
     * Get messageTitle
     *
     * @return messageTitle
     **/
    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public AmadeusResponse messageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AmadeusResponse {\n");

        sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
        sb.append("    messageCode: ").append(toIndentedString(messageCode)).append("\n");
        sb.append("    messageDetail: ").append(toIndentedString(messageDetail)).append("\n");
        sb.append("    messageLevel: ").append(toIndentedString(messageLevel)).append("\n");
        sb.append("    messageSourceParameter: ").append(toIndentedString(messageSourceParameter)).append("\n");
        sb.append("    messageSourcePointer: ").append(toIndentedString(messageSourcePointer)).append("\n");
        sb.append("    messageTitle: ").append(toIndentedString(messageTitle)).append("\n");
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

