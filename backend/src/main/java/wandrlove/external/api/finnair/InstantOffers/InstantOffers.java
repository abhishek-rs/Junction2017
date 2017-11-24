package wandrlove.external.api.finnair.InstantOffers;

import wandrlove.external.api.finnair.InstantOffers.model.LowestPriceOfPeriod;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import wandrlove.external.api.finnair.InstantOffers.model.LowestPriceOfPeriod;

@Path("/")
@Api(value = "/", description = "")
public interface InstantOffers {

    @GET
    @Path("/api/instantsearch/pricesforperiod")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/pricesforperiod", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LowestPriceOfPeriod.class) })
    public LowestPriceOfPeriod getPricesForPeriod(@QueryParam("departureLocationCode")String departureLocationCode, @QueryParam("destinationLocationCode")String destinationLocationCode, @QueryParam("startDate")String startDate, @QueryParam("numberOfDays")String numberOfDays, @QueryParam("cff")String cff, @QueryParam("oneway")@DefaultValue("false") Boolean oneway, @QueryParam("lengthOfStay")Integer lengthOfStay, @QueryParam("tripFlexibility")Integer tripFlexibility, @QueryParam("debug")@DefaultValue("false") Boolean debug, @QueryParam("requestedPriceTypes")@DefaultValue("RU,RP,LOU,DAY") String requestedPriceTypes);

    @GET
    @Path("/api/instantsearch/pricesforperiod/fixeddeparture")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/pricesforperiod/fixeddeparture", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LowestPriceOfPeriod.class) })
    public LowestPriceOfPeriod getPricesForPeriodWithFixedDepartureDate(@QueryParam("departureLocationCode")String departureLocationCode, @QueryParam("destinationLocationCode")String destinationLocationCode, @QueryParam("departureDate")String departureDate, @QueryParam("numberOfDays")String numberOfDays, @QueryParam("cff")String cff);
}

