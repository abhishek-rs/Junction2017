package wandrlove.external.api.finnair.Offers.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;

public class Bound {

    @ApiModelProperty(value = "")
    private LocationWithDateTime arrival = null;
    @ApiModelProperty(value = "")
    private SequentialBoundId boundId = null;
    @ApiModelProperty(value = "")
    private BigDecimal cheapestPrice = null;
    @ApiModelProperty(value = "")
    private LocationWithDateTime departure = null;
    @ApiModelProperty(value = "")
    private Duration duration = null;
    @ApiModelProperty(value = "")
    private Integer flights = null;
    @ApiModelProperty(value = "")
    private List<ItineraryItem> itinerary = new ArrayList<ItineraryItem>();
    @ApiModelProperty(value = "")
    private List<String> notes = new ArrayList<String>();
    @ApiModelProperty(value = "")
    private List<AirlineCode> operatingAirlineCodes = new ArrayList<AirlineCode>();
    @ApiModelProperty(value = "")
    private Map<FareFamilyCode, Integer> quotas = null;
    @ApiModelProperty(value = "")
    private Integer stops = null;
    @ApiModelProperty(value = "")
    private List<String> uniqueAirlineNames = new ArrayList<String>();

    /**
     * Get arrival
     *
     * @return arrival
     **/
    public LocationWithDateTime getArrival() {
        return arrival;
    }

    public void setArrival(LocationWithDateTime arrival) {
        this.arrival = arrival;
    }

    public Bound arrival(LocationWithDateTime arrival) {
        this.arrival = arrival;
        return this;
    }

    /**
     * Get boundId
     *
     * @return boundId
     **/
    public SequentialBoundId getBoundId() {
        return boundId;
    }

    public void setBoundId(SequentialBoundId boundId) {
        this.boundId = boundId;
    }

    public Bound boundId(SequentialBoundId boundId) {
        this.boundId = boundId;
        return this;
    }

    /**
     * Get cheapestPrice
     *
     * @return cheapestPrice
     **/
    public BigDecimal getCheapestPrice() {
        return cheapestPrice;
    }

    public void setCheapestPrice(BigDecimal cheapestPrice) {
        this.cheapestPrice = cheapestPrice;
    }

    public Bound cheapestPrice(BigDecimal cheapestPrice) {
        this.cheapestPrice = cheapestPrice;
        return this;
    }

    /**
     * Get departure
     *
     * @return departure
     **/
    public LocationWithDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocationWithDateTime departure) {
        this.departure = departure;
    }

    public Bound departure(LocationWithDateTime departure) {
        this.departure = departure;
        return this;
    }

    /**
     * Get duration
     *
     * @return duration
     **/
    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Bound duration(Duration duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get flights
     *
     * @return flights
     **/
    public Integer getFlights() {
        return flights;
    }

    public void setFlights(Integer flights) {
        this.flights = flights;
    }

    public Bound flights(Integer flights) {
        this.flights = flights;
        return this;
    }

    /**
     * Get itinerary
     *
     * @return itinerary
     **/
    public List<ItineraryItem> getItinerary() {
        return itinerary;
    }

    public void setItinerary(List<ItineraryItem> itinerary) {
        this.itinerary = itinerary;
    }

    public Bound itinerary(List<ItineraryItem> itinerary) {
        this.itinerary = itinerary;
        return this;
    }

    public Bound addItineraryItem(ItineraryItem itineraryItem) {
        this.itinerary.add(itineraryItem);
        return this;
    }

    /**
     * Get notes
     *
     * @return notes
     **/
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public Bound notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public Bound addNotesItem(String notesItem) {
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Get operatingAirlineCodes
     *
     * @return operatingAirlineCodes
     **/
    public List<AirlineCode> getOperatingAirlineCodes() {
        return operatingAirlineCodes;
    }

    public void setOperatingAirlineCodes(List<AirlineCode> operatingAirlineCodes) {
        this.operatingAirlineCodes = operatingAirlineCodes;
    }

    public Bound operatingAirlineCodes(List<AirlineCode> operatingAirlineCodes) {
        this.operatingAirlineCodes = operatingAirlineCodes;
        return this;
    }

    public Bound addOperatingAirlineCodesItem(AirlineCode operatingAirlineCodesItem) {
        this.operatingAirlineCodes.add(operatingAirlineCodesItem);
        return this;
    }

    /**
     * Get quotas
     *
     * @return quotas
     **/
    public Object getQuotas() {
        return quotas;
    }

    public void setQuotas(Map<FareFamilyCode, Integer> quotas) {
        this.quotas = quotas;
    }

    public Bound quotas(Map<FareFamilyCode, Integer> quotas) {
        this.quotas = quotas;
        return this;
    }

    /**
     * Get stops
     *
     * @return stops
     **/
    public Integer getStops() {
        return stops;
    }

    public void setStops(Integer stops) {
        this.stops = stops;
    }

    public Bound stops(Integer stops) {
        this.stops = stops;
        return this;
    }

    /**
     * Get uniqueAirlineNames
     *
     * @return uniqueAirlineNames
     **/
    public List<String> getUniqueAirlineNames() {
        return uniqueAirlineNames;
    }

    public void setUniqueAirlineNames(List<String> uniqueAirlineNames) {
        this.uniqueAirlineNames = uniqueAirlineNames;
    }

    public Bound uniqueAirlineNames(List<String> uniqueAirlineNames) {
        this.uniqueAirlineNames = uniqueAirlineNames;
        return this;
    }

    public Bound addUniqueAirlineNamesItem(String uniqueAirlineNamesItem) {
        this.uniqueAirlineNames.add(uniqueAirlineNamesItem);
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Bound {\n");

        sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
        sb.append("    boundId: ").append(toIndentedString(boundId)).append("\n");
        sb.append("    cheapestPrice: ").append(toIndentedString(cheapestPrice)).append("\n");
        sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    flights: ").append(toIndentedString(flights)).append("\n");
        sb.append("    itinerary: ").append(toIndentedString(itinerary)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    operatingAirlineCodes: ").append(toIndentedString(operatingAirlineCodes)).append("\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
        sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
        sb.append("    uniqueAirlineNames: ").append(toIndentedString(uniqueAirlineNames)).append("\n");
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

