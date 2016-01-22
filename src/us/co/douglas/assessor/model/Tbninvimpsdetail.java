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
public class Tbninvimpsdetail {
    private int invimpsdetailid;

    @Id
    @javax.persistence.Column(name = "INVIMPSDETAILID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getInvimpsdetailid() {
        return invimpsdetailid;
    }

    public void setInvimpsdetailid(int invimpsdetailid) {
        this.invimpsdetailid = invimpsdetailid;
    }

    private int detailid;

    @Basic
    @javax.persistence.Column(name = "DETAILID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getDetailid() {
        return detailid;
    }

    public void setDetailid(int detailid) {
        this.detailid = detailid;
    }

    private String impdetailtype;

    @Basic
    @javax.persistence.Column(name = "IMPDETAILTYPE", nullable = true, insertable = true, updatable = true, length = 30)
    public String getImpdetailtype() {
        return impdetailtype;
    }

    public void setImpdetailtype(String impdetailtype) {
        this.impdetailtype = impdetailtype;
    }

    private String impdetaildescription;

    @Basic
    @javax.persistence.Column(name = "IMPDETAILDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpdetaildescription() {
        return impdetaildescription;
    }

    public void setImpdetaildescription(String impdetaildescription) {
        this.impdetaildescription = impdetaildescription;
    }

    private BigDecimal detailunitcount;

    @Basic
    @javax.persistence.Column(name = "DETAILUNITCOUNT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getDetailunitcount() {
        return detailunitcount;
    }

    public void setDetailunitcount(BigDecimal detailunitcount) {
        this.detailunitcount = detailunitcount;
    }

    private Integer detailyearbuilt;

    @Basic
    @javax.persistence.Column(name = "DETAILYEARBUILT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getDetailyearbuilt() {
        return detailyearbuilt;
    }

    public void setDetailyearbuilt(Integer detailyearbuilt) {
        this.detailyearbuilt = detailyearbuilt;
    }

    private Integer addoncode;

    @Basic
    @javax.persistence.Column(name = "ADDONCODE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getAddoncode() {
        return addoncode;
    }

