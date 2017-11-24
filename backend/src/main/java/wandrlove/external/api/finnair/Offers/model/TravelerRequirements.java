package wandrlove.external.api.finnair.Offers.model;


import io.swagger.annotations.ApiModelProperty;

public class TravelerRequirements {

    @ApiModelProperty(value = "")
    private Boolean birthdayRequired = null;
    @ApiModelProperty(value = "")
    private String emailRegex = null;
    @ApiModelProperty(value = "")
    private String maxBirthDateInclusive = null;
    @ApiModelProperty(value = "")
    private String minBirthDateInclusive = null;
    @ApiModelProperty(value = "")
    private String nameRegex = null;
    @ApiModelProperty(value = "")
    private String passengerTypeCode = null;
    @ApiModelProperty(value = "")
    private String phoneNumberRegex = null;

    /**
     * Get birthdayRequired
     *
     * @return birthdayRequired
     **/
    public Boolean getBirthdayRequired() {
        return birthdayRequired;
    }

    public void setBirthdayRequired(Boolean birthdayRequired) {
        this.birthdayRequired = birthdayRequired;
    }

    public TravelerRequirements birthdayRequired(Boolean birthdayRequired) {
        this.birthdayRequired = birthdayRequired;
        return this;
    }

    /**
     * Get emailRegex
     *
     * @return emailRegex
     **/
    public String getEmailRegex() {
        return emailRegex;
    }

    public void setEmailRegex(String emailRegex) {
        this.emailRegex = emailRegex;
    }

    public TravelerRequirements emailRegex(String emailRegex) {
        this.emailRegex = emailRegex;
        return this;
    }

    /**
     * Get maxBirthDateInclusive
     *
     * @return maxBirthDateInclusive
     **/
    public String getMaxBirthDateInclusive() {
        return maxBirthDateInclusive;
    }

    public void setMaxBirthDateInclusive(String maxBirthDateInclusive) {
        this.maxBirthDateInclusive = maxBirthDateInclusive;
    }

    public TravelerRequirements maxBirthDateInclusive(String maxBirthDateInclusive) {
        this.maxBirthDateInclusive = maxBirthDateInclusive;
        return this;
    }

    /**
     * Get minBirthDateInclusive
     *
     * @return minBirthDateInclusive
     **/
    public String getMinBirthDateInclusive() {
        return minBirthDateInclusive;
    }

    public void setMinBirthDateInclusive(String minBirthDateInclusive) {
        this.minBirthDateInclusive = minBirthDateInclusive;
    }

    public TravelerRequirements minBirthDateInclusive(String minBirthDateInclusive) {
        this.minBirthDateInclusive = minBirthDateInclusive;
        return this;
    }

    /**
     * Get nameRegex
     *
     * @return nameRegex
     **/
    public String getNameRegex() {
        return nameRegex;
    }

    public void setNameRegex(String nameRegex) {
        this.nameRegex = nameRegex;
    }

    public TravelerRequirements nameRegex(String nameRegex) {
        this.nameRegex = nameRegex;
        return this;
    }

    /**
     * Get passengerTypeCode
     *
     * @return passengerTypeCode
     **/
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    public TravelerRequirements passengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
        return this;
    }

    /**
     * Get phoneNumberRegex
     *
     * @return phoneNumberRegex
     **/
    public String getPhoneNumberRegex() {
        return phoneNumberRegex;
    }

    public void setPhoneNumberRegex(String phoneNumberRegex) {
        this.phoneNumberRegex = phoneNumberRegex;
    }

    public TravelerRequirements phoneNumberRegex(String phoneNumberRegex) {
        this.phoneNumberRegex = phoneNumberRegex;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TravelerRequirements {\n");

        sb.append("    birthdayRequired: ").append(toIndentedString(birthdayRequired)).append("\n");
        sb.append("    emailRegex: ").append(toIndentedString(emailRegex)).append("\n");
        sb.append("    maxBirthDateInclusive: ").append(toIndentedString(maxBirthDateInclusive)).append("\n");
        sb.append("    minBirthDateInclusive: ").append(toIndentedString(minBirthDateInclusive)).append("\n");
        sb.append("    nameRegex: ").append(toIndentedString(nameRegex)).append("\n");
        sb.append("    passengerTypeCode: ").append(toIndentedString(passengerTypeCode)).append("\n");
        sb.append("    phoneNumberRegex: ").append(toIndentedString(phoneNumberRegex)).append("\n");
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

