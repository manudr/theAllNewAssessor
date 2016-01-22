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
public class Tblacct {
    private int verstart;

    @Basic
    @javax.persistence.Column(name = "VERSTART", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getVerstart() {
        return verstart;
    }

    public void setVerstart(int verstart) {
        this.verstart = verstart;
    }

    private int verend;

    @Basic
    @javax.persistence.Column(name = "VEREND", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getVerend() {
        return verend;
    }

    public void setVerend(int verend) {
        this.verend = verend;
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

    private String associatedacct;

    @Basic
    @javax.persistence.Column(name = "ASSOCIATEDACCT", nullable = true, insertable = true, updatable = true, length = 30)
    public String getAssociatedacct() {
        return associatedacct;
    }

    public void setAssociatedacct(String associatedacct) {
        this.associatedacct = associatedacct;
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

    private Timestamp writedate;

    @Basic
    @javax.persistence.Column(name = "WRITEDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getWritedate() {
        return writedate;
    }

    public void setWritedate(Timestamp writedate) {
        this.writedate = writedate;
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

    private int seqid;

    @Id
    @javax.persistence.Column(name = "SEQID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSeqid() {
        return seqid;
    }

    public void setSeqid(int seqid) {
        this.seqid = seqid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tblacct tblacct = (Tblacct) o;

        if (parcelsequence != tblacct.parcelsequence) return false;
        if (seqid != tblacct.seqid) return false;
        if (verend != tblacct.verend) return false;
        if (verstart != tblacct.verstart) return false;
        if (accountno != null ? !accountno.equals(tblacct.accountno) : tblacct.accountno != null)
            return false;
        if (acctdatecreated != null ? !acctdatecreated.equals(tblacct.acctdatecreated) : tblacct.acctdatecreated != null)
            return false;
        if (acctod0 != null ? !acctod0.equals(tblacct.acctod0) : tblacct.acctod0 != null)
            return false;
        if (acctod1 != null ? !acctod1.equals(tblacct.acctod1) : tblacct.acctod1 != null)
            return false;
        if (acctom0 != null ? !acctom0.equals(tblacct.acctom0) : tblacct.acctom0 != null)
            return false;
        if (acctom1 != null ? !acctom1.equals(tblacct.acctom1) : tblacct.acctom1 != null)
            return false;
        if (accton0 != null ? !accton0.equals(tblacct.accton0) : tblacct.accton0 != null)
            return false;
        if (accton1 != null ? !accton1.equals(tblacct.accton1) : tblacct.accton1 != null)
            return false;
        if (accton2 != null ? !accton2.equals(tblacct.accton2) : tblacct.accton2 != null)
            return false;
        if (acctot0 != null ? !acctot0.equals(tblacct.acctot0) : tblacct.acctot0 != null)
            return false;
        if (acctot1 != null ? !acctot1.equals(tblacct.acctot1) : tblacct.acctot1 != null)
            return false;
        if (associatedacct != null ? !associatedacct.equals(tblacct.associatedacct) : tblacct.associatedacct != null)
            return false;
        if (businesslicense != null ? !businesslicense.equals(tblacct.businesslicense) : tblacct.businesslicense != null)
            return false;
        if (businessname != null ? !businessname.equals(tblacct.businessname) : tblacct.businessname != null)
            return false;
        if (censusblock != null ? !censusblock.equals(tblacct.censusblock) : tblacct.censusblock != null)
            return false;
        if (censustract != null ? !censustract.equals(tblacct.censustract) : tblacct.censustract != null)
            return false;
        if (controlmap != null ? !controlmap.equals(tblacct.controlmap) : tblacct.controlmap != null)
            return false;
        if (costhybridpercent != null ? !costhybridpercent.equals(tblacct.costhybridpercent) : tblacct.costhybridpercent != null)
            return false;
        if (detailedreviewdate != null ? !detailedreviewdate.equals(tblacct.detailedreviewdate) : tblacct.detailedreviewdate != null)
            return false;
        if (efileflag != null ? !efileflag.equals(tblacct.efileflag) : tblacct.efileflag != null)
            return false;
        if (incomehybridpercent != null ? !incomehybridpercent.equals(tblacct.incomehybridpercent) : tblacct.incomehybridpercent != null)
            return false;
        if (localno != null ? !localno.equals(tblacct.localno) : tblacct.localno != null)
            return false;
        if (mapgroup != null ? !mapgroup.equals(tblacct.mapgroup) : tblacct.mapgroup != null)
            return false;
        if (mapno != null ? !mapno.equals(tblacct.mapno) : tblacct.mapno != null)
            return false;
        if (markethybridpercent != null ? !markethybridpercent.equals(tblacct.markethybridpercent) : tblacct.markethybridpercent != null)
            return false;
        if (mobilehomespace != null ? !mobilehomespace.equals(tblacct.mobilehomespace) : tblacct.mobilehomespace != null)
            return false;
        if (parcelno != null ? !parcelno.equals(tblacct.parcelno) : tblacct.parcelno != null)
            return false;
        if (propertyidentifier != null ? !propertyidentifier.equals(tblacct.propertyidentifier) : tblacct.propertyidentifier != null)
            return false;
        if (reconciledhybridpercent != null ? !reconciledhybridpercent.equals(tblacct.reconciledhybridpercent) : tblacct.reconciledhybridpercent != null)
            return false;
        if (specialinterestnumber != null ? !specialinterestnumber.equals(tblacct.specialinterestnumber) : tblacct.specialinterestnumber != null)
            return false;
        if (strippedaccountno != null ? !strippedaccountno.equals(tblacct.strippedaccountno) : tblacct.strippedaccountno != null)
            return false;
        if (ward != null ? !ward.equals(tblacct.ward) : tblacct.ward != null)
            return false;
        if (writedate != null ? !writedate.equals(tblacct.writedate) : tblacct.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + (accountno != null ? accountno.hashCode() : 0);
        result = 31 * result + (parcelno != null ? parcelno.hashCode() : 0);
        result = 31 * result + (localno != null ? localno.hashCode() : 0);
        result = 31 * result + (mapno != null ? mapno.hashCode() : 0);
        result = 31 * result + (associatedacct != null ? associatedacct.hashCode() : 0);
        result = 31 * result + (acctdatecreated != null ? acctdatecreated.hashCode() : 0);
        result = 31 * result + (businesslicense != null ? businesslicense.hashCode() : 0);
        result = 31 * result + (mapgroup != null ? mapgroup.hashCode() : 0);
        result = 31 * result + (controlmap != null ? controlmap.hashCode() : 0);
        result = 31 * result + (propertyidentifier != null ? propertyidentifier.hashCode() : 0);
        result = 31 * result + (specialinterestnumber != null ? specialinterestnumber.hashCode() : 0);
        result = 31 * result + (accton0 != null ? accton0.hashCode() : 0);
        result = 31 * result + (accton1 != null ? accton1.hashCode() : 0);
        result = 31 * result + (accton2 != null ? accton2.hashCode() : 0);
        result = 31 * result + (ward != null ? ward.hashCode() : 0);
        result = 31 * result + (acctod0 != null ? acctod0.hashCode() : 0);
        result = 31 * result + (acctod1 != null ? acctod1.hashCode() : 0);
        result = 31 * result + (acctom0 != null ? acctom0.hashCode() : 0);
        result = 31 * result + (acctom1 != null ? acctom1.hashCode() : 0);
        result = 31 * result + (strippedaccountno != null ? strippedaccountno.hashCode() : 0);
        result = 31 * result + (acctot0 != null ? acctot0.hashCode() : 0);
        result = 31 * result + (acctot1 != null ? acctot1.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
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
        result = 31 * result + seqid;
        result = 31 * result + (detailedreviewdate != null ? detailedreviewdate.hashCode() : 0);
        return result;
    }
}
