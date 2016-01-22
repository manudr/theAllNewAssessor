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
public class Tblapplicationapplicant {
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

    private int personcode;

    @Basic
    @javax.persistence.Column(name = "PERSONCODE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getPersoncode() {
        return personcode;
    }

    public void setPersoncode(int personcode) {
        this.personcode = personcode;
    }

    private Integer addresscode;

    @Basic
    @javax.persistence.Column(name = "ADDRESSCODE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getAddresscode() {
        return addresscode;
    }

    public void setAddresscode(Integer addresscode) {
        this.addresscode = addresscode;
    }

    private BigDecimal applicationapplicanton0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONAPPLICANTON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getApplicationapplicanton0() {
        return applicationapplicanton0;
    }

    public void setApplicationapplicanton0(BigDecimal applicationapplicanton0) {
        this.applicationapplicanton0 = applicationapplicanton0;
    }

    private BigDecimal applicationapplicanton1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONAPPLICANTON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getApplicationapplicanton1() {
        return applicationapplicanton1;
    }

    public void setApplicationapplicanton1(BigDecimal applicationapplicanton1) {
        this.applicationapplicanton1 = applicationapplicanton1;
    }

    private BigDecimal applicationapplicanton2;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONAPPLICANTON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getApplicationapplicanton2() {
        return applicationapplicanton2;
    }

    public void setApplicationapplicanton2(BigDecimal applicationapplicanton2) {
        this.applicationapplicanton2 = applicationapplicanton2;
    }

    private Timestamp applicationapplicantod0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONAPPLICANTOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getApplicationapplicantod0() {
        return applicationapplicantod0;
    }

    public void setApplicationapplicantod0(Timestamp applicationapplicantod0) {
        this.applicationapplicantod0 = applicationapplicantod0;
    }

    private Timestamp applicationapplicantod1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONAPPLICANTOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getApplicationapplicantod1() {
        return applicationapplicantod1;
    }

    public void setApplicationapplicantod1(Timestamp applicationapplicantod1) {
        this.applicationapplicantod1 = applicationapplicantod1;
    }

    private String applicationapplicantom0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONAPPLICANTOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationapplicantom0() {
        return applicationapplicantom0;
    }

    public void setApplicationapplicantom0(String applicationapplicantom0) {
        this.applicationapplicantom0 = applicationapplicantom0;
    }

    private String applicationapplicantom1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONAPPLICANTOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationapplicantom1() {
        return applicationapplicantom1;
    }

    public void setApplicationapplicantom1(String applicationapplicantom1) {
        this.applicationapplicantom1 = applicationapplicantom1;
    }

    private String applicationapplicantot0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONAPPLICANTOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationapplicantot0() {
        return applicationapplicantot0;
    }

    public void setApplicationapplicantot0(String applicationapplicantot0) {
        this.applicationapplicantot0 = applicationapplicantot0;
    }

    private String applicationapplicantot1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONAPPLICANTOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationapplicantot1() {
        return applicationapplicantot1;
    }

    public void setApplicationapplicantot1(String applicationapplicantot1) {
        this.applicationapplicantot1 = applicationapplicantot1;
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

    private Integer applicationapplicantid;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONAPPLICANTID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getApplicationapplicantid() {
        return applicationapplicantid;
    }

    public void setApplicationapplicantid(Integer applicationapplicantid) {
        this.applicationapplicantid = applicationapplicantid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tblapplicationapplicant that = (Tblapplicationapplicant) o;

        if (personcode != that.personcode) return false;
        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (addresscode != null ? !addresscode.equals(that.addresscode) : that.addresscode != null)
            return false;
        if (applicationapplicantid != null ? !applicationapplicantid.equals(that.applicationapplicantid) : that.applicationapplicantid != null)
            return false;
        if (applicationapplicantod0 != null ? !applicationapplicantod0.equals(that.applicationapplicantod0) : that.applicationapplicantod0 != null)
            return false;
        if (applicationapplicantod1 != null ? !applicationapplicantod1.equals(that.applicationapplicantod1) : that.applicationapplicantod1 != null)
            return false;
        if (applicationapplicantom0 != null ? !applicationapplicantom0.equals(that.applicationapplicantom0) : that.applicationapplicantom0 != null)
            return false;
        if (applicationapplicantom1 != null ? !applicationapplicantom1.equals(that.applicationapplicantom1) : that.applicationapplicantom1 != null)
            return false;
        if (applicationapplicanton0 != null ? !applicationapplicanton0.equals(that.applicationapplicanton0) : that.applicationapplicanton0 != null)
            return false;
        if (applicationapplicanton1 != null ? !applicationapplicanton1.equals(that.applicationapplicanton1) : that.applicationapplicanton1 != null)
            return false;
        if (applicationapplicanton2 != null ? !applicationapplicanton2.equals(that.applicationapplicanton2) : that.applicationapplicanton2 != null)
            return false;
        if (applicationapplicantot0 != null ? !applicationapplicantot0.equals(that.applicationapplicantot0) : that.applicationapplicantot0 != null)
            return false;
        if (applicationapplicantot1 != null ? !applicationapplicantot1.equals(that.applicationapplicantot1) : that.applicationapplicantot1 != null)
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
        result = 31 * result + personcode;
        result = 31 * result + (addresscode != null ? addresscode.hashCode() : 0);
        result = 31 * result + (applicationapplicanton0 != null ? applicationapplicanton0.hashCode() : 0);
        result = 31 * result + (applicationapplicanton1 != null ? applicationapplicanton1.hashCode() : 0);
        result = 31 * result + (applicationapplicanton2 != null ? applicationapplicanton2.hashCode() : 0);
        result = 31 * result + (applicationapplicantod0 != null ? applicationapplicantod0.hashCode() : 0);
        result = 31 * result + (applicationapplicantod1 != null ? applicationapplicantod1.hashCode() : 0);
        result = 31 * result + (applicationapplicantom0 != null ? applicationapplicantom0.hashCode() : 0);
        result = 31 * result + (applicationapplicantom1 != null ? applicationapplicantom1.hashCode() : 0);
        result = 31 * result + (applicationapplicantot0 != null ? applicationapplicantot0.hashCode() : 0);
        result = 31 * result + (applicationapplicantot1 != null ? applicationapplicantot1.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        result = 31 * result + (applicationapplicantid != null ? applicationapplicantid.hashCode() : 0);
        return result;
    }
}
