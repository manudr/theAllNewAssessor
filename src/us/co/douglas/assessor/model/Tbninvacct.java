package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
public class Tbninvacct {
    private int invacctid;

    @Id
    @javax.persistence.Column(name = "INVACCTID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getInvacctid() {
        return invacctid;
    }

    public void setInvacctid(int invacctid) {
        this.invacctid = invacctid;
    }

    private String accountno;

    @Basic
    @javax.persistence.Column(name = "ACCOUNTNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    private String parcelno;

    @Basic
    @javax.persistence.Column(name = "PARCELNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getParcelno() {
        return parcelno;
    }

    public void setParcelno(String parcelno) {
        this.parcelno = parcelno;
    }

    private String localno;

    @Basic
    @javax.persistence.Column(name = "LOCALNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getLocalno() {
        return localno;
    }

    public void setLocalno(String localno) {
        this.localno = localno;
    }

    private String mapno;

    @Basic
    @javax.persistence.Column(name = "MAPNO", nullable = true, insertable = true, updatable = true, length = 40)
    public String getMapno() {
        return mapno;
    }

    public void setMapno(String mapno) {
        this.mapno = mapno;
    }

    private String acctstatuscode;

    @Basic
    @javax.persistence.Column(name = "ACCTSTATUSCODE", nullable = false, insertable = true, updatable = true, length = 1)
    public String getAcctstatuscode() {
        return acctstatuscode;
    }

    public void setAcctstatuscode(String acctstatuscode) {
        this.acctstatuscode = acctstatuscode;
    }

    private String accttype;

    @Basic
    @javax.persistence.Column(name = "ACCTTYPE", nullable = false, insertable = true, updatable = true, length = 15)
    public String getAccttype() {
        return accttype;
    }

    public void setAccttype(String accttype) {
        this.accttype = accttype;
    }

    private String assignedto;

    @Basic
    @javax.persistence.Column(name = "ASSIGNEDTO", nullable = false, insertable = true, updatable = true, length = 20)
    public String getAssignedto() {
        return assignedto;
    }

    public void setAssignedto(String assignedto) {
        this.assignedto = assignedto;
    }

    private String valueareacode;

    @Basic
    @javax.persistence.Column(name = "VALUEAREACODE", nullable = false, insertable = true, updatable = true, length = 10)
    public String getValueareacode() {
        return valueareacode;
    }

    public void setValueareacode(String valueareacode) {
        this.valueareacode = valueareacode;
    }

    private String associatedacct;

    @Basic
    @javax.persistence.Column(name = "ASSOCIATEDACCT", nullable = true, insertable = true, updatable = true, length = 30)
    public String getAssociatedacct() {
        return associatedacct;
    }

    public void setAssociatedacct(String associatedacct) {
        this.associatedacct = associatedacct;
    }

    private String appraisaltype;

    @Basic
    @javax.persistence.Column(name = "APPRAISALTYPE", nullable = false, insertable = true, updatable = true, length = 30)
    public String getAppraisaltype() {
        return appraisaltype;
    }

    public void setAppraisaltype(String appraisaltype) {
        this.appraisaltype = appraisaltype;
    }

    private String economicareacode;

    @Basic
    @javax.persistence.Column(name = "ECONOMICAREACODE", nullable = false, insertable = true, updatable = true, length = 10)
    public String getEconomicareacode() {
        return economicareacode;
    }

    public void setEconomicareacode(String economicareacode) {
        this.economicareacode = economicareacode;
    }

    private Timestamp acctdatecreated;

    @Basic
    @javax.persistence.Column(name = "ACCTDATECREATED", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctdatecreated() {
        return acctdatecreated;
    }

    public void setAcctdatecreated(Timestamp acctdatecreated) {
        this.acctdatecreated = acctdatecreated;
    }

    private String defaultapproachtype;

    @Basic
    @javax.persistence.Column(name = "DEFAULTAPPROACHTYPE", nullable = true, insertable = true, updatable = true, length = 15)
    public String getDefaultapproachtype() {
        return defaultapproachtype;
    }

    public void setDefaultapproachtype(String defaultapproachtype) {
        this.defaultapproachtype = defaultapproachtype;
    }

    private String defaulttaxdistrict;

    @Basic
    @javax.persistence.Column(name = "DEFAULTTAXDISTRICT", nullable = false, insertable = true, updatable = true, length = 10)
    public String getDefaulttaxdistrict() {
        return defaulttaxdistrict;
    }

    public void setDefaulttaxdistrict(String defaulttaxdistrict) {
        this.defaulttaxdistrict = defaulttaxdistrict;
    }

    private String businesslicense;

    @Basic
    @javax.persistence.Column(name = "BUSINESSLICENSE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getBusinesslicense() {
        return businesslicense;
    }

    public void setBusinesslicense(String businesslicense) {
        this.businesslicense = businesslicense;
    }

    private String mapgroup;

    @Basic
    @javax.persistence.Column(name = "MAPGROUP", nullable = true, insertable = true, updatable = true, length = 2)
    public String getMapgroup() {
        return mapgroup;
    }

    public void setMapgroup(String mapgroup) {
        this.mapgroup = mapgroup;
    }

    private String controlmap;

    @Basic
    @javax.persistence.Column(name = "CONTROLMAP", nullable = true, insertable = true, updatable = true, length = 5)
    public String getControlmap() {
        return controlmap;
    }

    public void setControlmap(String controlmap) {
        this.controlmap = controlmap;
    }

    private String propertyidentifier;

    @Basic
    @javax.persistence.Column(name = "PROPERTYIDENTIFIER", nullable = true, insertable = true, updatable = true, length = 1)
    public String getPropertyidentifier() {
        return propertyidentifier;
    }

    public void setPropertyidentifier(String propertyidentifier) {
        this.propertyidentifier = propertyidentifier;
    }

    private String specialinterestnumber;

    @Basic
    @javax.persistence.Column(name = "SPECIALINTERESTNUMBER", nullable = true, insertable = true, updatable = true, length = 3)
    public String getSpecialinterestnumber() {
        return specialinterestnumber;
    }

    public void setSpecialinterestnumber(String specialinterestnumber) {
        this.specialinterestnumber = specialinterestnumber;
    }

    private BigDecimal accton0;

    @Basic
    @javax.persistence.Column(name = "ACCTON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAccton0() {
        return accton0;
    }

    public void setAccton0(BigDecimal accton0) {
        this.accton0 = accton0;
    }

    private BigDecimal accton1;

    @Basic
    @javax.persistence.Column(name = "ACCTON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAccton1() {
        return accton1;
    }

    public void setAccton1(BigDecimal accton1) {
        this.accton1 = accton1;
    }

    private BigDecimal accton2;

    @Basic
    @javax.persistence.Column(name = "ACCTON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAccton2() {
        return accton2;
    }

    public void setAccton2(BigDecimal accton2) {
        this.accton2 = accton2;
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

    private String ward;

    @Basic
    @javax.persistence.Column(name = "WARD", nullable = true, insertable = true, updatable = true, length = 2)
    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    private Timestamp acctod0;

    @Basic
    @javax.persistence.Column(name = "ACCTOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctod0() {
        return acctod0;
    }

    public void setAcctod0(Timestamp acctod0) {
        this.acctod0 = acctod0;
    }

    private Timestamp acctod1;

    @Basic
    @javax.persistence.Column(name = "ACCTOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctod1() {
        return acctod1;
    }

    public void setAcctod1(Timestamp acctod1) {
        this.acctod1 = acctod1;
    }

    private String acctom0;

    @Basic
    @javax.persistence.Column(name = "ACCTOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctom0() {
        return acctom0;
    }

    public void setAcctom0(String acctom0) {
        this.acctom0 = acctom0;
    }

    private String acctom1;

    @Basic
    @javax.persistence.Column(name = "ACCTOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctom1() {
        return acctom1;
    }

    public void setAcctom1(String acctom1) {
        this.acctom1 = acctom1;
    }

    private String strippedaccountno;

    @Basic
    @javax.persistence.Column(name = "STRIPPEDACCOUNTNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getStrippedaccountno() {
        return strippedaccountno;
    }

    public void setStrippedaccountno(String strippedaccountno) {
        this.strippedaccountno = strippedaccountno;
    }

    private int jurisdictionid;

    @Basic
    @javax.persistence.Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    private String acctot0;

    @Basic
    @javax.persistence.Column(name = "ACCTOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctot0() {
        return acctot0;
    }

    public void setAcctot0(String acctot0) {
        this.acctot0 = acctot0;
    }

    private String acctot1;

    @Basic
    @javax.persistence.Column(name = "ACCTOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctot1() {
        return acctot1;
    }

    public void setAcctot1(String acctot1) {
        this.acctot1 = acctot1;
    }

    private BigDecimal censustract;

    @Basic
    @javax.persistence.Column(name = "CENSUSTRACT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getCensustract() {
        return censustract;
    }

    public void setCensustract(BigDecimal censustract) {
        this.censustract = censustract;
    }

    private BigDecimal censusblock;

    @Basic
    @javax.persistence.Column(name = "CENSUSBLOCK", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getCensusblock() {
        return censusblock;
    }

    public void setCensusblock(BigDecimal censusblock) {
        this.censusblock = censusblock;
    }

    private String mobilehomespace;

    @Basic
    @javax.persistence.Column(name = "MOBILEHOMESPACE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getMobilehomespace() {
        return mobilehomespace;
    }

    public void setMobilehomespace(String mobilehomespace) {
        this.mobilehomespace = mobilehomespace;
    }

    private BigInteger efileflag;

    @Basic
    @javax.persistence.Column(name = "EFILEFLAG", nullable = true, insertable = true, updatable = true, precision = 0)
    public BigInteger getEfileflag() {
        return efileflag;
    }

    public void setEfileflag(BigInteger efileflag) {
        this.efileflag = efileflag;
    }

    private String businessname;

    @Basic
    @javax.persistence.Column(name = "BUSINESSNAME", nullable = true, insertable = true, updatable = true, length = 255)
    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    private BigDecimal costhybridpercent;

    @Basic
    @javax.persistence.Column(name = "COSTHYBRIDPERCENT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getCosthybridpercent() {
        return costhybridpercent;
    }

    public void setCosthybridpercent(BigDecimal costhybridpercent) {
        this.costhybridpercent = costhybridpercent;
    }

    private BigDecimal markethybridpercent;

    @Basic
    @javax.persistence.Column(name = "MARKETHYBRIDPERCENT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMarkethybridpercent() {
        return markethybridpercent;
    }

    public void setMarkethybridpercent(BigDecimal markethybridpercent) {
        this.markethybridpercent = markethybridpercent;
    }

    private BigDecimal incomehybridpercent;

    @Basic
    @javax.persistence.Column(name = "INCOMEHYBRIDPERCENT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getIncomehybridpercent() {
        return incomehybridpercent;
    }

    public void setIncomehybridpercent(BigDecimal incomehybridpercent) {
        this.incomehybridpercent = incomehybridpercent;
    }

    private BigDecimal reconciledhybridpercent;

    @Basic
    @javax.persistence.Column(name = "RECONCILEDHYBRIDPERCENT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getReconciledhybridpercent() {
        return reconciledhybridpercent;
    }

    public void setReconciledhybridpercent(BigDecimal reconciledhybridpercent) {
        this.reconciledhybridpercent = reconciledhybridpercent;
    }

    private int parcelsequence;

    @Basic
    @javax.persistence.Column(name = "PARCELSEQUENCE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getParcelsequence() {
        return parcelsequence;
    }

    public void setParcelsequence(int parcelsequence) {
        this.parcelsequence = parcelsequence;
    }

    private Integer propertyclassid;

    @Basic
    @javax.persistence.Column(name = "PROPERTYCLASSID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getPropertyclassid() {
        return propertyclassid;
    }

    public void setPropertyclassid(Integer propertyclassid) {
        this.propertyclassid = propertyclassid;
    }

    private Date detailedreviewdate;

    @Basic
    @javax.persistence.Column(name = "DETAILEDREVIEWDATE", nullable = true, insertable = true, updatable = true)
    public Date getDetailedreviewdate() {
        return detailedreviewdate;
    }

    public void setDetailedreviewdate(Date detailedreviewdate) {
        this.detailedreviewdate = detailedreviewdate;
    }

    private Timestamp lastupdated;

    @Basic
    @javax.persistence.Column(name = "LASTUPDATED", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Timestamp lastupdated) {
        this.lastupdated = lastupdated;
    }

    private int acctadjsaleprice;

    @Basic
    @javax.persistence.Column(name = "ACCTADJSALEPRICE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getAcctadjsaleprice() {
        return acctadjsaleprice;
    }

    public void setAcctadjsaleprice(int acctadjsaleprice) {
        this.acctadjsaleprice = acctadjsaleprice;
    }

    private BigInteger groupprimaryacctflag;

    @Basic
    @javax.persistence.Column(name = "GROUPPRIMARYACCTFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getGroupprimaryacctflag() {
        return groupprimaryacctflag;
    }

    public void setGroupprimaryacctflag(BigInteger groupprimaryacctflag) {
        this.groupprimaryacctflag = groupprimaryacctflag;
    }

    private Timestamp saleacctpenaltydate;

    @Basic
    @javax.persistence.Column(name = "SALEACCTPENALTYDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleacctpenaltydate() {
        return saleacctpenaltydate;
    }

    public void setSaleacctpenaltydate(Timestamp saleacctpenaltydate) {
        this.saleacctpenaltydate = saleacctpenaltydate;
    }

    private BigInteger saleacctpenaltyflag;

    @Basic
    @javax.persistence.Column(name = "SALEACCTPENALTYFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getSaleacctpenaltyflag() {
        return saleacctpenaltyflag;
    }

    public void setSaleacctpenaltyflag(BigInteger saleacctpenaltyflag) {
        this.saleacctpenaltyflag = saleacctpenaltyflag;
    }

    private Timestamp inventoryeffectivedate;

    @Basic
    @javax.persistence.Column(name = "INVENTORYEFFECTIVEDATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getInventoryeffectivedate() {
        return inventoryeffectivedate;
    }

    public void setInventoryeffectivedate(Timestamp inventoryeffectivedate) {
        this.inventoryeffectivedate = inventoryeffectivedate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tbninvacct that = (Tbninvacct) o;

        if (acctadjsaleprice != that.acctadjsaleprice) return false;
        if (invacctid != that.invacctid) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (parcelsequence != that.parcelsequence) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null)
            return false;
        if (acctdatecreated != null ? !acctdatecreated.equals(that.acctdatecreated) : that.acctdatecreated != null)
            return false;
        if (acctod0 != null ? !acctod0.equals(that.acctod0) : that.acctod0 != null)
            return false;
        if (acctod1 != null ? !acctod1.equals(that.acctod1) : that.acctod1 != null)
            return false;
        if (acctom0 != null ? !acctom0.equals(that.acctom0) : that.acctom0 != null)
            return false;
        if (acctom1 != null ? !acctom1.equals(that.acctom1) : that.acctom1 != null)
            return false;
        if (accton0 != null ? !accton0.equals(that.accton0) : that.accton0 != null)
            return false;
        if (accton1 != null ? !accton1.equals(that.accton1) : that.accton1 != null)
            return false;
        if (accton2 != null ? !accton2.equals(that.accton2) : that.accton2 != null)
            return false;
        if (acctot0 != null ? !acctot0.equals(that.acctot0) : that.acctot0 != null)
            return false;
        if (acctot1 != null ? !acctot1.equals(that.acctot1) : that.acctot1 != null)
            return false;
        if (acctstatuscode != null ? !acctstatuscode.equals(that.acctstatuscode) : that.acctstatuscode != null)
            return false;
        if (accttype != null ? !accttype.equals(that.accttype) : that.accttype != null)
            return false;
        if (appraisaltype != null ? !appraisaltype.equals(that.appraisaltype) : that.appraisaltype != null)
            return false;
        if (assignedto != null ? !assignedto.equals(that.assignedto) : that.assignedto != null)
            return false;
        if (associatedacct != null ? !associatedacct.equals(that.associatedacct) : that.associatedacct != null)
            return false;
        if (businesslicense != null ? !businesslicense.equals(that.businesslicense) : that.businesslicense != null)
            return false;
        if (businessname != null ? !businessname.equals(that.businessname) : that.businessname != null)
            return false;
        if (censusblock != null ? !censusblock.equals(that.censusblock) : that.censusblock != null)
            return false;
        if (censustract != null ? !censustract.equals(that.censustract) : that.censustract != null)
            return false;
        if (controlmap != null ? !controlmap.equals(that.controlmap) : that.controlmap != null)
            return false;
        if (costhybridpercent != null ? !costhybridpercent.equals(that.costhybridpercent) : that.costhybridpercent != null)
            return false;
        if (defaultapproachtype != null ? !defaultapproachtype.equals(that.defaultapproachtype) : that.defaultapproachtype != null)
            return false;
        if (defaulttaxdistrict != null ? !defaulttaxdistrict.equals(that.defaulttaxdistrict) : that.defaulttaxdistrict != null)
            return false;
        if (detailedreviewdate != null ? !detailedreviewdate.equals(that.detailedreviewdate) : that.detailedreviewdate != null)
            return false;
        if (economicareacode != null ? !economicareacode.equals(that.economicareacode) : that.economicareacode != null)
            return false;
        if (efileflag != null ? !efileflag.equals(that.efileflag) : that.efileflag != null)
            return false;
        if (groupprimaryacctflag != null ? !groupprimaryacctflag.equals(that.groupprimaryacctflag) : that.groupprimaryacctflag != null)
            return false;
        if (incomehybridpercent != null ? !incomehybridpercent.equals(that.incomehybridpercent) : that.incomehybridpercent != null)
            return false;
        if (inventoryeffectivedate != null ? !inventoryeffectivedate.equals(that.inventoryeffectivedate) : that.inventoryeffectivedate != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (localno != null ? !localno.equals(that.localno) : that.localno != null)
            return false;
        if (mapgroup != null ? !mapgroup.equals(that.mapgroup) : that.mapgroup != null)
            return false;
        if (mapno != null ? !mapno.equals(that.mapno) : that.mapno != null)
            return false;
        if (markethybridpercent != null ? !markethybridpercent.equals(that.markethybridpercent) : that.markethybridpercent != null)
            return false;
        if (mobilehomespace != null ? !mobilehomespace.equals(that.mobilehomespace) : that.mobilehomespace != null)
            return false;
        if (parcelno != null ? !parcelno.equals(that.parcelno) : that.parcelno != null)
            return false;
        if (primaryusecode != null ? !primaryusecode.equals(that.primaryusecode) : that.primaryusecode != null)
            return false;
        if (propertyclassid != null ? !propertyclassid.equals(that.propertyclassid) : that.propertyclassid != null)
            return false;
        if (propertyidentifier != null ? !propertyidentifier.equals(that.propertyidentifier) : that.propertyidentifier != null)
            return false;
        if (reconciledhybridpercent != null ? !reconciledhybridpercent.equals(that.reconciledhybridpercent) : that.reconciledhybridpercent != null)
            return false;
        if (saleacctpenaltydate != null ? !saleacctpenaltydate.equals(that.saleacctpenaltydate) : that.saleacctpenaltydate != null)
            return false;
        if (saleacctpenaltyflag != null ? !saleacctpenaltyflag.equals(that.saleacctpenaltyflag) : that.saleacctpenaltyflag != null)
            return false;
        if (specialinterestnumber != null ? !specialinterestnumber.equals(that.specialinterestnumber) : that.specialinterestnumber != null)
            return false;
        if (strippedaccountno != null ? !strippedaccountno.equals(that.strippedaccountno) : that.strippedaccountno != null)
            return false;
        if (valueareacode != null ? !valueareacode.equals(that.valueareacode) : that.valueareacode != null)
            return false;
        if (ward != null ? !ward.equals(that.ward) : that.ward != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invacctid;
        result = 31 * result + (accountno != null ? accountno.hashCode() : 0);
        result = 31 * result + (parcelno != null ? parcelno.hashCode() : 0);
        result = 31 * result + (localno != null ? localno.hashCode() : 0);
        result = 31 * result + (mapno != null ? mapno.hashCode() : 0);
        result = 31 * result + (acctstatuscode != null ? acctstatuscode.hashCode() : 0);
        result = 31 * result + (accttype != null ? accttype.hashCode() : 0);
        result = 31 * result + (assignedto != null ? assignedto.hashCode() : 0);
        result = 31 * result + (valueareacode != null ? valueareacode.hashCode() : 0);
        result = 31 * result + (associatedacct != null ? associatedacct.hashCode() : 0);
        result = 31 * result + (appraisaltype != null ? appraisaltype.hashCode() : 0);
        result = 31 * result + (economicareacode != null ? economicareacode.hashCode() : 0);
        result = 31 * result + (acctdatecreated != null ? acctdatecreated.hashCode() : 0);
        result = 31 * result + (defaultapproachtype != null ? defaultapproachtype.hashCode() : 0);
        result = 31 * result + (defaulttaxdistrict != null ? defaulttaxdistrict.hashCode() : 0);
        result = 31 * result + (businesslicense != null ? businesslicense.hashCode() : 0);
        result = 31 * result + (mapgroup != null ? mapgroup.hashCode() : 0);
        result = 31 * result + (controlmap != null ? controlmap.hashCode() : 0);
        result = 31 * result + (propertyidentifier != null ? propertyidentifier.hashCode() : 0);
        result = 31 * result + (specialinterestnumber != null ? specialinterestnumber.hashCode() : 0);
        result = 31 * result + (accton0 != null ? accton0.hashCode() : 0);
        result = 31 * result + (accton1 != null ? accton1.hashCode() : 0);
        result = 31 * result + (accton2 != null ? accton2.hashCode() : 0);
        result = 31 * result + (primaryusecode != null ? primaryusecode.hashCode() : 0);
        result = 31 * result + (ward != null ? ward.hashCode() : 0);
        result = 31 * result + (acctod0 != null ? acctod0.hashCode() : 0);
        result = 31 * result + (acctod1 != null ? acctod1.hashCode() : 0);
        result = 31 * result + (acctom0 != null ? acctom0.hashCode() : 0);
        result = 31 * result + (acctom1 != null ? acctom1.hashCode() : 0);
        result = 31 * result + (strippedaccountno != null ? strippedaccountno.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (acctot0 != null ? acctot0.hashCode() : 0);
        result = 31 * result + (acctot1 != null ? acctot1.hashCode() : 0);
        result = 31 * result + (censustract != null ? censustract.hashCode() : 0);
        result = 31 * result + (censusblock != null ? censusblock.hashCode() : 0);
        result = 31 * result + (mobilehomespace != null ? mobilehomespace.hashCode() : 0);
        result = 31 * result + (efileflag != null ? efileflag.hashCode() : 0);
        result = 31 * result + (businessname != null ? businessname.hashCode() : 0);
        result = 31 * result + (costhybridpercent != null ? costhybridpercent.hashCode() : 0);
        result = 31 * result + (markethybridpercent != null ? markethybridpercent.hashCode() : 0);
        result = 31 * result + (incomehybridpercent != null ? incomehybridpercent.hashCode() : 0);
        result = 31 * result + (reconciledhybridpercent != null ? reconciledhybridpercent.hashCode() : 0);
        result = 31 * result + parcelsequence;
        result = 31 * result + (propertyclassid != null ? propertyclassid.hashCode() : 0);
        result = 31 * result + (detailedreviewdate != null ? detailedreviewdate.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        result = 31 * result + acctadjsaleprice;
        result = 31 * result + (groupprimaryacctflag != null ? groupprimaryacctflag.hashCode() : 0);
        result = 31 * result + (saleacctpenaltydate != null ? saleacctpenaltydate.hashCode() : 0);
        result = 31 * result + (saleacctpenaltyflag != null ? saleacctpenaltyflag.hashCode() : 0);
        result = 31 * result + (inventoryeffectivedate != null ? inventoryeffectivedate.hashCode() : 0);
        return result;
    }
}
