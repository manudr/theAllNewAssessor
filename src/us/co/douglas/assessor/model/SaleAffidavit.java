package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
@Table(name="TBLSALEAFFIDAVIT", schema = "ENCOMPASS")
public class SaleAffidavit {
    private String receptionNo;

    @Basic
    @javax.persistence.Column(name = "RECEPTIONNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getReceptionNo() {
        return receptionNo;
    }

    public void setReceptionNo(String receptionNo) {
        this.receptionNo = receptionNo;
    }

    private BigInteger divideParcelFlag;

    @Basic
    @javax.persistence.Column(name = "DIVIDEPARCELFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getDivideParcelFlag() {
        return divideParcelFlag;
    }

    public void setDivideParcelFlag(BigInteger divideParcelFlag) {
        this.divideParcelFlag = divideParcelFlag;
    }

    private String salesAffPropAltDescription1;

    @Basic
    @javax.persistence.Column(name = "SALESAFFPROPALTDESCRIPTION1", nullable = true, insertable = true, updatable = true, length = 40)
    public String getSalesAffPropAltDescription1() {
        return salesAffPropAltDescription1;
    }

    public void setSalesAffPropAltDescription1(String salesAffPropAltDescription1) {
        this.salesAffPropAltDescription1 = salesAffPropAltDescription1;
    }

    private String salesAffPropAltDescription2;

    @Basic
    @javax.persistence.Column(name = "SALESAFFPROPALTDESCRIPTION2", nullable = true, insertable = true, updatable = true, length = 40)
    public String getSalesAffPropAltDescription2() {
        return salesAffPropAltDescription2;
    }

    public void setSalesAffPropAltDescription2(String salesAffPropAltDescription2) {
        this.salesAffPropAltDescription2 = salesAffPropAltDescription2;
    }

    private String intendedUseDescription;

