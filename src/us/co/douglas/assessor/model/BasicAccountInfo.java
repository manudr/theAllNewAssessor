package us.co.douglas.assessor.model;

import java.io.Serializable;

/**
 * Created by mdronamr on 12/29/15.
 */
public class BasicAccountInfo implements Serializable {
    private String accountNo;
    private String parcelNo;
    private String ownerName;
    private String businessName;
    private String businessLicense;
    private String propertyStreet;
    private String propertyCity;
    private String propertyState;
    private String propertyZipCode;
    //private String ownerStreet;
    //private String ownerCity;
    //private String ownerState;
    //private String ownerZipCode;
    private String neighborhood;
    private String neighborhoodExt;
    private String subdivisionName;
    //private String filingDescription;
    //private String location;

    public BasicAccountInfo() {

    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getParcelNo() {
        return parcelNo;
    }

    public void setParcelNo(String parcelNo) {
        this.parcelNo = parcelNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getPropertyStreet() {
        return propertyStreet;
    }

    public void setPropertyStreet(String propertyStreet) {
        this.propertyStreet = propertyStreet;
    }

    public String getPropertyCity() {
        return propertyCity;
    }

    public void setPropertyCity(String propertyCity) {
        this.propertyCity = propertyCity;
    }

    public String getPropertyState() {
        return propertyState;
    }

    public void setPropertyState(String propertyState) {
        this.propertyState = propertyState;
    }

    public String getPropertyZipCode() {
        return propertyZipCode;
    }

    public void setPropertyZipCode(String propertyZipCode) {
        this.propertyZipCode = propertyZipCode;
    }

    /*
    public String getOwnerStreet() {
        return ownerStreet;
    }

    public void setOwnerStreet(String ownerStreet) {
        this.ownerStreet = ownerStreet;
    }

    public String getOwnerCity() {
        return ownerCity;
    }

    public void setOwnerCity(String ownerCity) {
        this.ownerCity = ownerCity;
    }

    public String getOwnerState() {
        return ownerState;
    }

    public void setOwnerState(String ownerState) {
        this.ownerState = ownerState;
    }

    public String getOwnerZipCode() {
        return ownerZipCode;
    }

    public void setOwnerZipCode(String ownerZipCode) {
        this.ownerZipCode = ownerZipCode;
    }
    */

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getNeighborhoodExt() {
        return neighborhoodExt;
    }

    public void setNeighborhoodExt(String neighborhoodExt) {
        this.neighborhoodExt = neighborhoodExt;
    }

    public String getSubdivisionName() {
        return subdivisionName;
    }

    public void setSubdivisionName(String subdivisionName) {
        this.subdivisionName = subdivisionName;
    }

    /*
    public String getFilingDescription() {
        return filingDescription;
    }

    public void setFilingDescription(String filingDescription) {
        this.filingDescription = filingDescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    */
}
