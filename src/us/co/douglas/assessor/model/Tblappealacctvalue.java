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
public class Tblappealacctvalue {
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

    private BigDecimal estimatedvalue;

    @Basic
    @javax.persistence.Column(name = "ESTIMATEDVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getEstimatedvalue() {
        return estimatedvalue;
    }

    public void setEstimatedvalue(BigDecimal estimatedvalue) {
        this.estimatedvalue = estimatedvalue;
    }

    private BigDecimal initialreviewvalue;

    @Basic
    @javax.persistence.Column(name = "INITIALREVIEWVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getInitialreviewvalue() {
        return initialreviewvalue;
    }

    public void setInitialreviewvalue(BigDecimal initialreviewvalue) {
        this.initialreviewvalue = initialreviewvalue;
    }

    private BigDecimal finalreviewvalue;

    @Basic
    @javax.persistence.Column(name = "FINALREVIEWVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getFinalreviewvalue() {
        return finalreviewvalue;
    }

    public void setFinalreviewvalue(BigDecimal finalreviewvalue) {
        this.finalreviewvalue = finalreviewvalue;
    }

    private BigDecimal appealacctvalueon0;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTVALUEON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealacctvalueon0() {
        return appealacctvalueon0;
    }

    public void setAppealacctvalueon0(BigDecimal appealacctvalueon0) {
        this.appealacctvalueon0 = appealacctvalueon0;
    }

    private BigDecimal appealacctvalueon1;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTVALUEON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealacctvalueon1() {
        return appealacctvalueon1;
    }

    public void setAppealacctvalueon1(BigDecimal appealacctvalueon1) {
        this.appealacctvalueon1 = appealacctvalueon1;
    }

    private BigDecimal appealacctvalueon2;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTVALUEON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealacctvalueon2() {
        return appealacctvalueon2;
    }

    public void setAppealacctvalueon2(BigDecimal appealacctvalueon2) {
        this.appealacctvalueon2 = appealacctvalueon2;
    }

    private Timestamp appealacctvalueod0;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTVALUEOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getAppealacctvalueod0() {
        return appealacctvalueod0;
    }

    public void setAppealacctvalueod0(Timestamp appealacctvalueod0) {
        this.appealacctvalueod0 = appealacctvalueod0;
    }

    private Timestamp appealacctvalueod1;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTVALUEOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getAppealacctvalueod1() {
        return appealacctvalueod1;
    }

    public void setAppealacctvalueod1(Timestamp appealacctvalueod1) {
        this.appealacctvalueod1 = appealacctvalueod1;
    }

    private String appealacctvalueom0;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTVALUEOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealacctvalueom0() {
        return appealacctvalueom0;
    }

    public void setAppealacctvalueom0(String appealacctvalueom0) {
        this.appealacctvalueom0 = appealacctvalueom0;
    }

    private String appealacctvalueom1;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTVALUEOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealacctvalueom1() {
        return appealacctvalueom1;
    }

    public void setAppealacctvalueom1(String appealacctvalueom1) {
        this.appealacctvalueom1 = appealacctvalueom1;
    }

    private String appealacctvalueot0;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTVALUEOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealacctvalueot0() {
        return appealacctvalueot0;
    }

    public void setAppealacctvalueot0(String appealacctvalueot0) {
        this.appealacctvalueot0 = appealacctvalueot0;
    }

    private String appealacctvalueot1;

    @Basic
    @javax.persistence.Column(name = "APPEALACCTVALUEOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealacctvalueot1() {
        return appealacctvalueot1;
    }

    public void setAppealacctvalueot1(String appealacctvalueot1) {
        this.appealacctvalueot1 = appealacctvalueot1;
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

        Tblappealacctvalue that = (Tblappealacctvalue) o;

        if (appealno != that.appealno) return false;
        if (seqid != that.seqid) return false;
        if (taxyear != that.taxyear) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null)
            return false;
        if (appealacctvalueod0 != null ? !appealacctvalueod0.equals(that.appealacctvalueod0) : that.appealacctvalueod0 != null)
            return false;
        if (appealacctvalueod1 != null ? !appealacctvalueod1.equals(that.appealacctvalueod1) : that.appealacctvalueod1 != null)
            return false;
        if (appealacctvalueom0 != null ? !appealacctvalueom0.equals(that.appealacctvalueom0) : that.appealacctvalueom0 != null)
            return false;
        if (appealacctvalueom1 != null ? !appealacctvalueom1.equals(that.appealacctvalueom1) : that.appealacctvalueom1 != null)
            return false;
        if (appealacctvalueon0 != null ? !appealacctvalueon0.equals(that.appealacctvalueon0) : that.appealacctvalueon0 != null)
            return false;
        if (appealacctvalueon1 != null ? !appealacctvalueon1.equals(that.appealacctvalueon1) : that.appealacctvalueon1 != null)
            return false;
        if (appealacctvalueon2 != null ? !appealacctvalueon2.equals(that.appealacctvalueon2) : that.appealacctvalueon2 != null)
            return false;
        if (appealacctvalueot0 != null ? !appealacctvalueot0.equals(that.appealacctvalueot0) : that.appealacctvalueot0 != null)
            return false;
        if (appealacctvalueot1 != null ? !appealacctvalueot1.equals(that.appealacctvalueot1) : that.appealacctvalueot1 != null)
            return false;
        if (estimatedvalue != null ? !estimatedvalue.equals(that.estimatedvalue) : that.estimatedvalue != null)
            return false;
        if (finalreviewvalue != null ? !finalreviewvalue.equals(that.finalreviewvalue) : that.finalreviewvalue != null)
            return false;
        if (initialreviewvalue != null ? !initialreviewvalue.equals(that.initialreviewvalue) : that.initialreviewvalue != null)
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
        result = 31 * result + (estimatedvalue != null ? estimatedvalue.hashCode() : 0);
        result = 31 * result + (initialreviewvalue != null ? initialreviewvalue.hashCode() : 0);
        result = 31 * result + (finalreviewvalue != null ? finalreviewvalue.hashCode() : 0);
        result = 31 * result + (appealacctvalueon0 != null ? appealacctvalueon0.hashCode() : 0);
        result = 31 * result + (appealacctvalueon1 != null ? appealacctvalueon1.hashCode() : 0);
        result = 31 * result + (appealacctvalueon2 != null ? appealacctvalueon2.hashCode() : 0);
        result = 31 * result + (appealacctvalueod0 != null ? appealacctvalueod0.hashCode() : 0);
        result = 31 * result + (appealacctvalueod1 != null ? appealacctvalueod1.hashCode() : 0);
        result = 31 * result + (appealacctvalueom0 != null ? appealacctvalueom0.hashCode() : 0);
        result = 31 * result + (appealacctvalueom1 != null ? appealacctvalueom1.hashCode() : 0);
        result = 31 * result + (appealacctvalueot0 != null ? appealacctvalueot0.hashCode() : 0);
        result = 31 * result + (appealacctvalueot1 != null ? appealacctvalueot1.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
