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
public class Tblcompautocompuseradj {
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

    private int jurisdictionid;

    @Basic
    @javax.persistence.Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
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

    private String adjustmentname;

    @Basic
    @javax.persistence.Column(name = "ADJUSTMENTNAME", nullable = false, insertable = true, updatable = true, length = 30)
    public String getAdjustmentname() {
        return adjustmentname;
    }

    public void setAdjustmentname(String adjustmentname) {
        this.adjustmentname = adjustmentname;
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

    private BigDecimal compautocompuseradjon0;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPUSERADJON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getCompautocompuseradjon0() {
        return compautocompuseradjon0;
    }

    public void setCompautocompuseradjon0(BigDecimal compautocompuseradjon0) {
        this.compautocompuseradjon0 = compautocompuseradjon0;
    }

    private BigDecimal compautocompuseradjon1;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPUSERADJON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getCompautocompuseradjon1() {
        return compautocompuseradjon1;
    }

    public void setCompautocompuseradjon1(BigDecimal compautocompuseradjon1) {
        this.compautocompuseradjon1 = compautocompuseradjon1;
    }

    private BigDecimal compautocompuseradjon2;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPUSERADJON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getCompautocompuseradjon2() {
        return compautocompuseradjon2;
    }

    public void setCompautocompuseradjon2(BigDecimal compautocompuseradjon2) {
        this.compautocompuseradjon2 = compautocompuseradjon2;
    }

    private Timestamp compautocompuseradjod0;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPUSERADJOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getCompautocompuseradjod0() {
        return compautocompuseradjod0;
    }

    public void setCompautocompuseradjod0(Timestamp compautocompuseradjod0) {
        this.compautocompuseradjod0 = compautocompuseradjod0;
    }

    private Timestamp compautocompuseradjod1;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPUSERADJOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getCompautocompuseradjod1() {
        return compautocompuseradjod1;
    }

    public void setCompautocompuseradjod1(Timestamp compautocompuseradjod1) {
        this.compautocompuseradjod1 = compautocompuseradjod1;
    }

    private String compautocompuseradjom0;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPUSERADJOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getCompautocompuseradjom0() {
        return compautocompuseradjom0;
    }

    public void setCompautocompuseradjom0(String compautocompuseradjom0) {
        this.compautocompuseradjom0 = compautocompuseradjom0;
    }

    private String compautocompuseradjom1;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPUSERADJOM1", nullable = true, insertable = true, updatable = true, length = 59)
    public String getCompautocompuseradjom1() {
        return compautocompuseradjom1;
    }

    public void setCompautocompuseradjom1(String compautocompuseradjom1) {
        this.compautocompuseradjom1 = compautocompuseradjom1;
    }

    private String compautocompuseradjot0;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPUSERADJOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getCompautocompuseradjot0() {
        return compautocompuseradjot0;
    }

    public void setCompautocompuseradjot0(String compautocompuseradjot0) {
        this.compautocompuseradjot0 = compautocompuseradjot0;
    }

    private String compautocompuseradjot1;

    @Basic
    @javax.persistence.Column(name = "COMPAUTOCOMPUSERADJOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getCompautocompuseradjot1() {
        return compautocompuseradjot1;
    }

    public void setCompautocompuseradjot1(String compautocompuseradjot1) {
        this.compautocompuseradjot1 = compautocompuseradjot1;
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

    private BigInteger applyqualityfactorflag;

    @Basic
    @javax.persistence.Column(name = "APPLYQUALITYFACTORFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getApplyqualityfactorflag() {
        return applyqualityfactorflag;
    }

    public void setApplyqualityfactorflag(BigInteger applyqualityfactorflag) {
        this.applyqualityfactorflag = applyqualityfactorflag;
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

    private String defaultcolumnname;

    @Basic
    @javax.persistence.Column(name = "DEFAULTCOLUMNNAME", nullable = true, insertable = true, updatable = true, length = 30)
    public String getDefaultcolumnname() {
        return defaultcolumnname;
    }

    public void setDefaultcolumnname(String defaultcolumnname) {
        this.defaultcolumnname = defaultcolumnname;
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

        Tblcompautocompuseradj that = (Tblcompautocompuseradj) o;

        if (compadjustmenttypeid != that.compadjustmenttypeid) return false;
        if (detailid != that.detailid) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (seqid != that.seqid) return false;
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
        if (compautocompuseradjod0 != null ? !compautocompuseradjod0.equals(that.compautocompuseradjod0) : that.compautocompuseradjod0 != null)
            return false;
        if (compautocompuseradjod1 != null ? !compautocompuseradjod1.equals(that.compautocompuseradjod1) : that.compautocompuseradjod1 != null)
            return false;
        if (compautocompuseradjom0 != null ? !compautocompuseradjom0.equals(that.compautocompuseradjom0) : that.compautocompuseradjom0 != null)
            return false;
        if (compautocompuseradjom1 != null ? !compautocompuseradjom1.equals(that.compautocompuseradjom1) : that.compautocompuseradjom1 != null)
            return false;
        if (compautocompuseradjon0 != null ? !compautocompuseradjon0.equals(that.compautocompuseradjon0) : that.compautocompuseradjon0 != null)
            return false;
        if (compautocompuseradjon1 != null ? !compautocompuseradjon1.equals(that.compautocompuseradjon1) : that.compautocompuseradjon1 != null)
            return false;
        if (compautocompuseradjon2 != null ? !compautocompuseradjon2.equals(that.compautocompuseradjon2) : that.compautocompuseradjon2 != null)
            return false;
        if (compautocompuseradjot0 != null ? !compautocompuseradjot0.equals(that.compautocompuseradjot0) : that.compautocompuseradjot0 != null)
            return false;
        if (compautocompuseradjot1 != null ? !compautocompuseradjot1.equals(that.compautocompuseradjot1) : that.compautocompuseradjot1 != null)
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
        result = 31 * result + jurisdictionid;
        result = 31 * result + detailid;
        result = 31 * result + (adjustmentname != null ? adjustmentname.hashCode() : 0);
        result = 31 * result + (originalvalue != null ? originalvalue.hashCode() : 0);
        result = 31 * result + (adjustmentvalue != null ? adjustmentvalue.hashCode() : 0);
        result = 31 * result + compadjustmenttypeid;
        result = 31 * result + (compautocompuseradjon0 != null ? compautocompuseradjon0.hashCode() : 0);
        result = 31 * result + (compautocompuseradjon1 != null ? compautocompuseradjon1.hashCode() : 0);
        result = 31 * result + (compautocompuseradjon2 != null ? compautocompuseradjon2.hashCode() : 0);
        result = 31 * result + (compautocompuseradjod0 != null ? compautocompuseradjod0.hashCode() : 0);
        result = 31 * result + (compautocompuseradjod1 != null ? compautocompuseradjod1.hashCode() : 0);
        result = 31 * result + (compautocompuseradjom0 != null ? compautocompuseradjom0.hashCode() : 0);
        result = 31 * result + (compautocompuseradjom1 != null ? compautocompuseradjom1.hashCode() : 0);
        result = 31 * result + (compautocompuseradjot0 != null ? compautocompuseradjot0.hashCode() : 0);
        result = 31 * result + (compautocompuseradjot1 != null ? compautocompuseradjot1.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + (subjectaccountno != null ? subjectaccountno.hashCode() : 0);
        result = 31 * result + (comparableaccountno != null ? comparableaccountno.hashCode() : 0);
        result = 31 * result + (applyqualityfactorflag != null ? applyqualityfactorflag.hashCode() : 0);
        result = 31 * result + (adjusttype != null ? adjusttype.hashCode() : 0);
        result = 31 * result + (defaultcolumnname != null ? defaultcolumnname.hashCode() : 0);
        result = 31 * result + (receptionno != null ? receptionno.hashCode() : 0);
        result = 31 * result + (originalstringvalue != null ? originalstringvalue.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
