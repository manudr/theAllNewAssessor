package us.co.douglas.assessor.rest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import us.co.douglas.assessor.model.Account;
import us.co.douglas.assessor.model.BasicAccountInfo;
import us.co.douglas.assessor.model.Sale;
import us.co.douglas.assessor.service.AccountService;
import us.co.douglas.assessor.service.AccountServiceImpl;

import javax.ws.rs.*;
import java.util.*;

/**
 * Created by mdronamr on 12/22/15.
 */


@Path("/accountService")
@Consumes("application/json")
@Produces("application/json")
public class AccountRestService {
    private static Log log = LogFactory.getLog(AccountRestService.class);
    private AccountService accountService = new AccountServiceImpl();
    private static int maxRows = 500;

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
            //for (int i=0; i<=maxRows; i++) {
            //    String searchableString = allSearchableStrings.get(i);
            //    log.info("searchableString: " + searchableString);
                boolean stringMatches = true;
                for (String stringToken : stringTokens) {
                    if (!(searchableString.toUpperCase().contains(stringToken.toUpperCase()))) {
                        stringMatches = false;
                    }
                }
                if (stringMatches) {
                    //log.info(searchableString + " matches...");
                    BasicAccountInfo basicAccountInfo = new BasicAccountInfo();
                    String[] searchableStringTokens = searchableString.split(":");
                    //log.info("searchableString: " + searchableString);
                    //log.info("searchableString: " + searchableStringTokens[0] + " - " + searchableStringTokens[1] + " - " + searchableStringTokens[2] + " - " + searchableStringTokens[3] + " - " + searchableStringTokens[4] + " - " + searchableStringTokens[5]);
                    basicAccountInfo.setAccountNo(searchableStringTokens[0]);
                    basicAccountInfo.setParcelNo(searchableStringTokens[1]);
                    basicAccountInfo.setOwnerName(searchableStringTokens[2]);
                    basicAccountInfo.setBusinessName(searchableStringTokens[3]);
                    basicAccountInfo.setBusinessLicense(searchableStringTokens[4]);
                    basicAccountInfo.setNeighborhood(searchableStringTokens[5]);
                    basicAccountInfo.setPropertyAddress(searchableStringTokens[6]);
                    basicAccountInfo.setOwnerAddress(searchableStringTokens[7]);
                    basicAccountInfo.setSubdivisionName(searchableStringTokens[8]);
                    if (!matchedParcels.contains(basicAccountInfo)) {
                        //log.info("basicAccountInfo: " + basicAccountInfo);
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

    @GET
    @Path("/accounts/{accountNo}")
    public Account getAccount(@PathParam("accountNo") String accountNo) throws Exception {
        log.info("getAccount()...");
        log.info("accountNo: " + accountNo);
        return accountService.getAccountByAccountNo(accountNo);
    }

    @GET
    @Path("/neighborhoodSales/{zipCode}")
    public List<Sale> getNeighborhoodSales(@PathParam("zipCode") String zipCode) throws Exception {
        log.info("getNeighborhoodSales()...");
        log.info("zipCode: " + zipCode);
        return accountService.getNeighborhoodSales(zipCode);
    }



}