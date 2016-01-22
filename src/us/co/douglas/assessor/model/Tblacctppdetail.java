package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
public class Tblacctppdetail {
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

    private int detailid;

    @Basic
    @javax.persistence.Column(name = "DETAILID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getDetailid() {
        return detailid;
    }

    public void setDetailid(int detailid) {
        this.detailid = detailid;
    }

    private BigDecimal pprecordno;

    @Basic
    @javax.persistence.Column(name = "PPRECORDNO", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getPprecordno() {
        return pprecordno;
    }

    public void setPprecordno(BigDecimal pprecordno) {
        this.pprecordno = pprecordno;
    }

    private String ppogtype;

    @Basic
    @javax.persistence.Column(name = "PPOGTYPE", nullable = false, insertable = true, updatable = true, length = 4)
    public String getPpogtype() {
        return ppogtype;
    }

    public void setPpogtype(String ppogtype) {
        this.ppogtype = ppogtype;
    }

    private Integer acquisitionyear;

    @Basic
    @javax.persistence.Column(name = "ACQUISITIONYEAR", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getAcquisitionyear() {
        return acquisitionyear;
    }

    public void setAcquisitionyear(Integer acquisitionyear) {
        this.acquisitionyear = acquisitionyear;
    }

    private BigDecimal ppage;

    @Basic
    @javax.persistence.Column(name = "PPAGE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getPpage() {
        return ppage;
    }

    public void setPpage(BigDecimal ppage) {
        this.ppage = ppage;
    }

    private int ppquantity;

    @Basic
    @javax.persistence.Column(name = "PPQUANTITY", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getPpquantity() {
        return ppquantity;
    }

    public void setPpquantity(int ppquantity) {
        this.ppquantity = ppquantity;
    }

    private BigDecimal typefactor;

    @Basic
    @javax.persistence.Column(name = "TYPEFACTOR", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getTypefactor() {
        return typefactor;
    }

    public void setTypefactor(BigDecimal typefactor) {
        this.typefactor = typefactor;
    }

    private BigDecimal originalcost;

    @Basic
    @javax.persistence.Column(name = "ORIGINALCOST", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getOriginalcost() {
        return originalcost;
    }

    public void setOriginalcost(BigDecimal originalcost) {
        this.originalcost = originalcost;
    }

    private BigDecimal pplifeexpectancy;

    @Basic
    @javax.persistence.Column(name = "PPLIFEEXPECTANCY", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getPplifeexpectancy() {
        return pplifeexpectancy;
    }

    public void setPplifeexpectancy(BigDecimal pplifeexpectancy) {
        this.pplifeexpectancy = pplifeexpectancy;
    }

    private BigDecimal ppgoodpercent;

    @Basic
    @javax.persistence.Column(name = "PPGOODPERCENT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPpgoodpercent() {
        return ppgoodpercent;
    }

    public void setPpgoodpercent(BigDecimal ppgoodpercent) {
        this.ppgoodpercent = ppgoodpercent;
    }

    private BigDecimal percentaddeddepreciation;

    @Basic
    @javax.persistence.Column(name = "PERCENTADDEDDEPRECIATION", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPercentaddeddepreciation() {
        return percentaddeddepreciation;
    }

    public void setPercentaddeddepreciation(BigDecimal percentaddeddepreciation) {
        this.percentaddeddepreciation = percentaddeddepreciation;
    }

    private BigDecimal rollbackfactor;

    @Basic
    @javax.persistence.Column(name = "ROLLBACKFACTOR", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getRollbackfactor() {
        return rollbackfactor;
    }

    public void setRollbackfactor(BigDecimal rollbackfactor) {
        this.rollbackfactor = rollbackfactor;
    }

    private BigDecimal ppabstractvalue;

    @Basic
    @javax.persistence.Column(name = "PPABSTRACTVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getPpabstractvalue() {
        return ppabstractvalue;
    }

    public void setPpabstractvalue(BigDecimal ppabstractvalue) {
        this.ppabstractvalue = ppabstractvalue;
    }

    private BigInteger bestinfoavailableflag;

    @Basic
    @javax.persistence.Column(name = "BESTINFOAVAILABLEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getBestinfoavailableflag() {
        return bestinfoavailableflag;
    }

    public void setBestinfoavailableflag(BigInteger bestinfoavailableflag) {
        this.bestinfoavailableflag = bestinfoavailableflag;
    }

    private BigInteger omittedflag;

    @Basic
    @javax.persistence.Column(name = "OMITTEDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getOmittedflag() {
        return omittedflag;
    }

    public void setOmittedflag(BigInteger omittedflag) {
        this.omittedflag = omittedflag;
    }

    private BigDecimal depreciationvalue;

    @Basic
    @javax.persistence.Column(name = "DEPRECIATIONVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getDepreciationvalue() {
        return depreciationvalue;
    }

    public void setDepreciationvalue(BigDecimal depreciationvalue) {
        this.depreciationvalue = depreciationvalue;
    }

    private BigDecimal economicobsolescencepercent;

    @Basic
    @javax.persistence.Column(name = "ECONOMICOBSOLESCENCEPERCENT", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getEconomicobsolescencepercent() {
        return economicobsolescencepercent;
    }

    public void setEconomicobsolescencepercent(BigDecimal economicobsolescencepercent) {
        this.economicobsolescencepercent = economicobsolescencepercent;
    }

    private BigDecimal economicobsolescencevalue;

    @Basic
    @javax.persistence.Column(name = "ECONOMICOBSOLESCENCEVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getEconomicobsolescencevalue() {
        return economicobsolescencevalue;
    }

    public void setEconomicobsolescencevalue(BigDecimal economicobsolescencevalue) {
        this.economicobsolescencevalue = economicobsolescencevalue;
    }

    private BigDecimal functionalobsolescencepct;

    @Basic
    @javax.persistence.Column(name = "FUNCTIONALOBSOLESCENCEPCT", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getFunctionalobsolescencepct() {
        return functionalobsolescencepct;
    }

    public void setFunctionalobsolescencepct(BigDecimal functionalobsolescencepct) {
        this.functionalobsolescencepct = functionalobsolescencepct;
    }

    private BigDecimal functionalobsolescencevalue;

    @Basic
    @javax.persistence.Column(name = "FUNCTIONALOBSOLESCENCEVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getFunctionalobsolescencevalue() {
        return functionalobsolescencevalue;
    }

    public void setFunctionalobsolescencevalue(BigDecimal functionalobsolescencevalue) {
        this.functionalobsolescencevalue = functionalobsolescencevalue;
    }

    private BigDecimal otherobsolescencepercent;

    @Basic
    @javax.persistence.Column(name = "OTHEROBSOLESCENCEPERCENT", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getOtherobsolescencepercent() {
        return otherobsolescencepercent;
    }

    public void setOtherobsolescencepercent(BigDecimal otherobsolescencepercent) {
        this.otherobsolescencepercent = otherobsolescencepercent;
    }

    private BigDecimal otherobsolescencevalue;

    @Basic
    @javax.persistence.Column(name = "OTHEROBSOLESCENCEVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getOtherobsolescencevalue() {
        return otherobsolescencevalue;
    }

    public void setOtherobsolescencevalue(BigDecimal otherobsolescencevalue) {
        this.otherobsolescencevalue = otherobsolescencevalue;
    }

    private Integer reportedacquiredyear;

    @Basic
    @javax.persistence.Column(name = "REPORTEDACQUIREDYEAR", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getReportedacquiredyear() {
        return reportedacquiredyear;
    }

    public void setReportedacquiredyear(Integer reportedacquiredyear) {
        this.reportedacquiredyear = reportedacquiredyear;
    }

    private BigDecimal reportedacquiredcost;

    @Basic
    @javax.persistence.Column(name = "REPORTEDACQUIREDCOST", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getReportedacquiredcost() {
        return reportedacquiredcost;
    }

    public void setReportedacquiredcost(BigDecimal reportedacquiredcost) {
        this.reportedacquiredcost = reportedacquiredcost;
    }

    private String ppreportedrecordno;

    @Basic
    @javax.persistence.Column(name = "PPREPORTEDRECORDNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getPpreportedrecordno() {
        return ppreportedrecordno;
    }

    public void setPpreportedrecordno(String ppreportedrecordno) {
        this.ppreportedrecordno = ppreportedrecordno;
    }

    private String ppmake;

    @Basic
    @javax.persistence.Column(name = "PPMAKE", nullable = true, insertable = true, updatable = true, length = 25)
    public String getPpmake() {
        return ppmake;
    }

    public void setPpmake(String ppmake) {
        this.ppmake = ppmake;
    }

    private String ppmodel;

    @Basic
    @javax.persistence.Column(name = "PPMODEL", nullable = true, insertable = true, updatable = true, length = 25)
    public String getPpmodel() {
        return ppmodel;
    }

    public void setPpmodel(String ppmodel) {
        this.ppmodel = ppmodel;
    }

    private String ppleaseterm;

    @Basic
    @javax.persistence.Column(name = "PPLEASETERM", nullable = true, insertable = true, updatable = true, length = 20)
    public String getPpleaseterm() {
        return ppleaseterm;
    }

    public void setPpleaseterm(String ppleaseterm) {
        this.ppleaseterm = ppleaseterm;
    }

    private BigDecimal ppmonthlyrent;

    @Basic
    @javax.persistence.Column(name = "PPMONTHLYRENT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getPpmonthlyrent() {
        return ppmonthlyrent;
    }

    public void setPpmonthlyrent(BigDecimal ppmonthlyrent) {
        this.ppmonthlyrent = ppmonthlyrent;
    }

    private Integer pplessorcode;

    @Basic
    @javax.persistence.Column(name = "PPLESSORCODE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getPplessorcode() {
        return pplessorcode;
    }

    public void setPplessorcode(Integer pplessorcode) {
        this.pplessorcode = pplessorcode;
    }

    private BigDecimal acctppdetailon0;

    @Basic
    @javax.persistence.Column(name = "ACCTPPDETAILON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctppdetailon0() {
        return acctppdetailon0;
    }

    public void setAcctppdetailon0(BigDecimal acctppdetailon0) {
        this.acctppdetailon0 = acctppdetailon0;
    }

    private BigDecimal acctppdetailon1;

    @Basic
    @javax.persistence.Column(name = "ACCTPPDETAILON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctppdetailon1() {
        return acctppdetailon1;
    }

    public void setAcctppdetailon1(BigDecimal acctppdetailon1) {
        this.acctppdetailon1 = acctppdetailon1;
    }

    private BigDecimal acctppdetailon2;

    @Basic
    @javax.persistence.Column(name = "ACCTPPDETAILON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctppdetailon2() {
        return acctppdetailon2;
    }

    public void setAcctppdetailon2(BigDecimal acctppdetailon2) {
        this.acctppdetailon2 = acctppdetailon2;
    }

    private Timestamp acctppdetailod0;

    @Basic
    @javax.persistence.Column(name = "ACCTPPDETAILOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctppdetailod0() {
        return acctppdetailod0;
    }

    public void setAcctppdetailod0(Timestamp acctppdetailod0) {
        this.acctppdetailod0 = acctppdetailod0;
    }

    private Timestamp acctppdetailod1;

    @Basic
    @javax.persistence.Column(name = "ACCTPPDETAILOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctppdetailod1() {
        return acctppdetailod1;
    }

    public void setAcctppdetailod1(Timestamp acctppdetailod1) {
        this.acctppdetailod1 = acctppdetailod1;
    }

    private String acctppdetailom0;

    @Basic
    @javax.persistence.Column(name = "ACCTPPDETAILOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctppdetailom0() {
        return acctppdetailom0;
    }

    public void setAcctppdetailom0(String acctppdetailom0) {
        this.acctppdetailom0 = acctppdetailom0;
    }

    private String acctppdetailom1;

    @Basic
    @javax.persistence.Column(name = "ACCTPPDETAILOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctppdetailom1() {
        return acctppdetailom1;
    }

    public void setAcctppdetailom1(String acctppdetailom1) {
        this.acctppdetailom1 = acctppdetailom1;
    }

    private String acctppdetailot0;

    @Basic
    @javax.persistence.Column(name = "ACCTPPDETAILOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctppdetailot0() {
        return acctppdetailot0;
    }

    public void setAcctppdetailot0(String acctppdetailot0) {
        this.acctppdetailot0 = acctppdetailot0;
    }

    private String acctppdetailot1;

    @Basic
    @javax.persistence.Column(name = "ACCTPPDETAILOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctppdetailot1() {
        return acctppdetailot1;
    }

    public void setAcctppdetailot1(String acctppdetailot1) {
        this.acctppdetailot1 = acctppdetailot1;
    }

    private String ppdetaildescription;

    @Basic
    @javax.persistence.Column(name = "PPDETAILDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 200)
    public String getPpdetaildescription() {
        return ppdetaildescription;
    }

    public void setPpdetaildescription(String ppdetaildescription) {
        this.ppdetaildescription = ppdetaildescription;
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

    private int seqid;

    @Id
    @javax.persistence.Column(name = "SEQID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSeqid() {
        return seqid;
    }

    public void setSeqid(int seqid) {
        this.seqid = seqid;
    }

    private String leaseno;

    @Basic
    @javax.persistence.Column(name = "LEASENO", nullable = true, insertable = true, updatable = true, length = 50)
    public String getLeaseno() {
        return leaseno;
    }

    public void setLeaseno(String leaseno) {
        this.leaseno = leaseno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tblacctppdetail that = (Tblacctppdetail) o;

        if (detailid != that.detailid) return false;
        if (ppquantity != that.ppquantity) return false;
        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null)
            return false;
        if (acctppdetailod0 != null ? !acctppdetailod0.equals(that.acctppdetailod0) : that.acctppdetailod0 != null)
            return false;
        if (acctppdetailod1 != null ? !acctppdetailod1.equals(that.acctppdetailod1) : that.acctppdetailod1 != null)
            return false;
        if (acctppdetailom0 != null ? !acctppdetailom0.equals(that.acctppdetailom0) : that.acctppdetailom0 != null)
            return false;
        if (acctppdetailom1 != null ? !acctppdetailom1.equals(that.acctppdetailom1) : that.acctppdetailom1 != null)
            return false;
        if (acctppdetailon0 != null ? !acctppdetailon0.equals(that.acctppdetailon0) : that.acctppdetailon0 != null)
            return false;
        if (acctppdetailon1 != null ? !acctppdetailon1.equals(that.acctppdetailon1) : that.acctppdetailon1 != null)
            return false;
        if (acctppdetailon2 != null ? !acctppdetailon2.equals(that.acctppdetailon2) : that.acctppdetailon2 != null)
            return false;
        if (acctppdetailot0 != null ? !acctppdetailot0.equals(that.acctppdetailot0) : that.acctppdetailot0 != null)
            return false;
        if (acctppdetailot1 != null ? !acctppdetailot1.equals(that.acctppdetailot1) : that.acctppdetailot1 != null)
            return false;
        if (acquisitionyear != null ? !acquisitionyear.equals(that.acquisitionyear) : that.acquisitionyear != null)
            return false;
        if (bestinfoavailableflag != null ? !bestinfoavailableflag.equals(that.bestinfoavailableflag) : that.bestinfoavailableflag != null)
            return false;
        if (depreciationvalue != null ? !depreciationvalue.equals(that.depreciationvalue) : that.depreciationvalue != null)
            return false;
        if (economicobsolescencepercent != null ? !economicobsolescencepercent.equals(that.economicobsolescencepercent) : that.economicobsolescencepercent != null)
            return false;
        if (economicobsolescencevalue != null ? !economicobsolescencevalue.equals(that.economicobsolescencevalue) : that.economicobsolescencevalue != null)
            return false;
        if (functionalobsolescencepct != null ? !functionalobsolescencepct.equals(that.functionalobsolescencepct) : that.functionalobsolescencepct != null)
            return false;
        if (functionalobsolescencevalue != null ? !functionalobsolescencevalue.equals(that.functionalobsolescencevalue) : that.functionalobsolescencevalue != null)
            return false;
        if (leaseno != null ? !leaseno.equals(that.leaseno) : that.leaseno != null)
            return false;
        if (omittedflag != null ? !omittedflag.equals(that.omittedflag) : that.omittedflag != null)
            return false;
        if (originalcost != null ? !originalcost.equals(that.originalcost) : that.originalcost != null)
            return false;
        if (otherobsolescencepercent != null ? !otherobsolescencepercent.equals(that.otherobsolescencepercent) : that.otherobsolescencepercent != null)
            return false;
        if (otherobsolescencevalue != null ? !otherobsolescencevalue.equals(that.otherobsolescencevalue) : that.otherobsolescencevalue != null)
            return false;
        if (percentaddeddepreciation != null ? !percentaddeddepreciation.equals(that.percentaddeddepreciation) : that.percentaddeddepreciation != null)
            return false;
        if (ppabstractvalue != null ? !ppabstractvalue.equals(that.ppabstractvalue) : that.ppabstractvalue != null)
            return false;
        if (ppage != null ? !ppage.equals(that.ppage) : that.ppage != null)
            return false;
        if (ppdetaildescription != null ? !ppdetaildescription.equals(that.ppdetaildescription) : that.ppdetaildescription != null)
            return false;
        if (ppgoodpercent != null ? !ppgoodpercent.equals(that.ppgoodpercent) : that.ppgoodpercent != null)
            return false;
        if (ppleaseterm != null ? !ppleaseterm.equals(that.ppleaseterm) : that.ppleaseterm != null)
            return false;
        if (pplessorcode != null ? !pplessorcode.equals(that.pplessorcode) : that.pplessorcode != null)
            return false;
        if (pplifeexpectancy != null ? !pplifeexpectancy.equals(that.pplifeexpectancy) : that.pplifeexpectancy != null)
            return false;
        if (ppmake != null ? !ppmake.equals(that.ppmake) : that.ppmake != null)
            return false;
        if (ppmodel != null ? !ppmodel.equals(that.ppmodel) : that.ppmodel != null)
            return false;
        if (ppmonthlyrent != null ? !ppmonthlyrent.equals(that.ppmonthlyrent) : that.ppmonthlyrent != null)
            return false;
        if (ppogtype != null ? !ppogtype.equals(that.ppogtype) : that.ppogtype != null)
            return false;
        if (pprecordno != null ? !pprecordno.equals(that.pprecordno) : that.pprecordno != null)
            return false;
        if (ppreportedrecordno != null ? !ppreportedrecordno.equals(that.ppreportedrecordno) : that.ppreportedrecordno != null)
            return false;
        if (reportedacquiredcost != null ? !reportedacquiredcost.equals(that.reportedacquiredcost) : that.reportedacquiredcost != null)
            return false;
        if (reportedacquiredyear != null ? !reportedacquiredyear.equals(that.reportedacquiredyear) : that.reportedacquiredyear != null)
            return false;
        if (rollbackfactor != null ? !rollbackfactor.equals(that.rollbackfactor) : that.rollbackfactor != null)
            return false;
        if (typefactor != null ? !typefactor.equals(that.typefactor) : that.typefactor != null)
            return false;
        if (writedate != null ? !writedate.equals(that.writedate) : that.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + (accountno != null ? accountno.hashCode() : 0);
        result = 31 * result + detailid;
        result = 31 * result + (pprecordno != null ? pprecordno.hashCode() : 0);
        result = 31 * result + (ppogtype != null ? ppogtype.hashCode() : 0);
        result = 31 * result + (acquisitionyear != null ? acquisitionyear.hashCode() : 0);
        result = 31 * result + (ppage != null ? ppage.hashCode() : 0);
        result = 31 * result + ppquantity;
        result = 31 * result + (typefactor != null ? typefactor.hashCode() : 0);
        result = 31 * result + (originalcost != null ? originalcost.hashCode() : 0);
        result = 31 * result + (pplifeexpectancy != null ? pplifeexpectancy.hashCode() : 0);
        result = 31 * result + (ppgoodpercent != null ? ppgoodpercent.hashCode() : 0);
        result = 31 * result + (percentaddeddepreciation != null ? percentaddeddepreciation.hashCode() : 0);
        result = 31 * result + (rollbackfactor != null ? rollbackfactor.hashCode() : 0);
        result = 31 * result + (ppabstractvalue != null ? ppabstractvalue.hashCode() : 0);
        result = 31 * result + (bestinfoavailableflag != null ? bestinfoavailableflag.hashCode() : 0);
        result = 31 * result + (omittedflag != null ? omittedflag.hashCode() : 0);
        result = 31 * result + (depreciationvalue != null ? depreciationvalue.hashCode() : 0);
        result = 31 * result + (economicobsolescencepercent != null ? economicobsolescencepercent.hashCode() : 0);
        result = 31 * result + (economicobsolescencevalue != null ? economicobsolescencevalue.hashCode() : 0);
        result = 31 * result + (functionalobsolescencepct != null ? functionalobsolescencepct.hashCode() : 0);
        result = 31 * result + (functionalobsolescencevalue != null ? functionalobsolescencevalue.hashCode() : 0);
        result = 31 * result + (otherobsolescencepercent != null ? otherobsolescencepercent.hashCode() : 0);
        result = 31 * result + (otherobsolescencevalue != null ? otherobsolescencevalue.hashCode() : 0);
        result = 31 * result + (reportedacquiredyear != null ? reportedacquiredyear.hashCode() : 0);
        result = 31 * result + (reportedacquiredcost != null ? reportedacquiredcost.hashCode() : 0);
        result = 31 * result + (ppreportedrecordno != null ? ppreportedrecordno.hashCode() : 0);
        result = 31 * result + (ppmake != null ? ppmake.hashCode() : 0);
        result = 31 * result + (ppmodel != null ? ppmodel.hashCode() : 0);
        result = 31 * result + (ppleaseterm != null ? ppleaseterm.hashCode() : 0);
        result = 31 * result + (ppmonthlyrent != null ? ppmonthlyrent.hashCode() : 0);
        result = 31 * result + (pplessorcode != null ? pplessorcode.hashCode() : 0);
        result = 31 * result + (acctppdetailon0 != null ? acctppdetailon0.hashCode() : 0);
        result = 31 * result + (acctppdetailon1 != null ? acctppdetailon1.hashCode() : 0);
        result = 31 * result + (acctppdetailon2 != null ? acctppdetailon2.hashCode() : 0);
        result = 31 * result + (acctppdetailod0 != null ? acctppdetailod0.hashCode() : 0);
        result = 31 * result + (acctppdetailod1 != null ? acctppdetailod1.hashCode() : 0);
        result = 31 * result + (acctppdetailom0 != null ? acctppdetailom0.hashCode() : 0);
        result = 31 * result + (acctppdetailom1 != null ? acctppdetailom1.hashCode() : 0);
        result = 31 * result + (acctppdetailot0 != null ? acctppdetailot0.hashCode() : 0);
        result = 31 * result + (acctppdetailot1 != null ? acctppdetailot1.hashCode() : 0);
        result = 31 * result + (ppdetaildescription != null ? ppdetaildescription.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        result = 31 * result + (leaseno != null ? leaseno.hashCode() : 0);
        return result;
    }
}
