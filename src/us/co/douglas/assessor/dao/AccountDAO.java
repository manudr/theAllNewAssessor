package us.co.douglas.assessor.dao;

import us.co.douglas.assessor.model.*;

import java.util.List;

/**
 * Created by mdronamr on 12/22/15.
 */
public interface AccountDAO {
    public Parcel getParcel(String accountNo);
    public Account getAccount(String accountNo) throws Exception;
    public List<Account> getAllAccounts() throws Exception;
    public List<String> getAllPropertyAddresses() throws Exception;
    public List<String> getAllSearchableStrings() throws Exception;
    public List<NeighborhoodSale> getNeighborhoodSales(String zipCode, String neighborhood, String subdivision) throws Exception;
    public List<NeighborhoodSale> getAllNeighborhoodSales() throws Exception;
    public PropertyAddress getPropertyAddress(String accountNo) throws Exception;
    public OwnerAddress getOwnerAddress(String accountNo) throws Exception;

}
