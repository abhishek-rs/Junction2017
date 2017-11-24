package wandrlove.external.api.finnair.Offers.model;


import io.swagger.annotations.ApiModelProperty;

public class TranslatedBenefitRow {

    @ApiModelProperty(value = "")
    private Boolean isPositive = null;
    @ApiModelProperty(value = "")
    private String key = null;
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

    public TranslatedBenefitRow isPositive(Boolean isPositive) {
        this.isPositive = isPositive;
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

    public TranslatedBenefitRow key(String key) {
        this.key = key;
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

    public TranslatedBenefitRow label(String label) {
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

    public TranslatedBenefitRow value(String value) {
        this.value = value;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranslatedBenefitRow {\n");

        sb.append("    isPositive: ").append(toIndentedString(isPositive)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

