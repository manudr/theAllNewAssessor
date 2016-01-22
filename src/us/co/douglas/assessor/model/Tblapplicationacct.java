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
public class Tblapplicationacct {
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

    private String applicationrecordno;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONRECORDNO", nullable = false, insertable = true, updatable = true, length = 15)
    public String getApplicationrecordno() {
        return applicationrecordno;
    }

    public void setApplicationrecordno(String applicationrecordno) {
        this.applicationrecordno = applicationrecordno;
    }

    private BigInteger appprimaryaccountflag;

    @Basic
    @javax.persistence.Column(name = "APPPRIMARYACCOUNTFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getAppprimaryaccountflag() {
        return appprimaryaccountflag;
    }

    public void setAppprimaryaccountflag(BigInteger appprimaryaccountflag) {
        this.appprimaryaccountflag = appprimaryaccountflag;
    }

    private Timestamp applicationacctod0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONACCTOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getApplicationacctod0() {
        return applicationacctod0;
    }

    public void setApplicationacctod0(Timestamp applicationacctod0) {
        this.applicationacctod0 = applicationacctod0;
    }

    private Timestamp applicationacctod1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONACCTOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getApplicationacctod1() {
        return applicationacctod1;
    }

    public void setApplicationacctod1(Timestamp applicationacctod1) {
        this.applicationacctod1 = applicationacctod1;
    }

    private String applicationacctom0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONACCTOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationacctom0() {
        return applicationacctom0;
    }

    public void setApplicationacctom0(String applicationacctom0) {
        this.applicationacctom0 = applicationacctom0;
    }

    private String applicationacctom1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONACCTOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationacctom1() {
        return applicationacctom1;
    }

    public void setApplicationacctom1(String applicationacctom1) {
        this.applicationacctom1 = applicationacctom1;
    }

    private String applicationacctot0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONACCTOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationacctot0() {
        return applicationacctot0;
    }

    public void setApplicationacctot0(String applicationacctot0) {
        this.applicationacctot0 = applicationacctot0;
    }

    private String applicationacctot1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONACCTOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationacctot1() {
        return applicationacctot1;
    }

    public void setApplicationacctot1(String applicationacctot1) {
        this.applicationacctot1 = applicationacctot1;
    }

    private BigDecimal applicationaccton0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONACCTON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getApplicationaccton0() {
        return applicationaccton0;
    }

    public void setApplicationaccton0(BigDecimal applicationaccton0) {
        this.applicationaccton0 = applicationaccton0;
    }

    private BigDecimal applicationaccton1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONACCTON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getApplicationaccton1() {
        return applicationaccton1;
    }

    public void setApplicationaccton1(BigDecimal applicationaccton1) {
        this.applicationaccton1 = applicationaccton1;
    }

    private BigDecimal applicationaccton2;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONACCTON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getApplicationaccton2() {
        return applicationaccton2;
    }

    public void setApplicationaccton2(BigDecimal applicationaccton2) {
        this.applicationaccton2 = applicationaccton2;
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

        Tblapplicationacct that = (Tblapplicationacct) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null)
            return false;
        if (applicationacctod0 != null ? !applicationacctod0.equals(that.applicationacctod0) : that.applicationacctod0 != null)
            return false;
        if (applicationacctod1 != null ? !applicationacctod1.equals(that.applicationacctod1) : that.applicationacctod1 != null)
            return false;
        if (applicationacctom0 != null ? !applicationacctom0.equals(that.applicationacctom0) : that.applicationacctom0 != null)
            return false;
        if (applicationacctom1 != null ? !applicationacctom1.equals(that.applicationacctom1) : that.applicationacctom1 != null)
            return false;
        if (applicationaccton0 != null ? !applicationaccton0.equals(that.applicationaccton0) : that.applicationaccton0 != null)
            return false;
        if (applicationaccton1 != null ? !applicationaccton1.equals(that.applicationaccton1) : that.applicationaccton1 != null)
            return false;
        if (applicationaccton2 != null ? !applicationaccton2.equals(that.applicationaccton2) : that.applicationaccton2 != null)
            return false;
        if (applicationacctot0 != null ? !applicationacctot0.equals(that.applicationacctot0) : that.applicationacctot0 != null)
            return false;
        if (applicationacctot1 != null ? !applicationacctot1.equals(that.applicationacctot1) : that.applicationacctot1 != null)
            return false;
        if (applicationrecordno != null ? !applicationrecordno.equals(that.applicationrecordno) : that.applicationrecordno != null)
            return false;
        if (appprimaryaccountflag != null ? !appprimaryaccountflag.equals(that.appprimaryaccountflag) : that.appprimaryaccountflag != null)
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
        result = 31 * result + (applicationrecordno != null ? applicationrecordno.hashCode() : 0);
        result = 31 * result + (appprimaryaccountflag != null ? appprimaryaccountflag.hashCode() : 0);
        result = 31 * result + (applicationacctod0 != null ? applicationacctod0.hashCode() : 0);
        result = 31 * result + (applicationacctod1 != null ? applicationacctod1.hashCode() : 0);
        result = 31 * result + (applicationacctom0 != null ? applicationacctom0.hashCode() : 0);
        result = 31 * result + (applicationacctom1 != null ? applicationacctom1.hashCode() : 0);
        result = 31 * result + (applicationacctot0 != null ? applicationacctot0.hashCode() : 0);
        result = 31 * result + (applicationacctot1 != null ? applicationacctot1.hashCode() : 0);
        result = 31 * result + (applicationaccton0 != null ? applicationaccton0.hashCode() : 0);
        result = 31 * result + (applicationaccton1 != null ? applicationaccton1.hashCode() : 0);
        result = 31 * result + (applicationaccton2 != null ? applicationaccton2.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
