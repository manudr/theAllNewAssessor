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
public class Tblacctpp {
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

    private String ppcertificationcode;

    @Basic
    @javax.persistence.Column(name = "PPCERTIFICATIONCODE", nullable = true, insertable = true, updatable = true, length = 25)
    public String getPpcertificationcode() {
        return ppcertificationcode;
    }

    public void setPpcertificationcode(String ppcertificationcode) {
        this.ppcertificationcode = ppcertificationcode;
    }

    private Timestamp ppcertificationdate;

    @Basic
    @javax.persistence.Column(name = "PPCERTIFICATIONDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getPpcertificationdate() {
        return ppcertificationdate;
    }

    public void setPpcertificationdate(Timestamp ppcertificationdate) {
        this.ppcertificationdate = ppcertificationdate;
    }

    private Timestamp jurisdictionauditdate;

    @Basic
    @javax.persistence.Column(name = "JURISDICTIONAUDITDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getJurisdictionauditdate() {
        return jurisdictionauditdate;
    }

    public void setJurisdictionauditdate(Timestamp jurisdictionauditdate) {
        this.jurisdictionauditdate = jurisdictionauditdate;
    }

    private Timestamp novsentdate;

    @Basic
    @javax.persistence.Column(name = "NOVSENTDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getNovsentdate() {
        return novsentdate;
    }

    public void setNovsentdate(Timestamp novsentdate) {
        this.novsentdate = novsentdate;
    }

    private BigDecimal associatedrealsf;

