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
public class Tbnsaleoutofareadetail {
    private int inventorydetailid;

    @Id
    @javax.persistence.Column(name = "INVENTORYDETAILID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getInventorydetailid() {
        return inventorydetailid;
    }

    public void setInventorydetailid(int inventorydetailid) {
        this.inventorydetailid = inventorydetailid;
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

    private String detailtype;

    @Basic
    @javax.persistence.Column(name = "DETAILTYPE", nullable = false, insertable = true, updatable = true, length = 50)
    public String getDetailtype() {
        return detailtype;
    }

    public void setDetailtype(String detailtype) {
        this.detailtype = detailtype;
    }

    private String inventorydetailtype;

    @Basic
    @javax.persistence.Column(name = "INVENTORYDETAILTYPE", nullable = false, insertable = true, updatable = true, length = 100)
    public String getInventorydetailtype() {
        return inventorydetailtype;
    }

    public void setInventorydetailtype(String inventorydetailtype) {
        this.inventorydetailtype = inventorydetailtype;
    }

    private String inventorydetaildescription;

    @Basic
    @javax.persistence.Column(name = "INVENTORYDETAILDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 100)
    public String getInventorydetaildescription() {
        return inventorydetaildescription;
    }

    public void setInventorydetaildescription(String inventorydetaildescription) {
        this.inventorydetaildescription = inventorydetaildescription;
    }

    private BigDecimal inventoryunitcount;

    @Basic
    @javax.persistence.Column(name = "INVENTORYUNITCOUNT", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getInventoryunitcount() {
        return inventoryunitcount;
    }

    public void setInventoryunitcount(BigDecimal inventoryunitcount) {
        this.inventoryunitcount = inventoryunitcount;
    }

    private BigDecimal saleoutofareadetailon0;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREADETAILON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleoutofareadetailon0() {
        return saleoutofareadetailon0;
    }

    public void setSaleoutofareadetailon0(BigDecimal saleoutofareadetailon0) {
        this.saleoutofareadetailon0 = saleoutofareadetailon0;
    }

    private BigDecimal saleoutofareadetailon1;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREADETAILON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleoutofareadetailon1() {
        return saleoutofareadetailon1;
    }

    public void setSaleoutofareadetailon1(BigDecimal saleoutofareadetailon1) {
        this.saleoutofareadetailon1 = saleoutofareadetailon1;
    }

    private BigDecimal saleoutofareadetailon2;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREADETAILON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleoutofareadetailon2() {
        return saleoutofareadetailon2;
    }

    public void setSaleoutofareadetailon2(BigDecimal saleoutofareadetailon2) {
        this.saleoutofareadetailon2 = saleoutofareadetailon2;
    }

    private Timestamp saleoutofareadetailod0;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREADETAILOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleoutofareadetailod0() {
        return saleoutofareadetailod0;
    }

    public void setSaleoutofareadetailod0(Timestamp saleoutofareadetailod0) {
        this.saleoutofareadetailod0 = saleoutofareadetailod0;
    }

    private Timestamp saleoutofareadetailod1;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREADETAILOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleoutofareadetailod1() {
        return saleoutofareadetailod1;
    }

    public void setSaleoutofareadetailod1(Timestamp saleoutofareadetailod1) {
        this.saleoutofareadetailod1 = saleoutofareadetailod1;
    }

    private String saleoutofareadetailom0;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREADETAILOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleoutofareadetailom0() {
        return saleoutofareadetailom0;
    }

    public void setSaleoutofareadetailom0(String saleoutofareadetailom0) {
        this.saleoutofareadetailom0 = saleoutofareadetailom0;
    }

    private String saleoutofareadetailom1;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREADETAILOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleoutofareadetailom1() {
        return saleoutofareadetailom1;
    }

    public void setSaleoutofareadetailom1(String saleoutofareadetailom1) {
        this.saleoutofareadetailom1 = saleoutofareadetailom1;
    }

    private String saleoutofareadetailot0;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREADETAILOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleoutofareadetailot0() {
        return saleoutofareadetailot0;
    }

    public void setSaleoutofareadetailot0(String saleoutofareadetailot0) {
        this.saleoutofareadetailot0 = saleoutofareadetailot0;
    }

    private String saleoutofareadetailot1;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREADETAILOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleoutofareadetailot1() {
        return saleoutofareadetailot1;
    }

    public void setSaleoutofareadetailot1(String saleoutofareadetailot1) {
        this.saleoutofareadetailot1 = saleoutofareadetailot1;
    }

    private Integer yearbuilt;

    @Basic
    @javax.persistence.Column(name = "YEARBUILT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getYearbuilt() {
        return yearbuilt;
    }

    public void setYearbuilt(Integer yearbuilt) {
        this.yearbuilt = yearbuilt;
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

        Tbnsaleoutofareadetail that = (Tbnsaleoutofareadetail) o;

        if (inventorydetailid != that.inventorydetailid) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (detailtype != null ? !detailtype.equals(that.detailtype) : that.detailtype != null)
            return false;
        if (inventorydetaildescription != null ? !inventorydetaildescription.equals(that.inventorydetaildescription) : that.inventorydetaildescription != null)
            return false;
        if (inventorydetailtype != null ? !inventorydetailtype.equals(that.inventorydetailtype) : that.inventorydetailtype != null)
            return false;
        if (inventoryunitcount != null ? !inventoryunitcount.equals(that.inventoryunitcount) : that.inventoryunitcount != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (receptionno != null ? !receptionno.equals(that.receptionno) : that.receptionno != null)
            return false;
        if (saleoutofareadetailod0 != null ? !saleoutofareadetailod0.equals(that.saleoutofareadetailod0) : that.saleoutofareadetailod0 != null)
            return false;
        if (saleoutofareadetailod1 != null ? !saleoutofareadetailod1.equals(that.saleoutofareadetailod1) : that.saleoutofareadetailod1 != null)
            return false;
        if (saleoutofareadetailom0 != null ? !saleoutofareadetailom0.equals(that.saleoutofareadetailom0) : that.saleoutofareadetailom0 != null)
            return false;
        if (saleoutofareadetailom1 != null ? !saleoutofareadetailom1.equals(that.saleoutofareadetailom1) : that.saleoutofareadetailom1 != null)
            return false;
        if (saleoutofareadetailon0 != null ? !saleoutofareadetailon0.equals(that.saleoutofareadetailon0) : that.saleoutofareadetailon0 != null)
            return false;
        if (saleoutofareadetailon1 != null ? !saleoutofareadetailon1.equals(that.saleoutofareadetailon1) : that.saleoutofareadetailon1 != null)
            return false;
        if (saleoutofareadetailon2 != null ? !saleoutofareadetailon2.equals(that.saleoutofareadetailon2) : that.saleoutofareadetailon2 != null)
            return false;
        if (saleoutofareadetailot0 != null ? !saleoutofareadetailot0.equals(that.saleoutofareadetailot0) : that.saleoutofareadetailot0 != null)
            return false;
        if (saleoutofareadetailot1 != null ? !saleoutofareadetailot1.equals(that.saleoutofareadetailot1) : that.saleoutofareadetailot1 != null)
            return false;
        if (yearbuilt != null ? !yearbuilt.equals(that.yearbuilt) : that.yearbuilt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = inventorydetailid;
        result = 31 * result + (receptionno != null ? receptionno.hashCode() : 0);
        result = 31 * result + (detailtype != null ? detailtype.hashCode() : 0);
        result = 31 * result + (inventorydetailtype != null ? inventorydetailtype.hashCode() : 0);
        result = 31 * result + (inventorydetaildescription != null ? inventorydetaildescription.hashCode() : 0);
        result = 31 * result + (inventoryunitcount != null ? inventoryunitcount.hashCode() : 0);
        result = 31 * result + (saleoutofareadetailon0 != null ? saleoutofareadetailon0.hashCode() : 0);
        result = 31 * result + (saleoutofareadetailon1 != null ? saleoutofareadetailon1.hashCode() : 0);
        result = 31 * result + (saleoutofareadetailon2 != null ? saleoutofareadetailon2.hashCode() : 0);
        result = 31 * result + (saleoutofareadetailod0 != null ? saleoutofareadetailod0.hashCode() : 0);
        result = 31 * result + (saleoutofareadetailod1 != null ? saleoutofareadetailod1.hashCode() : 0);
        result = 31 * result + (saleoutofareadetailom0 != null ? saleoutofareadetailom0.hashCode() : 0);
        result = 31 * result + (saleoutofareadetailom1 != null ? saleoutofareadetailom1.hashCode() : 0);
        result = 31 * result + (saleoutofareadetailot0 != null ? saleoutofareadetailot0.hashCode() : 0);
        result = 31 * result + (saleoutofareadetailot1 != null ? saleoutofareadetailot1.hashCode() : 0);
        result = 31 * result + (yearbuilt != null ? yearbuilt.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
