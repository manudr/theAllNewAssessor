package us.co.douglas.assessor.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mdronamr on 12/24/15.
 */

@Entity
public class OwnerAddress {
    private String accountNo;
    private String streetAddress;
    private String cityName;
    private String stateName;
    private String zipCode;

    @Id
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

}