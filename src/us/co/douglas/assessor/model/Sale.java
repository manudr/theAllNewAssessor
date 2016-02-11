package us.co.douglas.assessor.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by mdronamr on 12/23/15.
 */

@Entity
public class Sale {
    private String receptionNo;
    private String grantor;
    private String grantee;
    private Date saleDate;
    private Date inventoryEffectiveDate;
    private Double salePrice;
    private Double adjSalePrice;
    private Double saleValuePer;
    private Date documentDate;
    private Double documentFee;
    private String deedCode;
    private String tenant;
    private Boolean improvedFlag;
    private String confirmBy;
    private String confirmMethod;
    private Timestamp confirmDate;
    private String comments;
    private Boolean transferDeclarationFlag;
    private Timestamp transferDeclarationDate;
    private String impConditionType;
    private String impQuality;
    private String impAbstractCode;
    private String bltAsDescription;
    private String bltAsCode;
    private String bltAsYearBuilt;
    private String physicalAge;
    private String adjustedYearBuilt;
    private String impExterior;
    private String classCode;
    private Integer impCount;
    private Integer bltAsTotalUnitCount;
    private Integer roomCount;
    private Integer bedRoomCount;
    private Integer bathCount;
    private Integer fixtureCount;
    private Integer totalImpSf;
    private Integer residentialSf;
    private Integer commercialSf;
    private Integer condoImpSf;
    private Integer outBuildingSf;
    private Integer outBuildingCount;
    private Integer impBltAsOther;
    private Integer landNetSf;
    private Integer landExcessSf;
    private String landType;
    private String landAbstractCode;
    private String landCertificationCode;
    private Integer landGrossAcreCount;
    private Integer landGrossSf;
    private Integer landGrossUnitCount;
    private String unitName;
    private Double totalLandValueTimeOfSale;
    private Double totalAcctValueTimeOfSale;
    private Double priorYearTaxRollActualAmt;
    private Double priorYearTaxRollAssessed;
    private Double landNetAcreCount;
    private String hvacType;
    private String impUnitType;
    private String impInterior;
    private String roofCover;
    private String roofType;
    private Boolean inventoryOverRideFlag;
    private Double zonedArea;
    private String approachType;
    private String floorCover;
    private Double condoImpPercent;
    private Double finalSf;
    private Double finalSfValuePer;
    private Double zonedAreaValuePer;
    private String lot;
    private String block;
    private String filingNo;
    private String occcodeDescription1;
    private Double ppAdjAmount;
    private Double goodWillAdjAmount;
    private Double otherAdjAmount;
    private Double timeAdj;
    private String jurisdictionId;
    private Double acctAdjSalePrice;
    private Double timeAdjSalePrice;

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

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Date getInventoryEffectiveDate() {
        return inventoryEffectiveDate;
    }

