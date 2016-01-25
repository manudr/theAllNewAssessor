package us.co.douglas.assessor.service;

import us.co.douglas.assessor.model.Account;
import us.co.douglas.assessor.model.Sale;

import java.util.List;

/**
 * Created by mdronamr on 12/22/15.
 */
public interface AccountService {
    public Account getAccountByAccountNo(String accountNo) throws Exception;
    public List<Account> getAllAccounts() throws Exception;
    public List<String> getAllPropertyAddresses() throws Exception;
    public List<String> getAllSearchableStrings() throws Exception;
    public List<Sale> getNeighborhoodSales(String zipCode, String neighborhood, String subdivision) throws Exception;

}
