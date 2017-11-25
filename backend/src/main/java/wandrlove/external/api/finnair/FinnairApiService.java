package wandrlove.external.api.finnair;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.stereotype.Service;
import wandrlove.external.api.finnair.InstantOffers.InstantOffers;
import wandrlove.external.api.finnair.Offers.Offers;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class FinnairApiService {

    private InstantOffers instantOffers = null;
    private Offers offers = null;

    @PostConstruct
    private void initialize() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        instantOffers = JAXRSClientFactory.create("https://instantsearch-junction.ecom.finnair.com", InstantOffers.class, providers);
        offers = JAXRSClientFactory.create("https://offer-junction.ecom.finnair.com", Offers.class, providers);
        org.apache.cxf.jaxrs.client.Client instantOffersClient = WebClient.client(instantOffers);
        ClientConfiguration instantOffersConfig = WebClient.getConfig(instantOffersClient);
        org.apache.cxf.jaxrs.client.Client offersClient = WebClient.client(instantOffers);
        ClientConfiguration offersConfig = WebClient.getConfig(offersClient);

    }
}