    @Basic
    @javax.persistence.Column(name = "ASSOCIATEDREALSF", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAssociatedrealsf() {
        return associatedrealsf;
    }

    public void setAssociatedrealsf(BigDecimal associatedrealsf) {
        this.associatedrealsf = associatedrealsf;
    }

    private String ppauditedby;

    @Basic
    @javax.persistence.Column(name = "PPAUDITEDBY", nullable = true, insertable = true, updatable = true, length = 30)
    public String getPpauditedby() {
        return ppauditedby;
    }

    public void setPpauditedby(String ppauditedby) {
        this.ppauditedby = ppauditedby;
    }

    private Timestamp ppdeclarationsentdate;

    @Basic
    @javax.persistence.Column(name = "PPDECLARATIONSENTDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getPpdeclarationsentdate() {
        return ppdeclarationsentdate;
    }

    public void setPpdeclarationsentdate(Timestamp ppdeclarationsentdate) {
        this.ppdeclarationsentdate = ppdeclarationsentdate;
    }

    private Timestamp ppdeclarationreturndate;

    @Basic
    @javax.persistence.Column(name = "PPDECLARATIONRETURNDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getPpdeclarationreturndate() {
        return ppdeclarationreturndate;
    }

    public void setPpdeclarationreturndate(Timestamp ppdeclarationreturndate) {
        this.ppdeclarationreturndate = ppdeclarationreturndate;
    }

    private Integer associatedrealunitcount;

    @Basic
    @javax.persistence.Column(name = "ASSOCIATEDREALUNITCOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getAssociatedrealunitcount() {
        return associatedrealunitcount;
    }

    public void setAssociatedrealunitcount(Integer associatedrealunitcount) {
        this.associatedrealunitcount = associatedrealunitcount;
    }

    private BigInteger latedeclarationflag;

    @Basic
    @javax.persistence.Column(name = "LATEDECLARATIONFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getLatedeclarationflag() {
        return latedeclarationflag;
    }

    public void setLatedeclarationflag(BigInteger latedeclarationflag) {
        this.latedeclarationflag = latedeclarationflag;
    }

    private Timestamp precollectdate;

    @Basic
    @javax.persistence.Column(name = "PRECOLLECTDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getPrecollectdate() {
        return precollectdate;
    }

    public void setPrecollectdate(Timestamp precollectdate) {
        this.precollectdate = precollectdate;
    }

    private BigInteger lettersentflag;

    @Basic
    @javax.persistence.Column(name = "LETTERSENTFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getLettersentflag() {
        return lettersentflag;
    }

    public void setLettersentflag(BigInteger lettersentflag) {
        this.lettersentflag = lettersentflag;
    }

    private String ppappraiser;

    @Basic
    @javax.persistence.Column(name = "PPAPPRAISER", nullable = true, insertable = true, updatable = true, length = 30)
    public String getPpappraiser() {
        return ppappraiser;
    }

    public void setPpappraiser(String ppappraiser) {
        this.ppappraiser = ppappraiser;
    }

    private Timestamp ppapprasaldate;

    @Basic
    @javax.persistence.Column(name = "PPAPPRASALDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getPpapprasaldate() {
        return ppapprasaldate;
    }

    public void setPpapprasaldate(Timestamp ppapprasaldate) {
        this.ppapprasaldate = ppapprasaldate;
    }

    private BigDecimal acresused;

    @Basic
    @javax.persistence.Column(name = "ACRESUSED", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAcresused() {
        return acresused;
    }

    public void setAcresused(BigDecimal acresused) {
        this.acresused = acresused;
    }

    private BigInteger farmserviceagencyflag;

    @Basic
    @javax.persistence.Column(name = "FARMSERVICEAGENCYFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getFarmserviceagencyflag() {
        return farmserviceagencyflag;
    }

    public void setFarmserviceagencyflag(BigInteger farmserviceagencyflag) {
        this.farmserviceagencyflag = farmserviceagencyflag;
    }

    private String farmserviceagencyno;

    @Basic
    @javax.persistence.Column(name = "FARMSERVICEAGENCYNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getFarmserviceagencyno() {
        return farmserviceagencyno;
    }

    public void setFarmserviceagencyno(String farmserviceagencyno) {
        this.farmserviceagencyno = farmserviceagencyno;
    }

    private BigInteger nochangeflag;

    @Basic
    @javax.persistence.Column(name = "NOCHANGEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getNochangeflag() {
        return nochangeflag;
    }

    public void setNochangeflag(BigInteger nochangeflag) {
        this.nochangeflag = nochangeflag;
    }

    private Timestamp auditdate;

    @Basic
    @javax.persistence.Column(name = "AUDITDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Timestamp auditdate) {
        this.auditdate = auditdate;
    }

    private BigInteger nodeclarationflag;

    @Basic
    @javax.persistence.Column(name = "NODECLARATIONFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getNodeclarationflag() {
        return nodeclarationflag;
    }

    public void setNodeclarationflag(BigInteger nodeclarationflag) {
        this.nodeclarationflag = nodeclarationflag;
    }

    private BigInteger bestinfoavailableflag;

    @Basic
    @javax.persistence.Column(name = "BESTINFOAVAILABLEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getBestinfoavailableflag() {
        return bestinfoavailableflag;
    }

    public void setBestinfoavailableflag(BigInteger bestinfoavailableflag) {
        this.bestinfoavailableflag = bestinfoavailableflag;
    }

    private String ppcitycode;

    @Basic
    @javax.persistence.Column(name = "PPCITYCODE", nullable = true, insertable = true, updatable = true, length = 3)
    public String getPpcitycode() {
        return ppcitycode;
    }

    public void setPpcitycode(String ppcitycode) {
        this.ppcitycode = ppcitycode;
    }

    private BigInteger attachmentcount;

    @Basic
    @javax.persistence.Column(name = "ATTACHMENTCOUNT", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getAttachmentcount() {
        return attachmentcount;
    }

    public void setAttachmentcount(BigInteger attachmentcount) {
        this.attachmentcount = attachmentcount;
    }

    private String specialdistrict1;

    @Basic
    @javax.persistence.Column(name = "SPECIALDISTRICT1", nullable = true, insertable = true, updatable = true, length = 2)
    public String getSpecialdistrict1() {
        return specialdistrict1;
    }

    public void setSpecialdistrict1(String specialdistrict1) {
        this.specialdistrict1 = specialdistrict1;
    }

    private String specialdistrict2;

    @Basic
    @javax.persistence.Column(name = "SPECIALDISTRICT2", nullable = true, insertable = true, updatable = true, length = 2)
    public String getSpecialdistrict2() {
        return specialdistrict2;
    }

    public void setSpecialdistrict2(String specialdistrict2) {
        this.specialdistrict2 = specialdistrict2;
    }

    private String areacodeid;

    @Basic
    @javax.persistence.Column(name = "AREACODEID", nullable = true, insertable = true, updatable = true, length = 3)
    public String getAreacodeid() {
        return areacodeid;
    }

    public void setAreacodeid(String areacodeid) {
        this.areacodeid = areacodeid;
    }

    private String deskauditby;

    @Basic
    @javax.persistence.Column(name = "DESKAUDITBY", nullable = true, insertable = true, updatable = true, length = 30)
    public String getDeskauditby() {
        return deskauditby;
    }

    public void setDeskauditby(String deskauditby) {
        this.deskauditby = deskauditby;
    }

    private String ppunittype;

    @Basic
    @javax.persistence.Column(name = "PPUNITTYPE", nullable = true, insertable = true, updatable = true, length = 4)
    public String getPpunittype() {
        return ppunittype;
    }

    public void setPpunittype(String ppunittype) {
        this.ppunittype = ppunittype;
    }

    private BigDecimal appraisedvalueperunit;

    @Basic
    @javax.persistence.Column(name = "APPRAISEDVALUEPERUNIT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAppraisedvalueperunit() {
        return appraisedvalueperunit;
    }

    public void setAppraisedvalueperunit(BigDecimal appraisedvalueperunit) {
        this.appraisedvalueperunit = appraisedvalueperunit;
    }

    private Integer unitnumber;

    @Basic
    @javax.persistence.Column(name = "UNITNUMBER", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getUnitnumber() {
        return unitnumber;
    }

    public void setUnitnumber(Integer unitnumber) {
        this.unitnumber = unitnumber;
    }

    private BigInteger smallacctcertificationflag;

    @Basic
    @javax.persistence.Column(name = "SMALLACCTCERTIFICATIONFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getSmallacctcertificationflag() {
        return smallacctcertificationflag;
    }

    public void setSmallacctcertificationflag(BigInteger smallacctcertificationflag) {
        this.smallacctcertificationflag = smallacctcertificationflag;
    }

    private String statesalestaxid;

    @Basic
    @javax.persistence.Column(name = "STATESALESTAXID", nullable = true, insertable = true, updatable = true, length = 14)
    public String getStatesalestaxid() {
        return statesalestaxid;
    }

    public void setStatesalestaxid(String statesalestaxid) {
        this.statesalestaxid = statesalestaxid;
    }

    private String federalid;

    @Basic
    @javax.persistence.Column(name = "FEDERALID", nullable = true, insertable = true, updatable = true, length = 9)
    public String getFederalid() {
        return federalid;
    }

    public void setFederalid(String federalid) {
        this.federalid = federalid;
    }

    private BigDecimal acctppon0;

    @Basic
    @javax.persistence.Column(name = "ACCTPPON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctppon0() {
        return acctppon0;
    }

    public void setAcctppon0(BigDecimal acctppon0) {
        this.acctppon0 = acctppon0;
    }

    private BigDecimal acctppon1;

    @Basic
    @javax.persistence.Column(name = "ACCTPPON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctppon1() {
        return acctppon1;
    }

    public void setAcctppon1(BigDecimal acctppon1) {
        this.acctppon1 = acctppon1;
    }

    private BigDecimal acctppon2;

    @Basic
    @javax.persistence.Column(name = "ACCTPPON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctppon2() {
        return acctppon2;
    }

    public void setAcctppon2(BigDecimal acctppon2) {
        this.acctppon2 = acctppon2;
    }

    private BigInteger electronicfileflag;

    @Basic
    @javax.persistence.Column(name = "ELECTRONICFILEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getElectronicfileflag() {
        return electronicfileflag;
    }

    public void setElectronicfileflag(BigInteger electronicfileflag) {
        this.electronicfileflag = electronicfileflag;
    }

    private Timestamp acctppod0;

    @Basic
    @javax.persistence.Column(name = "ACCTPPOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctppod0() {
        return acctppod0;
    }

    public void setAcctppod0(Timestamp acctppod0) {
        this.acctppod0 = acctppod0;
    }

    private Timestamp acctppod1;

    @Basic
    @javax.persistence.Column(name = "ACCTPPOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctppod1() {
        return acctppod1;
    }

    public void setAcctppod1(Timestamp acctppod1) {
        this.acctppod1 = acctppod1;
    }

    private String acctppom0;

    @Basic
    @javax.persistence.Column(name = "ACCTPPOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctppom0() {
        return acctppom0;
    }

    public void setAcctppom0(String acctppom0) {
        this.acctppom0 = acctppom0;
    }

    private String acctppom1;

    @Basic
    @javax.persistence.Column(name = "ACCTPPOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctppom1() {
        return acctppom1;
    }

    public void setAcctppom1(String acctppom1) {
        this.acctppom1 = acctppom1;
    }

    private String acctppot0;

    @Basic
    @javax.persistence.Column(name = "ACCTPPOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctppot0() {
        return acctppot0;
    }

    public void setAcctppot0(String acctppot0) {
        this.acctppot0 = acctppot0;
    }

    private String acctppot1;

    @Basic
    @javax.persistence.Column(name = "ACCTPPOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctppot1() {
        return acctppot1;
    }

    public void setAcctppot1(String acctppot1) {
        this.acctppot1 = acctppot1;
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

    private BigInteger onlinefilingoptoutflag;

    @Basic
    @javax.persistence.Column(name = "ONLINEFILINGOPTOUTFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getOnlinefilingoptoutflag() {
        return onlinefilingoptoutflag;
    }

    public void setOnlinefilingoptoutflag(BigInteger onlinefilingoptoutflag) {
        this.onlinefilingoptoutflag = onlinefilingoptoutflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tblacctpp tblacctpp = (Tblacctpp) o;

        if (seqid != tblacctpp.seqid) return false;
        if (verend != tblacctpp.verend) return false;
        if (verstart != tblacctpp.verstart) return false;
        if (accountno != null ? !accountno.equals(tblacctpp.accountno) : tblacctpp.accountno != null)
            return false;
        if (acctppod0 != null ? !acctppod0.equals(tblacctpp.acctppod0) : tblacctpp.acctppod0 != null)
            return false;
        if (acctppod1 != null ? !acctppod1.equals(tblacctpp.acctppod1) : tblacctpp.acctppod1 != null)
            return false;
        if (acctppom0 != null ? !acctppom0.equals(tblacctpp.acctppom0) : tblacctpp.acctppom0 != null)
            return false;
        if (acctppom1 != null ? !acctppom1.equals(tblacctpp.acctppom1) : tblacctpp.acctppom1 != null)
            return false;
        if (acctppon0 != null ? !acctppon0.equals(tblacctpp.acctppon0) : tblacctpp.acctppon0 != null)
            return false;
        if (acctppon1 != null ? !acctppon1.equals(tblacctpp.acctppon1) : tblacctpp.acctppon1 != null)
            return false;
        if (acctppon2 != null ? !acctppon2.equals(tblacctpp.acctppon2) : tblacctpp.acctppon2 != null)
            return false;
        if (acctppot0 != null ? !acctppot0.equals(tblacctpp.acctppot0) : tblacctpp.acctppot0 != null)
            return false;
        if (acctppot1 != null ? !acctppot1.equals(tblacctpp.acctppot1) : tblacctpp.acctppot1 != null)
            return false;
        if (acresused != null ? !acresused.equals(tblacctpp.acresused) : tblacctpp.acresused != null)
            return false;
        if (appraisedvalueperunit != null ? !appraisedvalueperunit.equals(tblacctpp.appraisedvalueperunit) : tblacctpp.appraisedvalueperunit != null)
            return false;
        if (areacodeid != null ? !areacodeid.equals(tblacctpp.areacodeid) : tblacctpp.areacodeid != null)
            return false;
        if (associatedrealsf != null ? !associatedrealsf.equals(tblacctpp.associatedrealsf) : tblacctpp.associatedrealsf != null)
            return false;
        if (associatedrealunitcount != null ? !associatedrealunitcount.equals(tblacctpp.associatedrealunitcount) : tblacctpp.associatedrealunitcount != null)
            return false;
        if (attachmentcount != null ? !attachmentcount.equals(tblacctpp.attachmentcount) : tblacctpp.attachmentcount != null)
            return false;
        if (auditdate != null ? !auditdate.equals(tblacctpp.auditdate) : tblacctpp.auditdate != null)
            return false;
        if (bestinfoavailableflag != null ? !bestinfoavailableflag.equals(tblacctpp.bestinfoavailableflag) : tblacctpp.bestinfoavailableflag != null)
            return false;
        if (deskauditby != null ? !deskauditby.equals(tblacctpp.deskauditby) : tblacctpp.deskauditby != null)
            return false;
        if (electronicfileflag != null ? !electronicfileflag.equals(tblacctpp.electronicfileflag) : tblacctpp.electronicfileflag != null)
            return false;
        if (farmserviceagencyflag != null ? !farmserviceagencyflag.equals(tblacctpp.farmserviceagencyflag) : tblacctpp.farmserviceagencyflag != null)
            return false;
        if (farmserviceagencyno != null ? !farmserviceagencyno.equals(tblacctpp.farmserviceagencyno) : tblacctpp.farmserviceagencyno != null)
            return false;
        if (federalid != null ? !federalid.equals(tblacctpp.federalid) : tblacctpp.federalid != null)
            return false;
        if (jurisdictionauditdate != null ? !jurisdictionauditdate.equals(tblacctpp.jurisdictionauditdate) : tblacctpp.jurisdictionauditdate != null)
            return false;
        if (latedeclarationflag != null ? !latedeclarationflag.equals(tblacctpp.latedeclarationflag) : tblacctpp.latedeclarationflag != null)
            return false;
        if (lettersentflag != null ? !lettersentflag.equals(tblacctpp.lettersentflag) : tblacctpp.lettersentflag != null)
            return false;
        if (nochangeflag != null ? !nochangeflag.equals(tblacctpp.nochangeflag) : tblacctpp.nochangeflag != null)
            return false;
        if (nodeclarationflag != null ? !nodeclarationflag.equals(tblacctpp.nodeclarationflag) : tblacctpp.nodeclarationflag != null)
            return false;
        if (novsentdate != null ? !novsentdate.equals(tblacctpp.novsentdate) : tblacctpp.novsentdate != null)
            return false;
        if (onlinefilingoptoutflag != null ? !onlinefilingoptoutflag.equals(tblacctpp.onlinefilingoptoutflag) : tblacctpp.onlinefilingoptoutflag != null)
            return false;
        if (ppappraiser != null ? !ppappraiser.equals(tblacctpp.ppappraiser) : tblacctpp.ppappraiser != null)
            return false;
        if (ppapprasaldate != null ? !ppapprasaldate.equals(tblacctpp.ppapprasaldate) : tblacctpp.ppapprasaldate != null)
            return false;
        if (ppauditedby != null ? !ppauditedby.equals(tblacctpp.ppauditedby) : tblacctpp.ppauditedby != null)
            return false;
        if (ppcertificationcode != null ? !ppcertificationcode.equals(tblacctpp.ppcertificationcode) : tblacctpp.ppcertificationcode != null)
            return false;
        if (ppcertificationdate != null ? !ppcertificationdate.equals(tblacctpp.ppcertificationdate) : tblacctpp.ppcertificationdate != null)
            return false;
        if (ppcitycode != null ? !ppcitycode.equals(tblacctpp.ppcitycode) : tblacctpp.ppcitycode != null)
            return false;
        if (ppdeclarationreturndate != null ? !ppdeclarationreturndate.equals(tblacctpp.ppdeclarationreturndate) : tblacctpp.ppdeclarationreturndate != null)
            return false;
        if (ppdeclarationsentdate != null ? !ppdeclarationsentdate.equals(tblacctpp.ppdeclarationsentdate) : tblacctpp.ppdeclarationsentdate != null)
            return false;
        if (ppunittype != null ? !ppunittype.equals(tblacctpp.ppunittype) : tblacctpp.ppunittype != null)
            return false;
        if (precollectdate != null ? !precollectdate.equals(tblacctpp.precollectdate) : tblacctpp.precollectdate != null)
            return false;
        if (smallacctcertificationflag != null ? !smallacctcertificationflag.equals(tblacctpp.smallacctcertificationflag) : tblacctpp.smallacctcertificationflag != null)
            return false;
        if (specialdistrict1 != null ? !specialdistrict1.equals(tblacctpp.specialdistrict1) : tblacctpp.specialdistrict1 != null)
            return false;
        if (specialdistrict2 != null ? !specialdistrict2.equals(tblacctpp.specialdistrict2) : tblacctpp.specialdistrict2 != null)
            return false;
        if (statesalestaxid != null ? !statesalestaxid.equals(tblacctpp.statesalestaxid) : tblacctpp.statesalestaxid != null)
            return false;
        if (unitnumber != null ? !unitnumber.equals(tblacctpp.unitnumber) : tblacctpp.unitnumber != null)
            return false;
        if (writedate != null ? !writedate.equals(tblacctpp.writedate) : tblacctpp.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + (accountno != null ? accountno.hashCode() : 0);
        result = 31 * result + (ppcertificationcode != null ? ppcertificationcode.hashCode() : 0);
        result = 31 * result + (ppcertificationdate != null ? ppcertificationdate.hashCode() : 0);
        result = 31 * result + (jurisdictionauditdate != null ? jurisdictionauditdate.hashCode() : 0);
        result = 31 * result + (novsentdate != null ? novsentdate.hashCode() : 0);
        result = 31 * result + (associatedrealsf != null ? associatedrealsf.hashCode() : 0);
        result = 31 * result + (ppauditedby != null ? ppauditedby.hashCode() : 0);
        result = 31 * result + (ppdeclarationsentdate != null ? ppdeclarationsentdate.hashCode() : 0);
        result = 31 * result + (ppdeclarationreturndate != null ? ppdeclarationreturndate.hashCode() : 0);
        result = 31 * result + (associatedrealunitcount != null ? associatedrealunitcount.hashCode() : 0);
        result = 31 * result + (latedeclarationflag != null ? latedeclarationflag.hashCode() : 0);
        result = 31 * result + (precollectdate != null ? precollectdate.hashCode() : 0);
        result = 31 * result + (lettersentflag != null ? lettersentflag.hashCode() : 0);
        result = 31 * result + (ppappraiser != null ? ppappraiser.hashCode() : 0);
        result = 31 * result + (ppapprasaldate != null ? ppapprasaldate.hashCode() : 0);
        result = 31 * result + (acresused != null ? acresused.hashCode() : 0);
        result = 31 * result + (farmserviceagencyflag != null ? farmserviceagencyflag.hashCode() : 0);
        result = 31 * result + (farmserviceagencyno != null ? farmserviceagencyno.hashCode() : 0);
        result = 31 * result + (nochangeflag != null ? nochangeflag.hashCode() : 0);
        result = 31 * result + (auditdate != null ? auditdate.hashCode() : 0);
        result = 31 * result + (nodeclarationflag != null ? nodeclarationflag.hashCode() : 0);
        result = 31 * result + (bestinfoavailableflag != null ? bestinfoavailableflag.hashCode() : 0);
        result = 31 * result + (ppcitycode != null ? ppcitycode.hashCode() : 0);
        result = 31 * result + (attachmentcount != null ? attachmentcount.hashCode() : 0);
        result = 31 * result + (specialdistrict1 != null ? specialdistrict1.hashCode() : 0);
        result = 31 * result + (specialdistrict2 != null ? specialdistrict2.hashCode() : 0);
        result = 31 * result + (areacodeid != null ? areacodeid.hashCode() : 0);
        result = 31 * result + (deskauditby != null ? deskauditby.hashCode() : 0);
        result = 31 * result + (ppunittype != null ? ppunittype.hashCode() : 0);
        result = 31 * result + (appraisedvalueperunit != null ? appraisedvalueperunit.hashCode() : 0);
        result = 31 * result + (unitnumber != null ? unitnumber.hashCode() : 0);
        result = 31 * result + (smallacctcertificationflag != null ? smallacctcertificationflag.hashCode() : 0);
        result = 31 * result + (statesalestaxid != null ? statesalestaxid.hashCode() : 0);
        result = 31 * result + (federalid != null ? federalid.hashCode() : 0);
        result = 31 * result + (acctppon0 != null ? acctppon0.hashCode() : 0);
        result = 31 * result + (acctppon1 != null ? acctppon1.hashCode() : 0);
        result = 31 * result + (acctppon2 != null ? acctppon2.hashCode() : 0);
        result = 31 * result + (electronicfileflag != null ? electronicfileflag.hashCode() : 0);
        result = 31 * result + (acctppod0 != null ? acctppod0.hashCode() : 0);
        result = 31 * result + (acctppod1 != null ? acctppod1.hashCode() : 0);
        result = 31 * result + (acctppom0 != null ? acctppom0.hashCode() : 0);
        result = 31 * result + (acctppom1 != null ? acctppom1.hashCode() : 0);
        result = 31 * result + (acctppot0 != null ? acctppot0.hashCode() : 0);
        result = 31 * result + (acctppot1 != null ? acctppot1.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        result = 31 * result + (onlinefilingoptoutflag != null ? onlinefilingoptoutflag.hashCode() : 0);
        return result;
    }
}
