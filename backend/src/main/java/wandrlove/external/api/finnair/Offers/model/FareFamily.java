package wandrlove.external.api.finnair.Offers.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class FareFamily {

    @ApiModelProperty(value = "")
    private List<BenefitIcon> benefitIcons = new ArrayList<BenefitIcon>();
    @ApiModelProperty(value = "")
    private String brandColor = null;
    @ApiModelProperty(value = "")
    private String brandName = null;
    @ApiModelProperty(value = "")
    private String brandNameDescription = null;
    @ApiModelProperty(value = "")
    private BigDecimal checkedBaggage = null;
    @ApiModelProperty(value = "")
    private String fareFamilyCode = null;
    @ApiModelProperty(value = "")
    private List<TranslatedBenefitRow> translatedBenefitRows = new ArrayList<TranslatedBenefitRow>();

    /**
     * Get benefitIcons
     *
     * @return benefitIcons
     **/
    public List<BenefitIcon> getBenefitIcons() {
        return benefitIcons;
    }

    public void setBenefitIcons(List<BenefitIcon> benefitIcons) {
        this.benefitIcons = benefitIcons;
    }

    public FareFamily benefitIcons(List<BenefitIcon> benefitIcons) {
        this.benefitIcons = benefitIcons;
        return this;
    }

    public FareFamily addBenefitIconsItem(BenefitIcon benefitIconsItem) {
        this.benefitIcons.add(benefitIconsItem);
        return this;
    }

    /**
     * Get brandColor
     *
     * @return brandColor
     **/
    public String getBrandColor() {
        return brandColor;
    }

    public void setBrandColor(String brandColor) {
        this.brandColor = brandColor;
    }

    public FareFamily brandColor(String brandColor) {
        this.brandColor = brandColor;
        return this;
    }

    /**
     * Get brandName
     *
     * @return brandName
     **/
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public FareFamily brandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    /**
     * Get brandNameDescription
     *
     * @return brandNameDescription
     **/
    public String getBrandNameDescription() {
        return brandNameDescription;
    }

    public void setBrandNameDescription(String brandNameDescription) {
        this.brandNameDescription = brandNameDescription;
    }

    public FareFamily brandNameDescription(String brandNameDescription) {
        this.brandNameDescription = brandNameDescription;
        return this;
    }

    /**
     * Get checkedBaggage
     *
     * @return checkedBaggage
     **/
    public BigDecimal getCheckedBaggage() {
        return checkedBaggage;
    }

    public void setCheckedBaggage(BigDecimal checkedBaggage) {
        this.checkedBaggage = checkedBaggage;
    }

    public FareFamily checkedBaggage(BigDecimal checkedBaggage) {
        this.checkedBaggage = checkedBaggage;
        return this;
    }

    /**
     * Get fareFamilyCode
     *
     * @return fareFamilyCode
     **/
    public String getFareFamilyCode() {
        return fareFamilyCode;
    }

    public void setFareFamilyCode(String fareFamilyCode) {
        this.fareFamilyCode = fareFamilyCode;
    }

    public FareFamily fareFamilyCode(String fareFamilyCode) {
        this.fareFamilyCode = fareFamilyCode;
        return this;
    }

    /**
     * Get translatedBenefitRows
     *
     * @return translatedBenefitRows
     **/
    public List<TranslatedBenefitRow> getTranslatedBenefitRows() {
        return translatedBenefitRows;
    }

    public void setTranslatedBenefitRows(List<TranslatedBenefitRow> translatedBenefitRows) {
        this.translatedBenefitRows = translatedBenefitRows;
    }

    public FareFamily translatedBenefitRows(List<TranslatedBenefitRow> translatedBenefitRows) {
        this.translatedBenefitRows = translatedBenefitRows;
        return this;
    }

    public FareFamily addTranslatedBenefitRowsItem(TranslatedBenefitRow translatedBenefitRowsItem) {
        this.translatedBenefitRows.add(translatedBenefitRowsItem);
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FareFamily {\n");

        sb.append("    benefitIcons: ").append(toIndentedString(benefitIcons)).append("\n");
        sb.append("    brandColor: ").append(toIndentedString(brandColor)).append("\n");
        sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
        sb.append("    brandNameDescription: ").append(toIndentedString(brandNameDescription)).append("\n");
        sb.append("    checkedBaggage: ").append(toIndentedString(checkedBaggage)).append("\n");
        sb.append("    fareFamilyCode: ").append(toIndentedString(fareFamilyCode)).append("\n");
        sb.append("    translatedBenefitRows: ").append(toIndentedString(translatedBenefitRows)).append("\n");
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

