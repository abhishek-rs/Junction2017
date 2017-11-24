package wandrlove.external.api.finnair.Offers.model;


import io.swagger.annotations.ApiModelProperty;

public class BenefitIcon {

    @ApiModelProperty(value = "")
    private String iconKey = null;
    @ApiModelProperty(value = "")
    private String png = null;
    @ApiModelProperty(value = "")
    private String svg = null;

    /**
     * Get iconKey
     *
     * @return iconKey
     **/
    public String getIconKey() {
        return iconKey;
    }

    public void setIconKey(String iconKey) {
        this.iconKey = iconKey;
    }

    public BenefitIcon iconKey(String iconKey) {
        this.iconKey = iconKey;
        return this;
    }

    /**
     * Get png
     *
     * @return png
     **/
    public String getPng() {
        return png;
    }

    public void setPng(String png) {
        this.png = png;
    }

    public BenefitIcon png(String png) {
        this.png = png;
        return this;
    }

    /**
     * Get svg
     *
     * @return svg
     **/
    public String getSvg() {
        return svg;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }

    public BenefitIcon svg(String svg) {
        this.svg = svg;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BenefitIcon {\n");

        sb.append("    iconKey: ").append(toIndentedString(iconKey)).append("\n");
        sb.append("    png: ").append(toIndentedString(png)).append("\n");
        sb.append("    svg: ").append(toIndentedString(svg)).append("\n");
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

