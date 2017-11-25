package wandrlove.external.api.finnair.Airports.models;

public class Airport {

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

    private String locationCode;
    private String title;
    private boolean airAlliance;
    private boolean airPartner;


}
