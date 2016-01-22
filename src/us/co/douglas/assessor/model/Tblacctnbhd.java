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
public class Tblacctnbhd {
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

    private String nbhdcode;

    @Basic
    @javax.persistence.Column(name = "NBHDCODE", nullable = false, insertable = true, updatable = true, length = 10)
    public String getNbhdcode() {
        return nbhdcode;
    }

    public void setNbhdcode(String nbhdcode) {
        this.nbhdcode = nbhdcode;
    }

    private String nbhdextension;

    @Basic
    @javax.persistence.Column(name = "NBHDEXTENSION", nullable = false, insertable = true, updatable = true, length = 10)
    public String getNbhdextension() {
        return nbhdextension;
    }

    public void setNbhdextension(String nbhdextension) {
        this.nbhdextension = nbhdextension;
    }

    private BigDecimal nbhdadjustmentvalue;

    @Basic
    @javax.persistence.Column(name = "NBHDADJUSTMENTVALUE", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getNbhdadjustmentvalue() {
        return nbhdadjustmentvalue;
    }

    public void setNbhdadjustmentvalue(BigDecimal nbhdadjustmentvalue) {
        this.nbhdadjustmentvalue = nbhdadjustmentvalue;
    }

    private BigDecimal acctnbhdon0;

    @Basic
    @javax.persistence.Column(name = "ACCTNBHDON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctnbhdon0() {
        return acctnbhdon0;
    }

    public void setAcctnbhdon0(BigDecimal acctnbhdon0) {
        this.acctnbhdon0 = acctnbhdon0;
    }

    private BigDecimal acctnbhdon1;

    @Basic
    @javax.persistence.Column(name = "ACCTNBHDON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctnbhdon1() {
        return acctnbhdon1;
    }

    public void setAcctnbhdon1(BigDecimal acctnbhdon1) {
        this.acctnbhdon1 = acctnbhdon1;
    }

    private BigDecimal acctnbhdon2;

    @Basic
    @javax.persistence.Column(name = "ACCTNBHDON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctnbhdon2() {
        return acctnbhdon2;
    }

    public void setAcctnbhdon2(BigDecimal acctnbhdon2) {
        this.acctnbhdon2 = acctnbhdon2;
    }

    private Timestamp acctnbhdod0;

    @Basic
    @javax.persistence.Column(name = "ACCTNBHDOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctnbhdod0() {
        return acctnbhdod0;
    }

    public void setAcctnbhdod0(Timestamp acctnbhdod0) {
        this.acctnbhdod0 = acctnbhdod0;
    }

    private Timestamp acctnbhdod1;

    @Basic
    @javax.persistence.Column(name = "ACCTNBHDOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctnbhdod1() {
        return acctnbhdod1;
    }

    public void setAcctnbhdod1(Timestamp acctnbhdod1) {
        this.acctnbhdod1 = acctnbhdod1;
    }

    private String acctnbhdom0;

    @Basic
    @javax.persistence.Column(name = "ACCTNBHDOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctnbhdom0() {
        return acctnbhdom0;
    }

    public void setAcctnbhdom0(String acctnbhdom0) {
        this.acctnbhdom0 = acctnbhdom0;
    }

    private String acctnbhdom1;

    @Basic
    @javax.persistence.Column(name = "ACCTNBHDOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctnbhdom1() {
        return acctnbhdom1;
    }

    public void setAcctnbhdom1(String acctnbhdom1) {
        this.acctnbhdom1 = acctnbhdom1;
    }

    private String acctnbhdot0;

    @Basic
    @javax.persistence.Column(name = "ACCTNBHDOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctnbhdot0() {
        return acctnbhdot0;
    }

    public void setAcctnbhdot0(String acctnbhdot0) {
        this.acctnbhdot0 = acctnbhdot0;
    }

    private String acctnbhdot1;

    @Basic
    @javax.persistence.Column(name = "ACCTNBHDOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctnbhdot1() {
        return acctnbhdot1;
    }

    public void setAcctnbhdot1(String acctnbhdot1) {
        this.acctnbhdot1 = acctnbhdot1;
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

        Tblacctnbhd that = (Tblacctnbhd) o;

        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null)
            return false;
        if (acctnbhdod0 != null ? !acctnbhdod0.equals(that.acctnbhdod0) : that.acctnbhdod0 != null)
            return false;
        if (acctnbhdod1 != null ? !acctnbhdod1.equals(that.acctnbhdod1) : that.acctnbhdod1 != null)
            return false;
        if (acctnbhdom0 != null ? !acctnbhdom0.equals(that.acctnbhdom0) : that.acctnbhdom0 != null)
            return false;
        if (acctnbhdom1 != null ? !acctnbhdom1.equals(that.acctnbhdom1) : that.acctnbhdom1 != null)
            return false;
        if (acctnbhdon0 != null ? !acctnbhdon0.equals(that.acctnbhdon0) : that.acctnbhdon0 != null)
            return false;
        if (acctnbhdon1 != null ? !acctnbhdon1.equals(that.acctnbhdon1) : that.acctnbhdon1 != null)
            return false;
        if (acctnbhdon2 != null ? !acctnbhdon2.equals(that.acctnbhdon2) : that.acctnbhdon2 != null)
            return false;
        if (acctnbhdot0 != null ? !acctnbhdot0.equals(that.acctnbhdot0) : that.acctnbhdot0 != null)
            return false;
        if (acctnbhdot1 != null ? !acctnbhdot1.equals(that.acctnbhdot1) : that.acctnbhdot1 != null)
            return false;
        if (nbhdadjustmentvalue != null ? !nbhdadjustmentvalue.equals(that.nbhdadjustmentvalue) : that.nbhdadjustmentvalue != null)
            return false;
        if (nbhdcode != null ? !nbhdcode.equals(that.nbhdcode) : that.nbhdcode != null)
            return false;
        if (nbhdextension != null ? !nbhdextension.equals(that.nbhdextension) : that.nbhdextension != null)
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
        result = 31 * result + (nbhdcode != null ? nbhdcode.hashCode() : 0);
        result = 31 * result + (nbhdextension != null ? nbhdextension.hashCode() : 0);
        result = 31 * result + (nbhdadjustmentvalue != null ? nbhdadjustmentvalue.hashCode() : 0);
        result = 31 * result + (acctnbhdon0 != null ? acctnbhdon0.hashCode() : 0);
        result = 31 * result + (acctnbhdon1 != null ? acctnbhdon1.hashCode() : 0);
        result = 31 * result + (acctnbhdon2 != null ? acctnbhdon2.hashCode() : 0);
        result = 31 * result + (acctnbhdod0 != null ? acctnbhdod0.hashCode() : 0);
        result = 31 * result + (acctnbhdod1 != null ? acctnbhdod1.hashCode() : 0);
        result = 31 * result + (acctnbhdom0 != null ? acctnbhdom0.hashCode() : 0);
        result = 31 * result + (acctnbhdom1 != null ? acctnbhdom1.hashCode() : 0);
        result = 31 * result + (acctnbhdot0 != null ? acctnbhdot0.hashCode() : 0);
        result = 31 * result + (acctnbhdot1 != null ? acctnbhdot1.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
