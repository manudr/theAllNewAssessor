package us.co.douglas.assessor.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by mdronamr on 12/23/15.
 */

@Entity
public class NeighborhoodSale {
    private String accountNo;
    private String receptionNo;
    private String neighborhood;
    private String neighborhoodExt;
    private String subdivision;
    private String grantor;
    private String grantee;
    private Date documentDate;
    private Date saleDate;
    private double salePrice;
    private double ppAdjAmount;
    private double goodWillAdjAmount;
    private double otherAdjAmount;
    private double timeAdj;
    private String jurisdictionId;
    private Date inventoryEffectiveDate;
    private double acctAdjSalePrice;
    private String propertyStreet;
    private String propertyCity;
    private String propertyState;
    private String propertyZipCode;
    private double timeAdjustedSalePrice;

    @Id
    public String getReceptionNo() {
        return receptionNo;
    }

    public void setReceptionNo(String receptionNo) {
        this.receptionNo = receptionNo;
    }

    public String getGrantor() {
        return grantor;
    }

    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    public String getGrantee() {
        return grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getPpAdjAmount() {
        return ppAdjAmount;
    }

    public void setPpAdjAmount(double ppAdjAmount) {
        this.ppAdjAmount = ppAdjAmount;
    }

    public double getGoodWillAdjAmount() {
        return goodWillAdjAmount;
    }

    public void setGoodWillAdjAmount(double goodWillAdjAmount) {
        this.goodWillAdjAmount = goodWillAdjAmount;
    }

    public double getOtherAdjAmount() {
        return otherAdjAmount;
    }

    public void setOtherAdjAmount(double otherAdjAmount) {
        this.otherAdjAmount = otherAdjAmount;
    }

    public double getTimeAdj() {
        return timeAdj;
    }

    public void setTimeAdj(double timeAdj) {
        this.timeAdj = timeAdj;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(String jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    public Date getInventoryEffectiveDate() {
        return inventoryEffectiveDate;
    }

    public void setInventoryEffectiveDate(Date inventoryEffectiveDate) {
        this.inventoryEffectiveDate = inventoryEffectiveDate;
    }

    public double getAcctAdjSalePrice() {
        return acctAdjSalePrice;
    }

    public void setAcctAdjSalePrice(double acctAdjSalePrice) {
        this.acctAdjSalePrice = acctAdjSalePrice;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public double getTimeAdjustedSalePrice() {
        return (new Double(getSalePrice()) - (new Double(getPpAdjAmount()) + new Double(getGoodWillAdjAmount()) + new Double(getOtherAdjAmount())) ) * new Double(getTimeAdj());
        //return timeAdjustedSalePrice;
    }

    public void setTimeAdjustedSalePrice(double timeAdjustedSalePrice) {
        this.timeAdjustedSalePrice = timeAdjustedSalePrice;
    }

    public String getNeighborhoodExt() {
        return neighborhoodExt;
    }

    public void setNeighborhoodExt(String neighborhoodExt) {
        this.neighborhoodExt = neighborhoodExt;
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
}