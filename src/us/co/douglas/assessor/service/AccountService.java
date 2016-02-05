package us.co.douglas.assessor.service;

import us.co.douglas.assessor.model.*;

import java.util.List;

/**
 * Created by mdronamr on 12/22/15.
 */
public interface AccountService {
    public Parcel getParcel(String accountNo);
    public PropertyAddress getPropertyAddress(String accountNo) throws Exception;
    public OwnerAddress getOwnerAddress(String accountNo) throws Exception;
    public Account getAccount(String accountNo) throws Exception;
    public List<Account> getAllAccounts() throws Exception;
    public List<String> getAllPropertyAddresses() throws Exception;
    public List<String> getAllSearchableStrings() throws Exception;
    public List<NeighborhoodSale> getNeighborhoodSales(String zipCode, String neighborhood, String subdivision) throws Exception;
}
