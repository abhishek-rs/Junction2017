package wandrlove.external.api.finnair.Offers.model;


import io.swagger.annotations.ApiModelProperty;

public class CancellationPolicy {

    @ApiModelProperty(value = "")
    private Boolean isPositive = null;
    @ApiModelProperty(value = "")
    private String label = null;
    @ApiModelProperty(value = "")
    private String value = null;

    /**
     * Get isPositive
     *
     * @return isPositive
     **/
    public Boolean getIsPositive() {
        return isPositive;
    }

    public void setIsPositive(Boolean isPositive) {
        this.isPositive = isPositive;
    }

    public CancellationPolicy isPositive(Boolean isPositive) {
        this.isPositive = isPositive;
        return this;
    }

    /**
     * Get label
     *
     * @return label
     **/
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CancellationPolicy label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CancellationPolicy value(String value) {
        this.value = value;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancellationPolicy {\n");

        sb.append("    isPositive: ").append(toIndentedString(isPositive)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

