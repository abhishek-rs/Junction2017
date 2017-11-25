package wandrlove.model;

import org.joda.time.DateTime;

import java.util.List;

public class User {

    private String userId;

    private String homePlace;

    private List<String> citiesLived;

    private DateTime fromDate;

    private DateTime toDate;

    private String[] interests;

    public User(String userId) {
        this.userId = userId;
    }

    public String getHomePlace() {
        return homePlace;
    }

    public void setHomePlace(String homePlace) {
        this.homePlace = homePlace;
    }

    public List<String> getCitiesLived() {
        return citiesLived;
    }

    public void setCitiesLived(List<String> citiesLived) {
        this.citiesLived = citiesLived;
    }

    public DateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(DateTime fromDate) {
        this.fromDate = fromDate;
    }

    public DateTime getToDate() {
        return toDate;
    }

    public void setToDate(DateTime toDate) {
        this.toDate = toDate;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }
}
