package wandrlove.external.api.finnair.Offers;

import wandrlove.external.api.finnair.Offers.model.OfferList;

import javax.ws.rs.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@Path("/")
@Api(value = "/", description = "")
public interface Offers {

    @GET
    @Path("/api/offerList")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Find flight offers for given origin, destination, dates and travelers", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = OfferList.class)})
    public OfferList findOfferList(@QueryParam("adults") Integer adults, @QueryParam("departureLocationCode") String departureLocationCode, @QueryParam("destinationLocationCode") String destinationLocationCode, @QueryParam("departureDate") String departureDate, @QueryParam("returnDate") String returnDate, @QueryParam("children") Integer children, @QueryParam("infants") Integer infants, @QueryParam("cabin") String cabin, @QueryParam("locale") @DefaultValue("en") String locale);
}

