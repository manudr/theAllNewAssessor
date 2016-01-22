package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
public class Tblcomparable {
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

    private String subjectaccountno;

    @Basic
    @javax.persistence.Column(name = "SUBJECTACCOUNTNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getSubjectaccountno() {
        return subjectaccountno;
    }

    public void setSubjectaccountno(String subjectaccountno) {
        this.subjectaccountno = subjectaccountno;
    }

    private int comparableorder;

    @Basic
    @javax.persistence.Column(name = "COMPARABLEORDER", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getComparableorder() {
        return comparableorder;
    }

    public void setComparableorder(int comparableorder) {
        this.comparableorder = comparableorder;
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

    private String comparabletype;

    @Basic
    @javax.persistence.Column(name = "COMPARABLETYPE", nullable = false, insertable = true, updatable = true, length = 30)
    public String getComparabletype() {
        return comparabletype;
    }

    public void setComparabletype(String comparabletype) {
        this.comparabletype = comparabletype;
    }

    private String comparabletypeno;

    @Basic
    @javax.persistence.Column(name = "COMPARABLETYPENO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getComparabletypeno() {
        return comparabletypeno;
    }

    public void setComparabletypeno(String comparabletypeno) {
        this.comparabletypeno = comparabletypeno;
    }

    private String selectiontype;

    @Basic
    @javax.persistence.Column(name = "SELECTIONTYPE", nullable = true, insertable = true, updatable = true, length = 30)
    public String getSelectiontype() {
        return selectiontype;
    }

    public void setSelectiontype(String selectiontype) {
        this.selectiontype = selectiontype;
    }

    private String modelcode;

    @Basic
    @javax.persistence.Column(name = "MODELCODE", nullable = true, insertable = true, updatable = true, length = 30)
    public String getModelcode() {
        return modelcode;
    }

    public void setModelcode(String modelcode) {
        this.modelcode = modelcode;
    }

    private BigDecimal comparabledistance;

    @Basic
    @javax.persistence.Column(name = "COMPARABLEDISTANCE", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getComparabledistance() {
        return comparabledistance;
    }

    public void setComparabledistance(BigDecimal comparabledistance) {
        this.comparabledistance = comparabledistance;
    }

    private BigDecimal comparableon0;

    @Basic
    @javax.persistence.Column(name = "COMPARABLEON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getComparableon0() {
        return comparableon0;
    }

    public void setComparableon0(BigDecimal comparableon0) {
        this.comparableon0 = comparableon0;
    }

    private BigDecimal comparableon1;

    @Basic
    @javax.persistence.Column(name = "COMPARABLEON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getComparableon1() {
        return comparableon1;
    }

    public void setComparableon1(BigDecimal comparableon1) {
        this.comparableon1 = comparableon1;
    }

    private BigDecimal comparableon2;

    @Basic
    @javax.persistence.Column(name = "COMPARABLEON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getComparableon2() {
        return comparableon2;
    }

    public void setComparableon2(BigDecimal comparableon2) {
        this.comparableon2 = comparableon2;
    }

    private Timestamp comparableod0;

    @Basic
    @javax.persistence.Column(name = "COMPARABLEOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getComparableod0() {
        return comparableod0;
    }

    public void setComparableod0(Timestamp comparableod0) {
        this.comparableod0 = comparableod0;
    }

    private Timestamp comparableod1;

    @Basic
    @javax.persistence.Column(name = "COMPARABLEOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getComparableod1() {
        return comparableod1;
    }

    public void setComparableod1(Timestamp comparableod1) {
        this.comparableod1 = comparableod1;
    }

    private String comparableom0;

    @Basic
    @javax.persistence.Column(name = "COMPARABLEOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getComparableom0() {
        return comparableom0;
    }

    public void setComparableom0(String comparableom0) {
        this.comparableom0 = comparableom0;
    }

    private String comparableom1;

    @Basic
    @javax.persistence.Column(name = "COMPARABLEOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getComparableom1() {
        return comparableom1;
    }

    public void setComparableom1(String comparableom1) {
        this.comparableom1 = comparableom1;
    }

    private String comparableot0;

    @Basic
    @javax.persistence.Column(name = "COMPARABLEOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getComparableot0() {
        return comparableot0;
    }

    public void setComparableot0(String comparableot0) {
        this.comparableot0 = comparableot0;
    }

    private String comparableot1;

    @Basic
    @javax.persistence.Column(name = "COMPARABLEOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getComparableot1() {
        return comparableot1;
    }

    public void setComparableot1(String comparableot1) {
        this.comparableot1 = comparableot1;
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

    private Timestamp writedate;

    @Basic
    @javax.persistence.Column(name = "WRITEDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getWritedate() {
        return writedate;
    }

    public void setWritedate(Timestamp writedate) {
        this.writedate = writedate;
    }

    private Integer comparableid;

    @Basic
    @javax.persistence.Column(name = "COMPARABLEID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getComparableid() {
        return comparableid;
    }

    public void setComparableid(Integer comparableid) {
        this.comparableid = comparableid;
    }

    private Integer taxyear;

    @Basic
    @javax.persistence.Column(name = "TAXYEAR", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getTaxyear() {
        return taxyear;
    }

    public void setTaxyear(Integer taxyear) {
        this.taxyear = taxyear;
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

        Tblcomparable that = (Tblcomparable) o;

        if (comparableorder != that.comparableorder) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (comparableaccountno != null ? !comparableaccountno.equals(that.comparableaccountno) : that.comparableaccountno != null)
            return false;
        if (comparabledistance != null ? !comparabledistance.equals(that.comparabledistance) : that.comparabledistance != null)
            return false;
        if (comparableid != null ? !comparableid.equals(that.comparableid) : that.comparableid != null)
            return false;
        if (comparableod0 != null ? !comparableod0.equals(that.comparableod0) : that.comparableod0 != null)
            return false;
        if (comparableod1 != null ? !comparableod1.equals(that.comparableod1) : that.comparableod1 != null)
            return false;
        if (comparableom0 != null ? !comparableom0.equals(that.comparableom0) : that.comparableom0 != null)
            return false;
        if (comparableom1 != null ? !comparableom1.equals(that.comparableom1) : that.comparableom1 != null)
            return false;
        if (comparableon0 != null ? !comparableon0.equals(that.comparableon0) : that.comparableon0 != null)
            return false;
        if (comparableon1 != null ? !comparableon1.equals(that.comparableon1) : that.comparableon1 != null)
            return false;
        if (comparableon2 != null ? !comparableon2.equals(that.comparableon2) : that.comparableon2 != null)
            return false;
        if (comparableot0 != null ? !comparableot0.equals(that.comparableot0) : that.comparableot0 != null)
            return false;
        if (comparableot1 != null ? !comparableot1.equals(that.comparableot1) : that.comparableot1 != null)
            return false;
        if (comparabletype != null ? !comparabletype.equals(that.comparabletype) : that.comparabletype != null)
            return false;
        if (comparabletypeno != null ? !comparabletypeno.equals(that.comparabletypeno) : that.comparabletypeno != null)
            return false;
        if (modelcode != null ? !modelcode.equals(that.modelcode) : that.modelcode != null)
            return false;
        if (selectiontype != null ? !selectiontype.equals(that.selectiontype) : that.selectiontype != null)
            return false;
        if (subjectaccountno != null ? !subjectaccountno.equals(that.subjectaccountno) : that.subjectaccountno != null)
            return false;
        if (taxyear != null ? !taxyear.equals(that.taxyear) : that.taxyear != null)
            return false;
        if (writedate != null ? !writedate.equals(that.writedate) : that.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + (subjectaccountno != null ? subjectaccountno.hashCode() : 0);
        result = 31 * result + comparableorder;
        result = 31 * result + (comparableaccountno != null ? comparableaccountno.hashCode() : 0);
        result = 31 * result + (comparabletype != null ? comparabletype.hashCode() : 0);
        result = 31 * result + (comparabletypeno != null ? comparabletypeno.hashCode() : 0);
        result = 31 * result + (selectiontype != null ? selectiontype.hashCode() : 0);
        result = 31 * result + (modelcode != null ? modelcode.hashCode() : 0);
        result = 31 * result + (comparabledistance != null ? comparabledistance.hashCode() : 0);
        result = 31 * result + (comparableon0 != null ? comparableon0.hashCode() : 0);
        result = 31 * result + (comparableon1 != null ? comparableon1.hashCode() : 0);
        result = 31 * result + (comparableon2 != null ? comparableon2.hashCode() : 0);
        result = 31 * result + (comparableod0 != null ? comparableod0.hashCode() : 0);
        result = 31 * result + (comparableod1 != null ? comparableod1.hashCode() : 0);
        result = 31 * result + (comparableom0 != null ? comparableom0.hashCode() : 0);
        result = 31 * result + (comparableom1 != null ? comparableom1.hashCode() : 0);
        result = 31 * result + (comparableot0 != null ? comparableot0.hashCode() : 0);
        result = 31 * result + (comparableot1 != null ? comparableot1.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + (comparableid != null ? comparableid.hashCode() : 0);
        result = 31 * result + (taxyear != null ? taxyear.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
