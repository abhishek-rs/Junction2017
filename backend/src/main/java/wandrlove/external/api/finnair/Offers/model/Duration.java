package wandrlove.external.api.finnair.Offers.model;


import io.swagger.annotations.ApiModelProperty;

public class Duration {

    @ApiModelProperty(value = "")
    private Long days = null;
    @ApiModelProperty(value = "")
    private Long hours = null;
    @ApiModelProperty(value = "")
    private Long hoursForDays = null;
    @ApiModelProperty(value = "")
    private Long milliseconds = null;
    @ApiModelProperty(value = "")
    private Long minutes = null;

    /**
     * Get days
     *
     * @return days
     **/
    public Long getDays() {
        return days;
    }

    public void setDays(Long days) {
        this.days = days;
    }

    public Duration days(Long days) {
        this.days = days;
        return this;
    }

    /**
     * Get hours
     *
     * @return hours
     **/
    public Long getHours() {
        return hours;
    }

    public void setHours(Long hours) {
        this.hours = hours;
    }

    public Duration hours(Long hours) {
        this.hours = hours;
        return this;
    }

    /**
     * Get hoursForDays
     *
     * @return hoursForDays
     **/
    public Long getHoursForDays() {
        return hoursForDays;
    }

    public void setHoursForDays(Long hoursForDays) {
        this.hoursForDays = hoursForDays;
    }

    public Duration hoursForDays(Long hoursForDays) {
        this.hoursForDays = hoursForDays;
        return this;
    }

    /**
     * Get milliseconds
     *
     * @return milliseconds
     **/
    public Long getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Long milliseconds) {
        this.milliseconds = milliseconds;
    }

    public Duration milliseconds(Long milliseconds) {
        this.milliseconds = milliseconds;
        return this;
    }

    /**
     * Get minutes
     *
     * @return minutes
     **/
    public Long getMinutes() {
        return minutes;
    }

    public void setMinutes(Long minutes) {
        this.minutes = minutes;
    }

    public Duration minutes(Long minutes) {
        this.minutes = minutes;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Duration {\n");

        sb.append("    days: ").append(toIndentedString(days)).append("\n");
        sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
        sb.append("    hoursForDays: ").append(toIndentedString(hoursForDays)).append("\n");
        sb.append("    milliseconds: ").append(toIndentedString(milliseconds)).append("\n");
        sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
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

