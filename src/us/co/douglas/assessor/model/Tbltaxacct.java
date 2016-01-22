package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
@Table(name="Tbltaxacct")
public class Tbltaxacct {
    private String accountno;

    @Basic
    @javax.persistence.Column(name = "ACCOUNTNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

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

    private int jurisdictionid;

    @Basic
    @javax.persistence.Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    private BigDecimal taxaccton0;

    @Basic
    @javax.persistence.Column(name = "TAXACCTON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getTaxaccton0() {
        return taxaccton0;
    }

    public void setTaxaccton0(BigDecimal taxaccton0) {
        this.taxaccton0 = taxaccton0;
    }

    private BigDecimal taxaccton1;

    @Basic
    @javax.persistence.Column(name = "TAXACCTON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getTaxaccton1() {
        return taxaccton1;
    }

    public void setTaxaccton1(BigDecimal taxaccton1) {
        this.taxaccton1 = taxaccton1;
    }

    private BigDecimal taxaccton2;

    @Basic
    @javax.persistence.Column(name = "TAXACCTON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getTaxaccton2() {
        return taxaccton2;
    }

    public void setTaxaccton2(BigDecimal taxaccton2) {
        this.taxaccton2 = taxaccton2;
    }

    private Timestamp taxacctod0;

    @Basic
    @javax.persistence.Column(name = "TAXACCTOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getTaxacctod0() {
        return taxacctod0;
    }

    public void setTaxacctod0(Timestamp taxacctod0) {
        this.taxacctod0 = taxacctod0;
    }

    private Timestamp taxacctod1;

    @Basic
    @javax.persistence.Column(name = "TAXACCTOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getTaxacctod1() {
        return taxacctod1;
    }

    public void setTaxacctod1(Timestamp taxacctod1) {
        this.taxacctod1 = taxacctod1;
    }

    private String taxacctom0;

    @Basic
    @javax.persistence.Column(name = "TAXACCTOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getTaxacctom0() {
        return taxacctom0;
    }

    public void setTaxacctom0(String taxacctom0) {
        this.taxacctom0 = taxacctom0;
    }

    private String taxacctom1;

    @Basic
    @javax.persistence.Column(name = "TAXACCTOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getTaxacctom1() {
        return taxacctom1;
    }

    public void setTaxacctom1(String taxacctom1) {
        this.taxacctom1 = taxacctom1;
    }

    private String taxacctot0;

    @Basic
    @javax.persistence.Column(name = "TAXACCTOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getTaxacctot0() {
        return taxacctot0;
    }

    public void setTaxacctot0(String taxacctot0) {
        this.taxacctot0 = taxacctot0;
    }

    private String taxacctot1;

    @Basic
    @javax.persistence.Column(name = "TAXACCTOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getTaxacctot1() {
        return taxacctot1;
    }

    public void setTaxacctot1(String taxacctot1) {
        this.taxacctot1 = taxacctot1;
    }

    private String taxacctassignedto;

    @Basic
    @javax.persistence.Column(name = "TAXACCTASSIGNEDTO", nullable = true, insertable = true, updatable = true, length = 20)
    public String getTaxacctassignedto() {
        return taxacctassignedto;
    }

    public void setTaxacctassignedto(String taxacctassignedto) {
        this.taxacctassignedto = taxacctassignedto;
    }

    private String taxacctstatuscode;

    @Basic
    @javax.persistence.Column(name = "TAXACCTSTATUSCODE", nullable = false, insertable = true, updatable = true, length = 40)
    public String getTaxacctstatuscode() {
        return taxacctstatuscode;
    }

    public void setTaxacctstatuscode(String taxacctstatuscode) {
        this.taxacctstatuscode = taxacctstatuscode;
    }

    private String taxacctlocalno;

    @Basic
    @javax.persistence.Column(name = "TAXACCTLOCALNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getTaxacctlocalno() {
        return taxacctlocalno;
    }

    public void setTaxacctlocalno(String taxacctlocalno) {
        this.taxacctlocalno = taxacctlocalno;
    }

    private String taxacctassociatedacct;

    @Basic
    @javax.persistence.Column(name = "TAXACCTASSOCIATEDACCT", nullable = true, insertable = true, updatable = true, length = 30)
    public String getTaxacctassociatedacct() {
        return taxacctassociatedacct;
    }

    public void setTaxacctassociatedacct(String taxacctassociatedacct) {
        this.taxacctassociatedacct = taxacctassociatedacct;
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

    private Integer taxaccttypeid;

    @Basic
    @javax.persistence.Column(name = "TAXACCTTYPEID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getTaxaccttypeid() {
        return taxaccttypeid;
    }

    public void setTaxaccttypeid(Integer taxaccttypeid) {
        this.taxaccttypeid = taxaccttypeid;
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

        Tbltaxacct that = (Tbltaxacct) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null)
            return false;
        if (taxacctassignedto != null ? !taxacctassignedto.equals(that.taxacctassignedto) : that.taxacctassignedto != null)
            return false;
        if (taxacctassociatedacct != null ? !taxacctassociatedacct.equals(that.taxacctassociatedacct) : that.taxacctassociatedacct != null)
            return false;
        if (taxacctlocalno != null ? !taxacctlocalno.equals(that.taxacctlocalno) : that.taxacctlocalno != null)
            return false;
        if (taxacctod0 != null ? !taxacctod0.equals(that.taxacctod0) : that.taxacctod0 != null)
            return false;
        if (taxacctod1 != null ? !taxacctod1.equals(that.taxacctod1) : that.taxacctod1 != null)
            return false;
        if (taxacctom0 != null ? !taxacctom0.equals(that.taxacctom0) : that.taxacctom0 != null)
            return false;
        if (taxacctom1 != null ? !taxacctom1.equals(that.taxacctom1) : that.taxacctom1 != null)
            return false;
        if (taxaccton0 != null ? !taxaccton0.equals(that.taxaccton0) : that.taxaccton0 != null)
            return false;
        if (taxaccton1 != null ? !taxaccton1.equals(that.taxaccton1) : that.taxaccton1 != null)
            return false;
        if (taxaccton2 != null ? !taxaccton2.equals(that.taxaccton2) : that.taxaccton2 != null)
            return false;
        if (taxacctot0 != null ? !taxacctot0.equals(that.taxacctot0) : that.taxacctot0 != null)
            return false;
        if (taxacctot1 != null ? !taxacctot1.equals(that.taxacctot1) : that.taxacctot1 != null)
            return false;
        if (taxacctstatuscode != null ? !taxacctstatuscode.equals(that.taxacctstatuscode) : that.taxacctstatuscode != null)
            return false;
        if (taxaccttypeid != null ? !taxaccttypeid.equals(that.taxaccttypeid) : that.taxaccttypeid != null)
            return false;
        if (writedate != null ? !writedate.equals(that.writedate) : that.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accountno != null ? accountno.hashCode() : 0;
        result = 31 * result + verstart;
        result = 31 * result + verend;
        result = 31 * result + jurisdictionid;
        result = 31 * result + (taxaccton0 != null ? taxaccton0.hashCode() : 0);
        result = 31 * result + (taxaccton1 != null ? taxaccton1.hashCode() : 0);
        result = 31 * result + (taxaccton2 != null ? taxaccton2.hashCode() : 0);
        result = 31 * result + (taxacctod0 != null ? taxacctod0.hashCode() : 0);
        result = 31 * result + (taxacctod1 != null ? taxacctod1.hashCode() : 0);
        result = 31 * result + (taxacctom0 != null ? taxacctom0.hashCode() : 0);
        result = 31 * result + (taxacctom1 != null ? taxacctom1.hashCode() : 0);
        result = 31 * result + (taxacctot0 != null ? taxacctot0.hashCode() : 0);
        result = 31 * result + (taxacctot1 != null ? taxacctot1.hashCode() : 0);
        result = 31 * result + (taxacctassignedto != null ? taxacctassignedto.hashCode() : 0);
        result = 31 * result + (taxacctstatuscode != null ? taxacctstatuscode.hashCode() : 0);
        result = 31 * result + (taxacctlocalno != null ? taxacctlocalno.hashCode() : 0);
        result = 31 * result + (taxacctassociatedacct != null ? taxacctassociatedacct.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + (taxaccttypeid != null ? taxaccttypeid.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
