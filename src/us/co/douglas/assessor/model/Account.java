package us.co.douglas.assessor.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by mdronamr on 12/21/15.
 */
public class Account implements Serializable {
    private String accountNo;
    private String parcelNo;
    private String localNo;
    private String mapNo;
    private String acctStatus;
    private String acctType;
    private String assignedTo;
    private String valueAreaDescription;
    private String associatedAcct;
    private String appraisalType;
    private String economicAreaCode;
    private String acctDateCreated;
    private String defaultApproachType;
    private String defaultTaxDistrict;
    private String businessLicense;
    private String mapGroup;
    private String controlMap;
    private String propertyIdentifier;
    private String specialInterestNumber;
    private String primaryUseCodeDescription;
    private String ward;
    private String strippedAccountNo;
    private String jurisdictionId;
    private String writeDate;
    private String censusTract;
    private String censusBlock;
    private String mobileHomeSpace;
    private String eFileFlag;
    private String businessName;
    private String costHybridPercent;
    private String marketHybridPercent;
    private String incomeHybridPercent;
    private String reconciledHybridPercent;
    private String parcelSequence;
    private String propertyClassId;
    private String seqId;
    private String detailedReviewDate;
    private String receptionNo;
    private String legal;
    private String qtr;
    private String section;
    private String township;
    private String range;
    private String nbhdCode;
    private String nbhdExtension;
    private String propertyType;
    private String nbhdAdjustmentValue;
    private String buildingId;
    private String preDirection;
    private String propertyAddress;
    private String impOnlyFlag;
    private String tifFlag;
    private String vacantFlag;
    private String landWidth;
    private String landDepth;
    private String trafficCount;
    private String parkingSpaces;
    private String zoningCode;
    private String floodFringe;
    private String floodWay;
    private String tapFee;
    private String plattedFlag;
    private String landCertificationCode;
    private String landAppraiser;
    private String landAppraisalDate;
    private String landOverrideSizeAdj;
    private String landSizeAdj;
    private String landGrossSf;
    private String landGrossAcres;
    private String landGrossFf;
    private String landGrossUnitCount;
    private String landEasementSf;
    private String landExcessSf;
    private String defaultLea;
    private String totalAcctImpInterestPct;
    private String totalAcctLandInterestPct;
    private String ownerAddress;
    private String phone;
    private String fax;
    private String mobile;
    private String pager;
    private String emailAddress;
    private String privateFlag;
    private String personTypeId;
    private String metaPhoneName1;
    private String metaPhoneName2;

    private String accountSubTypeCode;
    private String taxDistrictNo;
    private String landEconomicAreaCode;
    private String accountTypeCode;
    private String subFilingRecordingNo;
    private String ownerName;
    private String mailingAddressLine1;
    private String mailingAddressLine2;
    private String mailingAddressLine3;
    private String mailingCityName;
    private String mailingState;
    private String mailingZipCode;
    private String mailingCountry;
    private String unitNo;
    private String unitDesignator;
    private String addressNumber;
    private String addressNumberSuffix;
    private String preDirectionCode;
    private String streetName;
    private String streetTypeCode;
    private String postDirectionCode;
    private String cityName;
    private String locationZipCode;
    private BigDecimal totalActualValue;
    private BigDecimal totalAssessedValue;
    private BigDecimal totalNetAcres;
    private String legalDescr;
    private String accountStatusCode;
    private String federalIdNo;
    private String locationStateCode;
    private BigDecimal reducedTaxRate;
    private BigDecimal reducedMillLevy;
    //private AccountType accountType;
    //private TaxDistrict taxDistrict;
    //private Land land;
    //private AccountStatus accountStatus;
    private Appeal appeal;
    private Sale sale;
    private SaleInventory saleInventory;


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

    public String getLocalNo() {
        return localNo;
    }

    public void setLocalNo(String localNo) {
        this.localNo = localNo;
    }

    public String getMapNo() {
        return mapNo;
    }

    public void setMapNo(String mapNo) {
        this.mapNo = mapNo;
    }

    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus;
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

    public String getValueAreaDescription() {
        return valueAreaDescription;
    }

    public void setValueAreaDescription(String valueAreaDescription) {
        this.valueAreaDescription = valueAreaDescription;
    }

