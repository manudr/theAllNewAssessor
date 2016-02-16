package us.co.douglas.assessor.service;

import us.co.douglas.assessor.model.*;

import java.util.List;

/**
 * Created by mdronamr on 12/22/15.
 */
public interface AccountService {
    //public List<String> getAllAccountStrings() throws Exception;
    public Parcel getParcel(String accountNo) throws Exception;
    public PropertyAddress getPropertyAddress(String accountNo) throws Exception;
    public OwnerAddress getOwnerAddress(String accountNo) throws Exception;
    public Account getAccount(String accountNo) throws Exception;
    public List<Account> getAllAccounts() throws Exception;
    public List<String> getAllPropertyAddresses() throws Exception;
    public List<String> getAllSearchableStrings() throws Exception;
    public List<NeighborhoodSale> getAllNeighborhoodSales() throws Exception;
}
