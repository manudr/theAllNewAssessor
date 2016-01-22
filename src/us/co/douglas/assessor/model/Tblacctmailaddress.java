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
public class Tblacctmailaddress {
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

    private String incareof;

    @Basic
    @javax.persistence.Column(name = "INCAREOF", nullable = true, insertable = true, updatable = true, length = 60)
    public String getIncareof() {
        return incareof;
    }

    public void setIncareof(String incareof) {
        this.incareof = incareof;
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

    private BigInteger monthfrom;

    @Basic
    @javax.persistence.Column(name = "MONTHFROM", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getMonthfrom() {
        return monthfrom;
    }

    public void setMonthfrom(BigInteger monthfrom) {
        this.monthfrom = monthfrom;
    }

    private BigInteger dayfrom;

    @Basic
    @javax.persistence.Column(name = "DAYFROM", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getDayfrom() {
        return dayfrom;
    }

    public void setDayfrom(BigInteger dayfrom) {
        this.dayfrom = dayfrom;
    }

    private BigInteger monthto;

    @Basic
    @javax.persistence.Column(name = "MONTHTO", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getMonthto() {
        return monthto;
    }

    public void setMonthto(BigInteger monthto) {
        this.monthto = monthto;
    }

    private BigInteger dayto;

    @Basic
    @javax.persistence.Column(name = "DAYTO", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getDayto() {
        return dayto;
    }

    public void setDayto(BigInteger dayto) {
        this.dayto = dayto;
    }

    private BigDecimal acctmailaddresson0;

    @Basic
    @javax.persistence.Column(name = "ACCTMAILADDRESSON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctmailaddresson0() {
        return acctmailaddresson0;
    }

    public void setAcctmailaddresson0(BigDecimal acctmailaddresson0) {
        this.acctmailaddresson0 = acctmailaddresson0;
    }

    private BigDecimal acctmailaddresson1;

    @Basic
    @javax.persistence.Column(name = "ACCTMAILADDRESSON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctmailaddresson1() {
        return acctmailaddresson1;
    }

    public void setAcctmailaddresson1(BigDecimal acctmailaddresson1) {
        this.acctmailaddresson1 = acctmailaddresson1;
    }

    private BigDecimal acctmailaddresson2;

    @Basic
    @javax.persistence.Column(name = "ACCTMAILADDRESSON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctmailaddresson2() {
        return acctmailaddresson2;
    }

    public void setAcctmailaddresson2(BigDecimal acctmailaddresson2) {
        this.acctmailaddresson2 = acctmailaddresson2;
    }

    private Timestamp acctmailaddressod0;

    @Basic
    @javax.persistence.Column(name = "ACCTMAILADDRESSOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctmailaddressod0() {
        return acctmailaddressod0;
    }

    public void setAcctmailaddressod0(Timestamp acctmailaddressod0) {
        this.acctmailaddressod0 = acctmailaddressod0;
    }

    private Timestamp acctmailaddressod1;

    @Basic
    @javax.persistence.Column(name = "ACCTMAILADDRESSOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctmailaddressod1() {
        return acctmailaddressod1;
    }

    public void setAcctmailaddressod1(Timestamp acctmailaddressod1) {
        this.acctmailaddressod1 = acctmailaddressod1;
    }

    private String acctmailaddressom0;

    @Basic
    @javax.persistence.Column(name = "ACCTMAILADDRESSOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctmailaddressom0() {
        return acctmailaddressom0;
    }

    public void setAcctmailaddressom0(String acctmailaddressom0) {
        this.acctmailaddressom0 = acctmailaddressom0;
    }

    private String acctmailaddressom1;

    @Basic
    @javax.persistence.Column(name = "ACCTMAILADDRESSOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctmailaddressom1() {
        return acctmailaddressom1;
    }

    public void setAcctmailaddressom1(String acctmailaddressom1) {
        this.acctmailaddressom1 = acctmailaddressom1;
    }

    private String acctmailaddressot0;

    @Basic
    @javax.persistence.Column(name = "ACCTMAILADDRESSOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctmailaddressot0() {
        return acctmailaddressot0;
    }

    public void setAcctmailaddressot0(String acctmailaddressot0) {
        this.acctmailaddressot0 = acctmailaddressot0;
    }

    private String acctmailaddressot1;

    @Basic
    @javax.persistence.Column(name = "ACCTMAILADDRESSOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctmailaddressot1() {
        return acctmailaddressot1;
    }

    public void setAcctmailaddressot1(String acctmailaddressot1) {
        this.acctmailaddressot1 = acctmailaddressot1;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tblacctmailaddress that = (Tblacctmailaddress) o;

        if (addresscode != that.addresscode) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (personcode != that.personcode) return false;
        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null)
            return false;
        if (acctmailaddressod0 != null ? !acctmailaddressod0.equals(that.acctmailaddressod0) : that.acctmailaddressod0 != null)
            return false;
        if (acctmailaddressod1 != null ? !acctmailaddressod1.equals(that.acctmailaddressod1) : that.acctmailaddressod1 != null)
            return false;
        if (acctmailaddressom0 != null ? !acctmailaddressom0.equals(that.acctmailaddressom0) : that.acctmailaddressom0 != null)
            return false;
        if (acctmailaddressom1 != null ? !acctmailaddressom1.equals(that.acctmailaddressom1) : that.acctmailaddressom1 != null)
            return false;
        if (acctmailaddresson0 != null ? !acctmailaddresson0.equals(that.acctmailaddresson0) : that.acctmailaddresson0 != null)
            return false;
        if (acctmailaddresson1 != null ? !acctmailaddresson1.equals(that.acctmailaddresson1) : that.acctmailaddresson1 != null)
            return false;
        if (acctmailaddresson2 != null ? !acctmailaddresson2.equals(that.acctmailaddresson2) : that.acctmailaddresson2 != null)
            return false;
        if (acctmailaddressot0 != null ? !acctmailaddressot0.equals(that.acctmailaddressot0) : that.acctmailaddressot0 != null)
            return false;
        if (acctmailaddressot1 != null ? !acctmailaddressot1.equals(that.acctmailaddressot1) : that.acctmailaddressot1 != null)
            return false;
        if (dayfrom != null ? !dayfrom.equals(that.dayfrom) : that.dayfrom != null)
            return false;
        if (dayto != null ? !dayto.equals(that.dayto) : that.dayto != null)
            return false;
        if (incareof != null ? !incareof.equals(that.incareof) : that.incareof != null)
            return false;
        if (monthfrom != null ? !monthfrom.equals(that.monthfrom) : that.monthfrom != null)
            return false;
        if (monthto != null ? !monthto.equals(that.monthto) : that.monthto != null)
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
        result = 31 * result + (incareof != null ? incareof.hashCode() : 0);
        result = 31 * result + addresscode;
        result = 31 * result + (monthfrom != null ? monthfrom.hashCode() : 0);
        result = 31 * result + (dayfrom != null ? dayfrom.hashCode() : 0);
        result = 31 * result + (monthto != null ? monthto.hashCode() : 0);
        result = 31 * result + (dayto != null ? dayto.hashCode() : 0);
        result = 31 * result + (acctmailaddresson0 != null ? acctmailaddresson0.hashCode() : 0);
        result = 31 * result + (acctmailaddresson1 != null ? acctmailaddresson1.hashCode() : 0);
        result = 31 * result + (acctmailaddresson2 != null ? acctmailaddresson2.hashCode() : 0);
        result = 31 * result + (acctmailaddressod0 != null ? acctmailaddressod0.hashCode() : 0);
        result = 31 * result + (acctmailaddressod1 != null ? acctmailaddressod1.hashCode() : 0);
        result = 31 * result + (acctmailaddressom0 != null ? acctmailaddressom0.hashCode() : 0);
        result = 31 * result + (acctmailaddressom1 != null ? acctmailaddressom1.hashCode() : 0);
        result = 31 * result + (acctmailaddressot0 != null ? acctmailaddressot0.hashCode() : 0);
        result = 31 * result + (acctmailaddressot1 != null ? acctmailaddressot1.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