    @Basic
    @javax.persistence.Column(name = "INTENDEDUSEDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 40)
    public String getIntendedUseDescription() {
        return intendedUseDescription;
    }

    public void setIntendedUseDescription(String intendedUseDescription) {
        this.intendedUseDescription = intendedUseDescription;
    }

    private String excludeDescription1;

    @Basic
    @javax.persistence.Column(name = "EXCLUDEDESCRIPTION1", nullable = true, insertable = true, updatable = true, length = 40)
    public String getExcludeDescription1() {
        return excludeDescription1;
    }

    public void setExcludeDescription1(String excludeDescription1) {
        this.excludeDescription1 = excludeDescription1;
    }

    private String excludeDescription2;

    @Basic
    @javax.persistence.Column(name = "EXCLUDEDESCRIPTION2", nullable = true, insertable = true, updatable = true, length = 40)
    public String getExcludeDescription2() {
        return excludeDescription2;
    }

    public void setExcludeDescription2(String excludeDescription2) {
        this.excludeDescription2 = excludeDescription2;
    }

    private Timestamp documentDate;

    @Basic
    @javax.persistence.Column(name = "DOCUMENTDATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Timestamp documentDate) {
        this.documentDate = documentDate;
    }

    private String docketNo;

    @Basic
    @javax.persistence.Column(name = "DOCKETNO", nullable = true, insertable = true, updatable = true, length = 10)
    public String getDocketNo() {
        return docketNo;
    }

    public void setDocketNo(String docketNo) {
        this.docketNo = docketNo;
    }

    private String salesAffBatchNo;

    @Basic
    @javax.persistence.Column(name = "SALESAFFBATCHNO", nullable = true, insertable = true, updatable = true, length = 3)
    public String getSalesAffBatchNo() {
        return salesAffBatchNo;
    }

    public void setSalesAffBatchNo(String salesAffBatchNo) {
        this.salesAffBatchNo = salesAffBatchNo;
    }

    private String salesAffDeedAltDescription;

    @Basic
    @javax.persistence.Column(name = "SALESAFFDEEDALTDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 40)
    public String getSalesAffDeedAltDescription() {
        return salesAffDeedAltDescription;
    }

    public void setSalesAffDeedAltDescription(String salesAffDeedAltDescription) {
        this.salesAffDeedAltDescription = salesAffDeedAltDescription;
    }

    private String assessorInitials;

    @Basic
    @javax.persistence.Column(name = "ASSESSORINITIALS", nullable = true, insertable = true, updatable = true, length = 3)
    public String getAssessorInitials() {
        return assessorInitials;
    }

    public void setAssessorInitials(String assessorInitials) {
        this.assessorInitials = assessorInitials;
    }

    private String departmentOfRevenueInitials;

    @Basic
    @javax.persistence.Column(name = "DEPARTMENTOFREVENUEINITIALS", nullable = true, insertable = true, updatable = true, length = 3)
    public String getDepartmentOfRevenueInitials() {
        return departmentOfRevenueInitials;
    }

    public void setDepartmentOfRevenueInitials(String departmentOfRevenueInitials) {
        this.departmentOfRevenueInitials = departmentOfRevenueInitials;
    }

    private BigDecimal totalAdjActualValue;

    @Basic
    @javax.persistence.Column(name = "TOTALADJACTUALVALUE", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getTotalAdjActualValue() {
        return totalAdjActualValue;
    }

    public void setTotalAdjActualValue(BigDecimal totalAdjActualValue) {
        this.totalAdjActualValue = totalAdjActualValue;
    }

    private Timestamp saleDate;

    @Basic
    @javax.persistence.Column(name = "SALEDATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Timestamp saleDate) {
        this.saleDate = saleDate;
    }

    private BigDecimal salePrice;

    @Basic
    @javax.persistence.Column(name = "SALEPRICE", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    private BigDecimal downPaymentAmount;

    @Basic
    @javax.persistence.Column(name = "DOWNPAYMENTAMOUNT", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getDownPaymentAmount() {
        return downPaymentAmount;
    }

    public void setDownPaymentAmount(BigDecimal downPaymentAmount) {
        this.downPaymentAmount = downPaymentAmount;
    }

    private String financeMethodAltDescription;

    @Basic
    @javax.persistence.Column(name = "FINANCEMETHODALTDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 40)
    public String getFinanceMethodAltDescription() {
        return financeMethodAltDescription;
    }

    public void setFinanceMethodAltDescription(String financeMethodAltDescription) {
        this.financeMethodAltDescription = financeMethodAltDescription;
    }

    private BigInteger ppFlag;

    @Basic
    @javax.persistence.Column(name = "PPFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getPpFlag() {
        return ppFlag;
    }

    public void setPpFlag(BigInteger ppFlag) {
        this.ppFlag = ppFlag;
    }

    private BigDecimal ppAdjAmount;

    @Basic
    @javax.persistence.Column(name = "PPADJAMOUNT", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getPpAdjAmount() {
        return ppAdjAmount;
    }

    public void setPpAdjAmount(BigDecimal ppAdjAmount) {
        this.ppAdjAmount = ppAdjAmount;
    }

    private String ppDescription;

    @Basic
    @javax.persistence.Column(name = "PPDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 200)
    public String getPpDescription() {
        return ppDescription;
    }

    public void setPpDescription(String ppDescription) {
        this.ppDescription = ppDescription;
    }

    private BigInteger partialInterestFlag;

    @Basic
    @javax.persistence.Column(name = "PARTIALINTERESTFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getPartialInterestFlag() {
        return partialInterestFlag;
    }

    public void setPartialInterestFlag(BigInteger partialInterestFlag) {
        this.partialInterestFlag = partialInterestFlag;
    }

    private String partialInterestDescription;

    @Basic
    @javax.persistence.Column(name = "PARTIALINTERESTDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 40)
    public String getPartialInterestDescription() {
        return partialInterestDescription;
    }

    public void setPartialInterestDescription(String partialInterestDescription) {
        this.partialInterestDescription = partialInterestDescription;
    }

    private BigInteger relatedFlag;

    @Basic
    @javax.persistence.Column(name = "RELATEDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getRelatedFlag() {
        return relatedFlag;
    }

    public void setRelatedFlag(BigInteger relatedFlag) {
        this.relatedFlag = relatedFlag;
    }

    private String legalDescription;

    @Basic
    @javax.persistence.Column(name = "LEGALDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 4000)
    public String getLegalDescription() {
        return legalDescription;
    }

    public void setLegalDescription(String legalDescription) {
        this.legalDescription = legalDescription;
    }

    private String streetNo;

    @Basic
    @javax.persistence.Column(name = "STREETNO", nullable = true, insertable = true, updatable = true, length = 15)
    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    private String preDirection;

    @Basic
    @javax.persistence.Column(name = "PREDIRECTION", nullable = true, insertable = true, updatable = true, length = 2)
    public String getPreDirection() {
        return preDirection;
    }

    public void setPreDirection(String preDirection) {
        this.preDirection = preDirection;
    }

    private String streetName;

    @Basic
    @javax.persistence.Column(name = "STREETNAME", nullable = true, insertable = true, updatable = true, length = 50)
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    private String streetType;

    @Basic
    @javax.persistence.Column(name = "STREETTYPE", nullable = true, insertable = true, updatable = true, length = 4)
    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    private String postDirection;

    @Basic
    @javax.persistence.Column(name = "POSTDIRECTION", nullable = true, insertable = true, updatable = true, length = 2)
    public String getPostDirection() {
        return postDirection;
    }

    public void setPostDirection(String postDirection) {
        this.postDirection = postDirection;
    }

    private String unitName;

    @Basic
    @javax.persistence.Column(name = "UNITNAME", nullable = true, insertable = true, updatable = true, length = 6)
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    private String propertyCity;

    @Basic
    @javax.persistence.Column(name = "PROPERTYCITY", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPropertyCity() {
        return propertyCity;
    }

    public void setPropertyCity(String propertyCity) {
        this.propertyCity = propertyCity;
    }

    private String propertyZipCode;

    @Basic
    @javax.persistence.Column(name = "PROPERTYZIPCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getPropertyZipCode() {
        return propertyZipCode;
    }

    public void setPropertyZipCode(String propertyZipCode) {
        this.propertyZipCode = propertyZipCode;
    }

    private BigInteger sellersignatureflag;

    @Basic
    @javax.persistence.Column(name = "SELLERSIGNATUREFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getSellersignatureflag() {
        return sellersignatureflag;
    }

    public void setSellersignatureflag(BigInteger sellersignatureflag) {
        this.sellersignatureflag = sellersignatureflag;
    }

    private BigInteger buyersignatureflag;

    @Basic
    @javax.persistence.Column(name = "BUYERSIGNATUREFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getBuyersignatureflag() {
        return buyersignatureflag;
    }

    public void setBuyersignatureflag(BigInteger buyersignatureflag) {
        this.buyersignatureflag = buyersignatureflag;
    }

    private String sellername;

    @Basic
    @javax.persistence.Column(name = "SELLERNAME", nullable = true, insertable = true, updatable = true, length = 80)
    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    private String selleraddress;

    @Basic
    @javax.persistence.Column(name = "SELLERADDRESS", nullable = true, insertable = true, updatable = true, length = 40)
    public String getSelleraddress() {
        return selleraddress;
    }

    public void setSelleraddress(String selleraddress) {
        this.selleraddress = selleraddress;
    }

    private String sellercity;

    @Basic
    @javax.persistence.Column(name = "SELLERCITY", nullable = true, insertable = true, updatable = true, length = 40)
    public String getSellercity() {
        return sellercity;
    }

    public void setSellercity(String sellercity) {
        this.sellercity = sellercity;
    }

    private String sellerstate;

    @Basic
    @javax.persistence.Column(name = "SELLERSTATE", nullable = true, insertable = true, updatable = true, length = 2)
    public String getSellerstate() {
        return sellerstate;
    }

    public void setSellerstate(String sellerstate) {
        this.sellerstate = sellerstate;
    }

    private String sellerzipcode;

    @Basic
    @javax.persistence.Column(name = "SELLERZIPCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getSellerzipcode() {
        return sellerzipcode;
    }

    public void setSellerzipcode(String sellerzipcode) {
        this.sellerzipcode = sellerzipcode;
    }

    private String sellerphone;

    @Basic
    @javax.persistence.Column(name = "SELLERPHONE", nullable = true, insertable = true, updatable = true, length = 18)
    public String getSellerphone() {
        return sellerphone;
    }

    public void setSellerphone(String sellerphone) {
        this.sellerphone = sellerphone;
    }

    private String buyername;

    @Basic
    @javax.persistence.Column(name = "BUYERNAME", nullable = true, insertable = true, updatable = true, length = 80)
    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername;
    }

    private String buyeraddress;

    @Basic
    @javax.persistence.Column(name = "BUYERADDRESS", nullable = true, insertable = true, updatable = true, length = 40)
    public String getBuyeraddress() {
        return buyeraddress;
    }

    public void setBuyeraddress(String buyeraddress) {
        this.buyeraddress = buyeraddress;
    }

    private String buyercity;

    @Basic
    @javax.persistence.Column(name = "BUYERCITY", nullable = true, insertable = true, updatable = true, length = 40)
    public String getBuyercity() {
        return buyercity;
    }

    public void setBuyercity(String buyercity) {
        this.buyercity = buyercity;
    }

    private String buyerstate;

    @Basic
    @javax.persistence.Column(name = "BUYERSTATE", nullable = true, insertable = true, updatable = true, length = 2)
    public String getBuyerstate() {
        return buyerstate;
    }

    public void setBuyerstate(String buyerstate) {
        this.buyerstate = buyerstate;
    }

    private String buyerzipcode;

    @Basic
    @javax.persistence.Column(name = "BUYERZIPCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getBuyerzipcode() {
        return buyerzipcode;
    }

    public void setBuyerzipcode(String buyerzipcode) {
        this.buyerzipcode = buyerzipcode;
    }

    private String buyerphone;

    @Basic
    @javax.persistence.Column(name = "BUYERPHONE", nullable = true, insertable = true, updatable = true, length = 18)
    public String getBuyerphone() {
        return buyerphone;
    }

    public void setBuyerphone(String buyerphone) {
        this.buyerphone = buyerphone;
    }

    private String mailtoname;

    @Basic
    @javax.persistence.Column(name = "MAILTONAME", nullable = true, insertable = true, updatable = true, length = 80)
    public String getMailtoname() {
        return mailtoname;
    }

    public void setMailtoname(String mailtoname) {
        this.mailtoname = mailtoname;
    }

    private String mailtoaddress;

    @Basic
    @javax.persistence.Column(name = "MAILTOADDRESS", nullable = true, insertable = true, updatable = true, length = 40)
    public String getMailtoaddress() {
        return mailtoaddress;
    }

    public void setMailtoaddress(String mailtoaddress) {
        this.mailtoaddress = mailtoaddress;
    }

    private String mailtocity;

    @Basic
    @javax.persistence.Column(name = "MAILTOCITY", nullable = true, insertable = true, updatable = true, length = 40)
    public String getMailtocity() {
        return mailtocity;
    }

    public void setMailtocity(String mailtocity) {
        this.mailtocity = mailtocity;
    }

    private String mailtostate;

    @Basic
    @javax.persistence.Column(name = "MAILTOSTATE", nullable = true, insertable = true, updatable = true, length = 2)
    public String getMailtostate() {
        return mailtostate;
    }

    public void setMailtostate(String mailtostate) {
        this.mailtostate = mailtostate;
    }

    private String mailtozipcode;

    @Basic
    @javax.persistence.Column(name = "MAILTOZIPCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getMailtozipcode() {
        return mailtozipcode;
    }

    public void setMailtozipcode(String mailtozipcode) {
        this.mailtozipcode = mailtozipcode;
    }

    private String completedbyname;

    @Basic
    @javax.persistence.Column(name = "COMPLETEDBYNAME", nullable = true, insertable = true, updatable = true, length = 40)
    public String getCompletedbyname() {
        return completedbyname;
    }

    public void setCompletedbyname(String completedbyname) {
        this.completedbyname = completedbyname;
    }

    private String completedbyaddress;

    @Basic
    @javax.persistence.Column(name = "COMPLETEDBYADDRESS", nullable = true, insertable = true, updatable = true, length = 40)
    public String getCompletedbyaddress() {
        return completedbyaddress;
    }

    public void setCompletedbyaddress(String completedbyaddress) {
        this.completedbyaddress = completedbyaddress;
    }

    private String completedbycity;

    @Basic
    @javax.persistence.Column(name = "COMPLETEDBYCITY", nullable = true, insertable = true, updatable = true, length = 40)
    public String getCompletedbycity() {
        return completedbycity;
    }

    public void setCompletedbycity(String completedbycity) {
        this.completedbycity = completedbycity;
    }

    private String completedbystate;

    @Basic
    @javax.persistence.Column(name = "COMPLETEDBYSTATE", nullable = true, insertable = true, updatable = true, length = 2)
    public String getCompletedbystate() {
        return completedbystate;
    }

    public void setCompletedbystate(String completedbystate) {
        this.completedbystate = completedbystate;
    }

    private String completedbyzipcode;

    @Basic
    @javax.persistence.Column(name = "COMPLETEDBYZIPCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getCompletedbyzipcode() {
        return completedbyzipcode;
    }

    public void setCompletedbyzipcode(String completedbyzipcode) {
        this.completedbyzipcode = completedbyzipcode;
    }

    private String completedbyphone;

    @Basic
    @javax.persistence.Column(name = "COMPLETEDBYPHONE", nullable = true, insertable = true, updatable = true, length = 18)
    public String getCompletedbyphone() {
        return completedbyphone;
    }

    public void setCompletedbyphone(String completedbyphone) {
        this.completedbyphone = completedbyphone;
    }

    private String page;

    @Basic
    @javax.persistence.Column(name = "PAGE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    private BigDecimal saleaffidaviton0;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleaffidaviton0() {
        return saleaffidaviton0;
    }

    public void setSaleaffidaviton0(BigDecimal saleaffidaviton0) {
        this.saleaffidaviton0 = saleaffidaviton0;
    }

    private BigDecimal saleaffidaviton1;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleaffidaviton1() {
        return saleaffidaviton1;
    }

    public void setSaleaffidaviton1(BigDecimal saleaffidaviton1) {
        this.saleaffidaviton1 = saleaffidaviton1;
    }

    private BigDecimal saleaffidaviton2;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleaffidaviton2() {
        return saleaffidaviton2;
    }

    public void setSaleaffidaviton2(BigDecimal saleaffidaviton2) {
        this.saleaffidaviton2 = saleaffidaviton2;
    }

    private Timestamp saleaffidavitod0;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleaffidavitod0() {
        return saleaffidavitod0;
    }

    public void setSaleaffidavitod0(Timestamp saleaffidavitod0) {
        this.saleaffidavitod0 = saleaffidavitod0;
    }

    private Timestamp saleaffidavitod1;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleaffidavitod1() {
        return saleaffidavitod1;
    }

    public void setSaleaffidavitod1(Timestamp saleaffidavitod1) {
        this.saleaffidavitod1 = saleaffidavitod1;
    }

    private String saleaffidavitom0;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleaffidavitom0() {
        return saleaffidavitom0;
    }

    public void setSaleaffidavitom0(String saleaffidavitom0) {
        this.saleaffidavitom0 = saleaffidavitom0;
    }

    private String saleaffidavitom1;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleaffidavitom1() {
        return saleaffidavitom1;
    }

    public void setSaleaffidavitom1(String saleaffidavitom1) {
        this.saleaffidavitom1 = saleaffidavitom1;
    }

    private String saleaffidavitot0;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleaffidavitot0() {
        return saleaffidavitot0;
    }

    public void setSaleaffidavitot0(String saleaffidavitot0) {
        this.saleaffidavitot0 = saleaffidavitot0;
    }

    private String saleaffidavitot1;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleaffidavitot1() {
        return saleaffidavitot1;
    }

    public void setSaleaffidavitot1(String saleaffidavitot1) {
        this.saleaffidavitot1 = saleaffidavitot1;
    }

    private Timestamp writedate;

    @Basic
    @javax.persistence.Column(name = "WRITEDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getWritedate() {
        return writedate;
    }

    public void setWritedate(Timestamp writedate) {
        this.writedate = writedate;
    }

    private BigDecimal unitcount;

    @Basic
    @javax.persistence.Column(name = "UNITCOUNT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getUnitcount() {
        return unitcount;
    }

    public void setUnitcount(BigDecimal unitcount) {
        this.unitcount = unitcount;
    }

    private String primaryusecode;

    @Basic
    @javax.persistence.Column(name = "PRIMARYUSECODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getPrimaryusecode() {
        return primaryusecode;
    }

    public void setPrimaryusecode(String primaryusecode) {
        this.primaryusecode = primaryusecode;
    }

    private int seqid;

    @Id
    @javax.persistence.Column(name = "SEQID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSeqid() {
        return seqid;
    }

    public void setSeqid(int seqid) {
        this.seqid = seqid;
    }

    private BigInteger mhaffixedflag;

    @Basic
    @javax.persistence.Column(name = "MHAFFIXEDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getMhaffixedflag() {
        return mhaffixedflag;
    }

    public void setMhaffixedflag(BigInteger mhaffixedflag) {
        this.mhaffixedflag = mhaffixedflag;
    }

    private BigInteger solarflag;

    @Basic
    @javax.persistence.Column(name = "SOLARFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getSolarflag() {
        return solarflag;
    }

    public void setSolarflag(BigInteger solarflag) {
        this.solarflag = solarflag;
    }

    private String solardescription;

    @Basic
    @javax.persistence.Column(name = "SOLARDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSolardescription() {
        return solardescription;
    }

    public void setSolardescription(String solardescription) {
        this.solardescription = solardescription;
    }
}
