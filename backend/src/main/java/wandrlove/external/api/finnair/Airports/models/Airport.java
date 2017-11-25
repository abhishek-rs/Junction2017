package wandrlove.external.api.finnair.Airports.models;

public class Airport {
    private String locationCode;
    private String title;
    private boolean airAlliance;
    private boolean airPartner;
    private String city;
    private String country;
    private String continent;

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAirAlliance() {
        return airAlliance;
    }

    public void setAirAlliance(boolean airAlliance) {
        this.airAlliance = airAlliance;
    }

    public boolean isAirPartner() {
        return airPartner;
    }

    public void setAirPartner(boolean airPartner) {
        this.airPartner = airPartner;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }


}
