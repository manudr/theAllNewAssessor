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
public class Tblappeal {
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

    private String initiatedby;

    @Basic
    @javax.persistence.Column(name = "INITIATEDBY", nullable = true, insertable = true, updatable = true, length = 30)
    public String getInitiatedby() {
        return initiatedby;
    }

    public void setInitiatedby(String initiatedby) {
        this.initiatedby = initiatedby;
    }

    private Integer agentcode;

    @Basic
    @javax.persistence.Column(name = "AGENTCODE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(Integer agentcode) {
        this.agentcode = agentcode;
    }

    private String mailto;

    @Basic
    @javax.persistence.Column(name = "MAILTO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getMailto() {
        return mailto;
    }

    public void setMailto(String mailto) {
        this.mailto = mailto;
    }

    private String decisionby;

    @Basic
    @javax.persistence.Column(name = "DECISIONBY", nullable = true, insertable = true, updatable = true, length = 30)
    public String getDecisionby() {
        return decisionby;
    }

    public void setDecisionby(String decisionby) {
        this.decisionby = decisionby;
    }

    private String caseno;

    @Basic
    @javax.persistence.Column(name = "CASENO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getCaseno() {
        return caseno;
    }

    public void setCaseno(String caseno) {
        this.caseno = caseno;
    }

    private String rereviewinitials;

    @Basic
    @javax.persistence.Column(name = "REREVIEWINITIALS", nullable = true, insertable = true, updatable = true, length = 30)
    public String getRereviewinitials() {
        return rereviewinitials;
    }

    public void setRereviewinitials(String rereviewinitials) {
        this.rereviewinitials = rereviewinitials;
    }

    private BigDecimal appealendvalue;

    @Basic
    @javax.persistence.Column(name = "APPEALENDVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAppealendvalue() {
        return appealendvalue;
    }

    public void setAppealendvalue(BigDecimal appealendvalue) {
        this.appealendvalue = appealendvalue;
    }

    private Timestamp dateofappeal;

    @Basic
    @javax.persistence.Column(name = "DATEOFAPPEAL", nullable = true, insertable = true, updatable = true)
    public Timestamp getDateofappeal() {
        return dateofappeal;
    }

    public void setDateofappeal(Timestamp dateofappeal) {
        this.dateofappeal = dateofappeal;
    }

    private Timestamp datereceived;

    @Basic
    @javax.persistence.Column(name = "DATERECEIVED", nullable = true, insertable = true, updatable = true)
    public Timestamp getDatereceived() {
        return datereceived;
    }

    public void setDatereceived(Timestamp datereceived) {
        this.datereceived = datereceived;
    }

    private BigInteger taxpayermeetingrequestflag;

    @Basic
    @javax.persistence.Column(name = "TAXPAYERMEETINGREQUESTFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getTaxpayermeetingrequestflag() {
        return taxpayermeetingrequestflag;
    }

    public void setTaxpayermeetingrequestflag(BigInteger taxpayermeetingrequestflag) {
        this.taxpayermeetingrequestflag = taxpayermeetingrequestflag;
    }

    private Timestamp taxpayermeetingdate;

    @Basic
    @javax.persistence.Column(name = "TAXPAYERMEETINGDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getTaxpayermeetingdate() {
        return taxpayermeetingdate;
    }

    public void setTaxpayermeetingdate(Timestamp taxpayermeetingdate) {
        this.taxpayermeetingdate = taxpayermeetingdate;
    }

    private String taxpayermeetingtime;

    @Basic
    @javax.persistence.Column(name = "TAXPAYERMEETINGTIME", nullable = true, insertable = true, updatable = true, length = 100)
    public String getTaxpayermeetingtime() {
        return taxpayermeetingtime;
    }

    public void setTaxpayermeetingtime(String taxpayermeetingtime) {
        this.taxpayermeetingtime = taxpayermeetingtime;
    }

    private BigDecimal beginningappealvalue;

    @Basic
    @javax.persistence.Column(name = "BEGINNINGAPPEALVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getBeginningappealvalue() {
        return beginningappealvalue;
    }

    public void setBeginningappealvalue(BigDecimal beginningappealvalue) {
        this.beginningappealvalue = beginningappealvalue;
    }

    private BigDecimal appealon1;

    @Basic
    @javax.persistence.Column(name = "APPEALON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealon1() {
        return appealon1;
    }

