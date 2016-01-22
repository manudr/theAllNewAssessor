package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/18/15.
 */
@Entity
@javax.persistence.Table(name = "TBLACCTADJUSTMENTABSTRACT", schema = "ENCOMPASS")
public class TblacctadjustmentabstractEntity {
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

    private int adjustmentdetailid;

    @Basic
    @javax.persistence.Column(name = "ADJUSTMENTDETAILID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getAdjustmentdetailid() {
        return adjustmentdetailid;
    }

    public void setAdjustmentdetailid(int adjustmentdetailid) {
        this.adjustmentdetailid = adjustmentdetailid;
    }

    private BigDecimal acctadjustmentabstracton0;

    @Basic
    @javax.persistence.Column(name = "ACCTADJUSTMENTABSTRACTON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctadjustmentabstracton0() {
        return acctadjustmentabstracton0;
    }

    public void setAcctadjustmentabstracton0(BigDecimal acctadjustmentabstracton0) {
        this.acctadjustmentabstracton0 = acctadjustmentabstracton0;
    }

    private BigDecimal acctadjustmentabstracton1;

    @Basic
    @javax.persistence.Column(name = "ACCTADJUSTMENTABSTRACTON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctadjustmentabstracton1() {
        return acctadjustmentabstracton1;
    }

    public void setAcctadjustmentabstracton1(BigDecimal acctadjustmentabstracton1) {
        this.acctadjustmentabstracton1 = acctadjustmentabstracton1;
    }

    private BigDecimal acctadjustmentabstracton2;

    @Basic
    @javax.persistence.Column(name = "ACCTADJUSTMENTABSTRACTON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctadjustmentabstracton2() {
        return acctadjustmentabstracton2;
    }

    public void setAcctadjustmentabstracton2(BigDecimal acctadjustmentabstracton2) {
        this.acctadjustmentabstracton2 = acctadjustmentabstracton2;
    }

    private Timestamp acctadjustmentabstractod0;

    @Basic
    @javax.persistence.Column(name = "ACCTADJUSTMENTABSTRACTOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctadjustmentabstractod0() {
        return acctadjustmentabstractod0;
    }

    public void setAcctadjustmentabstractod0(Timestamp acctadjustmentabstractod0) {
        this.acctadjustmentabstractod0 = acctadjustmentabstractod0;
    }

    private Timestamp acctadjustmentabstractod1;

    @Basic
    @javax.persistence.Column(name = "ACCTADJUSTMENTABSTRACTOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctadjustmentabstractod1() {
        return acctadjustmentabstractod1;
    }

    public void setAcctadjustmentabstractod1(Timestamp acctadjustmentabstractod1) {
        this.acctadjustmentabstractod1 = acctadjustmentabstractod1;
    }

    private String acctadjustmentabstractom0;

    @Basic
    @javax.persistence.Column(name = "ACCTADJUSTMENTABSTRACTOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctadjustmentabstractom0() {
        return acctadjustmentabstractom0;
    }

    public void setAcctadjustmentabstractom0(String acctadjustmentabstractom0) {
        this.acctadjustmentabstractom0 = acctadjustmentabstractom0;
    }

    private String acctadjustmentabstractom1;

    @Basic
    @javax.persistence.Column(name = "ACCTADJUSTMENTABSTRACTOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctadjustmentabstractom1() {
        return acctadjustmentabstractom1;
    }

    public void setAcctadjustmentabstractom1(String acctadjustmentabstractom1) {
        this.acctadjustmentabstractom1 = acctadjustmentabstractom1;
    }

    private String acctadjustmentabstractot0;

    @Basic
    @javax.persistence.Column(name = "ACCTADJUSTMENTABSTRACTOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctadjustmentabstractot0() {
        return acctadjustmentabstractot0;
    }

    public void setAcctadjustmentabstractot0(String acctadjustmentabstractot0) {
        this.acctadjustmentabstractot0 = acctadjustmentabstractot0;
    }

    private String acctadjustmentabstractot1;

    @Basic
    @javax.persistence.Column(name = "ACCTADJUSTMENTABSTRACTOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctadjustmentabstractot1() {
        return acctadjustmentabstractot1;
    }

    public void setAcctadjustmentabstractot1(String acctadjustmentabstractot1) {
        this.acctadjustmentabstractot1 = acctadjustmentabstractot1;
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

        TblacctadjustmentabstractEntity that = (TblacctadjustmentabstractEntity) o;

        if (adjustmentdetailid != that.adjustmentdetailid) return false;
        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null)
            return false;
        if (acctadjustmentabstractod0 != null ? !acctadjustmentabstractod0.equals(that.acctadjustmentabstractod0) : that.acctadjustmentabstractod0 != null)
            return false;
        if (acctadjustmentabstractod1 != null ? !acctadjustmentabstractod1.equals(that.acctadjustmentabstractod1) : that.acctadjustmentabstractod1 != null)
            return false;
        if (acctadjustmentabstractom0 != null ? !acctadjustmentabstractom0.equals(that.acctadjustmentabstractom0) : that.acctadjustmentabstractom0 != null)
            return false;
        if (acctadjustmentabstractom1 != null ? !acctadjustmentabstractom1.equals(that.acctadjustmentabstractom1) : that.acctadjustmentabstractom1 != null)
            return false;
        if (acctadjustmentabstracton0 != null ? !acctadjustmentabstracton0.equals(that.acctadjustmentabstracton0) : that.acctadjustmentabstracton0 != null)
            return false;
        if (acctadjustmentabstracton1 != null ? !acctadjustmentabstracton1.equals(that.acctadjustmentabstracton1) : that.acctadjustmentabstracton1 != null)
            return false;
        if (acctadjustmentabstracton2 != null ? !acctadjustmentabstracton2.equals(that.acctadjustmentabstracton2) : that.acctadjustmentabstracton2 != null)
            return false;
        if (acctadjustmentabstractot0 != null ? !acctadjustmentabstractot0.equals(that.acctadjustmentabstractot0) : that.acctadjustmentabstractot0 != null)
            return false;
        if (acctadjustmentabstractot1 != null ? !acctadjustmentabstractot1.equals(that.acctadjustmentabstractot1) : that.acctadjustmentabstractot1 != null)
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
        result = 31 * result + adjustmentdetailid;
        result = 31 * result + (acctadjustmentabstracton0 != null ? acctadjustmentabstracton0.hashCode() : 0);
        result = 31 * result + (acctadjustmentabstracton1 != null ? acctadjustmentabstracton1.hashCode() : 0);
        result = 31 * result + (acctadjustmentabstracton2 != null ? acctadjustmentabstracton2.hashCode() : 0);
        result = 31 * result + (acctadjustmentabstractod0 != null ? acctadjustmentabstractod0.hashCode() : 0);
        result = 31 * result + (acctadjustmentabstractod1 != null ? acctadjustmentabstractod1.hashCode() : 0);
        result = 31 * result + (acctadjustmentabstractom0 != null ? acctadjustmentabstractom0.hashCode() : 0);
        result = 31 * result + (acctadjustmentabstractom1 != null ? acctadjustmentabstractom1.hashCode() : 0);
        result = 31 * result + (acctadjustmentabstractot0 != null ? acctadjustmentabstractot0.hashCode() : 0);
        result = 31 * result + (acctadjustmentabstractot1 != null ? acctadjustmentabstractot1.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
