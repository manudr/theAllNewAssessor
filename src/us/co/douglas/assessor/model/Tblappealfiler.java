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
public class Tblappealfiler {
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

    private int appealno;

    @Basic
    @javax.persistence.Column(name = "APPEALNO", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getAppealno() {
        return appealno;
    }

    public void setAppealno(int appealno) {
        this.appealno = appealno;
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

    private int addresscode;

    @Basic
    @javax.persistence.Column(name = "ADDRESSCODE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getAddresscode() {
        return addresscode;
    }

    public void setAddresscode(int addresscode) {
        this.addresscode = addresscode;
    }

    private BigDecimal appealfileron0;

    @Basic
    @javax.persistence.Column(name = "APPEALFILERON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealfileron0() {
        return appealfileron0;
    }

    public void setAppealfileron0(BigDecimal appealfileron0) {
        this.appealfileron0 = appealfileron0;
    }

    private BigDecimal appealfileron1;

    @Basic
    @javax.persistence.Column(name = "APPEALFILERON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealfileron1() {
        return appealfileron1;
    }

    public void setAppealfileron1(BigDecimal appealfileron1) {
        this.appealfileron1 = appealfileron1;
    }

    private BigDecimal appealfileron2;

    @Basic
    @javax.persistence.Column(name = "APPEALFILERON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealfileron2() {
        return appealfileron2;
    }

    public void setAppealfileron2(BigDecimal appealfileron2) {
        this.appealfileron2 = appealfileron2;
    }

    private String appealfilerot0;

    @Basic
    @javax.persistence.Column(name = "APPEALFILEROT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealfilerot0() {
        return appealfilerot0;
    }

    public void setAppealfilerot0(String appealfilerot0) {
        this.appealfilerot0 = appealfilerot0;
    }

    private String appealfilerot1;

    @Basic
    @javax.persistence.Column(name = "APPEALFILEROT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealfilerot1() {
        return appealfilerot1;
    }

    public void setAppealfilerot1(String appealfilerot1) {
        this.appealfilerot1 = appealfilerot1;
    }

    private Timestamp appealfilerod0;

    @Basic
    @javax.persistence.Column(name = "APPEALFILEROD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getAppealfilerod0() {
        return appealfilerod0;
    }

    public void setAppealfilerod0(Timestamp appealfilerod0) {
        this.appealfilerod0 = appealfilerod0;
    }

    private Timestamp appealfilerod1;

    @Basic
    @javax.persistence.Column(name = "APPEALFILEROD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getAppealfilerod1() {
        return appealfilerod1;
    }

    public void setAppealfilerod1(Timestamp appealfilerod1) {
        this.appealfilerod1 = appealfilerod1;
    }

    private String appealfilerom0;

    @Basic
    @javax.persistence.Column(name = "APPEALFILEROM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealfilerom0() {
        return appealfilerom0;
    }

    public void setAppealfilerom0(String appealfilerom0) {
        this.appealfilerom0 = appealfilerom0;
    }

    private String appealfilerom1;

    @Basic
    @javax.persistence.Column(name = "APPEALFILEROM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealfilerom1() {
        return appealfilerom1;
    }

    public void setAppealfilerom1(String appealfilerom1) {
        this.appealfilerom1 = appealfilerom1;
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

    private String emailaddress;

    @Basic
    @javax.persistence.Column(name = "EMAILADDRESS", nullable = true, insertable = true, updatable = true, length = 100)
    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    private String phone;

    @Basic
    @javax.persistence.Column(name = "PHONE", nullable = true, insertable = true, updatable = true, length = 18)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

        Tblappealfiler that = (Tblappealfiler) o;

        if (addresscode != that.addresscode) return false;
        if (appealno != that.appealno) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (personcode != that.personcode) return false;
        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (appealfilerod0 != null ? !appealfilerod0.equals(that.appealfilerod0) : that.appealfilerod0 != null)
            return false;
        if (appealfilerod1 != null ? !appealfilerod1.equals(that.appealfilerod1) : that.appealfilerod1 != null)
            return false;
        if (appealfilerom0 != null ? !appealfilerom0.equals(that.appealfilerom0) : that.appealfilerom0 != null)
            return false;
        if (appealfilerom1 != null ? !appealfilerom1.equals(that.appealfilerom1) : that.appealfilerom1 != null)
            return false;
        if (appealfileron0 != null ? !appealfileron0.equals(that.appealfileron0) : that.appealfileron0 != null)
            return false;
        if (appealfileron1 != null ? !appealfileron1.equals(that.appealfileron1) : that.appealfileron1 != null)
            return false;
        if (appealfileron2 != null ? !appealfileron2.equals(that.appealfileron2) : that.appealfileron2 != null)
            return false;
        if (appealfilerot0 != null ? !appealfilerot0.equals(that.appealfilerot0) : that.appealfilerot0 != null)
            return false;
        if (appealfilerot1 != null ? !appealfilerot1.equals(that.appealfilerot1) : that.appealfilerot1 != null)
            return false;
        if (emailaddress != null ? !emailaddress.equals(that.emailaddress) : that.emailaddress != null)
            return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null)
            return false;
        if (writedate != null ? !writedate.equals(that.writedate) : that.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + appealno;
        result = 31 * result + personcode;
        result = 31 * result + addresscode;
        result = 31 * result + (appealfileron0 != null ? appealfileron0.hashCode() : 0);
        result = 31 * result + (appealfileron1 != null ? appealfileron1.hashCode() : 0);
        result = 31 * result + (appealfileron2 != null ? appealfileron2.hashCode() : 0);
        result = 31 * result + (appealfilerot0 != null ? appealfilerot0.hashCode() : 0);
        result = 31 * result + (appealfilerot1 != null ? appealfilerot1.hashCode() : 0);
        result = 31 * result + (appealfilerod0 != null ? appealfilerod0.hashCode() : 0);
        result = 31 * result + (appealfilerod1 != null ? appealfilerod1.hashCode() : 0);
        result = 31 * result + (appealfilerom0 != null ? appealfilerom0.hashCode() : 0);
        result = 31 * result + (appealfilerom1 != null ? appealfilerom1.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + (emailaddress != null ? emailaddress.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
