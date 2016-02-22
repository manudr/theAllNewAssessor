package us.co.douglas.assessor.rest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import us.co.douglas.assessor.model.BasicAccountInfo;
import us.co.douglas.assessor.model.Parcel;
import us.co.douglas.assessor.model.NeighborhoodSale;
import us.co.douglas.assessor.service.AccountService;
import us.co.douglas.assessor.service.AccountServiceImpl;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mdronamr on 12/22/15.
 */


@Path("/accountService")
@Consumes("application/json")
@Produces("application/json")
public class AccountRestService {
    private static Log log = LogFactory.getLog(AccountRestService.class);
    private AccountService accountService = new AccountServiceImpl();
    private static int maxRows = 2000;

    @GET
    @Path("/allSearchableStrings/{searchString}")
    public List<BasicAccountInfo> getAllSearchableStrings(@PathParam("searchString") String searchString) throws Exception {
        log.info("getAllSearchableStrings()...");
        log.info("searchString: " + searchString);
        //log.info("searchCriteria: " + searchCriteria);
        String[] stringTokens =  searchString.split(" ");
        List<BasicAccountInfo> matchedParcels = new ArrayList<BasicAccountInfo>();
        List<String> allSearchableStrings = accountService.getAllSearchableStrings();
        log.info("allSearchableStrings.size(): " + allSearchableStrings.size());
        if (allSearchableStrings != null & allSearchableStrings.size() > 0) {
            for (String searchableString : allSearchableStrings) {
                for (String stringToken : stringTokens) {
                    if ((searchableString.toUpperCase().contains(stringToken.toUpperCase()))) {
                        BasicAccountInfo basicAccountInfo = new BasicAccountInfo();
                        String[] searchableStringTokens = searchableString.split(":");
                        basicAccountInfo.setAccountNo(searchableStringTokens[0]);
                        basicAccountInfo.setParcelNo(searchableStringTokens[1]);
                        basicAccountInfo.setOwnerName(searchableStringTokens[2]);
                        basicAccountInfo.setBusinessName(searchableStringTokens[3]);
                        basicAccountInfo.setBusinessLicense(searchableStringTokens[4]);
                        basicAccountInfo.setNeighborhood(searchableStringTokens[5]);
                        basicAccountInfo.setNeighborhoodExt(searchableStringTokens[6]);
                        basicAccountInfo.setPropertyStreet(searchableStringTokens[7]);
                        basicAccountInfo.setPropertyCity(searchableStringTokens[8]);
                        basicAccountInfo.setPropertyState("CO");
                        basicAccountInfo.setPropertyZipCode(searchableStringTokens[9]);
                        basicAccountInfo.setOwnerStreet(searchableStringTokens[10]);
                        basicAccountInfo.setOwnerCity(searchableStringTokens[11]);
                        basicAccountInfo.setOwnerState(searchableStringTokens[12]);
                        basicAccountInfo.setOwnerZipCode(searchableStringTokens[13]);
                        basicAccountInfo.setSubdivisionName(searchableStringTokens[14]);
                        if (!matchedParcels.contains(basicAccountInfo)) {
                            matchedParcels.add(basicAccountInfo);
                        }
                        break;
                    }
                }
                if (matchedParcels.size() >= maxRows) {
                    log.info("Max rows(" + maxRows + ") reached. Stopping the search...");
                    break;
                }
            }
        }
        log.info("ONLY FIRST " + maxRows + " ROWS WILL BE DISPLAYED!");
        log.info("matchedParcels.size(): " + matchedParcels.size());
        return matchedParcels;
    }

    @GET
    @Path("/parcels/{accountNo}")
    public Parcel getParcel(@PathParam("accountNo") String accountNo) throws Exception {
        log.info("getParcel()...");
        log.info("accountNo: " + accountNo);
        return accountService.getParcel(accountNo);
    }

    @GET
    @Path("/neighborhoodSales/{zipCode}/{neighborhood}/{neighborhoodExt}/{subdivision}")
    public List<NeighborhoodSale> getNeighborhoodSales(@PathParam("zipCode") String zipCode, @PathParam("neighborhood") String neighborhood, @PathParam("neighborhoodExt") String neighborhoodExt, @PathParam("subdivision") String subdivision) throws Exception {
        log.info("getNeighborhoodSales()...");
        List<NeighborhoodSale> allNeighborhoodSales = accountService.getAllNeighborhoodSales();
        List<NeighborhoodSale> matchedNeighborhoodSales = new ArrayList<NeighborhoodSale>();
        for (NeighborhoodSale neighborhoodSale : allNeighborhoodSales) {
            if (neighborhoodSale.getPropertyZipCode().equalsIgnoreCase(zipCode) &&
                    neighborhoodSale.getNeighborhood().equalsIgnoreCase(neighborhood) &&
                    neighborhoodSale.getNeighborhoodExt().equalsIgnoreCase(neighborhoodExt) &&
                    neighborhoodSale.getSubdivision().equalsIgnoreCase(subdivision)) {
                matchedNeighborhoodSales.add(neighborhoodSale);
            }
            if (matchedNeighborhoodSales.size() >= maxRows) {
                log.info("Max rows(" + maxRows + ") reached. Stopping the search...");
                break;
            }
        }
        return matchedNeighborhoodSales;
    }
}