    public void setAppealon1(BigDecimal appealon1) {
        this.appealon1 = appealon1;
    }

    private BigDecimal appealon2;

    @Basic
    @javax.persistence.Column(name = "APPEALON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealon2() {
        return appealon2;
    }

    public void setAppealon2(BigDecimal appealon2) {
        this.appealon2 = appealon2;
    }

    private Timestamp appealod0;

    @Basic
    @javax.persistence.Column(name = "APPEALOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getAppealod0() {
        return appealod0;
    }

    public void setAppealod0(Timestamp appealod0) {
        this.appealod0 = appealod0;
    }

    private Timestamp appealod1;

    @Basic
    @javax.persistence.Column(name = "APPEALOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getAppealod1() {
        return appealod1;
    }

    public void setAppealod1(Timestamp appealod1) {
        this.appealod1 = appealod1;
    }

    private String appealom0;

    @Basic
    @javax.persistence.Column(name = "APPEALOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealom0() {
        return appealom0;
    }

    public void setAppealom0(String appealom0) {
        this.appealom0 = appealom0;
    }

    private String appealom1;

    @Basic
    @javax.persistence.Column(name = "APPEALOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealom1() {
        return appealom1;
    }

    public void setAppealom1(String appealom1) {
        this.appealom1 = appealom1;
    }

    private BigDecimal appealon0;

    @Basic
    @javax.persistence.Column(name = "APPEALON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealon0() {
        return appealon0;
    }

    public void setAppealon0(BigDecimal appealon0) {
        this.appealon0 = appealon0;
    }

    private String appealot0;

    @Basic
    @javax.persistence.Column(name = "APPEALOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealot0() {
        return appealot0;
    }

    public void setAppealot0(String appealot0) {
        this.appealot0 = appealot0;
    }

    private String appealot1;

    @Basic
    @javax.persistence.Column(name = "APPEALOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealot1() {
        return appealot1;
    }

    public void setAppealot1(String appealot1) {
        this.appealot1 = appealot1;
    }

    private String primaryaccount;

    @Basic
    @javax.persistence.Column(name = "PRIMARYACCOUNT", nullable = true, insertable = true, updatable = true, length = 30)
    public String getPrimaryaccount() {
        return primaryaccount;
    }

    public void setPrimaryaccount(String primaryaccount) {
        this.primaryaccount = primaryaccount;
    }

    private Timestamp scheduledate;

    @Basic
    @javax.persistence.Column(name = "SCHEDULEDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getScheduledate() {
        return scheduledate;
    }

    public void setScheduledate(Timestamp scheduledate) {
        this.scheduledate = scheduledate;
    }

    private String schedulestarttime;

