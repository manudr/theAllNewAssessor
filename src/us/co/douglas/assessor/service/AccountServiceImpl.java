package us.co.douglas.assessor.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import us.co.douglas.assessor.dao.AccountDAO;
import us.co.douglas.assessor.dao.AccountDAOImpl;
import us.co.douglas.assessor.model.*;
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

    /*
    public List<String> getAllAccountStrings() throws Exception {
        return accountDAO.getAllAccountStrings();
    }
    */

    public Parcel getParcel(String accountNo) throws Exception {
        //return accountDAO.getParcel(accountNo);
        Parcel parcel = (Parcel) SerializeDeserializeUtil.deserialize("/Users/admin/development/jsonDocs/" + accountNo + ".ser");
        return  parcel;
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

    public List<String> getAllSearchableStrings() throws Exception{
         List<String> allSearchableStrings = (List<String>) InMemoryCache.getCacheMap().get("allSearchableStrings");
         return allSearchableStrings;
    }

    public List<NeighborhoodSale> getAllNeighborhoodSales() throws Exception {
        List<NeighborhoodSale> allNeighborhoodSales = (List<NeighborhoodSale>) InMemoryCache.getCacheMap().get("allNeighborhoodSales");
        return allNeighborhoodSales;
    }
}