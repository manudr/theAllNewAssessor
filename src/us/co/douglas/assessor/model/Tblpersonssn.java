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
public class Tblpersonssn {
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

    private int personcode;

    @Basic
    @javax.persistence.Column(name = "PERSONCODE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getPersoncode() {
        return personcode;
    }

    public void setPersoncode(int personcode) {
        this.personcode = personcode;
    }

    private String ssn;

    @Basic
    @javax.persistence.Column(name = "SSN", nullable = false, insertable = true, updatable = true, length = 15)
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
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

    private BigDecimal personssnon0;

    @Basic
    @javax.persistence.Column(name = "PERSONSSNON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getPersonssnon0() {
        return personssnon0;
    }

    public void setPersonssnon0(BigDecimal personssnon0) {
        this.personssnon0 = personssnon0;
    }

    private BigDecimal personssnon1;

    @Basic
    @javax.persistence.Column(name = "PERSONSSNON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getPersonssnon1() {
        return personssnon1;
    }

    public void setPersonssnon1(BigDecimal personssnon1) {
        this.personssnon1 = personssnon1;
    }

    private BigDecimal personssnon2;

    @Basic
    @javax.persistence.Column(name = "PERSONSSNON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getPersonssnon2() {
        return personssnon2;
    }

    public void setPersonssnon2(BigDecimal personssnon2) {
        this.personssnon2 = personssnon2;
    }

    private Timestamp personssnod0;

    @Basic
    @javax.persistence.Column(name = "PERSONSSNOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getPersonssnod0() {
        return personssnod0;
    }

    public void setPersonssnod0(Timestamp personssnod0) {
        this.personssnod0 = personssnod0;
    }

    private Timestamp personssnod1;

    @Basic
    @javax.persistence.Column(name = "PERSONSSNOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getPersonssnod1() {
        return personssnod1;
    }

    public void setPersonssnod1(Timestamp personssnod1) {
        this.personssnod1 = personssnod1;
    }

    private String personssnom0;

    @Basic
    @javax.persistence.Column(name = "PERSONSSNOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPersonssnom0() {
        return personssnom0;
    }

    public void setPersonssnom0(String personssnom0) {
        this.personssnom0 = personssnom0;
    }

    private String personssnom1;

    @Basic
    @javax.persistence.Column(name = "PERSONSSNOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPersonssnom1() {
        return personssnom1;
    }

    public void setPersonssnom1(String personssnom1) {
        this.personssnom1 = personssnom1;
    }

    private String personssnot0;

    @Basic
    @javax.persistence.Column(name = "PERSONSSNOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPersonssnot0() {
        return personssnot0;
    }

    public void setPersonssnot0(String personssnot0) {
        this.personssnot0 = personssnot0;
    }

    private String personssnot1;

    @Basic
    @javax.persistence.Column(name = "PERSONSSNOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPersonssnot1() {
        return personssnot1;
    }

    public void setPersonssnot1(String personssnot1) {
        this.personssnot1 = personssnot1;
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

        Tblpersonssn that = (Tblpersonssn) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (personcode != that.personcode) return false;
        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (personssnod0 != null ? !personssnod0.equals(that.personssnod0) : that.personssnod0 != null)
            return false;
        if (personssnod1 != null ? !personssnod1.equals(that.personssnod1) : that.personssnod1 != null)
            return false;
        if (personssnom0 != null ? !personssnom0.equals(that.personssnom0) : that.personssnom0 != null)
            return false;
        if (personssnom1 != null ? !personssnom1.equals(that.personssnom1) : that.personssnom1 != null)
            return false;
        if (personssnon0 != null ? !personssnon0.equals(that.personssnon0) : that.personssnon0 != null)
            return false;
        if (personssnon1 != null ? !personssnon1.equals(that.personssnon1) : that.personssnon1 != null)
            return false;
        if (personssnon2 != null ? !personssnon2.equals(that.personssnon2) : that.personssnon2 != null)
            return false;
        if (personssnot0 != null ? !personssnot0.equals(that.personssnot0) : that.personssnot0 != null)
            return false;
        if (personssnot1 != null ? !personssnot1.equals(that.personssnot1) : that.personssnot1 != null)
            return false;
        if (ssn != null ? !ssn.equals(that.ssn) : that.ssn != null)
            return false;
        if (writedate != null ? !writedate.equals(that.writedate) : that.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + personcode;
        result = 31 * result + (ssn != null ? ssn.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + (personssnon0 != null ? personssnon0.hashCode() : 0);
        result = 31 * result + (personssnon1 != null ? personssnon1.hashCode() : 0);
        result = 31 * result + (personssnon2 != null ? personssnon2.hashCode() : 0);
        result = 31 * result + (personssnod0 != null ? personssnod0.hashCode() : 0);
        result = 31 * result + (personssnod1 != null ? personssnod1.hashCode() : 0);
        result = 31 * result + (personssnom0 != null ? personssnom0.hashCode() : 0);
        result = 31 * result + (personssnom1 != null ? personssnom1.hashCode() : 0);
        result = 31 * result + (personssnot0 != null ? personssnot0.hashCode() : 0);
        result = 31 * result + (personssnot1 != null ? personssnot1.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
