package wandrlove.external.api.finnair.Offers.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class RestError {

    @ApiModelProperty(value = "")
    private AmadeusResponse amadeusResponse = null;
    @ApiModelProperty(value = "")
    private String errorCode = null;
    @ApiModelProperty(value = "")
    private String errorMessage = null;
    @ApiModelProperty(value = "")
    private String fieldName = null;
    @ApiModelProperty(value = "")
    private String key = null;
    @ApiModelProperty(value = "")
    private String level = null;
    @ApiModelProperty(value = "")
    private List<String> stackTrace = new ArrayList<String>();

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
    @ApiModelProperty(value = "")
    private Date timestamp = null;
    @ApiModelProperty(value = "")
    private String trackingId = null;

    /**
     * Get amadeusResponse
     *
     * @return amadeusResponse
     **/
    public AmadeusResponse getAmadeusResponse() {
        return amadeusResponse;
    }

    public void setAmadeusResponse(AmadeusResponse amadeusResponse) {
        this.amadeusResponse = amadeusResponse;
    }

    public RestError amadeusResponse(AmadeusResponse amadeusResponse) {
        this.amadeusResponse = amadeusResponse;
        return this;
    }

    /**
     * Get errorCode
     *
     * @return errorCode
     **/
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public RestError errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get errorMessage
     *
     * @return errorMessage
     **/
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public RestError errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get fieldName
     *
     * @return fieldName
     **/
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public RestError fieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     **/
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public RestError key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get level
     *
     * @return level
     **/
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public RestError level(String level) {
        this.level = level;
        return this;
    }

    /**
     * Get stackTrace
     *
     * @return stackTrace
     **/
    public List<String> getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(List<String> stackTrace) {
        this.stackTrace = stackTrace;
    }

    public RestError stackTrace(List<String> stackTrace) {
        this.stackTrace = stackTrace;
        return this;
    }

    public RestError addStackTraceItem(String stackTraceItem) {
        this.stackTrace.add(stackTraceItem);
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

    public RestError status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/
    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public RestError timestamp(Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get trackingId
     *
     * @return trackingId
     **/
    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public RestError trackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestError {\n");

        sb.append("    amadeusResponse: ").append(toIndentedString(amadeusResponse)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
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

