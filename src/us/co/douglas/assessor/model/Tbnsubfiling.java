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
public class Tbnsubfiling {
    private String subno;

    @Id
    @javax.persistence.Column(name = "SUBNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getSubno() {
        return subno;
    }

    public void setSubno(String subno) {
        this.subno = subno;
    }

    private String filingno;

    @javax.persistence.Column(name = "FILINGNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getFilingno() {
        return filingno;
    }

    public void setFilingno(String filingno) {
        this.filingno = filingno;
    }

    private String subfilingdescription;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSubfilingdescription() {
        return subfilingdescription;
    }

    public void setSubfilingdescription(String subfilingdescription) {
        this.subfilingdescription = subfilingdescription;
    }

    private String subfilingrecordingno;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGRECORDINGNO", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSubfilingrecordingno() {
        return subfilingrecordingno;
    }

    public void setSubfilingrecordingno(String subfilingrecordingno) {
        this.subfilingrecordingno = subfilingrecordingno;
    }

    private String subfilingcity;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGCITY", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSubfilingcity() {
        return subfilingcity;
    }

    public void setSubfilingcity(String subfilingcity) {
        this.subfilingcity = subfilingcity;
    }

    private String defaultsection;

    @Basic
    @javax.persistence.Column(name = "DEFAULTSECTION", nullable = true, insertable = true, updatable = true, length = 15)
    public String getDefaultsection() {
        return defaultsection;
    }

    public void setDefaultsection(String defaultsection) {
        this.defaultsection = defaultsection;
    }

    private String defaulttownship;

    @Basic
    @javax.persistence.Column(name = "DEFAULTTOWNSHIP", nullable = true, insertable = true, updatable = true, length = 15)
    public String getDefaulttownship() {
        return defaulttownship;
    }

    public void setDefaulttownship(String defaulttownship) {
        this.defaulttownship = defaulttownship;
    }

    private String defaultrange;

    @Basic
    @javax.persistence.Column(name = "DEFAULTRANGE", nullable = true, insertable = true, updatable = true, length = 15)
    public String getDefaultrange() {
        return defaultrange;
    }

    public void setDefaultrange(String defaultrange) {
        this.defaultrange = defaultrange;
    }

    private String defaultqtr;

    @Basic
    @javax.persistence.Column(name = "DEFAULTQTR", nullable = true, insertable = true, updatable = true, length = 15)
    public String getDefaultqtr() {
        return defaultqtr;
    }

    public void setDefaultqtr(String defaultqtr) {
        this.defaultqtr = defaultqtr;
    }

    private String defaultqtrqtr;

    @Basic
    @javax.persistence.Column(name = "DEFAULTQTRQTR", nullable = true, insertable = true, updatable = true, length = 15)
    public String getDefaultqtrqtr() {
        return defaultqtrqtr;
    }

    public void setDefaultqtrqtr(String defaultqtrqtr) {
        this.defaultqtrqtr = defaultqtrqtr;
    }

    private Timestamp subfilingdaterecorded;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGDATERECORDED", nullable = true, insertable = true, updatable = true)
    public Timestamp getSubfilingdaterecorded() {
        return subfilingdaterecorded;
    }

    public void setSubfilingdaterecorded(Timestamp subfilingdaterecorded) {
        this.subfilingdaterecorded = subfilingdaterecorded;
    }

    private String mapno;

    @Basic
    @javax.persistence.Column(name = "MAPNO", nullable = true, insertable = true, updatable = true, length = 40)
    public String getMapno() {
        return mapno;
    }

    public void setMapno(String mapno) {
        this.mapno = mapno;
    }

    private String accounttype;

    @Basic
    @javax.persistence.Column(name = "ACCOUNTTYPE", nullable = false, insertable = true, updatable = true, length = 15)
    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    private String subfilingstatus;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGSTATUS", nullable = false, insertable = true, updatable = true, length = 15)
    public String getSubfilingstatus() {
        return subfilingstatus;
    }

    public void setSubfilingstatus(String subfilingstatus) {
        this.subfilingstatus = subfilingstatus;
    }

    private Integer blockcount;

    @Basic
    @javax.persistence.Column(name = "BLOCKCOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getBlockcount() {
        return blockcount;
    }

    public void setBlockcount(Integer blockcount) {
        this.blockcount = blockcount;
    }

    private Integer lotcount;

    @Basic
    @javax.persistence.Column(name = "LOTCOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getLotcount() {
        return lotcount;
    }

    public void setLotcount(Integer lotcount) {
        this.lotcount = lotcount;
    }

    private Integer tractcount;

    @Basic
    @javax.persistence.Column(name = "TRACTCOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getTractcount() {
        return tractcount;
    }

    public void setTractcount(Integer tractcount) {
        this.tractcount = tractcount;
    }

    private BigInteger subfilingmhtitleflag;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGMHTITLEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getSubfilingmhtitleflag() {
        return subfilingmhtitleflag;
    }

    public void setSubfilingmhtitleflag(BigInteger subfilingmhtitleflag) {
        this.subfilingmhtitleflag = subfilingmhtitleflag;
    }

    private BigInteger subfilingnotesflag;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGNOTESFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getSubfilingnotesflag() {
        return subfilingnotesflag;
    }

    public void setSubfilingnotesflag(BigInteger subfilingnotesflag) {
        this.subfilingnotesflag = subfilingnotesflag;
    }

    private BigInteger subfilingnewconstflag;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGNEWCONSTFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getSubfilingnewconstflag() {
        return subfilingnewconstflag;
    }

    public void setSubfilingnewconstflag(BigInteger subfilingnewconstflag) {
        this.subfilingnewconstflag = subfilingnewconstflag;
    }

    private BigInteger subfilingphotosflag;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGPHOTOSFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getSubfilingphotosflag() {
        return subfilingphotosflag;
    }

    public void setSubfilingphotosflag(BigInteger subfilingphotosflag) {
        this.subfilingphotosflag = subfilingphotosflag;
    }

    private BigInteger subfilingsketchesflag;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGSKETCHESFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getSubfilingsketchesflag() {
        return subfilingsketchesflag;
    }

    public void setSubfilingsketchesflag(BigInteger subfilingsketchesflag) {
        this.subfilingsketchesflag = subfilingsketchesflag;
    }

    private int subfilingtaxyear;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGTAXYEAR", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSubfilingtaxyear() {
        return subfilingtaxyear;
    }

    public void setSubfilingtaxyear(int subfilingtaxyear) {
        this.subfilingtaxyear = subfilingtaxyear;
    }

    private BigDecimal subfilingon0;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSubfilingon0() {
        return subfilingon0;
    }

    public void setSubfilingon0(BigDecimal subfilingon0) {
        this.subfilingon0 = subfilingon0;
    }

    private BigDecimal subfilingon1;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSubfilingon1() {
        return subfilingon1;
    }

    public void setSubfilingon1(BigDecimal subfilingon1) {
        this.subfilingon1 = subfilingon1;
    }

    private BigDecimal subfilingon2;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSubfilingon2() {
        return subfilingon2;
    }

    public void setSubfilingon2(BigDecimal subfilingon2) {
        this.subfilingon2 = subfilingon2;
    }

    private String assignedto;

    @Basic
    @javax.persistence.Column(name = "ASSIGNEDTO", nullable = false, insertable = true, updatable = true, length = 20)
    public String getAssignedto() {
        return assignedto;
    }

    public void setAssignedto(String assignedto) {
        this.assignedto = assignedto;
    }

    private Timestamp subfilingod0;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getSubfilingod0() {
        return subfilingod0;
    }

    public void setSubfilingod0(Timestamp subfilingod0) {
        this.subfilingod0 = subfilingod0;
    }

    private Timestamp subfilingod1;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getSubfilingod1() {
        return subfilingod1;
    }

    public void setSubfilingod1(Timestamp subfilingod1) {
        this.subfilingod1 = subfilingod1;
    }

    private String subfilingom0;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSubfilingom0() {
        return subfilingom0;
    }

    public void setSubfilingom0(String subfilingom0) {
        this.subfilingom0 = subfilingom0;
    }

    private String subfilingom1;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSubfilingom1() {
        return subfilingom1;
    }

    public void setSubfilingom1(String subfilingom1) {
        this.subfilingom1 = subfilingom1;
    }

    private String subfilingot0;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSubfilingot0() {
        return subfilingot0;
    }

    public void setSubfilingot0(String subfilingot0) {
        this.subfilingot0 = subfilingot0;
    }

    private String subfilingot1;

    @Basic
    @javax.persistence.Column(name = "SUBFILINGOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSubfilingot1() {
        return subfilingot1;
    }

    public void setSubfilingot1(String subfilingot1) {
        this.subfilingot1 = subfilingot1;
    }

    private int jurisdictionid;

    @javax.persistence.Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    private String defaultlegal;

    @Basic
    @javax.persistence.Column(name = "DEFAULTLEGAL", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getDefaultlegal() {
        return defaultlegal;
    }

    public void setDefaultlegal(String defaultlegal) {
        this.defaultlegal = defaultlegal;
    }

    private Timestamp lastupdated;

    @Basic
    @javax.persistence.Column(name = "LASTUPDATED", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Timestamp lastupdated) {
        this.lastupdated = lastupdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tbnsubfiling that = (Tbnsubfiling) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (subfilingtaxyear != that.subfilingtaxyear) return false;
        if (accounttype != null ? !accounttype.equals(that.accounttype) : that.accounttype != null)
            return false;
        if (assignedto != null ? !assignedto.equals(that.assignedto) : that.assignedto != null)
            return false;
        if (blockcount != null ? !blockcount.equals(that.blockcount) : that.blockcount != null)
            return false;
        if (defaultlegal != null ? !defaultlegal.equals(that.defaultlegal) : that.defaultlegal != null)
            return false;
        if (defaultqtr != null ? !defaultqtr.equals(that.defaultqtr) : that.defaultqtr != null)
            return false;
        if (defaultqtrqtr != null ? !defaultqtrqtr.equals(that.defaultqtrqtr) : that.defaultqtrqtr != null)
            return false;
        if (defaultrange != null ? !defaultrange.equals(that.defaultrange) : that.defaultrange != null)
            return false;
        if (defaultsection != null ? !defaultsection.equals(that.defaultsection) : that.defaultsection != null)
            return false;
        if (defaulttownship != null ? !defaulttownship.equals(that.defaulttownship) : that.defaulttownship != null)
            return false;
        if (filingno != null ? !filingno.equals(that.filingno) : that.filingno != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (lotcount != null ? !lotcount.equals(that.lotcount) : that.lotcount != null)
            return false;
        if (mapno != null ? !mapno.equals(that.mapno) : that.mapno != null)
            return false;
        if (subfilingcity != null ? !subfilingcity.equals(that.subfilingcity) : that.subfilingcity != null)
            return false;
        if (subfilingdaterecorded != null ? !subfilingdaterecorded.equals(that.subfilingdaterecorded) : that.subfilingdaterecorded != null)
            return false;
        if (subfilingdescription != null ? !subfilingdescription.equals(that.subfilingdescription) : that.subfilingdescription != null)
            return false;
        if (subfilingmhtitleflag != null ? !subfilingmhtitleflag.equals(that.subfilingmhtitleflag) : that.subfilingmhtitleflag != null)
            return false;
        if (subfilingnewconstflag != null ? !subfilingnewconstflag.equals(that.subfilingnewconstflag) : that.subfilingnewconstflag != null)
            return false;
        if (subfilingnotesflag != null ? !subfilingnotesflag.equals(that.subfilingnotesflag) : that.subfilingnotesflag != null)
            return false;
        if (subfilingod0 != null ? !subfilingod0.equals(that.subfilingod0) : that.subfilingod0 != null)
            return false;
        if (subfilingod1 != null ? !subfilingod1.equals(that.subfilingod1) : that.subfilingod1 != null)
            return false;
        if (subfilingom0 != null ? !subfilingom0.equals(that.subfilingom0) : that.subfilingom0 != null)
            return false;
        if (subfilingom1 != null ? !subfilingom1.equals(that.subfilingom1) : that.subfilingom1 != null)
            return false;
        if (subfilingon0 != null ? !subfilingon0.equals(that.subfilingon0) : that.subfilingon0 != null)
            return false;
        if (subfilingon1 != null ? !subfilingon1.equals(that.subfilingon1) : that.subfilingon1 != null)
            return false;
        if (subfilingon2 != null ? !subfilingon2.equals(that.subfilingon2) : that.subfilingon2 != null)
            return false;
        if (subfilingot0 != null ? !subfilingot0.equals(that.subfilingot0) : that.subfilingot0 != null)
            return false;
        if (subfilingot1 != null ? !subfilingot1.equals(that.subfilingot1) : that.subfilingot1 != null)
            return false;
        if (subfilingphotosflag != null ? !subfilingphotosflag.equals(that.subfilingphotosflag) : that.subfilingphotosflag != null)
            return false;
        if (subfilingrecordingno != null ? !subfilingrecordingno.equals(that.subfilingrecordingno) : that.subfilingrecordingno != null)
            return false;
        if (subfilingsketchesflag != null ? !subfilingsketchesflag.equals(that.subfilingsketchesflag) : that.subfilingsketchesflag != null)
            return false;
        if (subfilingstatus != null ? !subfilingstatus.equals(that.subfilingstatus) : that.subfilingstatus != null)
            return false;
        if (subno != null ? !subno.equals(that.subno) : that.subno != null)
            return false;
        if (tractcount != null ? !tractcount.equals(that.tractcount) : that.tractcount != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subno != null ? subno.hashCode() : 0;
        result = 31 * result + (filingno != null ? filingno.hashCode() : 0);
        result = 31 * result + (subfilingdescription != null ? subfilingdescription.hashCode() : 0);
        result = 31 * result + (subfilingrecordingno != null ? subfilingrecordingno.hashCode() : 0);
        result = 31 * result + (subfilingcity != null ? subfilingcity.hashCode() : 0);
        result = 31 * result + (defaultsection != null ? defaultsection.hashCode() : 0);
        result = 31 * result + (defaulttownship != null ? defaulttownship.hashCode() : 0);
        result = 31 * result + (defaultrange != null ? defaultrange.hashCode() : 0);
        result = 31 * result + (defaultqtr != null ? defaultqtr.hashCode() : 0);
        result = 31 * result + (defaultqtrqtr != null ? defaultqtrqtr.hashCode() : 0);
        result = 31 * result + (subfilingdaterecorded != null ? subfilingdaterecorded.hashCode() : 0);
        result = 31 * result + (mapno != null ? mapno.hashCode() : 0);
        result = 31 * result + (accounttype != null ? accounttype.hashCode() : 0);
        result = 31 * result + (subfilingstatus != null ? subfilingstatus.hashCode() : 0);
        result = 31 * result + (blockcount != null ? blockcount.hashCode() : 0);
        result = 31 * result + (lotcount != null ? lotcount.hashCode() : 0);
        result = 31 * result + (tractcount != null ? tractcount.hashCode() : 0);
        result = 31 * result + (subfilingmhtitleflag != null ? subfilingmhtitleflag.hashCode() : 0);
        result = 31 * result + (subfilingnotesflag != null ? subfilingnotesflag.hashCode() : 0);
        result = 31 * result + (subfilingnewconstflag != null ? subfilingnewconstflag.hashCode() : 0);
        result = 31 * result + (subfilingphotosflag != null ? subfilingphotosflag.hashCode() : 0);
        result = 31 * result + (subfilingsketchesflag != null ? subfilingsketchesflag.hashCode() : 0);
        result = 31 * result + subfilingtaxyear;
        result = 31 * result + (subfilingon0 != null ? subfilingon0.hashCode() : 0);
        result = 31 * result + (subfilingon1 != null ? subfilingon1.hashCode() : 0);
        result = 31 * result + (subfilingon2 != null ? subfilingon2.hashCode() : 0);
        result = 31 * result + (assignedto != null ? assignedto.hashCode() : 0);
        result = 31 * result + (subfilingod0 != null ? subfilingod0.hashCode() : 0);
        result = 31 * result + (subfilingod1 != null ? subfilingod1.hashCode() : 0);
        result = 31 * result + (subfilingom0 != null ? subfilingom0.hashCode() : 0);
        result = 31 * result + (subfilingom1 != null ? subfilingom1.hashCode() : 0);
        result = 31 * result + (subfilingot0 != null ? subfilingot0.hashCode() : 0);
        result = 31 * result + (subfilingot1 != null ? subfilingot1.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (defaultlegal != null ? defaultlegal.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
