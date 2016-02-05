package us.co.douglas.assessor.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mdronamr on 12/21/15.
 */

@Entity
public class Account implements Serializable {
    private String accountNo;
    private String parcelNo;
    private String acctStatusCode;
    private String acctType;
    private String assignedTo;
    private String valueAreaCode;
    private String appraisalType;
    private String economicAreaCode;
    private String acctDateCreated;
    private String defaultApproachType;
    private String defaultTaxDistrict;
    private String businessLicense;
    private String propertyIdentifier;
    private String primaryUseCode;
    private String ward;
    private String strippedAccountNo;
    private String jurisdictionId;
    private String mobileHomeSpace;
    private String eFileFlag;
    private String businessName;
    private String propertyClassId;
    private String legal;
    private String qtr;
    private String section;
    private String township;
    private String range;
    private String nbhdCode;
    private String nbhdExtension;
    private String propertyType;
    private String impOnlyFlag;
    private String tifFlag;
    private String vacantFlag;
    private String landWidth;
    private String landDepth;
    private String parkingSpaces;
    private String zoningCode;
    private String defaultLea;
    private String subdivisionName;

    @Id
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

    public String getAcctStatusCode() {
        return acctStatusCode;
    }

    public void setAcctStatusCode(String acctStatusCode) {
        this.acctStatusCode = acctStatusCode;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getValueAreaCode() {
        return valueAreaCode;
    }

    public void setValueAreaCode(String valueAreaCode) {
        this.valueAreaCode = valueAreaCode;
    }

    public String getAppraisalType() {
        return appraisalType;
    }

    public void setAppraisalType(String appraisalType) {
        this.appraisalType = appraisalType;
    }

    public String getEconomicAreaCode() {
        return economicAreaCode;
    }

    public void setEconomicAreaCode(String economicAreaCode) {
        this.economicAreaCode = economicAreaCode;
    }

    public String getAcctDateCreated() {
        return acctDateCreated;
    }

    public void setAcctDateCreated(String acctDateCreated) {
        this.acctDateCreated = acctDateCreated;
    }

    public String getDefaultApproachType() {
        return defaultApproachType;
    }

    public void setDefaultApproachType(String defaultApproachType) {
        this.defaultApproachType = defaultApproachType;
    }

    public String getDefaultTaxDistrict() {
        return defaultTaxDistrict;
    }

    public void setDefaultTaxDistrict(String defaultTaxDistrict) {
        this.defaultTaxDistrict = defaultTaxDistrict;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getPropertyIdentifier() {
        return propertyIdentifier;
    }

    public void setPropertyIdentifier(String propertyIdentifier) {
        this.propertyIdentifier = propertyIdentifier;
    }

    public String getPrimaryUseCode() {
        return primaryUseCode;
    }

    public void setPrimaryUseCode(String primaryUseCode) {
        this.primaryUseCode = primaryUseCode;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getStrippedAccountNo() {
        return strippedAccountNo;
    }

    public void setStrippedAccountNo(String strippedAccountNo) {
        this.strippedAccountNo = strippedAccountNo;
    }

    public String getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(String jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    public String getMobileHomeSpace() {
        return mobileHomeSpace;
    }

    public void setMobileHomeSpace(String mobileHomeSpace) {
        this.mobileHomeSpace = mobileHomeSpace;
    }

    public String geteFileFlag() {
        return eFileFlag;
    }

    public void seteFileFlag(String eFileFlag) {
        this.eFileFlag = eFileFlag;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getPropertyClassId() {
        return propertyClassId;
    }

    public void setPropertyClassId(String propertyClassId) {
        this.propertyClassId = propertyClassId;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    public String getQtr() {
        return qtr;
    }

    public void setQtr(String qtr) {
        this.qtr = qtr;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getNbhdCode() {
        return nbhdCode;
    }

    public void setNbhdCode(String nbhdCode) {
        this.nbhdCode = nbhdCode;
    }

    public String getNbhdExtension() {
        return nbhdExtension;
    }

    public void setNbhdExtension(String nbhdExtension) {
        this.nbhdExtension = nbhdExtension;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getImpOnlyFlag() {
        return impOnlyFlag;
    }

    public void setImpOnlyFlag(String impOnlyFlag) {
        this.impOnlyFlag = impOnlyFlag;
    }

    public String getTifFlag() {
        return tifFlag;
    }

    public void setTifFlag(String tifFlag) {
        this.tifFlag = tifFlag;
    }

    public String getVacantFlag() {
        return vacantFlag;
    }

    public void setVacantFlag(String vacantFlag) {
        this.vacantFlag = vacantFlag;
    }

    public String getLandWidth() {
        return landWidth;
    }

    public void setLandWidth(String landWidth) {
        this.landWidth = landWidth;
    }

    public String getLandDepth() {
        return landDepth;
    }

    public void setLandDepth(String landDepth) {
        this.landDepth = landDepth;
    }

    public String getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(String parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public String getZoningCode() {
        return zoningCode;
    }

    public void setZoningCode(String zoningCode) {
        this.zoningCode = zoningCode;
    }

    public String getDefaultLea() {
        return defaultLea;
    }

    public void setDefaultLea(String defaultLea) {
        this.defaultLea = defaultLea;
    }

    public String getSubdivisionName() {
        return subdivisionName;
    }

    public void setSubdivisionName(String subdivisionName) {
        this.subdivisionName = subdivisionName;
    }
}
