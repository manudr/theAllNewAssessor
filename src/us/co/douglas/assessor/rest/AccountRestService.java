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

    /*
    @GET
    @Path("/accounts")
    public List<Account> getAllAccounts() throws Exception {
        log.info("getAllAccounts()...");
        List<Account> accounts = accountService.getAllAccounts();
        log.info("accounts.size(): " + accounts.size());
        return accounts;
    }

    @GET
    @Path("/propertyAddresses")
    public List<String> getPropertyAddresses() throws Exception {
        log.info("getPropertyAddresses()...");
        List<String> addresses = new ArrayList<String>();
        addresses = accountService.getAllPropertyAddresses();
        log.info("addresses.size(): " + addresses.size());
        return addresses;
    }
    */

    @GET
    @Path("/allSearchableStrings/{searchString}")
    public List<BasicAccountInfo> getAllSearchableStrings(@PathParam("searchString") String searchString) throws Exception {
        log.info("getAllSearchableStrings()...");
        //log.info("searchString: " + searchString + "matchAnyWhere: " + matchAnyWhere);
        String[] stringTokens =  searchString.split(" ");
        List<BasicAccountInfo> matchedParcels = new ArrayList<BasicAccountInfo>();
        List<String> allSearchableStrings = accountService.getAllSearchableStrings();
        log.info("allSearchableStrings.size(): " + allSearchableStrings.size());
        int maxCount = 0;

        /*
        if (allSearchableStrings != null & allSearchableStrings.size() > 0) {
            for (String searchableString : allSearchableStrings) {
                for (String stringToken : stringTokens) {
                    if (searchableString.toUpperCase().contains(stringToken.toUpperCase()) && maxCount <= maxRows) {
                        BasicAccountInfo basicAccountInfo = new BasicAccountInfo();
                        String[] searchableStringTokens = searchableString.split(":");
                        //log.info("searchableString: " + searchableString);
                        //log.info("searchableString: " + searchableStringTokens[0] + " - " + searchableStringTokens[1] + " - " + searchableStringTokens[2] + " - " + searchableStringTokens[3] + " - " + searchableStringTokens[4] + " - " + searchableStringTokens[5]);
                        basicAccountInfo.setAccountNo(searchableStringTokens[0]);
                        basicAccountInfo.setParcelNo(searchableStringTokens[1]);
                        basicAccountInfo.setOwnerName(searchableStringTokens[2]);
                        basicAccountInfo.setBusinessName(searchableStringTokens[3]);
                        basicAccountInfo.setBusinessLicense(searchableStringTokens[4]);
                        basicAccountInfo.setPropertyAddress(searchableStringTokens[5]);
                        basicAccountInfo.setOwnerAddress(searchableStringTokens[5]);
                        if (!matchedParcels.contains(basicAccountInfo)) {
                            //log.info("basicAccountInfo: " + basicAccountInfo);
                            matchedParcels.add(basicAccountInfo);
                            maxCount++;
                        }
                    }
                }
            }
        }
        */

        if (allSearchableStrings != null & allSearchableStrings.size() > 0) {
            for (String searchableString : allSearchableStrings) {
                boolean stringMatches = true;
                for (String stringToken : stringTokens) {
                    if (!(searchableString.toUpperCase().contains(stringToken.toUpperCase()))) {
                        stringMatches = false;
                    }
                }
                if (stringMatches) {
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
                        maxCount++;
                    }
                }
                if (maxCount > maxRows) {
                    log.info("Max rows reached. Stopping the search...");
                    break;
                }
            }
        }
        log.info("ONLY FIRST " + maxRows + " ROWS WILL BE DISPLAYED!");
        log.info("matchedParcels.size(): " + matchedParcels.size());
        return matchedParcels;
    }

    /*
    @GET
    @Path("/allSearchableStrings/")
    public List<BasicAccountInfo> getAllSearchableStrings() throws Exception {
        log.info("getAllSearchableStrings()...");
        List<BasicAccountInfo> allBasicAccountInfoObjects = new ArrayList<BasicAccountInfo>();
        List<String> allSearchableStrings = accountService.getAllSearchableStrings();
        log.info("allSearchableStrings.size(): " + allSearchableStrings.size());
        if (allSearchableStrings != null & allSearchableStrings.size() > 0) {
            for (String searchableString : allSearchableStrings) {
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
                allBasicAccountInfoObjects.add(basicAccountInfo);
            }
        }
        log.info("allBasicAccountInfoObjects.size(): " + allBasicAccountInfoObjects.size());
        return allBasicAccountInfoObjects;
    }
    */

    @GET
    @Path("/parcels/{accountNo}")
    public Parcel getParcel(@PathParam("accountNo") String accountNo) throws Exception {
        log.info("getParcel()...");
        log.info("accountNo: " + accountNo);
        return accountService.getParcel(accountNo);
    }

    @GET
    @Path("/neighborhoodSales/{zipCode}/{neighborhood}/{subdivision}")
    public List<NeighborhoodSale> getNeighborhoodSales(@PathParam("zipCode") String zipCode, @PathParam("neighborhood") String neighborhood, @PathParam("subdivision") String subdivision) throws Exception {
        log.info("getNeighborhoodSales()...");
        log.info("zipCode: " + zipCode);
        return accountService.getNeighborhoodSales(zipCode, neighborhood, subdivision);
    }



}