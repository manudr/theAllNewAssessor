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
public class Tblacctcontact {
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

    private BigInteger primarycontactflag;

    @Basic
    @javax.persistence.Column(name = "PRIMARYCONTACTFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getPrimarycontactflag() {
        return primarycontactflag;
    }

    public void setPrimarycontactflag(BigInteger primarycontactflag) {
        this.primarycontactflag = primarycontactflag;
    }

    private BigDecimal acctcontacton0;

    @Basic
    @javax.persistence.Column(name = "ACCTCONTACTON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctcontacton0() {
        return acctcontacton0;
    }

    public void setAcctcontacton0(BigDecimal acctcontacton0) {
        this.acctcontacton0 = acctcontacton0;
    }

    private BigDecimal acctcontacton1;

    @Basic
    @javax.persistence.Column(name = "ACCTCONTACTON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctcontacton1() {
        return acctcontacton1;
    }

    public void setAcctcontacton1(BigDecimal acctcontacton1) {
        this.acctcontacton1 = acctcontacton1;
    }

    private BigDecimal acctcontacton2;

    @Basic
    @javax.persistence.Column(name = "ACCTCONTACTON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctcontacton2() {
        return acctcontacton2;
    }

    public void setAcctcontacton2(BigDecimal acctcontacton2) {
        this.acctcontacton2 = acctcontacton2;
    }

    private Timestamp acctcontactod0;

    @Basic
    @javax.persistence.Column(name = "ACCTCONTACTOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctcontactod0() {
        return acctcontactod0;
    }

    public void setAcctcontactod0(Timestamp acctcontactod0) {
        this.acctcontactod0 = acctcontactod0;
    }

    private Timestamp acctcontactod1;

    @Basic
    @javax.persistence.Column(name = "ACCTCONTACTOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctcontactod1() {
        return acctcontactod1;
    }

    public void setAcctcontactod1(Timestamp acctcontactod1) {
        this.acctcontactod1 = acctcontactod1;
    }

    private String acctcontactom0;

    @Basic
    @javax.persistence.Column(name = "ACCTCONTACTOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctcontactom0() {
        return acctcontactom0;
    }

    public void setAcctcontactom0(String acctcontactom0) {
        this.acctcontactom0 = acctcontactom0;
    }

    private String acctcontactom1;

    @Basic
    @javax.persistence.Column(name = "ACCTCONTACTOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctcontactom1() {
        return acctcontactom1;
    }

    public void setAcctcontactom1(String acctcontactom1) {
        this.acctcontactom1 = acctcontactom1;
    }

    private String acctcontactot0;

    @Basic
    @javax.persistence.Column(name = "ACCTCONTACTOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctcontactot0() {
        return acctcontactot0;
    }

    public void setAcctcontactot0(String acctcontactot0) {
        this.acctcontactot0 = acctcontactot0;
    }

    private String acctcontactot1;

    @Basic
    @javax.persistence.Column(name = "ACCTCONTACTOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctcontactot1() {
        return acctcontactot1;
    }

    public void setAcctcontactot1(String acctcontactot1) {
        this.acctcontactot1 = acctcontactot1;
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

    private int seqid;

    @Id
    @javax.persistence.Column(name = "SEQID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSeqid() {
        return seqid;
    }

    public void setSeqid(int seqid) {
        this.seqid = seqid;
    }

    private Integer contacttypeid;

    @Basic
    @javax.persistence.Column(name = "CONTACTTYPEID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getContacttypeid() {
        return contacttypeid;
    }

    public void setContacttypeid(Integer contacttypeid) {
        this.contacttypeid = contacttypeid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tblacctcontact that = (Tblacctcontact) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (personcode != that.personcode) return false;
        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null)
            return false;
        if (acctcontactod0 != null ? !acctcontactod0.equals(that.acctcontactod0) : that.acctcontactod0 != null)
            return false;
        if (acctcontactod1 != null ? !acctcontactod1.equals(that.acctcontactod1) : that.acctcontactod1 != null)
            return false;
        if (acctcontactom0 != null ? !acctcontactom0.equals(that.acctcontactom0) : that.acctcontactom0 != null)
            return false;
        if (acctcontactom1 != null ? !acctcontactom1.equals(that.acctcontactom1) : that.acctcontactom1 != null)
            return false;
        if (acctcontacton0 != null ? !acctcontacton0.equals(that.acctcontacton0) : that.acctcontacton0 != null)
            return false;
        if (acctcontacton1 != null ? !acctcontacton1.equals(that.acctcontacton1) : that.acctcontacton1 != null)
            return false;
        if (acctcontacton2 != null ? !acctcontacton2.equals(that.acctcontacton2) : that.acctcontacton2 != null)
            return false;
        if (acctcontactot0 != null ? !acctcontactot0.equals(that.acctcontactot0) : that.acctcontactot0 != null)
            return false;
        if (acctcontactot1 != null ? !acctcontactot1.equals(that.acctcontactot1) : that.acctcontactot1 != null)
            return false;
        if (addresscode != null ? !addresscode.equals(that.addresscode) : that.addresscode != null)
            return false;
        if (contacttypeid != null ? !contacttypeid.equals(that.contacttypeid) : that.contacttypeid != null)
            return false;
        if (primarycontactflag != null ? !primarycontactflag.equals(that.primarycontactflag) : that.primarycontactflag != null)
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
        result = 31 * result + personcode;
        result = 31 * result + (addresscode != null ? addresscode.hashCode() : 0);
        result = 31 * result + (primarycontactflag != null ? primarycontactflag.hashCode() : 0);
        result = 31 * result + (acctcontacton0 != null ? acctcontacton0.hashCode() : 0);
        result = 31 * result + (acctcontacton1 != null ? acctcontacton1.hashCode() : 0);
        result = 31 * result + (acctcontacton2 != null ? acctcontacton2.hashCode() : 0);
        result = 31 * result + (acctcontactod0 != null ? acctcontactod0.hashCode() : 0);
        result = 31 * result + (acctcontactod1 != null ? acctcontactod1.hashCode() : 0);
        result = 31 * result + (acctcontactom0 != null ? acctcontactom0.hashCode() : 0);
        result = 31 * result + (acctcontactom1 != null ? acctcontactom1.hashCode() : 0);
        result = 31 * result + (acctcontactot0 != null ? acctcontactot0.hashCode() : 0);
        result = 31 * result + (acctcontactot1 != null ? acctcontactot1.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        result = 31 * result + (contacttypeid != null ? contacttypeid.hashCode() : 0);
        return result;
    }
}
