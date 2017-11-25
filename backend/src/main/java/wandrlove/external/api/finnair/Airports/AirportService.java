package wandrlove.external.api.finnair.Airports;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import wandrlove.external.api.finnair.Airports.models.Airport;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AirportService {
    File file = null;
    File airportCityFile = null;
    public AirportService() {

    }

    @PostConstruct
    public void initialize() {
        ClassLoader classLoader = getClass().getClassLoader();
        file = new File(classLoader.getResource("data/airports.json").getFile());
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
