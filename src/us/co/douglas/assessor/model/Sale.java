package us.co.douglas.assessor.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/23/15.
 */

@Entity

public class Sale {
    private String accountNo;
    private String receptionNo;
    private String neighborhood;
    private String subdivision;
    private String grantor;
    private String grantee;
    private String documentDate;
    private String saleDate;
    private String salePrice;
    private String ppAdjAmount;
    private String goodWillAdjAmount;
    private String otherAdjAmount;
    private String timeAdj;
    private String jurisdictionId;
    private String inventoryEffectiveDate;
    private String acctAdjSalePrice;
    private String propertyAddress;
    private String timeAdjustedSalePrice;

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

    public String getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getPpAdjAmount() {
        return ppAdjAmount;
    }

    public void setPpAdjAmount(String ppAdjAmount) {
        this.ppAdjAmount = ppAdjAmount;
    }

    public String getGoodWillAdjAmount() {
        return goodWillAdjAmount;
    }

    public void setGoodWillAdjAmount(String goodWillAdjAmount) {
        this.goodWillAdjAmount = goodWillAdjAmount;
    }

    public String getOtherAdjAmount() {
        return otherAdjAmount;
    }

    public void setOtherAdjAmount(String otherAdjAmount) {
        this.otherAdjAmount = otherAdjAmount;
    }

    public String getTimeAdj() {
        return timeAdj;
    }

    public void setTimeAdj(String timeAdj) {
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

    public String getInventoryEffectiveDate() {
        return inventoryEffectiveDate;
    }

    public void setInventoryEffectiveDate(String inventoryEffectiveDate) {
        this.inventoryEffectiveDate = inventoryEffectiveDate;
    }

    public String getAcctAdjSalePrice() {
        return acctAdjSalePrice;
    }

    public void setAcctAdjSalePrice(String acctAdjSalePrice) {
        this.acctAdjSalePrice = acctAdjSalePrice;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
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

    public String getTimeAdjustedSalePrice() {
        return String.valueOf((new Double(getSalePrice()) - (new Double(getPpAdjAmount()) + new Double(getGoodWillAdjAmount()) + new Double(getOtherAdjAmount())) ) * new Double(getTimeAdj()));
        //return timeAdjustedSalePrice;
    }

    public void setTimeAdjustedSalePrice(String timeAdjustedSalePrice) {
        this.timeAdjustedSalePrice = timeAdjustedSalePrice;
    }

}