    public void setInventoryEffectiveDate(Date inventoryEffectiveDate) {
        this.inventoryEffectiveDate = inventoryEffectiveDate;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getAdjSalePrice() {
        return adjSalePrice;
    }

    public void setAdjSalePrice(Double adjSalePrice) {
        this.adjSalePrice = adjSalePrice;
    }

    public Double getSaleValuePer() {
        return saleValuePer;
    }

    public void setSaleValuePer(Double saleValuePer) {
        this.saleValuePer = saleValuePer;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    public Double getDocumentFee() {
        return documentFee;
    }

    public void setDocumentFee(Double documentFee) {
        this.documentFee = documentFee;
    }

    public String getDeedCode() {
        return deedCode;
    }

    public void setDeedCode(String deedCode) {
        this.deedCode = deedCode;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public Boolean getImprovedFlag() {
        return improvedFlag;
    }

    public void setImprovedFlag(Boolean improvedFlag) {
        this.improvedFlag = improvedFlag;
    }

    public String getConfirmBy() {
        return confirmBy;
    }

    public void setConfirmBy(String confirmBy) {
        this.confirmBy = confirmBy;
    }

    public String getConfirmMethod() {
        return confirmMethod;
    }

    public void setConfirmMethod(String confirmMethod) {
        this.confirmMethod = confirmMethod;
    }

    public Timestamp getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Timestamp confirmDate) {
        this.confirmDate = confirmDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getTransferDeclarationFlag() {
        return transferDeclarationFlag;
    }

    public void setTransferDeclarationFlag(Boolean transferDeclarationFlag) {
        this.transferDeclarationFlag = transferDeclarationFlag;
    }

    public Timestamp getTransferDeclarationDate() {
        return transferDeclarationDate;
    }

    public void setTransferDeclarationDate(Timestamp transferDeclarationDate) {
        this.transferDeclarationDate = transferDeclarationDate;
    }

    public String getImpConditionType() {
        return impConditionType;
    }

    public void setImpConditionType(String impConditionType) {
        this.impConditionType = impConditionType;
    }

    public String getImpQuality() {
        return impQuality;
    }

    public void setImpQuality(String impQuality) {
        this.impQuality = impQuality;
    }

    public String getImpAbstractCode() {
        return impAbstractCode;
    }

    public void setImpAbstractCode(String impAbstractCode) {
        this.impAbstractCode = impAbstractCode;
    }

    public String getBltAsDescription() {
        return bltAsDescription;
    }

    public void setBltAsDescription(String bltAsDescription) {
        this.bltAsDescription = bltAsDescription;
    }

    public String getBltAsCode() {
        return bltAsCode;
    }

    public void setBltAsCode(String bltAsCode) {
        this.bltAsCode = bltAsCode;
    }

    public String getBltAsYearBuilt() {
        return bltAsYearBuilt;
    }

    public void setBltAsYearBuilt(String bltAsYearBuilt) {
        this.bltAsYearBuilt = bltAsYearBuilt;
    }

    public String getPhysicalAge() {
        return physicalAge;
    }

    public void setPhysicalAge(String physicalAge) {
        this.physicalAge = physicalAge;
    }

    public String getAdjustedYearBuilt() {
        return adjustedYearBuilt;
    }

    public void setAdjustedYearBuilt(String adjustedYearBuilt) {
        this.adjustedYearBuilt = adjustedYearBuilt;
    }

    public String getImpExterior() {
        return impExterior;
    }

    public void setImpExterior(String impExterior) {
        this.impExterior = impExterior;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public Integer getImpCount() {
        return impCount;
    }

    public void setImpCount(Integer impCount) {
        this.impCount = impCount;
    }

    public Integer getBltAsTotalUnitCount() {
        return bltAsTotalUnitCount;
    }

    public void setBltAsTotalUnitCount(Integer bltAsTotalUnitCount) {
        this.bltAsTotalUnitCount = bltAsTotalUnitCount;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public Integer getBedRoomCount() {
        return bedRoomCount;
    }

    public void setBedRoomCount(Integer bedRoomCount) {
        this.bedRoomCount = bedRoomCount;
    }

    public Integer getBathCount() {
        return bathCount;
    }

    public void setBathCount(Integer bathCount) {
        this.bathCount = bathCount;
    }

    public Integer getFixtureCount() {
        return fixtureCount;
    }

    public void setFixtureCount(Integer fixtureCount) {
        this.fixtureCount = fixtureCount;
    }

    public Integer getTotalImpSf() {
        return totalImpSf;
    }

    public void setTotalImpSf(Integer totalImpSf) {
        this.totalImpSf = totalImpSf;
    }

    public Integer getResidentialSf() {
        return residentialSf;
    }

    public void setResidentialSf(Integer residentialSf) {
        this.residentialSf = residentialSf;
    }

    public Integer getCommercialSf() {
        return commercialSf;
    }

    public void setCommercialSf(Integer commercialSf) {
        this.commercialSf = commercialSf;
    }

    public Integer getCondoImpSf() {
        return condoImpSf;
    }

    public void setCondoImpSf(Integer condoImpSf) {
        this.condoImpSf = condoImpSf;
    }

    public Integer getOutBuildingSf() {
        return outBuildingSf;
    }

    public void setOutBuildingSf(Integer outBuildingSf) {
        this.outBuildingSf = outBuildingSf;
    }

    public Integer getOutBuildingCount() {
        return outBuildingCount;
    }

    public void setOutBuildingCount(Integer outBuildingCount) {
        this.outBuildingCount = outBuildingCount;
    }

    public Integer getImpBltAsOther() {
        return impBltAsOther;
    }

    public void setImpBltAsOther(Integer impBltAsOther) {
        this.impBltAsOther = impBltAsOther;
    }

    public Integer getLandNetSf() {
        return landNetSf;
    }

    public void setLandNetSf(Integer landNetSf) {
        this.landNetSf = landNetSf;
    }

    public Integer getLandExcessSf() {
        return landExcessSf;
    }

    public void setLandExcessSf(Integer landExcessSf) {
        this.landExcessSf = landExcessSf;
    }

    public String getLandType() {
        return landType;
    }

    public void setLandType(String landType) {
        this.landType = landType;
    }

    public String getLandAbstractCode() {
        return landAbstractCode;
    }

    public void setLandAbstractCode(String landAbstractCode) {
        this.landAbstractCode = landAbstractCode;
    }

    public String getLandCertificationCode() {
        return landCertificationCode;
    }

    public void setLandCertificationCode(String landCertificationCode) {
        this.landCertificationCode = landCertificationCode;
    }

    public Integer getLandGrossAcreCount() {
        return landGrossAcreCount;
    }

    public void setLandGrossAcreCount(Integer landGrossAcreCount) {
        this.landGrossAcreCount = landGrossAcreCount;
    }

    public Integer getLandGrossSf() {
        return landGrossSf;
    }

    public void setLandGrossSf(Integer landGrossSf) {
        this.landGrossSf = landGrossSf;
    }

    public Integer getLandGrossUnitCount() {
        return landGrossUnitCount;
    }

    public void setLandGrossUnitCount(Integer landGrossUnitCount) {
        this.landGrossUnitCount = landGrossUnitCount;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Double getTotalLandValueTimeOfSale() {
        return totalLandValueTimeOfSale;
    }

    public void setTotalLandValueTimeOfSale(Double totalLandValueTimeOfSale) {
        this.totalLandValueTimeOfSale = totalLandValueTimeOfSale;
    }

    public Double getTotalAcctValueTimeOfSale() {
        return totalAcctValueTimeOfSale;
    }

    public void setTotalAcctValueTimeOfSale(Double totalAcctValueTimeOfSale) {
        this.totalAcctValueTimeOfSale = totalAcctValueTimeOfSale;
    }

    public Double getPriorYearTaxRollActualAmt() {
        return priorYearTaxRollActualAmt;
    }

    public void setPriorYearTaxRollActualAmt(Double priorYearTaxRollActualAmt) {
        this.priorYearTaxRollActualAmt = priorYearTaxRollActualAmt;
    }

    public Double getPriorYearTaxRollAssessed() {
        return priorYearTaxRollAssessed;
    }

    public void setPriorYearTaxRollAssessed(Double priorYearTaxRollAssessed) {
        this.priorYearTaxRollAssessed = priorYearTaxRollAssessed;
    }

    public Double getLandNetAcreCount() {
        return landNetAcreCount;
    }

    public void setLandNetAcreCount(Double landNetAcreCount) {
        this.landNetAcreCount = landNetAcreCount;
    }

    public String getHvacType() {
        return hvacType;
    }

    public void setHvacType(String hvacType) {
        this.hvacType = hvacType;
    }

    public String getImpUnitType() {
        return impUnitType;
    }

    public void setImpUnitType(String impUnitType) {
        this.impUnitType = impUnitType;
    }

    public String getImpInterior() {
        return impInterior;
    }

    public void setImpInterior(String impInterior) {
        this.impInterior = impInterior;
    }

    public String getRoofCover() {
        return roofCover;
    }

    public void setRoofCover(String roofCover) {
        this.roofCover = roofCover;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public Boolean getInventoryOverRideFlag() {
        return inventoryOverRideFlag;
    }

    public void setInventoryOverRideFlag(Boolean inventoryOverRideFlag) {
        this.inventoryOverRideFlag = inventoryOverRideFlag;
    }

    public Double getZonedArea() {
        return zonedArea;
    }

    public void setZonedArea(Double zonedArea) {
        this.zonedArea = zonedArea;
    }

    public String getApproachType() {
        return approachType;
    }

    public void setApproachType(String approachType) {
        this.approachType = approachType;
    }

    public String getFloorCover() {
        return floorCover;
    }

    public void setFloorCover(String floorCover) {
        this.floorCover = floorCover;
    }

    public Double getCondoImpPercent() {
        return condoImpPercent;
    }

    public void setCondoImpPercent(Double condoImpPercent) {
        this.condoImpPercent = condoImpPercent;
    }

    public Double getFinalSf() {
        return finalSf;
    }

    public void setFinalSf(Double finalSf) {
        this.finalSf = finalSf;
    }

    public Double getFinalSfValuePer() {
        return finalSfValuePer;
    }

    public void setFinalSfValuePer(Double finalSfValuePer) {
        this.finalSfValuePer = finalSfValuePer;
    }

    public Double getZonedAreaValuePer() {
        return zonedAreaValuePer;
    }

    public void setZonedAreaValuePer(Double zonedAreaValuePer) {
        this.zonedAreaValuePer = zonedAreaValuePer;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getFilingNo() {
        return filingNo;
    }

    public void setFilingNo(String filingNo) {
        this.filingNo = filingNo;
    }

    public String getOcccodeDescription1() {
        return occcodeDescription1;
    }

    public void setOcccodeDescription1(String occcodeDescription1) {
        this.occcodeDescription1 = occcodeDescription1;
    }

    public Double getPpAdjAmount() {
        return ppAdjAmount;
    }

    public void setPpAdjAmount(Double ppAdjAmount) {
        this.ppAdjAmount = ppAdjAmount;
    }

    public Double getGoodWillAdjAmount() {
        return goodWillAdjAmount;
    }

    public void setGoodWillAdjAmount(Double goodWillAdjAmount) {
        this.goodWillAdjAmount = goodWillAdjAmount;
    }

    public Double getOtherAdjAmount() {
        return otherAdjAmount;
    }

    public void setOtherAdjAmount(Double otherAdjAmount) {
        this.otherAdjAmount = otherAdjAmount;
    }

    public Double getTimeAdj() {
        return timeAdj;
    }

    public void setTimeAdj(Double timeAdj) {
        this.timeAdj = timeAdj;
    }

    public String getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(String jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    public Double getAcctAdjSalePrice() {
        return acctAdjSalePrice;
    }

    public void setAcctAdjSalePrice(Double acctAdjSalePrice) {
        this.acctAdjSalePrice = acctAdjSalePrice;
    }

    public Double getTimeAdjSalePrice() {
        return timeAdjSalePrice;
    }

    public void setTimeAdjSalePrice(Double timeAdjSalePrice) {
        this.timeAdjSalePrice = timeAdjSalePrice;
    }

}