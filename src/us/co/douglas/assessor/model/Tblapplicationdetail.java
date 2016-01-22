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
public class Tblapplicationdetail {
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

    private String applicationrecordno;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONRECORDNO", nullable = false, insertable = true, updatable = true, length = 15)
    public String getApplicationrecordno() {
        return applicationrecordno;
    }

    public void setApplicationrecordno(String applicationrecordno) {
        this.applicationrecordno = applicationrecordno;
    }

    private BigDecimal applicationdetailnumber;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONDETAILNUMBER", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getApplicationdetailnumber() {
        return applicationdetailnumber;
    }

    public void setApplicationdetailnumber(BigDecimal applicationdetailnumber) {
        this.applicationdetailnumber = applicationdetailnumber;
    }

    private Timestamp applicationdetaildate;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONDETAILDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getApplicationdetaildate() {
        return applicationdetaildate;
    }

    public void setApplicationdetaildate(Timestamp applicationdetaildate) {
        this.applicationdetaildate = applicationdetaildate;
    }

    private String applicationdetailtext;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONDETAILTEXT", nullable = true, insertable = true, updatable = true, length = 500)
    public String getApplicationdetailtext() {
        return applicationdetailtext;
    }

    public void setApplicationdetailtext(String applicationdetailtext) {
        this.applicationdetailtext = applicationdetailtext;
    }

    private Timestamp applicationdetailod0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONDETAILOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getApplicationdetailod0() {
        return applicationdetailod0;
    }

    public void setApplicationdetailod0(Timestamp applicationdetailod0) {
        this.applicationdetailod0 = applicationdetailod0;
    }

    private Timestamp applicationdetailod1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONDETAILOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getApplicationdetailod1() {
        return applicationdetailod1;
    }

    public void setApplicationdetailod1(Timestamp applicationdetailod1) {
        this.applicationdetailod1 = applicationdetailod1;
    }

    private String applicationdetailom0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONDETAILOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationdetailom0() {
        return applicationdetailom0;
    }

    public void setApplicationdetailom0(String applicationdetailom0) {
        this.applicationdetailom0 = applicationdetailom0;
    }

    private String applicationdetailom1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONDETAILOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationdetailom1() {
        return applicationdetailom1;
    }

    public void setApplicationdetailom1(String applicationdetailom1) {
        this.applicationdetailom1 = applicationdetailom1;
    }

    private BigDecimal applicationdetailon0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONDETAILON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getApplicationdetailon0() {
        return applicationdetailon0;
    }

    public void setApplicationdetailon0(BigDecimal applicationdetailon0) {
        this.applicationdetailon0 = applicationdetailon0;
    }

    private BigDecimal applicationdetailon1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONDETAILON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getApplicationdetailon1() {
        return applicationdetailon1;
    }

    public void setApplicationdetailon1(BigDecimal applicationdetailon1) {
        this.applicationdetailon1 = applicationdetailon1;
    }

    private BigDecimal applicationdetailon2;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONDETAILON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getApplicationdetailon2() {
        return applicationdetailon2;
    }

    public void setApplicationdetailon2(BigDecimal applicationdetailon2) {
        this.applicationdetailon2 = applicationdetailon2;
    }

    private String applicationdetailot0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONDETAILOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationdetailot0() {
        return applicationdetailot0;
    }

    public void setApplicationdetailot0(String applicationdetailot0) {
        this.applicationdetailot0 = applicationdetailot0;
    }

    private String applicationdetailot1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONDETAILOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationdetailot1() {
        return applicationdetailot1;
    }

    public void setApplicationdetailot1(String applicationdetailot1) {
        this.applicationdetailot1 = applicationdetailot1;
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

    private BigInteger applicationdefinitionindex;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONDEFINITIONINDEX", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getApplicationdefinitionindex() {
        return applicationdefinitionindex;
    }

    public void setApplicationdefinitionindex(BigInteger applicationdefinitionindex) {
        this.applicationdefinitionindex = applicationdefinitionindex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tblapplicationdetail that = (Tblapplicationdetail) o;

        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (applicationdefinitionindex != null ? !applicationdefinitionindex.equals(that.applicationdefinitionindex) : that.applicationdefinitionindex != null)
            return false;
        if (applicationdetaildate != null ? !applicationdetaildate.equals(that.applicationdetaildate) : that.applicationdetaildate != null)
            return false;
        if (applicationdetailnumber != null ? !applicationdetailnumber.equals(that.applicationdetailnumber) : that.applicationdetailnumber != null)
            return false;
        if (applicationdetailod0 != null ? !applicationdetailod0.equals(that.applicationdetailod0) : that.applicationdetailod0 != null)
            return false;
        if (applicationdetailod1 != null ? !applicationdetailod1.equals(that.applicationdetailod1) : that.applicationdetailod1 != null)
            return false;
        if (applicationdetailom0 != null ? !applicationdetailom0.equals(that.applicationdetailom0) : that.applicationdetailom0 != null)
            return false;
        if (applicationdetailom1 != null ? !applicationdetailom1.equals(that.applicationdetailom1) : that.applicationdetailom1 != null)
            return false;
        if (applicationdetailon0 != null ? !applicationdetailon0.equals(that.applicationdetailon0) : that.applicationdetailon0 != null)
            return false;
        if (applicationdetailon1 != null ? !applicationdetailon1.equals(that.applicationdetailon1) : that.applicationdetailon1 != null)
            return false;
        if (applicationdetailon2 != null ? !applicationdetailon2.equals(that.applicationdetailon2) : that.applicationdetailon2 != null)
            return false;
        if (applicationdetailot0 != null ? !applicationdetailot0.equals(that.applicationdetailot0) : that.applicationdetailot0 != null)
            return false;
        if (applicationdetailot1 != null ? !applicationdetailot1.equals(that.applicationdetailot1) : that.applicationdetailot1 != null)
            return false;
        if (applicationdetailtext != null ? !applicationdetailtext.equals(that.applicationdetailtext) : that.applicationdetailtext != null)
            return false;
        if (applicationrecordno != null ? !applicationrecordno.equals(that.applicationrecordno) : that.applicationrecordno != null)
            return false;
        if (writedate != null ? !writedate.equals(that.writedate) : that.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + (applicationrecordno != null ? applicationrecordno.hashCode() : 0);
        result = 31 * result + (applicationdetailnumber != null ? applicationdetailnumber.hashCode() : 0);
        result = 31 * result + (applicationdetaildate != null ? applicationdetaildate.hashCode() : 0);
        result = 31 * result + (applicationdetailtext != null ? applicationdetailtext.hashCode() : 0);
        result = 31 * result + (applicationdetailod0 != null ? applicationdetailod0.hashCode() : 0);
        result = 31 * result + (applicationdetailod1 != null ? applicationdetailod1.hashCode() : 0);
        result = 31 * result + (applicationdetailom0 != null ? applicationdetailom0.hashCode() : 0);
        result = 31 * result + (applicationdetailom1 != null ? applicationdetailom1.hashCode() : 0);
        result = 31 * result + (applicationdetailon0 != null ? applicationdetailon0.hashCode() : 0);
        result = 31 * result + (applicationdetailon1 != null ? applicationdetailon1.hashCode() : 0);
        result = 31 * result + (applicationdetailon2 != null ? applicationdetailon2.hashCode() : 0);
        result = 31 * result + (applicationdetailot0 != null ? applicationdetailot0.hashCode() : 0);
        result = 31 * result + (applicationdetailot1 != null ? applicationdetailot1.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        result = 31 * result + (applicationdefinitionindex != null ? applicationdefinitionindex.hashCode() : 0);
        return result;
    }
}