    public void setAddoncode(Integer addoncode) {
        this.addoncode = addoncode;
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

    private BigInteger apexlinkflag;

    @Basic
    @javax.persistence.Column(name = "APEXLINKFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getApexlinkflag() {
        return apexlinkflag;
    }

    public void setApexlinkflag(BigInteger apexlinkflag) {
        this.apexlinkflag = apexlinkflag;
    }

    private String impsdetailot0;

    @Basic
    @javax.persistence.Column(name = "IMPSDETAILOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsdetailot0() {
        return impsdetailot0;
    }

    public void setImpsdetailot0(String impsdetailot0) {
        this.impsdetailot0 = impsdetailot0;
    }

    private String impsdetailot1;

    @Basic
    @javax.persistence.Column(name = "IMPSDETAILOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsdetailot1() {
        return impsdetailot1;
    }

    public void setImpsdetailot1(String impsdetailot1) {
        this.impsdetailot1 = impsdetailot1;
    }

    private String impsdetailom0;

    @Basic
    @javax.persistence.Column(name = "IMPSDETAILOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsdetailom0() {
        return impsdetailom0;
    }

    public void setImpsdetailom0(String impsdetailom0) {
        this.impsdetailom0 = impsdetailom0;
    }

    private String impsdetailom1;

    @Basic
    @javax.persistence.Column(name = "IMPSDETAILOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsdetailom1() {
        return impsdetailom1;
    }

    public void setImpsdetailom1(String impsdetailom1) {
        this.impsdetailom1 = impsdetailom1;
    }

    private Timestamp impsdetailod0;

    @Basic
    @javax.persistence.Column(name = "IMPSDETAILOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getImpsdetailod0() {
        return impsdetailod0;
    }

    public void setImpsdetailod0(Timestamp impsdetailod0) {
        this.impsdetailod0 = impsdetailod0;
    }

    private Timestamp impsdetailod1;

    @Basic
    @javax.persistence.Column(name = "IMPSDETAILOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getImpsdetailod1() {
        return impsdetailod1;
    }

    public void setImpsdetailod1(Timestamp impsdetailod1) {
        this.impsdetailod1 = impsdetailod1;
    }

    private BigDecimal impsdetailon0;

    @Basic
    @javax.persistence.Column(name = "IMPSDETAILON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getImpsdetailon0() {
        return impsdetailon0;
    }

    public void setImpsdetailon0(BigDecimal impsdetailon0) {
        this.impsdetailon0 = impsdetailon0;
    }

    private BigDecimal impsdetailon1;

    @Basic
    @javax.persistence.Column(name = "IMPSDETAILON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getImpsdetailon1() {
        return impsdetailon1;
    }

    public void setImpsdetailon1(BigDecimal impsdetailon1) {
        this.impsdetailon1 = impsdetailon1;
    }

    private BigDecimal impsdetailon2;

    @Basic
    @javax.persistence.Column(name = "IMPSDETAILON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getImpsdetailon2() {
        return impsdetailon2;
    }

    public void setImpsdetailon2(BigDecimal impsdetailon2) {
        this.impsdetailon2 = impsdetailon2;
    }

    private int impdetailtypeid;

    @Basic
    @javax.persistence.Column(name = "IMPDETAILTYPEID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getImpdetailtypeid() {
        return impdetailtypeid;
    }

    public void setImpdetailtypeid(int impdetailtypeid) {
        this.impdetailtypeid = impdetailtypeid;
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

        Tbninvimpsdetail that = (Tbninvimpsdetail) o;

        if (detailid != that.detailid) return false;
        if (impdetailtypeid != that.impdetailtypeid) return false;
        if (invimpsdetailid != that.invimpsdetailid) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (addoncode != null ? !addoncode.equals(that.addoncode) : that.addoncode != null)
            return false;
        if (apexlinkflag != null ? !apexlinkflag.equals(that.apexlinkflag) : that.apexlinkflag != null)
            return false;
        if (detailunitcount != null ? !detailunitcount.equals(that.detailunitcount) : that.detailunitcount != null)
            return false;
        if (detailyearbuilt != null ? !detailyearbuilt.equals(that.detailyearbuilt) : that.detailyearbuilt != null)
            return false;
        if (impdetaildescription != null ? !impdetaildescription.equals(that.impdetaildescription) : that.impdetaildescription != null)
            return false;
        if (impdetailtype != null ? !impdetailtype.equals(that.impdetailtype) : that.impdetailtype != null)
            return false;
        if (impsdetailod0 != null ? !impsdetailod0.equals(that.impsdetailod0) : that.impsdetailod0 != null)
            return false;
        if (impsdetailod1 != null ? !impsdetailod1.equals(that.impsdetailod1) : that.impsdetailod1 != null)
            return false;
        if (impsdetailom0 != null ? !impsdetailom0.equals(that.impsdetailom0) : that.impsdetailom0 != null)
            return false;
        if (impsdetailom1 != null ? !impsdetailom1.equals(that.impsdetailom1) : that.impsdetailom1 != null)
            return false;
        if (impsdetailon0 != null ? !impsdetailon0.equals(that.impsdetailon0) : that.impsdetailon0 != null)
            return false;
        if (impsdetailon1 != null ? !impsdetailon1.equals(that.impsdetailon1) : that.impsdetailon1 != null)
            return false;
        if (impsdetailon2 != null ? !impsdetailon2.equals(that.impsdetailon2) : that.impsdetailon2 != null)
            return false;
        if (impsdetailot0 != null ? !impsdetailot0.equals(that.impsdetailot0) : that.impsdetailot0 != null)
            return false;
        if (impsdetailot1 != null ? !impsdetailot1.equals(that.impsdetailot1) : that.impsdetailot1 != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invimpsdetailid;
        result = 31 * result + detailid;
        result = 31 * result + (impdetailtype != null ? impdetailtype.hashCode() : 0);
        result = 31 * result + (impdetaildescription != null ? impdetaildescription.hashCode() : 0);
        result = 31 * result + (detailunitcount != null ? detailunitcount.hashCode() : 0);
        result = 31 * result + (detailyearbuilt != null ? detailyearbuilt.hashCode() : 0);
        result = 31 * result + (addoncode != null ? addoncode.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (apexlinkflag != null ? apexlinkflag.hashCode() : 0);
        result = 31 * result + (impsdetailot0 != null ? impsdetailot0.hashCode() : 0);
        result = 31 * result + (impsdetailot1 != null ? impsdetailot1.hashCode() : 0);
        result = 31 * result + (impsdetailom0 != null ? impsdetailom0.hashCode() : 0);
        result = 31 * result + (impsdetailom1 != null ? impsdetailom1.hashCode() : 0);
        result = 31 * result + (impsdetailod0 != null ? impsdetailod0.hashCode() : 0);
        result = 31 * result + (impsdetailod1 != null ? impsdetailod1.hashCode() : 0);
        result = 31 * result + (impsdetailon0 != null ? impsdetailon0.hashCode() : 0);
        result = 31 * result + (impsdetailon1 != null ? impsdetailon1.hashCode() : 0);
        result = 31 * result + (impsdetailon2 != null ? impsdetailon2.hashCode() : 0);
        result = 31 * result + impdetailtypeid;
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
