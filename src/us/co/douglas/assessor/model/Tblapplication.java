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
public class Tblapplication {
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

    private String applicationrecordno;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONRECORDNO", nullable = false, insertable = true, updatable = true, length = 15)
    public String getApplicationrecordno() {
        return applicationrecordno;
    }

    public void setApplicationrecordno(String applicationrecordno) {
        this.applicationrecordno = applicationrecordno;
    }

    private String applicationstatus;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONSTATUS", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationstatus() {
        return applicationstatus;
    }

    public void setApplicationstatus(String applicationstatus) {
        this.applicationstatus = applicationstatus;
    }

    private Integer renewalyear;

    @Basic
    @javax.persistence.Column(name = "RENEWALYEAR", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getRenewalyear() {
        return renewalyear;
    }

    public void setRenewalyear(Integer renewalyear) {
        this.renewalyear = renewalyear;
    }

    private Timestamp startdate;

    @Basic
    @javax.persistence.Column(name = "STARTDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getStartdate() {
        return startdate;
    }

    public void setStartdate(Timestamp startdate) {
        this.startdate = startdate;
    }

    private BigInteger residencyflag;

    @Basic
    @javax.persistence.Column(name = "RESIDENCYFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getResidencyflag() {
        return residencyflag;
    }

    public void setResidencyflag(BigInteger residencyflag) {
        this.residencyflag = residencyflag;
    }

    private BigInteger formsignedflag;

    @Basic
    @javax.persistence.Column(name = "FORMSIGNEDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getFormsignedflag() {
        return formsignedflag;
    }

    public void setFormsignedflag(BigInteger formsignedflag) {
        this.formsignedflag = formsignedflag;
    }

    private Timestamp maildate;

    @Basic
    @javax.persistence.Column(name = "MAILDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getMaildate() {
        return maildate;
    }

    public void setMaildate(Timestamp maildate) {
        this.maildate = maildate;
    }

    private Timestamp duedate;

    @Basic
    @javax.persistence.Column(name = "DUEDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getDuedate() {
        return duedate;
    }

    public void setDuedate(Timestamp duedate) {
        this.duedate = duedate;
    }

    private Timestamp receiveddate;

    @Basic
    @javax.persistence.Column(name = "RECEIVEDDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getReceiveddate() {
        return receiveddate;
    }

    public void setReceiveddate(Timestamp receiveddate) {
        this.receiveddate = receiveddate;
    }

    private Timestamp applicationod0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getApplicationod0() {
        return applicationod0;
    }

    public void setApplicationod0(Timestamp applicationod0) {
        this.applicationod0 = applicationod0;
    }

    private Timestamp applicationod1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getApplicationod1() {
        return applicationod1;
    }

    public void setApplicationod1(Timestamp applicationod1) {
        this.applicationod1 = applicationod1;
    }

    private String applicationom0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationom0() {
        return applicationom0;
    }

    public void setApplicationom0(String applicationom0) {
        this.applicationom0 = applicationom0;
    }

    private String applicationom1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationom1() {
        return applicationom1;
    }

    public void setApplicationom1(String applicationom1) {
        this.applicationom1 = applicationom1;
    }

    private BigDecimal applicationon0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getApplicationon0() {
        return applicationon0;
    }

    public void setApplicationon0(BigDecimal applicationon0) {
        this.applicationon0 = applicationon0;
    }

    private BigDecimal applicationon1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getApplicationon1() {
        return applicationon1;
    }

    public void setApplicationon1(BigDecimal applicationon1) {
        this.applicationon1 = applicationon1;
    }

    private BigDecimal applicationon2;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getApplicationon2() {
        return applicationon2;
    }

    public void setApplicationon2(BigDecimal applicationon2) {
        this.applicationon2 = applicationon2;
    }

    private String applicationot0;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationot0() {
        return applicationot0;
    }

    public void setApplicationot0(String applicationot0) {
        this.applicationot0 = applicationot0;
    }

    private String applicationot1;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getApplicationot1() {
        return applicationot1;
    }

    public void setApplicationot1(String applicationot1) {
        this.applicationot1 = applicationot1;
    }

    private Integer applicationeffectiveyear;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONEFFECTIVEYEAR", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getApplicationeffectiveyear() {
        return applicationeffectiveyear;
    }

    public void setApplicationeffectiveyear(Integer applicationeffectiveyear) {
        this.applicationeffectiveyear = applicationeffectiveyear;
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

    private String adjustmentcode;

    @Basic
    @javax.persistence.Column(name = "ADJUSTMENTCODE", nullable = true, insertable = true, updatable = true, length = 15)
    public String getAdjustmentcode() {
        return adjustmentcode;
    }

    public void setAdjustmentcode(String adjustmentcode) {
        this.adjustmentcode = adjustmentcode;
    }

    private Integer applicationapplicantid;

    @Basic
    @javax.persistence.Column(name = "APPLICATIONAPPLICANTID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getApplicationapplicantid() {
        return applicationapplicantid;
    }

    public void setApplicationapplicantid(Integer applicationapplicantid) {
        this.applicationapplicantid = applicationapplicantid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tblapplication that = (Tblapplication) o;

        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (adjustmentcode != null ? !adjustmentcode.equals(that.adjustmentcode) : that.adjustmentcode != null)
            return false;
        if (applicationapplicantid != null ? !applicationapplicantid.equals(that.applicationapplicantid) : that.applicationapplicantid != null)
            return false;
        if (applicationeffectiveyear != null ? !applicationeffectiveyear.equals(that.applicationeffectiveyear) : that.applicationeffectiveyear != null)
            return false;
        if (applicationod0 != null ? !applicationod0.equals(that.applicationod0) : that.applicationod0 != null)
            return false;
        if (applicationod1 != null ? !applicationod1.equals(that.applicationod1) : that.applicationod1 != null)
            return false;
        if (applicationom0 != null ? !applicationom0.equals(that.applicationom0) : that.applicationom0 != null)
            return false;
        if (applicationom1 != null ? !applicationom1.equals(that.applicationom1) : that.applicationom1 != null)
            return false;
        if (applicationon0 != null ? !applicationon0.equals(that.applicationon0) : that.applicationon0 != null)
            return false;
        if (applicationon1 != null ? !applicationon1.equals(that.applicationon1) : that.applicationon1 != null)
            return false;
        if (applicationon2 != null ? !applicationon2.equals(that.applicationon2) : that.applicationon2 != null)
            return false;
        if (applicationot0 != null ? !applicationot0.equals(that.applicationot0) : that.applicationot0 != null)
            return false;
        if (applicationot1 != null ? !applicationot1.equals(that.applicationot1) : that.applicationot1 != null)
            return false;
        if (applicationrecordno != null ? !applicationrecordno.equals(that.applicationrecordno) : that.applicationrecordno != null)
            return false;
        if (applicationstatus != null ? !applicationstatus.equals(that.applicationstatus) : that.applicationstatus != null)
            return false;
        if (duedate != null ? !duedate.equals(that.duedate) : that.duedate != null)
            return false;
        if (formsignedflag != null ? !formsignedflag.equals(that.formsignedflag) : that.formsignedflag != null)
            return false;
        if (maildate != null ? !maildate.equals(that.maildate) : that.maildate != null)
            return false;
        if (receiveddate != null ? !receiveddate.equals(that.receiveddate) : that.receiveddate != null)
            return false;
        if (renewalyear != null ? !renewalyear.equals(that.renewalyear) : that.renewalyear != null)
            return false;
        if (residencyflag != null ? !residencyflag.equals(that.residencyflag) : that.residencyflag != null)
            return false;
        if (startdate != null ? !startdate.equals(that.startdate) : that.startdate != null)
            return false;
        if (writedate != null ? !writedate.equals(that.writedate) : that.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + (applicationrecordno != null ? applicationrecordno.hashCode() : 0);
        result = 31 * result + (applicationstatus != null ? applicationstatus.hashCode() : 0);
        result = 31 * result + (renewalyear != null ? renewalyear.hashCode() : 0);
        result = 31 * result + (startdate != null ? startdate.hashCode() : 0);
        result = 31 * result + (residencyflag != null ? residencyflag.hashCode() : 0);
        result = 31 * result + (formsignedflag != null ? formsignedflag.hashCode() : 0);
        result = 31 * result + (maildate != null ? maildate.hashCode() : 0);
        result = 31 * result + (duedate != null ? duedate.hashCode() : 0);
        result = 31 * result + (receiveddate != null ? receiveddate.hashCode() : 0);
        result = 31 * result + (applicationod0 != null ? applicationod0.hashCode() : 0);
        result = 31 * result + (applicationod1 != null ? applicationod1.hashCode() : 0);
        result = 31 * result + (applicationom0 != null ? applicationom0.hashCode() : 0);
        result = 31 * result + (applicationom1 != null ? applicationom1.hashCode() : 0);
        result = 31 * result + (applicationon0 != null ? applicationon0.hashCode() : 0);
        result = 31 * result + (applicationon1 != null ? applicationon1.hashCode() : 0);
        result = 31 * result + (applicationon2 != null ? applicationon2.hashCode() : 0);
        result = 31 * result + (applicationot0 != null ? applicationot0.hashCode() : 0);
        result = 31 * result + (applicationot1 != null ? applicationot1.hashCode() : 0);
        result = 31 * result + (applicationeffectiveyear != null ? applicationeffectiveyear.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        result = 31 * result + (adjustmentcode != null ? adjustmentcode.hashCode() : 0);
        result = 31 * result + (applicationapplicantid != null ? applicationapplicantid.hashCode() : 0);
        return result;
    }
}
