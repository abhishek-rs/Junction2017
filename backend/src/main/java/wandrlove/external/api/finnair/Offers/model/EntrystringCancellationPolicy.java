package wandrlove.external.api.finnair.Offers.model;

import io.swagger.annotations.ApiModelProperty;

public class EntrystringCancellationPolicy {

    @ApiModelProperty(value = "")
    private CancellationPolicy key = null;

    /**
     * Get key
     *
     * @return key
     **/
    public CancellationPolicy getKey() {
        return key;
    }

    public void setKey(CancellationPolicy key) {
        this.key = key;
    }

    public EntrystringCancellationPolicy key(CancellationPolicy key) {
        this.key = key;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EntrystringCancellationPolicy {\n");

        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

