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
public class Tblsaleaffidavitparcel {
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

    private String receptionno;

    @Basic
    @javax.persistence.Column(name = "RECEPTIONNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getReceptionno() {
        return receptionno;
    }

    public void setReceptionno(String receptionno) {
        this.receptionno = receptionno;
    }

    private String parcelno;

    @Basic
    @javax.persistence.Column(name = "PARCELNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getParcelno() {
        return parcelno;
    }

    public void setParcelno(String parcelno) {
        this.parcelno = parcelno;
    }

    private int parcelorder;

    @Basic
    @javax.persistence.Column(name = "PARCELORDER", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getParcelorder() {
        return parcelorder;
    }

    public void setParcelorder(int parcelorder) {
        this.parcelorder = parcelorder;
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

    private BigDecimal saleaffidavitparcelon0;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITPARCELON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleaffidavitparcelon0() {
        return saleaffidavitparcelon0;
    }

    public void setSaleaffidavitparcelon0(BigDecimal saleaffidavitparcelon0) {
        this.saleaffidavitparcelon0 = saleaffidavitparcelon0;
    }

    private BigDecimal saleaffidavitparcelon1;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITPARCELON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleaffidavitparcelon1() {
        return saleaffidavitparcelon1;
    }

    public void setSaleaffidavitparcelon1(BigDecimal saleaffidavitparcelon1) {
        this.saleaffidavitparcelon1 = saleaffidavitparcelon1;
    }

    private BigDecimal saleaffidavitparcelon2;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITPARCELON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleaffidavitparcelon2() {
        return saleaffidavitparcelon2;
    }

    public void setSaleaffidavitparcelon2(BigDecimal saleaffidavitparcelon2) {
        this.saleaffidavitparcelon2 = saleaffidavitparcelon2;
    }

    private Timestamp saleaffidavitparcelod0;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITPARCELOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleaffidavitparcelod0() {
        return saleaffidavitparcelod0;
    }

    public void setSaleaffidavitparcelod0(Timestamp saleaffidavitparcelod0) {
        this.saleaffidavitparcelod0 = saleaffidavitparcelod0;
    }

    private Timestamp saleaffidavitparcelod1;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITPARCELOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleaffidavitparcelod1() {
        return saleaffidavitparcelod1;
    }

    public void setSaleaffidavitparcelod1(Timestamp saleaffidavitparcelod1) {
        this.saleaffidavitparcelod1 = saleaffidavitparcelod1;
    }

    private String saleaffidavitparcelom0;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITPARCELOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleaffidavitparcelom0() {
        return saleaffidavitparcelom0;
    }

    public void setSaleaffidavitparcelom0(String saleaffidavitparcelom0) {
        this.saleaffidavitparcelom0 = saleaffidavitparcelom0;
    }

    private String saleaffidavitparcelom1;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITPARCELOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleaffidavitparcelom1() {
        return saleaffidavitparcelom1;
    }

    public void setSaleaffidavitparcelom1(String saleaffidavitparcelom1) {
        this.saleaffidavitparcelom1 = saleaffidavitparcelom1;
    }

    private String saleaffidavitparcelot0;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITPARCELOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleaffidavitparcelot0() {
        return saleaffidavitparcelot0;
    }

    public void setSaleaffidavitparcelot0(String saleaffidavitparcelot0) {
        this.saleaffidavitparcelot0 = saleaffidavitparcelot0;
    }

    private String saleaffidavitparcelot1;

    @Basic
    @javax.persistence.Column(name = "SALEAFFIDAVITPARCELOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleaffidavitparcelot1() {
        return saleaffidavitparcelot1;
    }

    public void setSaleaffidavitparcelot1(String saleaffidavitparcelot1) {
        this.saleaffidavitparcelot1 = saleaffidavitparcelot1;
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

        Tblsaleaffidavitparcel that = (Tblsaleaffidavitparcel) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (parcelorder != that.parcelorder) return false;
        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null)
            return false;
        if (parcelno != null ? !parcelno.equals(that.parcelno) : that.parcelno != null)
            return false;
        if (receptionno != null ? !receptionno.equals(that.receptionno) : that.receptionno != null)
            return false;
        if (saleaffidavitparcelod0 != null ? !saleaffidavitparcelod0.equals(that.saleaffidavitparcelod0) : that.saleaffidavitparcelod0 != null)
            return false;
        if (saleaffidavitparcelod1 != null ? !saleaffidavitparcelod1.equals(that.saleaffidavitparcelod1) : that.saleaffidavitparcelod1 != null)
            return false;
        if (saleaffidavitparcelom0 != null ? !saleaffidavitparcelom0.equals(that.saleaffidavitparcelom0) : that.saleaffidavitparcelom0 != null)
            return false;
        if (saleaffidavitparcelom1 != null ? !saleaffidavitparcelom1.equals(that.saleaffidavitparcelom1) : that.saleaffidavitparcelom1 != null)
            return false;
        if (saleaffidavitparcelon0 != null ? !saleaffidavitparcelon0.equals(that.saleaffidavitparcelon0) : that.saleaffidavitparcelon0 != null)
            return false;
        if (saleaffidavitparcelon1 != null ? !saleaffidavitparcelon1.equals(that.saleaffidavitparcelon1) : that.saleaffidavitparcelon1 != null)
            return false;
        if (saleaffidavitparcelon2 != null ? !saleaffidavitparcelon2.equals(that.saleaffidavitparcelon2) : that.saleaffidavitparcelon2 != null)
            return false;
        if (saleaffidavitparcelot0 != null ? !saleaffidavitparcelot0.equals(that.saleaffidavitparcelot0) : that.saleaffidavitparcelot0 != null)
            return false;
        if (saleaffidavitparcelot1 != null ? !saleaffidavitparcelot1.equals(that.saleaffidavitparcelot1) : that.saleaffidavitparcelot1 != null)
            return false;
        if (writedate != null ? !writedate.equals(that.writedate) : that.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + (receptionno != null ? receptionno.hashCode() : 0);
        result = 31 * result + (parcelno != null ? parcelno.hashCode() : 0);
        result = 31 * result + parcelorder;
        result = 31 * result + (accountno != null ? accountno.hashCode() : 0);
        result = 31 * result + (saleaffidavitparcelon0 != null ? saleaffidavitparcelon0.hashCode() : 0);
        result = 31 * result + (saleaffidavitparcelon1 != null ? saleaffidavitparcelon1.hashCode() : 0);
        result = 31 * result + (saleaffidavitparcelon2 != null ? saleaffidavitparcelon2.hashCode() : 0);
        result = 31 * result + (saleaffidavitparcelod0 != null ? saleaffidavitparcelod0.hashCode() : 0);
        result = 31 * result + (saleaffidavitparcelod1 != null ? saleaffidavitparcelod1.hashCode() : 0);
        result = 31 * result + (saleaffidavitparcelom0 != null ? saleaffidavitparcelom0.hashCode() : 0);
        result = 31 * result + (saleaffidavitparcelom1 != null ? saleaffidavitparcelom1.hashCode() : 0);
        result = 31 * result + (saleaffidavitparcelot0 != null ? saleaffidavitparcelot0.hashCode() : 0);
        result = 31 * result + (saleaffidavitparcelot1 != null ? saleaffidavitparcelot1.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
