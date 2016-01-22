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
public class Tblcompautocompadj {
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

    private int statcandidatedetailid;

    @Basic
    @javax.persistence.Column(name = "STATCANDIDATEDETAILID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getStatcandidatedetailid() {
        return statcandidatedetailid;
    }

    public void setStatcandidatedetailid(int statcandidatedetailid) {
        this.statcandidatedetailid = statcandidatedetailid;
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

    private BigDecimal originalvalue;

    @Basic
    @javax.persistence.Column(name = "ORIGINALVALUE", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getOriginalvalue() {
        return originalvalue;
    }

    public void setOriginalvalue(BigDecimal originalvalue) {
        this.originalvalue = originalvalue;
    }

    private BigDecimal adjustmentvalue;

    @Basic
    @javax.persistence.Column(name = "ADJUSTMENTVALUE", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAdjustmentvalue() {
        return adjustmentvalue;
    }

    public void setAdjustmentvalue(BigDecimal adjustmentvalue) {
        this.adjustmentvalue = adjustmentvalue;
    }

    private int compadjustmenttypeid;

    @Basic
    @javax.persistence.Column(name = "COMPADJUSTMENTTYPEID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getCompadjustmenttypeid() {
        return compadjustmenttypeid;
    }

    public void setCompadjustmenttypeid(int compadjustmenttypeid) {
        this.compadjustmenttypeid = compadjustmenttypeid;
    }

    private BigDecimal compautocompadjon0;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPADJON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getCompautocompadjon0() {
        return compautocompadjon0;
    }

    public void setCompautocompadjon0(BigDecimal compautocompadjon0) {
        this.compautocompadjon0 = compautocompadjon0;
    }

    private BigDecimal compautocompadjon1;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPADJON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getCompautocompadjon1() {
        return compautocompadjon1;
    }

    public void setCompautocompadjon1(BigDecimal compautocompadjon1) {
        this.compautocompadjon1 = compautocompadjon1;
    }

    private BigDecimal compautocompadjon2;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPADJON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getCompautocompadjon2() {
        return compautocompadjon2;
    }

    public void setCompautocompadjon2(BigDecimal compautocompadjon2) {
        this.compautocompadjon2 = compautocompadjon2;
    }

    private Timestamp compautocompadjod0;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPADJOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getCompautocompadjod0() {
        return compautocompadjod0;
    }

    public void setCompautocompadjod0(Timestamp compautocompadjod0) {
        this.compautocompadjod0 = compautocompadjod0;
    }

    private Timestamp compautocompadjod1;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPADJOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getCompautocompadjod1() {
        return compautocompadjod1;
    }

    public void setCompautocompadjod1(Timestamp compautocompadjod1) {
        this.compautocompadjod1 = compautocompadjod1;
    }

    private String compautocompadjom0;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPADJOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getCompautocompadjom0() {
        return compautocompadjom0;
    }

    public void setCompautocompadjom0(String compautocompadjom0) {
        this.compautocompadjom0 = compautocompadjom0;
    }

    private String compautocompadjom1;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPADJOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getCompautocompadjom1() {
        return compautocompadjom1;
    }

    public void setCompautocompadjom1(String compautocompadjom1) {
        this.compautocompadjom1 = compautocompadjom1;
    }

    private String compautocompadjot0;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPADJOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getCompautocompadjot0() {
        return compautocompadjot0;
    }

    public void setCompautocompadjot0(String compautocompadjot0) {
        this.compautocompadjot0 = compautocompadjot0;
    }

    private String compautocompadjot1;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPADJOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getCompautocompadjot1() {
        return compautocompadjot1;
    }

    public void setCompautocompadjot1(String compautocompadjot1) {
        this.compautocompadjot1 = compautocompadjot1;
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

    private String subjectaccountno;

    @Basic
    @javax.persistence.Column(name = "SUBJECTACCOUNTNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getSubjectaccountno() {
        return subjectaccountno;
    }

    public void setSubjectaccountno(String subjectaccountno) {
        this.subjectaccountno = subjectaccountno;
    }

    private String comparableaccountno;

    @Basic
    @javax.persistence.Column(name = "COMPARABLEACCOUNTNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getComparableaccountno() {
        return comparableaccountno;
    }

    public void setComparableaccountno(String comparableaccountno) {
        this.comparableaccountno = comparableaccountno;
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

    private String adjusttype;

    @Basic
    @javax.persistence.Column(name = "ADJUSTTYPE", nullable = false, insertable = true, updatable = true, length = 20)
    public String getAdjusttype() {
        return adjusttype;
    }

    public void setAdjusttype(String adjusttype) {
        this.adjusttype = adjusttype;
    }

    private BigInteger applyqualityfactorflag;

    @Basic
    @javax.persistence.Column(name = "APPLYQUALITYFACTORFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getApplyqualityfactorflag() {
        return applyqualityfactorflag;
    }

    public void setApplyqualityfactorflag(BigInteger applyqualityfactorflag) {
        this.applyqualityfactorflag = applyqualityfactorflag;
    }

    private String adjustmentname;

    @Basic
    @javax.persistence.Column(name = "ADJUSTMENTNAME", nullable = false, insertable = true, updatable = true, length = 30)
    public String getAdjustmentname() {
        return adjustmentname;
    }

    public void setAdjustmentname(String adjustmentname) {
        this.adjustmentname = adjustmentname;
    }

    private String receptionno;

    @Basic
    @javax.persistence.Column(name = "RECEPTIONNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getReceptionno() {
        return receptionno;
    }

    public void setReceptionno(String receptionno) {
        this.receptionno = receptionno;
    }

    private String defaultcolumnname;

    @Basic
    @javax.persistence.Column(name = "DEFAULTCOLUMNNAME", nullable = true, insertable = true, updatable = true, length = 30)
    public String getDefaultcolumnname() {
        return defaultcolumnname;
    }

    public void setDefaultcolumnname(String defaultcolumnname) {
        this.defaultcolumnname = defaultcolumnname;
    }

    private String originalstringvalue;

    @Basic
    @javax.persistence.Column(name = "ORIGINALSTRINGVALUE", nullable = true, insertable = true, updatable = true, length = 50)
    public String getOriginalstringvalue() {
        return originalstringvalue;
    }

    public void setOriginalstringvalue(String originalstringvalue) {
        this.originalstringvalue = originalstringvalue;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tblcompautocompadj that = (Tblcompautocompadj) o;

        if (compadjustmenttypeid != that.compadjustmenttypeid) return false;
        if (detailid != that.detailid) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (seqid != that.seqid) return false;
        if (statcandidatedetailid != that.statcandidatedetailid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (adjustmentname != null ? !adjustmentname.equals(that.adjustmentname) : that.adjustmentname != null)
            return false;
        if (adjustmentvalue != null ? !adjustmentvalue.equals(that.adjustmentvalue) : that.adjustmentvalue != null)
            return false;
        if (adjusttype != null ? !adjusttype.equals(that.adjusttype) : that.adjusttype != null)
            return false;
        if (applyqualityfactorflag != null ? !applyqualityfactorflag.equals(that.applyqualityfactorflag) : that.applyqualityfactorflag != null)
            return false;
        if (comparableaccountno != null ? !comparableaccountno.equals(that.comparableaccountno) : that.comparableaccountno != null)
            return false;
        if (compautocompadjod0 != null ? !compautocompadjod0.equals(that.compautocompadjod0) : that.compautocompadjod0 != null)
            return false;
        if (compautocompadjod1 != null ? !compautocompadjod1.equals(that.compautocompadjod1) : that.compautocompadjod1 != null)
            return false;
        if (compautocompadjom0 != null ? !compautocompadjom0.equals(that.compautocompadjom0) : that.compautocompadjom0 != null)
            return false;
        if (compautocompadjom1 != null ? !compautocompadjom1.equals(that.compautocompadjom1) : that.compautocompadjom1 != null)
            return false;
        if (compautocompadjon0 != null ? !compautocompadjon0.equals(that.compautocompadjon0) : that.compautocompadjon0 != null)
            return false;
        if (compautocompadjon1 != null ? !compautocompadjon1.equals(that.compautocompadjon1) : that.compautocompadjon1 != null)
            return false;
        if (compautocompadjon2 != null ? !compautocompadjon2.equals(that.compautocompadjon2) : that.compautocompadjon2 != null)
            return false;
        if (compautocompadjot0 != null ? !compautocompadjot0.equals(that.compautocompadjot0) : that.compautocompadjot0 != null)
            return false;
        if (compautocompadjot1 != null ? !compautocompadjot1.equals(that.compautocompadjot1) : that.compautocompadjot1 != null)
            return false;
        if (defaultcolumnname != null ? !defaultcolumnname.equals(that.defaultcolumnname) : that.defaultcolumnname != null)
            return false;
        if (originalstringvalue != null ? !originalstringvalue.equals(that.originalstringvalue) : that.originalstringvalue != null)
            return false;
        if (originalvalue != null ? !originalvalue.equals(that.originalvalue) : that.originalvalue != null)
            return false;
        if (receptionno != null ? !receptionno.equals(that.receptionno) : that.receptionno != null)
            return false;
        if (subjectaccountno != null ? !subjectaccountno.equals(that.subjectaccountno) : that.subjectaccountno != null)
            return false;
        if (writedate != null ? !writedate.equals(that.writedate) : that.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + statcandidatedetailid;
        result = 31 * result + jurisdictionid;
        result = 31 * result + (originalvalue != null ? originalvalue.hashCode() : 0);
        result = 31 * result + (adjustmentvalue != null ? adjustmentvalue.hashCode() : 0);
        result = 31 * result + compadjustmenttypeid;
        result = 31 * result + (compautocompadjon0 != null ? compautocompadjon0.hashCode() : 0);
        result = 31 * result + (compautocompadjon1 != null ? compautocompadjon1.hashCode() : 0);
        result = 31 * result + (compautocompadjon2 != null ? compautocompadjon2.hashCode() : 0);
        result = 31 * result + (compautocompadjod0 != null ? compautocompadjod0.hashCode() : 0);
        result = 31 * result + (compautocompadjod1 != null ? compautocompadjod1.hashCode() : 0);
        result = 31 * result + (compautocompadjom0 != null ? compautocompadjom0.hashCode() : 0);
        result = 31 * result + (compautocompadjom1 != null ? compautocompadjom1.hashCode() : 0);
        result = 31 * result + (compautocompadjot0 != null ? compautocompadjot0.hashCode() : 0);
        result = 31 * result + (compautocompadjot1 != null ? compautocompadjot1.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + (subjectaccountno != null ? subjectaccountno.hashCode() : 0);
        result = 31 * result + (comparableaccountno != null ? comparableaccountno.hashCode() : 0);
        result = 31 * result + detailid;
        result = 31 * result + (adjusttype != null ? adjusttype.hashCode() : 0);
        result = 31 * result + (applyqualityfactorflag != null ? applyqualityfactorflag.hashCode() : 0);
        result = 31 * result + (adjustmentname != null ? adjustmentname.hashCode() : 0);
        result = 31 * result + (receptionno != null ? receptionno.hashCode() : 0);
        result = 31 * result + (defaultcolumnname != null ? defaultcolumnname.hashCode() : 0);
        result = 31 * result + (originalstringvalue != null ? originalstringvalue.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
