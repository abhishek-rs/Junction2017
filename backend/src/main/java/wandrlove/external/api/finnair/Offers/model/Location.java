package wandrlove.external.api.finnair.Offers.model;


import io.swagger.annotations.ApiModelProperty;

public class Location {

    @ApiModelProperty(value = "")
    private String cityCode = null;
    @ApiModelProperty(value = "")
    private String cityName = null;
    @ApiModelProperty(value = "")
    private String countryCode = null;
    @ApiModelProperty(value = "")
    private String name = null;
    @ApiModelProperty(value = "")
    private String type = null;

    /**
     * Get cityCode
     *
     * @return cityCode
     **/
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Location cityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }

    /**
     * Get cityName
     *
     * @return cityName
     **/
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Location cityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    /**
     * Get countryCode
     *
     * @return countryCode
     **/
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Location countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Location type(String type) {
        this.type = type;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Location {\n");

        sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
        sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