    public String getAssociatedAcct() {
        return associatedAcct;
    }

    public void setAssociatedAcct(String associatedAcct) {
        this.associatedAcct = associatedAcct;
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

    public String getMapGroup() {
        return mapGroup;
    }

    public void setMapGroup(String mapGroup) {
        this.mapGroup = mapGroup;
    }

    public String getControlMap() {
        return controlMap;
    }

    public void setControlMap(String controlMap) {
        this.controlMap = controlMap;
    }

    public String getPropertyIdentifier() {
        return propertyIdentifier;
    }

    public void setPropertyIdentifier(String propertyIdentifier) {
        this.propertyIdentifier = propertyIdentifier;
    }

    public String getSpecialInterestNumber() {
        return specialInterestNumber;
    }

    public void setSpecialInterestNumber(String specialInterestNumber) {
        this.specialInterestNumber = specialInterestNumber;
    }

    public String getPrimaryUseCodeDescription() {
        return primaryUseCodeDescription;
    }

    public void setPrimaryUseCodeDescription(String primaryUseCodeDescription) {
        this.primaryUseCodeDescription = primaryUseCodeDescription;
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

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

    public String getCensusTract() {
        return censusTract;
    }

    public void setCensusTract(String censusTract) {
        this.censusTract = censusTract;
    }

    public String getCensusBlock() {
        return censusBlock;
    }

    public void setCensusBlock(String censusBlock) {
        this.censusBlock = censusBlock;
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

    public String getCostHybridPercent() {
        return costHybridPercent;
    }

    public void setCostHybridPercent(String costHybridPercent) {
        this.costHybridPercent = costHybridPercent;
    }

    public String getMarketHybridPercent() {
        return marketHybridPercent;
    }

    public void setMarketHybridPercent(String marketHybridPercent) {
        this.marketHybridPercent = marketHybridPercent;
    }

    public String getIncomeHybridPercent() {
        return incomeHybridPercent;
    }

    public void setIncomeHybridPercent(String incomeHybridPercent) {
        this.incomeHybridPercent = incomeHybridPercent;
    }

    public String getReconciledHybridPercent() {
        return reconciledHybridPercent;
    }

    public void setReconciledHybridPercent(String reconciledHybridPercent) {
        this.reconciledHybridPercent = reconciledHybridPercent;
    }

    public String getParcelSequence() {
        return parcelSequence;
    }

    public void setParcelSequence(String parcelSequence) {
        this.parcelSequence = parcelSequence;
    }

    public String getPropertyClassId() {
        return propertyClassId;
    }

    public void setPropertyClassId(String propertyClassId) {
        this.propertyClassId = propertyClassId;
    }

    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    public String getDetailedReviewDate() {
        return detailedReviewDate;
    }

    public void setDetailedReviewDate(String detailedReviewDate) {
        this.detailedReviewDate = detailedReviewDate;
    }

    public String getReceptionNo() {
        return receptionNo;
    }

    public void setReceptionNo(String receptionNo) {
        this.receptionNo = receptionNo;
    }

    public Appeal getAppeal() {
        return appeal;
    }

    public void setAppeal(Appeal appeal) {
        this.appeal = appeal;
    }


    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public SaleInventory getSaleInventory() {
        return saleInventory;
    }

    public void setSaleInventory(SaleInventory saleInventory) {
        this.saleInventory = saleInventory;
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

    public String getNbhdAdjustmentValue() {
        return nbhdAdjustmentValue;
    }

    public void setNbhdAdjustmentValue(String nbhdAdjustmentValue) {
        this.nbhdAdjustmentValue = nbhdAdjustmentValue;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public String getPreDirection() {
        return preDirection;
    }

    public void setPreDirection(String preDirection) {
        this.preDirection = preDirection;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
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

    public String getTrafficCount() {
        return trafficCount;
    }

    public void setTrafficCount(String trafficCount) {
        this.trafficCount = trafficCount;
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

    public String getFloodFringe() {
        return floodFringe;
    }

    public void setFloodFringe(String floodFringe) {
        this.floodFringe = floodFringe;
    }

    public String getFloodWay() {
        return floodWay;
    }

    public void setFloodWay(String floodWay) {
        this.floodWay = floodWay;
    }

    public String getTapFee() {
        return tapFee;
    }

    public void setTapFee(String tapFee) {
        this.tapFee = tapFee;
    }

    public String getPlattedFlag() {
        return plattedFlag;
    }

    public void setPlattedFlag(String plattedFlag) {
        this.plattedFlag = plattedFlag;
    }

    public String getLandCertificationCode() {
        return landCertificationCode;
    }

    public void setLandCertificationCode(String landCertificationCode) {
        this.landCertificationCode = landCertificationCode;
    }

    public String getLandAppraiser() {
        return landAppraiser;
    }

    public void setLandAppraiser(String landAppraiser) {
        this.landAppraiser = landAppraiser;
    }

    public String getLandAppraisalDate() {
        return landAppraisalDate;
    }

    public void setLandAppraisalDate(String landAppraisalDate) {
        this.landAppraisalDate = landAppraisalDate;
    }

    public String getLandOverrideSizeAdj() {
        return landOverrideSizeAdj;
    }

    public void setLandOverrideSizeAdj(String landOverrideSizeAdj) {
        this.landOverrideSizeAdj = landOverrideSizeAdj;
    }

    public String getLandSizeAdj() {
        return landSizeAdj;
    }

    public void setLandSizeAdj(String landSizeAdj) {
        this.landSizeAdj = landSizeAdj;
    }

    public String getLandGrossSf() {
        return landGrossSf;
    }

    public void setLandGrossSf(String landGrossSf) {
        this.landGrossSf = landGrossSf;
    }

    public String getLandGrossAcres() {
        return landGrossAcres;
    }

    public void setLandGrossAcres(String landGrossAcres) {
        this.landGrossAcres = landGrossAcres;
    }

    public String getLandGrossFf() {
        return landGrossFf;
    }

    public void setLandGrossFf(String landGrossFf) {
        this.landGrossFf = landGrossFf;
    }

    public String getLandGrossUnitCount() {
        return landGrossUnitCount;
    }

    public void setLandGrossUnitCount(String landGrossUnitCount) {
        this.landGrossUnitCount = landGrossUnitCount;
    }

    public String getLandEasementSf() {
        return landEasementSf;
    }

    public void setLandEasementSf(String landEasementSf) {
        this.landEasementSf = landEasementSf;
    }

    public String getLandExcessSf() {
        return landExcessSf;
    }

    public void setLandExcessSf(String landExcessSf) {
        this.landExcessSf = landExcessSf;
    }

    public String getDefaultLea() {
        return defaultLea;
    }

    public void setDefaultLea(String defaultLea) {
        this.defaultLea = defaultLea;
    }

    public String getTotalAcctImpInterestPct() {
        return totalAcctImpInterestPct;
    }

    public void setTotalAcctImpInterestPct(String totalAcctImpInterestPct) {
        this.totalAcctImpInterestPct = totalAcctImpInterestPct;
    }

    public String getTotalAcctLandInterestPct() {
        return totalAcctLandInterestPct;
    }

    public void setTotalAcctLandInterestPct(String totalAcctLandInterestPct) {
        this.totalAcctLandInterestPct = totalAcctLandInterestPct;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPager() {
        return pager;
    }

    public void setPager(String pager) {
        this.pager = pager;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFederalIdNo() {
        return federalIdNo;
    }

    public void setFederalIdNo(String federalIdNo) {
        this.federalIdNo = federalIdNo;
    }

    public String getPrivateFlag() {
        return privateFlag;
    }

    public void setPrivateFlag(String privateFlag) {
        this.privateFlag = privateFlag;
    }

    public String getPersonTypeId() {
        return personTypeId;
    }

    public void setPersonTypeId(String personTypeId) {
        this.personTypeId = personTypeId;
    }

    public String getMetaPhoneName1() {
        return metaPhoneName1;
    }

    public void setMetaPhoneName1(String metaPhoneName1) {
        this.metaPhoneName1 = metaPhoneName1;
    }

    public String getMetaPhoneName2() {
        return metaPhoneName2;
    }

    public void setMetaPhoneName2(String metaPhoneName2) {
        this.metaPhoneName2 = metaPhoneName2;
    }
}
