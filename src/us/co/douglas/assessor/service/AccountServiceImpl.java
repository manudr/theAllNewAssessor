package us.co.douglas.assessor.service;

import org.apache.commons.collections4.map.LRUMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import us.co.douglas.assessor.dao.AccountDAO;
import us.co.douglas.assessor.dao.AccountDAOImpl;
import us.co.douglas.assessor.model.Account;
import us.co.douglas.assessor.model.Sale;
import us.co.douglas.assessor.util.InMemoryCache;
import us.co.douglas.assessor.util.SerializeDeserializeUtil;

import java.util.List;

/**
 * Created by mdronamr on 12/22/15.
 */
public class AccountServiceImpl implements AccountService {
    private static Log log = LogFactory.getLog(AccountServiceImpl.class);
    private AccountDAO accountDAO = new AccountDAOImpl();
    private static Boolean serialized = false; // TODO  change this to false

    public Account getAccountByAccountNo(String accountNo) throws Exception{
        log.info("getAccountByAccountNo()...");
        return accountDAO.getAccountByAccountNo(accountNo);
    }

    public List<Account> getAllAccounts() throws Exception{
        log.info("getAllAccounts()...");
        List<Account> accounts = accountDAO.getAllAccounts();
        log.info("accounts.size(): " + accounts.size());

        return accounts;
    }

    public List<String> getAllPropertyAddresses() throws Exception{
        log.info("getAllPropertyAddresses()...");
        List<String> propertyAddresses = accountDAO.getAllPropertyAddresses();
        log.info("propertyAddresses.size(): " + propertyAddresses.size());

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
        log.info("getAllSearchableStrings()...");
        List<String> allSearchableStrings = (List<String>) InMemoryCache.getCacheMap().get("allSearchableStrings");
        log.info("allSearchableStrings.size(): " + allSearchableStrings.size());
        return allSearchableStrings;
    }

    public List<Sale> getNeighborhoodSales(String zipCode, String neighborhood, String subdivision) throws Exception {
        return accountDAO.getNeighborhoodSales(zipCode, neighborhood, subdivision);
    }
}