    @Basic
    @javax.persistence.Column(name = "SCHEDULESTARTTIME", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSchedulestarttime() {
        return schedulestarttime;
    }

    public void setSchedulestarttime(String schedulestarttime) {
        this.schedulestarttime = schedulestarttime;
    }

    private String scheduleendtime;

    @Basic
    @javax.persistence.Column(name = "SCHEDULEENDTIME", nullable = true, insertable = true, updatable = true, length = 50)
    public String getScheduleendtime() {
        return scheduleendtime;
    }

    public void setScheduleendtime(String scheduleendtime) {
        this.scheduleendtime = scheduleendtime;
    }

    private String schedulecomment;

    @Basic
    @javax.persistence.Column(name = "SCHEDULECOMMENT", nullable = true, insertable = true, updatable = true, length = 500)
    public String getSchedulecomment() {
        return schedulecomment;
    }

    public void setSchedulecomment(String schedulecomment) {
        this.schedulecomment = schedulecomment;
    }

    private String scheduleboardfileno;

    @Basic
    @javax.persistence.Column(name = "SCHEDULEBOARDFILENO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getScheduleboardfileno() {
        return scheduleboardfileno;
    }

    public void setScheduleboardfileno(String scheduleboardfileno) {
        this.scheduleboardfileno = scheduleboardfileno;
    }

    private String scheduleappraiserinitials;

    @Basic
    @javax.persistence.Column(name = "SCHEDULEAPPRAISERINITIALS", nullable = true, insertable = true, updatable = true, length = 30)
    public String getScheduleappraiserinitials() {
        return scheduleappraiserinitials;
    }

    public void setScheduleappraiserinitials(String scheduleappraiserinitials) {
        this.scheduleappraiserinitials = scheduleappraiserinitials;
    }

    private String appointmentcolor;

    @Basic
    @javax.persistence.Column(name = "APPOINTMENTCOLOR", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppointmentcolor() {
        return appointmentcolor;
    }

    public void setAppointmentcolor(String appointmentcolor) {
        this.appointmentcolor = appointmentcolor;
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

    private String appealreasondescription;

    @Basic
    @javax.persistence.Column(name = "APPEALREASONDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 1000)
    public String getAppealreasondescription() {
        return appealreasondescription;
    }

    public void setAppealreasondescription(String appealreasondescription) {
        this.appealreasondescription = appealreasondescription;
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

        Tblappeal tblappeal = (Tblappeal) o;

        if (appealno != tblappeal.appealno) return false;
        if (seqid != tblappeal.seqid) return false;
        if (taxyear != tblappeal.taxyear) return false;
        if (verend != tblappeal.verend) return false;
        if (verstart != tblappeal.verstart) return false;
        if (agentcode != null ? !agentcode.equals(tblappeal.agentcode) : tblappeal.agentcode != null)
            return false;
        if (appealdecision != null ? !appealdecision.equals(tblappeal.appealdecision) : tblappeal.appealdecision != null)
            return false;
        if (appealendvalue != null ? !appealendvalue.equals(tblappeal.appealendvalue) : tblappeal.appealendvalue != null)
            return false;
        if (appealod0 != null ? !appealod0.equals(tblappeal.appealod0) : tblappeal.appealod0 != null)
            return false;
        if (appealod1 != null ? !appealod1.equals(tblappeal.appealod1) : tblappeal.appealod1 != null)
            return false;
        if (appealom0 != null ? !appealom0.equals(tblappeal.appealom0) : tblappeal.appealom0 != null)
            return false;
        if (appealom1 != null ? !appealom1.equals(tblappeal.appealom1) : tblappeal.appealom1 != null)
            return false;
        if (appealon0 != null ? !appealon0.equals(tblappeal.appealon0) : tblappeal.appealon0 != null)
            return false;
        if (appealon1 != null ? !appealon1.equals(tblappeal.appealon1) : tblappeal.appealon1 != null)
            return false;
        if (appealon2 != null ? !appealon2.equals(tblappeal.appealon2) : tblappeal.appealon2 != null)
            return false;
        if (appealot0 != null ? !appealot0.equals(tblappeal.appealot0) : tblappeal.appealot0 != null)
            return false;
        if (appealot1 != null ? !appealot1.equals(tblappeal.appealot1) : tblappeal.appealot1 != null)
            return false;
        if (appealreasondescription != null ? !appealreasondescription.equals(tblappeal.appealreasondescription) : tblappeal.appealreasondescription != null)
            return false;
        if (appointmentcolor != null ? !appointmentcolor.equals(tblappeal.appointmentcolor) : tblappeal.appointmentcolor != null)
            return false;
        if (beginningappealvalue != null ? !beginningappealvalue.equals(tblappeal.beginningappealvalue) : tblappeal.beginningappealvalue != null)
            return false;
        if (caseno != null ? !caseno.equals(tblappeal.caseno) : tblappeal.caseno != null)
            return false;
        if (dateofappeal != null ? !dateofappeal.equals(tblappeal.dateofappeal) : tblappeal.dateofappeal != null)
            return false;
        if (datereceived != null ? !datereceived.equals(tblappeal.datereceived) : tblappeal.datereceived != null)
            return false;
        if (decisionby != null ? !decisionby.equals(tblappeal.decisionby) : tblappeal.decisionby != null)
            return false;
        if (initiatedby != null ? !initiatedby.equals(tblappeal.initiatedby) : tblappeal.initiatedby != null)
            return false;
        if (mailto != null ? !mailto.equals(tblappeal.mailto) : tblappeal.mailto != null)
            return false;
        if (primaryaccount != null ? !primaryaccount.equals(tblappeal.primaryaccount) : tblappeal.primaryaccount != null)
            return false;
        if (rereviewinitials != null ? !rereviewinitials.equals(tblappeal.rereviewinitials) : tblappeal.rereviewinitials != null)
            return false;
        if (scheduleappraiserinitials != null ? !scheduleappraiserinitials.equals(tblappeal.scheduleappraiserinitials) : tblappeal.scheduleappraiserinitials != null)
            return false;
        if (scheduleboardfileno != null ? !scheduleboardfileno.equals(tblappeal.scheduleboardfileno) : tblappeal.scheduleboardfileno != null)
            return false;
        if (schedulecomment != null ? !schedulecomment.equals(tblappeal.schedulecomment) : tblappeal.schedulecomment != null)
            return false;
        if (scheduledate != null ? !scheduledate.equals(tblappeal.scheduledate) : tblappeal.scheduledate != null)
            return false;
        if (scheduleendtime != null ? !scheduleendtime.equals(tblappeal.scheduleendtime) : tblappeal.scheduleendtime != null)
            return false;
        if (schedulestarttime != null ? !schedulestarttime.equals(tblappeal.schedulestarttime) : tblappeal.schedulestarttime != null)
            return false;
        if (taxpayermeetingdate != null ? !taxpayermeetingdate.equals(tblappeal.taxpayermeetingdate) : tblappeal.taxpayermeetingdate != null)
            return false;
        if (taxpayermeetingrequestflag != null ? !taxpayermeetingrequestflag.equals(tblappeal.taxpayermeetingrequestflag) : tblappeal.taxpayermeetingrequestflag != null)
            return false;
        if (taxpayermeetingtime != null ? !taxpayermeetingtime.equals(tblappeal.taxpayermeetingtime) : tblappeal.taxpayermeetingtime != null)
            return false;
        if (writedate != null ? !writedate.equals(tblappeal.writedate) : tblappeal.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + taxyear;
        result = 31 * result + appealno;
        result = 31 * result + (initiatedby != null ? initiatedby.hashCode() : 0);
        result = 31 * result + (agentcode != null ? agentcode.hashCode() : 0);
        result = 31 * result + (mailto != null ? mailto.hashCode() : 0);
        result = 31 * result + (decisionby != null ? decisionby.hashCode() : 0);
        result = 31 * result + (caseno != null ? caseno.hashCode() : 0);
        result = 31 * result + (rereviewinitials != null ? rereviewinitials.hashCode() : 0);
        result = 31 * result + (appealendvalue != null ? appealendvalue.hashCode() : 0);
        result = 31 * result + (dateofappeal != null ? dateofappeal.hashCode() : 0);
        result = 31 * result + (datereceived != null ? datereceived.hashCode() : 0);
        result = 31 * result + (taxpayermeetingrequestflag != null ? taxpayermeetingrequestflag.hashCode() : 0);
        result = 31 * result + (taxpayermeetingdate != null ? taxpayermeetingdate.hashCode() : 0);
        result = 31 * result + (taxpayermeetingtime != null ? taxpayermeetingtime.hashCode() : 0);
        result = 31 * result + (beginningappealvalue != null ? beginningappealvalue.hashCode() : 0);
        result = 31 * result + (appealon1 != null ? appealon1.hashCode() : 0);
        result = 31 * result + (appealon2 != null ? appealon2.hashCode() : 0);
        result = 31 * result + (appealod0 != null ? appealod0.hashCode() : 0);
        result = 31 * result + (appealod1 != null ? appealod1.hashCode() : 0);
        result = 31 * result + (appealom0 != null ? appealom0.hashCode() : 0);
        result = 31 * result + (appealom1 != null ? appealom1.hashCode() : 0);
        result = 31 * result + (appealon0 != null ? appealon0.hashCode() : 0);
        result = 31 * result + (appealot0 != null ? appealot0.hashCode() : 0);
        result = 31 * result + (appealot1 != null ? appealot1.hashCode() : 0);
        result = 31 * result + (primaryaccount != null ? primaryaccount.hashCode() : 0);
        result = 31 * result + (scheduledate != null ? scheduledate.hashCode() : 0);
        result = 31 * result + (schedulestarttime != null ? schedulestarttime.hashCode() : 0);
        result = 31 * result + (scheduleendtime != null ? scheduleendtime.hashCode() : 0);
        result = 31 * result + (schedulecomment != null ? schedulecomment.hashCode() : 0);
        result = 31 * result + (scheduleboardfileno != null ? scheduleboardfileno.hashCode() : 0);
        result = 31 * result + (scheduleappraiserinitials != null ? scheduleappraiserinitials.hashCode() : 0);
        result = 31 * result + (appointmentcolor != null ? appointmentcolor.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + (appealreasondescription != null ? appealreasondescription.hashCode() : 0);
        result = 31 * result + (appealdecision != null ? appealdecision.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
