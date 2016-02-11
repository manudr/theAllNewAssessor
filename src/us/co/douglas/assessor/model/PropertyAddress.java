package us.co.douglas.assessor.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mdronamr on 12/24/15.
 */

@Entity
public class PropertyAddress {
    private String accountNo;
    private String streetNumber;
    private String streetName;
    private String unitName;
    private String streetType;
    private String postDirection;
    private String preDirection;
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

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getPostDirection() {
        return postDirection;
    }

    public void setPostDirection(String postDirection) {
        this.postDirection = postDirection;
    }

    public String getPreDirection() {
        return preDirection;
    }

    public void setPreDirection(String preDirection) {
        this.preDirection = preDirection;
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