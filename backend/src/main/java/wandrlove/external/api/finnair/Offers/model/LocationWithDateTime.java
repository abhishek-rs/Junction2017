package wandrlove.external.api.finnair.Offers.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class LocationWithDateTime {

    @ApiModelProperty(value = "")
    private Date dateTime = null;
    @ApiModelProperty(value = "")
    private LocationCode locationCode = null;
    @ApiModelProperty(value = "")
    private String terminal = null;

    /**
     * Get dateTime
     *
     * @return dateTime
     **/
    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public LocationWithDateTime dateTime(Date dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Get locationCode
     *
     * @return locationCode
     **/
    public LocationCode getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(LocationCode locationCode) {
        this.locationCode = locationCode;
    }

    public LocationWithDateTime locationCode(LocationCode locationCode) {
        this.locationCode = locationCode;
        return this;
    }

    /**
     * Get terminal
     *
     * @return terminal
     **/
    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public LocationWithDateTime terminal(String terminal) {
        this.terminal = terminal;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationWithDateTime {\n");

        sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
        sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
        sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
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

