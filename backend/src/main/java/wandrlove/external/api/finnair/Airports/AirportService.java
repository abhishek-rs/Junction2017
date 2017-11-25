package wandrlove.external.api.finnair.Airports;

import com.fasterxml.jackson.databind.ObjectMapper;
import wandrlove.external.api.finnair.Airports.models.Airport;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AirportService {
    File file = null;

    public AirportService() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("data/airports.json").getFile());
    }

    public List<Airport> getAllAirports() {
        ObjectMapper objectMapper = new ObjectMapper();
        Airport[] pojos = new Airport[0];
        try {
            pojos = objectMapper.readValue(file, Airport[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Airport> airportList = new ArrayList<>(Arrays.asList(pojos));
        return airportList;
    }

}
