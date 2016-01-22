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
public class Tbnmlssale {
    private int mlslistingno;

    @Id
    @javax.persistence.Column(name = "MLSLISTINGNO", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getMlslistingno() {
        return mlslistingno;
    }

    public void setMlslistingno(int mlslistingno) {
        this.mlslistingno = mlslistingno;
    }

    private Integer mlsserialno;

    @Basic
    @javax.persistence.Column(name = "MLSSERIALNO", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getMlsserialno() {
        return mlsserialno;
    }

    public void setMlsserialno(Integer mlsserialno) {
        this.mlsserialno = mlsserialno;
    }

    private String mlsparcelno;

    @Basic
    @javax.persistence.Column(name = "MLSPARCELNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getMlsparcelno() {
        return mlsparcelno;
    }

    public void setMlsparcelno(String mlsparcelno) {
        this.mlsparcelno = mlsparcelno;
    }

    private BigDecimal mlssaleprice;

    @Basic
    @javax.persistence.Column(name = "MLSSALEPRICE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getMlssaleprice() {
        return mlssaleprice;
    }

    public void setMlssaleprice(BigDecimal mlssaleprice) {
        this.mlssaleprice = mlssaleprice;
    }

    private Timestamp mlssaledate;

    @Basic
    @javax.persistence.Column(name = "MLSSALEDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getMlssaledate() {
        return mlssaledate;
    }

    public void setMlssaledate(Timestamp mlssaledate) {
        this.mlssaledate = mlssaledate;
    }

    private String mlspredirection;

    @Basic
    @javax.persistence.Column(name = "MLSPREDIRECTION", nullable = true, insertable = true, updatable = true, length = 3)
    public String getMlspredirection() {
        return mlspredirection;
    }

    public void setMlspredirection(String mlspredirection) {
        this.mlspredirection = mlspredirection;
    }

    private String mlsstreetname;

    @Basic
    @javax.persistence.Column(name = "MLSSTREETNAME", nullable = true, insertable = true, updatable = true, length = 50)
    public String getMlsstreetname() {
        return mlsstreetname;
    }

    public void setMlsstreetname(String mlsstreetname) {
        this.mlsstreetname = mlsstreetname;
    }

    private String mlsstreettype;

    @Basic
    @javax.persistence.Column(name = "MLSSTREETTYPE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getMlsstreettype() {
        return mlsstreettype;
    }

    public void setMlsstreettype(String mlsstreettype) {
        this.mlsstreettype = mlsstreettype;
    }

    private String mlspostdirection;

    @Basic
    @javax.persistence.Column(name = "MLSPOSTDIRECTION", nullable = true, insertable = true, updatable = true, length = 10)
    public String getMlspostdirection() {
        return mlspostdirection;
    }

    public void setMlspostdirection(String mlspostdirection) {
        this.mlspostdirection = mlspostdirection;
    }

    private String mlscity;

    @Basic
    @javax.persistence.Column(name = "MLSCITY", nullable = true, insertable = true, updatable = true, length = 50)
    public String getMlscity() {
        return mlscity;
    }

    public void setMlscity(String mlscity) {
        this.mlscity = mlscity;
    }

    private String mlsstate;

    @Basic
    @javax.persistence.Column(name = "MLSSTATE", nullable = true, insertable = true, updatable = true, length = 20)
    public String getMlsstate() {
        return mlsstate;
    }

    public void setMlsstate(String mlsstate) {
        this.mlsstate = mlsstate;
    }

    private String mlszipcode;

    @Basic
    @javax.persistence.Column(name = "MLSZIPCODE", nullable = true, insertable = true, updatable = true, length = 20)
    public String getMlszipcode() {
        return mlszipcode;
    }

    public void setMlszipcode(String mlszipcode) {
        this.mlszipcode = mlszipcode;
    }

    private BigDecimal mlstotalimpsf;

    @Basic
    @javax.persistence.Column(name = "MLSTOTALIMPSF", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getMlstotalimpsf() {
        return mlstotalimpsf;
    }

    public void setMlstotalimpsf(BigDecimal mlstotalimpsf) {
        this.mlstotalimpsf = mlstotalimpsf;
    }

    private BigDecimal mlslandnetacrecount;

    @Basic
    @javax.persistence.Column(name = "MLSLANDNETACRECOUNT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getMlslandnetacrecount() {
        return mlslandnetacrecount;
    }

    public void setMlslandnetacrecount(BigDecimal mlslandnetacrecount) {
        this.mlslandnetacrecount = mlslandnetacrecount;
    }

    private Integer mlsyearbuilt;

    @Basic
    @javax.persistence.Column(name = "MLSYEARBUILT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getMlsyearbuilt() {
        return mlsyearbuilt;
    }

    public void setMlsyearbuilt(Integer mlsyearbuilt) {
        this.mlsyearbuilt = mlsyearbuilt;
    }

    private String mlssubdivisionname;

    @Basic
    @javax.persistence.Column(name = "MLSSUBDIVISIONNAME", nullable = true, insertable = true, updatable = true, length = 255)
    public String getMlssubdivisionname() {
        return mlssubdivisionname;
    }

    public void setMlssubdivisionname(String mlssubdivisionname) {
        this.mlssubdivisionname = mlssubdivisionname;
    }

    private String mlsclasscode;

    @Basic
    @javax.persistence.Column(name = "MLSCLASSCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getMlsclasscode() {
        return mlsclasscode;
    }

    public void setMlsclasscode(String mlsclasscode) {
        this.mlsclasscode = mlsclasscode;
    }

    private String mlslistprice;

    @Basic
    @javax.persistence.Column(name = "MLSLISTPRICE", nullable = true, insertable = true, updatable = true, length = 9)
    public String getMlslistprice() {
        return mlslistprice;
    }

    public void setMlslistprice(String mlslistprice) {
        this.mlslistprice = mlslistprice;
    }

    private Timestamp mlslistdate;

    @Basic
    @javax.persistence.Column(name = "MLSLISTDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getMlslistdate() {
        return mlslistdate;
    }

    public void setMlslistdate(Timestamp mlslistdate) {
        this.mlslistdate = mlslistdate;
    }

    private Integer mlspaidconcessions;

    @Basic
    @javax.persistence.Column(name = "MLSPAIDCONCESSIONS", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getMlspaidconcessions() {
        return mlspaidconcessions;
    }

    public void setMlspaidconcessions(Integer mlspaidconcessions) {
        this.mlspaidconcessions = mlspaidconcessions;
    }

    private String mlshoafees;

    @Basic
    @javax.persistence.Column(name = "MLSHOAFEES", nullable = true, insertable = true, updatable = true, length = 20)
    public String getMlshoafees() {
        return mlshoafees;
    }

    public void setMlshoafees(String mlshoafees) {
        this.mlshoafees = mlshoafees;
    }

    private Timestamp mlscontractdate;

    @Basic
    @javax.persistence.Column(name = "MLSCONTRACTDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getMlscontractdate() {
        return mlscontractdate;
    }

    public void setMlscontractdate(Timestamp mlscontractdate) {
        this.mlscontractdate = mlscontractdate;
    }

    private BigDecimal mlsbasementarea;

    @Basic
    @javax.persistence.Column(name = "MLSBASEMENTAREA", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getMlsbasementarea() {
        return mlsbasementarea;
    }

    public void setMlsbasementarea(BigDecimal mlsbasementarea) {
        this.mlsbasementarea = mlsbasementarea;
    }

    private BigDecimal mlsbasementfinish;

    @Basic
    @javax.persistence.Column(name = "MLSBASEMENTFINISH", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getMlsbasementfinish() {
        return mlsbasementfinish;
    }

    public void setMlsbasementfinish(BigDecimal mlsbasementfinish) {
        this.mlsbasementfinish = mlsbasementfinish;
    }

    private String mlsgaragetype;

    @Basic
    @javax.persistence.Column(name = "MLSGARAGETYPE", nullable = true, insertable = true, updatable = true, length = 100)
    public String getMlsgaragetype() {
        return mlsgaragetype;
    }

    public void setMlsgaragetype(String mlsgaragetype) {
        this.mlsgaragetype = mlsgaragetype;
    }

    private String mlsexterior;

    @Basic
    @javax.persistence.Column(name = "MLSEXTERIOR", nullable = true, insertable = true, updatable = true, length = 50)
    public String getMlsexterior() {
        return mlsexterior;
    }

    public void setMlsexterior(String mlsexterior) {
        this.mlsexterior = mlsexterior;
    }

    private String mlsrooftype;

    @Basic
    @javax.persistence.Column(name = "MLSROOFTYPE", nullable = true, insertable = true, updatable = true, length = 30)
    public String getMlsrooftype() {
        return mlsrooftype;
    }

    public void setMlsrooftype(String mlsrooftype) {
        this.mlsrooftype = mlsrooftype;
    }

    private String mlsheattype;

    @Basic
    @javax.persistence.Column(name = "MLSHEATTYPE", nullable = true, insertable = true, updatable = true, length = 30)
    public String getMlsheattype() {
        return mlsheattype;
    }

    public void setMlsheattype(String mlsheattype) {
        this.mlsheattype = mlsheattype;
    }

    private String mlsactype;

    @Basic
    @javax.persistence.Column(name = "MLSACTYPE", nullable = true, insertable = true, updatable = true, length = 30)
    public String getMlsactype() {
        return mlsactype;
    }

    public void setMlsactype(String mlsactype) {
        this.mlsactype = mlsactype;
    }

    private String mlsstyle;

    @Basic
    @javax.persistence.Column(name = "MLSSTYLE", nullable = true, insertable = true, updatable = true, length = 30)
    public String getMlsstyle() {
        return mlsstyle;
    }

    public void setMlsstyle(String mlsstyle) {
        this.mlsstyle = mlsstyle;
    }

    private Timestamp mlspusheddate;

    @Basic
    @javax.persistence.Column(name = "MLSPUSHEDDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getMlspusheddate() {
        return mlspusheddate;
    }

    public void setMlspusheddate(Timestamp mlspusheddate) {
        this.mlspusheddate = mlspusheddate;
    }

    private String mlsvalidsale;

    @Basic
    @javax.persistence.Column(name = "MLSVALIDSALE", nullable = true, insertable = true, updatable = true, length = 5)
    public String getMlsvalidsale() {
        return mlsvalidsale;
    }

    public void setMlsvalidsale(String mlsvalidsale) {
        this.mlsvalidsale = mlsvalidsale;
    }

    private String mlsworkstatus;

    @Basic
    @javax.persistence.Column(name = "MLSWORKSTATUS", nullable = true, insertable = true, updatable = true, length = 5)
    public String getMlsworkstatus() {
        return mlsworkstatus;
    }

    public void setMlsworkstatus(String mlsworkstatus) {
        this.mlsworkstatus = mlsworkstatus;
    }

    private String mlscomment;

    @Basic
    @javax.persistence.Column(name = "MLSCOMMENT", nullable = true, insertable = true, updatable = true, length = 2000)
    public String getMlscomment() {
        return mlscomment;
    }

    public void setMlscomment(String mlscomment) {
        this.mlscomment = mlscomment;
    }

    private Timestamp salemlsod0;

    @Basic
    @javax.persistence.Column(name = "SALEMLSOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getSalemlsod0() {
        return salemlsod0;
    }

    public void setSalemlsod0(Timestamp salemlsod0) {
        this.salemlsod0 = salemlsod0;
    }

    private Timestamp salemlsod1;

    @Basic
    @javax.persistence.Column(name = "SALEMLSOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getSalemlsod1() {
        return salemlsod1;
    }

    public void setSalemlsod1(Timestamp salemlsod1) {
        this.salemlsod1 = salemlsod1;
    }

    private String salemlsom0;

    @Basic
    @javax.persistence.Column(name = "SALEMLSOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSalemlsom0() {
        return salemlsom0;
    }

    public void setSalemlsom0(String salemlsom0) {
        this.salemlsom0 = salemlsom0;
    }

    private String salemlsom1;

    @Basic
    @javax.persistence.Column(name = "SALEMLSOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSalemlsom1() {
        return salemlsom1;
    }

    public void setSalemlsom1(String salemlsom1) {
        this.salemlsom1 = salemlsom1;
    }

    private BigDecimal salemlson0;

    @Basic
    @javax.persistence.Column(name = "SALEMLSON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSalemlson0() {
        return salemlson0;
    }

    public void setSalemlson0(BigDecimal salemlson0) {
        this.salemlson0 = salemlson0;
    }

    private BigDecimal salemlson1;

    @Basic
    @javax.persistence.Column(name = "SALEMLSON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSalemlson1() {
        return salemlson1;
    }

    public void setSalemlson1(BigDecimal salemlson1) {
        this.salemlson1 = salemlson1;
    }

    private BigDecimal salemlson2;

    @Basic
    @javax.persistence.Column(name = "SALEMLSON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSalemlson2() {
        return salemlson2;
    }

    public void setSalemlson2(BigDecimal salemlson2) {
        this.salemlson2 = salemlson2;
    }

    private String salemlsot0;

    @Basic
    @javax.persistence.Column(name = "SALEMLSOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSalemlsot0() {
        return salemlsot0;
    }

    public void setSalemlsot0(String salemlsot0) {
        this.salemlsot0 = salemlsot0;
    }

    private String salemlsot1;

    @Basic
    @javax.persistence.Column(name = "SALEMLSOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSalemlsot1() {
        return salemlsot1;
    }

    public void setSalemlsot1(String salemlsot1) {
        this.salemlsot1 = salemlsot1;
    }

    private int jurisdictionid;

    @javax.persistence.Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    private String mlsstatus;

    @Basic
    @javax.persistence.Column(name = "MLSSTATUS", nullable = false, insertable = true, updatable = true, length = 50)
    public String getMlsstatus() {
        return mlsstatus;
    }

    public void setMlsstatus(String mlsstatus) {
        this.mlsstatus = mlsstatus;
    }

    private BigDecimal mlsadjsaleprice;

    @Basic
    @javax.persistence.Column(name = "MLSADJSALEPRICE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getMlsadjsaleprice() {
        return mlsadjsaleprice;
    }

    public void setMlsadjsaleprice(BigDecimal mlsadjsaleprice) {
        this.mlsadjsaleprice = mlsadjsaleprice;
    }

    private String mlsadjreason;

    @Basic
    @javax.persistence.Column(name = "MLSADJREASON", nullable = true, insertable = true, updatable = true, length = 50)
    public String getMlsadjreason() {
        return mlsadjreason;
    }

    public void setMlsadjreason(String mlsadjreason) {
        this.mlsadjreason = mlsadjreason;
    }

    private String mlssaletype;

    @Basic
    @javax.persistence.Column(name = "MLSSALETYPE", nullable = true, insertable = true, updatable = true, length = 50)
    public String getMlssaletype() {
        return mlssaletype;
    }

    public void setMlssaletype(String mlssaletype) {
        this.mlssaletype = mlssaletype;
    }

    private String mlssaleterms;

    @Basic
    @javax.persistence.Column(name = "MLSSALETERMS", nullable = true, insertable = true, updatable = true, length = 50)
    public String getMlssaleterms() {
        return mlssaleterms;
    }

    public void setMlssaleterms(String mlssaleterms) {
        this.mlssaleterms = mlssaleterms;
    }

    private String mlsstatesrs;

    @Basic
    @javax.persistence.Column(name = "MLSSTATESRS", nullable = true, insertable = true, updatable = true, length = 50)
    public String getMlsstatesrs() {
        return mlsstatesrs;
    }

    public void setMlsstatesrs(String mlsstatesrs) {
        this.mlsstatesrs = mlsstatesrs;
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

    private String mlsstreetno;

    @Basic
    @javax.persistence.Column(name = "MLSSTREETNO", nullable = true, insertable = true, updatable = true, length = 15)
    public String getMlsstreetno() {
        return mlsstreetno;
    }

    public void setMlsstreetno(String mlsstreetno) {
        this.mlsstreetno = mlsstreetno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tbnmlssale that = (Tbnmlssale) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (mlslistingno != that.mlslistingno) return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (mlsactype != null ? !mlsactype.equals(that.mlsactype) : that.mlsactype != null)
            return false;
        if (mlsadjreason != null ? !mlsadjreason.equals(that.mlsadjreason) : that.mlsadjreason != null)
            return false;
        if (mlsadjsaleprice != null ? !mlsadjsaleprice.equals(that.mlsadjsaleprice) : that.mlsadjsaleprice != null)
            return false;
        if (mlsbasementarea != null ? !mlsbasementarea.equals(that.mlsbasementarea) : that.mlsbasementarea != null)
            return false;
        if (mlsbasementfinish != null ? !mlsbasementfinish.equals(that.mlsbasementfinish) : that.mlsbasementfinish != null)
            return false;
        if (mlscity != null ? !mlscity.equals(that.mlscity) : that.mlscity != null)
            return false;
        if (mlsclasscode != null ? !mlsclasscode.equals(that.mlsclasscode) : that.mlsclasscode != null)
            return false;
        if (mlscomment != null ? !mlscomment.equals(that.mlscomment) : that.mlscomment != null)
            return false;
        if (mlscontractdate != null ? !mlscontractdate.equals(that.mlscontractdate) : that.mlscontractdate != null)
            return false;
        if (mlsexterior != null ? !mlsexterior.equals(that.mlsexterior) : that.mlsexterior != null)
            return false;
        if (mlsgaragetype != null ? !mlsgaragetype.equals(that.mlsgaragetype) : that.mlsgaragetype != null)
            return false;
        if (mlsheattype != null ? !mlsheattype.equals(that.mlsheattype) : that.mlsheattype != null)
            return false;
        if (mlshoafees != null ? !mlshoafees.equals(that.mlshoafees) : that.mlshoafees != null)
            return false;
        if (mlslandnetacrecount != null ? !mlslandnetacrecount.equals(that.mlslandnetacrecount) : that.mlslandnetacrecount != null)
            return false;
        if (mlslistdate != null ? !mlslistdate.equals(that.mlslistdate) : that.mlslistdate != null)
            return false;
        if (mlslistprice != null ? !mlslistprice.equals(that.mlslistprice) : that.mlslistprice != null)
            return false;
        if (mlspaidconcessions != null ? !mlspaidconcessions.equals(that.mlspaidconcessions) : that.mlspaidconcessions != null)
            return false;
        if (mlsparcelno != null ? !mlsparcelno.equals(that.mlsparcelno) : that.mlsparcelno != null)
            return false;
        if (mlspostdirection != null ? !mlspostdirection.equals(that.mlspostdirection) : that.mlspostdirection != null)
            return false;
        if (mlspredirection != null ? !mlspredirection.equals(that.mlspredirection) : that.mlspredirection != null)
            return false;
        if (mlspusheddate != null ? !mlspusheddate.equals(that.mlspusheddate) : that.mlspusheddate != null)
            return false;
        if (mlsrooftype != null ? !mlsrooftype.equals(that.mlsrooftype) : that.mlsrooftype != null)
            return false;
        if (mlssaledate != null ? !mlssaledate.equals(that.mlssaledate) : that.mlssaledate != null)
            return false;
        if (mlssaleprice != null ? !mlssaleprice.equals(that.mlssaleprice) : that.mlssaleprice != null)
            return false;
        if (mlssaleterms != null ? !mlssaleterms.equals(that.mlssaleterms) : that.mlssaleterms != null)
            return false;
        if (mlssaletype != null ? !mlssaletype.equals(that.mlssaletype) : that.mlssaletype != null)
            return false;
        if (mlsserialno != null ? !mlsserialno.equals(that.mlsserialno) : that.mlsserialno != null)
            return false;
        if (mlsstate != null ? !mlsstate.equals(that.mlsstate) : that.mlsstate != null)
            return false;
        if (mlsstatesrs != null ? !mlsstatesrs.equals(that.mlsstatesrs) : that.mlsstatesrs != null)
            return false;
        if (mlsstatus != null ? !mlsstatus.equals(that.mlsstatus) : that.mlsstatus != null)
            return false;
        if (mlsstreetname != null ? !mlsstreetname.equals(that.mlsstreetname) : that.mlsstreetname != null)
            return false;
        if (mlsstreetno != null ? !mlsstreetno.equals(that.mlsstreetno) : that.mlsstreetno != null)
            return false;
        if (mlsstreettype != null ? !mlsstreettype.equals(that.mlsstreettype) : that.mlsstreettype != null)
            return false;
        if (mlsstyle != null ? !mlsstyle.equals(that.mlsstyle) : that.mlsstyle != null)
            return false;
        if (mlssubdivisionname != null ? !mlssubdivisionname.equals(that.mlssubdivisionname) : that.mlssubdivisionname != null)
            return false;
        if (mlstotalimpsf != null ? !mlstotalimpsf.equals(that.mlstotalimpsf) : that.mlstotalimpsf != null)
            return false;
        if (mlsvalidsale != null ? !mlsvalidsale.equals(that.mlsvalidsale) : that.mlsvalidsale != null)
            return false;
        if (mlsworkstatus != null ? !mlsworkstatus.equals(that.mlsworkstatus) : that.mlsworkstatus != null)
            return false;
        if (mlsyearbuilt != null ? !mlsyearbuilt.equals(that.mlsyearbuilt) : that.mlsyearbuilt != null)
            return false;
        if (mlszipcode != null ? !mlszipcode.equals(that.mlszipcode) : that.mlszipcode != null)
            return false;
        if (salemlsod0 != null ? !salemlsod0.equals(that.salemlsod0) : that.salemlsod0 != null)
            return false;
        if (salemlsod1 != null ? !salemlsod1.equals(that.salemlsod1) : that.salemlsod1 != null)
            return false;
        if (salemlsom0 != null ? !salemlsom0.equals(that.salemlsom0) : that.salemlsom0 != null)
            return false;
        if (salemlsom1 != null ? !salemlsom1.equals(that.salemlsom1) : that.salemlsom1 != null)
            return false;
        if (salemlson0 != null ? !salemlson0.equals(that.salemlson0) : that.salemlson0 != null)
            return false;
        if (salemlson1 != null ? !salemlson1.equals(that.salemlson1) : that.salemlson1 != null)
            return false;
        if (salemlson2 != null ? !salemlson2.equals(that.salemlson2) : that.salemlson2 != null)
            return false;
        if (salemlsot0 != null ? !salemlsot0.equals(that.salemlsot0) : that.salemlsot0 != null)
            return false;
        if (salemlsot1 != null ? !salemlsot1.equals(that.salemlsot1) : that.salemlsot1 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mlslistingno;
        result = 31 * result + (mlsserialno != null ? mlsserialno.hashCode() : 0);
        result = 31 * result + (mlsparcelno != null ? mlsparcelno.hashCode() : 0);
        result = 31 * result + (mlssaleprice != null ? mlssaleprice.hashCode() : 0);
        result = 31 * result + (mlssaledate != null ? mlssaledate.hashCode() : 0);
        result = 31 * result + (mlspredirection != null ? mlspredirection.hashCode() : 0);
        result = 31 * result + (mlsstreetname != null ? mlsstreetname.hashCode() : 0);
        result = 31 * result + (mlsstreettype != null ? mlsstreettype.hashCode() : 0);
        result = 31 * result + (mlspostdirection != null ? mlspostdirection.hashCode() : 0);
        result = 31 * result + (mlscity != null ? mlscity.hashCode() : 0);
        result = 31 * result + (mlsstate != null ? mlsstate.hashCode() : 0);
        result = 31 * result + (mlszipcode != null ? mlszipcode.hashCode() : 0);
        result = 31 * result + (mlstotalimpsf != null ? mlstotalimpsf.hashCode() : 0);
        result = 31 * result + (mlslandnetacrecount != null ? mlslandnetacrecount.hashCode() : 0);
        result = 31 * result + (mlsyearbuilt != null ? mlsyearbuilt.hashCode() : 0);
        result = 31 * result + (mlssubdivisionname != null ? mlssubdivisionname.hashCode() : 0);
        result = 31 * result + (mlsclasscode != null ? mlsclasscode.hashCode() : 0);
        result = 31 * result + (mlslistprice != null ? mlslistprice.hashCode() : 0);
        result = 31 * result + (mlslistdate != null ? mlslistdate.hashCode() : 0);
        result = 31 * result + (mlspaidconcessions != null ? mlspaidconcessions.hashCode() : 0);
        result = 31 * result + (mlshoafees != null ? mlshoafees.hashCode() : 0);
        result = 31 * result + (mlscontractdate != null ? mlscontractdate.hashCode() : 0);
        result = 31 * result + (mlsbasementarea != null ? mlsbasementarea.hashCode() : 0);
        result = 31 * result + (mlsbasementfinish != null ? mlsbasementfinish.hashCode() : 0);
        result = 31 * result + (mlsgaragetype != null ? mlsgaragetype.hashCode() : 0);
        result = 31 * result + (mlsexterior != null ? mlsexterior.hashCode() : 0);
        result = 31 * result + (mlsrooftype != null ? mlsrooftype.hashCode() : 0);
        result = 31 * result + (mlsheattype != null ? mlsheattype.hashCode() : 0);
        result = 31 * result + (mlsactype != null ? mlsactype.hashCode() : 0);
        result = 31 * result + (mlsstyle != null ? mlsstyle.hashCode() : 0);
        result = 31 * result + (mlspusheddate != null ? mlspusheddate.hashCode() : 0);
        result = 31 * result + (mlsvalidsale != null ? mlsvalidsale.hashCode() : 0);
        result = 31 * result + (mlsworkstatus != null ? mlsworkstatus.hashCode() : 0);
        result = 31 * result + (mlscomment != null ? mlscomment.hashCode() : 0);
        result = 31 * result + (salemlsod0 != null ? salemlsod0.hashCode() : 0);
        result = 31 * result + (salemlsod1 != null ? salemlsod1.hashCode() : 0);
        result = 31 * result + (salemlsom0 != null ? salemlsom0.hashCode() : 0);
        result = 31 * result + (salemlsom1 != null ? salemlsom1.hashCode() : 0);
        result = 31 * result + (salemlson0 != null ? salemlson0.hashCode() : 0);
        result = 31 * result + (salemlson1 != null ? salemlson1.hashCode() : 0);
        result = 31 * result + (salemlson2 != null ? salemlson2.hashCode() : 0);
        result = 31 * result + (salemlsot0 != null ? salemlsot0.hashCode() : 0);
        result = 31 * result + (salemlsot1 != null ? salemlsot1.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (mlsstatus != null ? mlsstatus.hashCode() : 0);
        result = 31 * result + (mlsadjsaleprice != null ? mlsadjsaleprice.hashCode() : 0);
        result = 31 * result + (mlsadjreason != null ? mlsadjreason.hashCode() : 0);
        result = 31 * result + (mlssaletype != null ? mlssaletype.hashCode() : 0);
        result = 31 * result + (mlssaleterms != null ? mlssaleterms.hashCode() : 0);
        result = 31 * result + (mlsstatesrs != null ? mlsstatesrs.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        result = 31 * result + (mlsstreetno != null ? mlsstreetno.hashCode() : 0);
        return result;
    }
}
