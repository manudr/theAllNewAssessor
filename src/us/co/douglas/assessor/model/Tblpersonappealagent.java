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
public class Tblpersonappealagent {
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

    private int agentcode;

    @Basic
    @javax.persistence.Column(name = "AGENTCODE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(int agentcode) {
        this.agentcode = agentcode;
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

    private int addresscode;

    @Basic
    @javax.persistence.Column(name = "ADDRESSCODE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getAddresscode() {
        return addresscode;
    }

    public void setAddresscode(int addresscode) {
        this.addresscode = addresscode;
    }

    private BigDecimal appealagenton0;

    @Basic
    @javax.persistence.Column(name = "APPEALAGENTON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealagenton0() {
        return appealagenton0;
    }

    public void setAppealagenton0(BigDecimal appealagenton0) {
        this.appealagenton0 = appealagenton0;
    }

    private BigDecimal appealagenton1;

    @Basic
    @javax.persistence.Column(name = "APPEALAGENTON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealagenton1() {
        return appealagenton1;
    }

    public void setAppealagenton1(BigDecimal appealagenton1) {
        this.appealagenton1 = appealagenton1;
    }

    private BigDecimal appealagenton2;

    @Basic
    @javax.persistence.Column(name = "APPEALAGENTON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAppealagenton2() {
        return appealagenton2;
    }

    public void setAppealagenton2(BigDecimal appealagenton2) {
        this.appealagenton2 = appealagenton2;
    }

    private String appealagentot0;

    @Basic
    @javax.persistence.Column(name = "APPEALAGENTOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealagentot0() {
        return appealagentot0;
    }

    public void setAppealagentot0(String appealagentot0) {
        this.appealagentot0 = appealagentot0;
    }

    private String appealagentot1;

    @Basic
    @javax.persistence.Column(name = "APPEALAGENTOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealagentot1() {
        return appealagentot1;
    }

    public void setAppealagentot1(String appealagentot1) {
        this.appealagentot1 = appealagentot1;
    }

    private String appealagentom0;

    @Basic
    @javax.persistence.Column(name = "APPEALAGENTOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealagentom0() {
        return appealagentom0;
    }

    public void setAppealagentom0(String appealagentom0) {
        this.appealagentom0 = appealagentom0;
    }

    private String appealagentom1;

    @Basic
    @javax.persistence.Column(name = "APPEALAGENTOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAppealagentom1() {
        return appealagentom1;
    }

    public void setAppealagentom1(String appealagentom1) {
        this.appealagentom1 = appealagentom1;
    }

    private Timestamp appealagentod0;

    @Basic
    @javax.persistence.Column(name = "APPEALAGENTOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getAppealagentod0() {
        return appealagentod0;
    }

    public void setAppealagentod0(Timestamp appealagentod0) {
        this.appealagentod0 = appealagentod0;
    }

    private Timestamp appealagentod1;

    @Basic
    @javax.persistence.Column(name = "APPEALAGENTOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getAppealagentod1() {
        return appealagentod1;
    }

    public void setAppealagentod1(Timestamp appealagentod1) {
        this.appealagentod1 = appealagentod1;
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

        Tblpersonappealagent that = (Tblpersonappealagent) o;

        if (addresscode != that.addresscode) return false;
        if (agentcode != that.agentcode) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (personcode != that.personcode) return false;
        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (appealagentod0 != null ? !appealagentod0.equals(that.appealagentod0) : that.appealagentod0 != null)
            return false;
        if (appealagentod1 != null ? !appealagentod1.equals(that.appealagentod1) : that.appealagentod1 != null)
            return false;
        if (appealagentom0 != null ? !appealagentom0.equals(that.appealagentom0) : that.appealagentom0 != null)
            return false;
        if (appealagentom1 != null ? !appealagentom1.equals(that.appealagentom1) : that.appealagentom1 != null)
            return false;
        if (appealagenton0 != null ? !appealagenton0.equals(that.appealagenton0) : that.appealagenton0 != null)
            return false;
        if (appealagenton1 != null ? !appealagenton1.equals(that.appealagenton1) : that.appealagenton1 != null)
            return false;
        if (appealagenton2 != null ? !appealagenton2.equals(that.appealagenton2) : that.appealagenton2 != null)
            return false;
        if (appealagentot0 != null ? !appealagentot0.equals(that.appealagentot0) : that.appealagentot0 != null)
            return false;
        if (appealagentot1 != null ? !appealagentot1.equals(that.appealagentot1) : that.appealagentot1 != null)
            return false;
        if (writedate != null ? !writedate.equals(that.writedate) : that.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + agentcode;
        result = 31 * result + personcode;
        result = 31 * result + addresscode;
        result = 31 * result + (appealagenton0 != null ? appealagenton0.hashCode() : 0);
        result = 31 * result + (appealagenton1 != null ? appealagenton1.hashCode() : 0);
        result = 31 * result + (appealagenton2 != null ? appealagenton2.hashCode() : 0);
        result = 31 * result + (appealagentot0 != null ? appealagentot0.hashCode() : 0);
        result = 31 * result + (appealagentot1 != null ? appealagentot1.hashCode() : 0);
        result = 31 * result + (appealagentom0 != null ? appealagentom0.hashCode() : 0);
        result = 31 * result + (appealagentom1 != null ? appealagentom1.hashCode() : 0);
        result = 31 * result + (appealagentod0 != null ? appealagentod0.hashCode() : 0);
        result = 31 * result + (appealagentod1 != null ? appealagentod1.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
