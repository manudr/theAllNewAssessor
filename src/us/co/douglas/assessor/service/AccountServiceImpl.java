package us.co.douglas.assessor.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import us.co.douglas.assessor.dao.AccountDAO;
import us.co.douglas.assessor.dao.AccountDAOImpl;
import us.co.douglas.assessor.model.*;
import us.co.douglas.assessor.util.InMemoryCache;

import java.util.List;

/**
 * Created by mdronamr on 12/22/15.
 */
public class AccountServiceImpl implements AccountService {
    private static Log log = LogFactory.getLog(AccountServiceImpl.class);
    private AccountDAO accountDAO = new AccountDAOImpl();
    private static Boolean serialized = false; // TODO  change this to false

    public Parcel getParcel(String accountNo) {
        return accountDAO.getParcel(accountNo);
    }

    public PropertyAddress getPropertyAddress(String accountNo) throws Exception {
        return accountDAO.getPropertyAddress(accountNo);
    }

    public OwnerAddress getOwnerAddress(String accountNo) throws Exception {
        return accountDAO.getOwnerAddress(accountNo);
    }

    public Account getAccount(String accountNo) throws Exception {
        return accountDAO.getAccount(accountNo);
    }

    public List<Account> getAllAccounts() throws Exception{
        List<Account> accounts = accountDAO.getAllAccounts();
        return accounts;
    }

    public List<String> getAllPropertyAddresses() throws Exception{
        List<String> propertyAddresses = accountDAO.getAllPropertyAddresses();
        return propertyAddresses;
    }

    /*
    public List<String> getAllSearchableStrings() throws Exception{
        log.info("getAllSearchableStrings()...");
        if (allSearchableStrings == null) {
            log.info("allSearchableStrings is null...");
            if ( !serialized) {
                allSearchableStrings = accountDAO.getAllSearchableStrings();
                SerializeDeserializeUtil.serialize(allSearchableStrings);
                serialized = true;
                log.info("serialized allSearchableStrings...");
            }
            allSearchableStrings = SerializeDeserializeUtil.deserialize();
            inMemoryCache.put("allSearchableStrings", allSearchableStrings);
        } else {
            log.info("allSearchableStrings is not null...");
            allSearchableStrings = inMemoryCache.get("allSearchableStrings");
        }
        log.info("allSearchableStrings.size(): " + allSearchableStrings.size());
        return allSearchableStrings;
    }
    */

    public List<String> getAllSearchableStrings() throws Exception{
         List<String> allSearchableStrings = (List<String>) InMemoryCache.getCacheMap().get("allSearchableStrings");
         return allSearchableStrings;
    }

    public List<NeighborhoodSale> getNeighborhoodSales(String zipCode, String neighborhood, String subdivision) throws Exception {
        return accountDAO.getNeighborhoodSales(zipCode, neighborhood, subdivision);
    }
}