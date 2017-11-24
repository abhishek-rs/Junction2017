package wandrlove.external.api.finnair.Offers.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;

public class Sorting {

    @ApiModelProperty(value = "")
    private List<FareFamilyCode> fareFamilies = new ArrayList<FareFamilyCode>();
    @ApiModelProperty(value = "")
    private Map<String, List<SequentialBoundId>> inbounds = null;
    @ApiModelProperty(value = "")
    private Map<String, List<SequentialBoundId>> outbounds = null;

    /**
     * Get fareFamilies
     *
     * @return fareFamilies
     **/
    public List<FareFamilyCode> getFareFamilies() {
        return fareFamilies;
    }

    public void setFareFamilies(List<FareFamilyCode> fareFamilies) {
        this.fareFamilies = fareFamilies;
    }

    public Sorting fareFamilies(List<FareFamilyCode> fareFamilies) {
        this.fareFamilies = fareFamilies;
        return this;
    }

    public Sorting addFareFamiliesItem(FareFamilyCode fareFamiliesItem) {
        this.fareFamilies.add(fareFamiliesItem);
        return this;
    }

    /**
     * Get inbounds
     *
     * @return inbounds
     **/
    public Object getInbounds() {
        return inbounds;
    }

    public void setInbounds(Map<String, List<SequentialBoundId>> inbounds) {
        this.inbounds = inbounds;
    }

    public Sorting inbounds(Map<String, List<SequentialBoundId>> inbounds) {
        this.inbounds = inbounds;
        return this;
    }

    /**
     * Get outbounds
     *
     * @return outbounds
     **/
    public Object getOutbounds() {
        return outbounds;
    }

    public void setOutbounds(Map<String, List<SequentialBoundId>> outbounds) {
        this.outbounds = outbounds;
    }

    public Sorting outbounds(Map<String, List<SequentialBoundId>> outbounds) {
        this.outbounds = outbounds;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Sorting {\n");

        sb.append("    fareFamilies: ").append(toIndentedString(fareFamilies)).append("\n");
        sb.append("    inbounds: ").append(toIndentedString(inbounds)).append("\n");
        sb.append("    outbounds: ").append(toIndentedString(outbounds)).append("\n");
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

