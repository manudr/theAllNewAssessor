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
public class Tblappealacct {
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

    private int taxyear;

    @Basic
    @javax.persistence.Column(name = "TAXYEAR", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getTaxyear() {
        return taxyear;
    }

    public void setTaxyear(int taxyear) {
        this.taxyear = taxyear;
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

    private String accountno;

    @Basic
    @javax.persistence.Column(name = "ACCOUNTNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    private String appealcomment;

    @Basic
    @javax.persistence.Column(name = "APPEALCOMMENT", nullable = true, insertable = true, updatable = true, length = 255)
    public String getAppealcomment() {
        return appealcomment;
    }

    public void setAppealcomment(String appealcomment) {
        this.appealcomment = appealcomment;
    }

    private BigDecimal appealaccountendvalue;

    @Basic
    @javax.persistence.Column(name = "APPEALACCOUNTENDVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAppealaccountendvalue() {
        return appealaccountendvalue;
    }

    public void setAppealaccountendvalue(BigDecimal appealaccountendvalue) {
        this.appealaccountendvalue = appealaccountendvalue;
    }

    private BigDecimal appealaccton0;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealaccton0() {
        return appealaccton0;
    }

    public void setAppealaccton0(BigDecimal appealaccton0) {
        this.appealaccton0 = appealaccton0;
    }

    private BigDecimal appealaccton1;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealaccton1() {
        return appealaccton1;
    }

    public void setAppealaccton1(BigDecimal appealaccton1) {
        this.appealaccton1 = appealaccton1;
    }

    private BigDecimal appealaccton2;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealaccton2() {
        return appealaccton2;
    }

    public void setAppealaccton2(BigDecimal appealaccton2) {
        this.appealaccton2 = appealaccton2;
    }

    private Timestamp appealacctod0;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getAppealacctod0() {
        return appealacctod0;
    }

    public void setAppealacctod0(Timestamp appealacctod0) {
        this.appealacctod0 = appealacctod0;
    }

    private Timestamp appealacctod1;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getAppealacctod1() {
        return appealacctod1;
    }

    public void setAppealacctod1(Timestamp appealacctod1) {
        this.appealacctod1 = appealacctod1;
    }

    private String appealacctom0;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealacctom0() {
        return appealacctom0;
    }

    public void setAppealacctom0(String appealacctom0) {
        this.appealacctom0 = appealacctom0;
    }

    private String appealacctom1;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealacctom1() {
        return appealacctom1;
    }

    public void setAppealacctom1(String appealacctom1) {
        this.appealacctom1 = appealacctom1;
    }

    private String appealacctot0;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealacctot0() {
        return appealacctot0;
    }

    public void setAppealacctot0(String appealacctot0) {
        this.appealacctot0 = appealacctot0;
    }

    private String appealacctot1;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealacctot1() {
        return appealacctot1;
    }

    public void setAppealacctot1(String appealacctot1) {
        this.appealacctot1 = appealacctot1;
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

    private BigDecimal beginningaccountvalue;

    @Basic
    @javax.persistence.Column(name = "BEGINNINGACCOUNTVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getBeginningaccountvalue() {
        return beginningaccountvalue;
    }

    public void setBeginningaccountvalue(BigDecimal beginningaccountvalue) {
        this.beginningaccountvalue = beginningaccountvalue;
    }

    private String appealdecision;

    @Basic
    @javax.persistence.Column(name = "APPEALDECISION", nullable = true, insertable = true, updatable = true, length = 30)
    public String getAppealdecision() {
        return appealdecision;
    }

    public void setAppealdecision(String appealdecision) {
        this.appealdecision = appealdecision;
    }

    private String appealacctreasondesc;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTREASONDESC", nullable = true, insertable = true, updatable = true, length = 1000)
    public String getAppealacctreasondesc() {
        return appealacctreasondesc;
    }

    public void setAppealacctreasondesc(String appealacctreasondesc) {
        this.appealacctreasondesc = appealacctreasondesc;
    }

    private BigDecimal addboardappealendvalue;

    @Basic
    @javax.persistence.Column(name = "ADDBOARDAPPEALENDVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAddboardappealendvalue() {
        return addboardappealendvalue;
    }

    public void setAddboardappealendvalue(BigDecimal addboardappealendvalue) {
        this.addboardappealendvalue = addboardappealendvalue;
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

        Tblappealacct that = (Tblappealacct) o;

        if (appealno != that.appealno) return false;
        if (seqid != that.seqid) return false;
        if (taxyear != that.taxyear) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null)
            return false;
        if (addboardappealendvalue != null ? !addboardappealendvalue.equals(that.addboardappealendvalue) : that.addboardappealendvalue != null)
            return false;
        if (appealaccountendvalue != null ? !appealaccountendvalue.equals(that.appealaccountendvalue) : that.appealaccountendvalue != null)
            return false;
        if (appealacctod0 != null ? !appealacctod0.equals(that.appealacctod0) : that.appealacctod0 != null)
            return false;
        if (appealacctod1 != null ? !appealacctod1.equals(that.appealacctod1) : that.appealacctod1 != null)
            return false;
        if (appealacctom0 != null ? !appealacctom0.equals(that.appealacctom0) : that.appealacctom0 != null)
            return false;
        if (appealacctom1 != null ? !appealacctom1.equals(that.appealacctom1) : that.appealacctom1 != null)
            return false;
        if (appealaccton0 != null ? !appealaccton0.equals(that.appealaccton0) : that.appealaccton0 != null)
            return false;
        if (appealaccton1 != null ? !appealaccton1.equals(that.appealaccton1) : that.appealaccton1 != null)
            return false;
        if (appealaccton2 != null ? !appealaccton2.equals(that.appealaccton2) : that.appealaccton2 != null)
            return false;
        if (appealacctot0 != null ? !appealacctot0.equals(that.appealacctot0) : that.appealacctot0 != null)
            return false;
        if (appealacctot1 != null ? !appealacctot1.equals(that.appealacctot1) : that.appealacctot1 != null)
            return false;
        if (appealacctreasondesc != null ? !appealacctreasondesc.equals(that.appealacctreasondesc) : that.appealacctreasondesc != null)
            return false;
        if (appealcomment != null ? !appealcomment.equals(that.appealcomment) : that.appealcomment != null)
            return false;
        if (appealdecision != null ? !appealdecision.equals(that.appealdecision) : that.appealdecision != null)
            return false;
        if (beginningaccountvalue != null ? !beginningaccountvalue.equals(that.beginningaccountvalue) : that.beginningaccountvalue != null)
            return false;
        if (writedate != null ? !writedate.equals(that.writedate) : that.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + taxyear;
        result = 31 * result + appealno;
        result = 31 * result + (accountno != null ? accountno.hashCode() : 0);
        result = 31 * result + (appealcomment != null ? appealcomment.hashCode() : 0);
        result = 31 * result + (appealaccountendvalue != null ? appealaccountendvalue.hashCode() : 0);
        result = 31 * result + (appealaccton0 != null ? appealaccton0.hashCode() : 0);
        result = 31 * result + (appealaccton1 != null ? appealaccton1.hashCode() : 0);
        result = 31 * result + (appealaccton2 != null ? appealaccton2.hashCode() : 0);
        result = 31 * result + (appealacctod0 != null ? appealacctod0.hashCode() : 0);
        result = 31 * result + (appealacctod1 != null ? appealacctod1.hashCode() : 0);
        result = 31 * result + (appealacctom0 != null ? appealacctom0.hashCode() : 0);
        result = 31 * result + (appealacctom1 != null ? appealacctom1.hashCode() : 0);
        result = 31 * result + (appealacctot0 != null ? appealacctot0.hashCode() : 0);
        result = 31 * result + (appealacctot1 != null ? appealacctot1.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + (beginningaccountvalue != null ? beginningaccountvalue.hashCode() : 0);
        result = 31 * result + (appealdecision != null ? appealdecision.hashCode() : 0);
        result = 31 * result + (appealacctreasondesc != null ? appealacctreasondesc.hashCode() : 0);
        result = 31 * result + (addboardappealendvalue != null ? addboardappealendvalue.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
