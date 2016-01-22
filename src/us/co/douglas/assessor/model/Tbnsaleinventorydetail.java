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
public class Tbnsaleinventorydetail {
    private String receptionno;

    @Basic
    @javax.persistence.Column(name = "RECEPTIONNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getReceptionno() {
        return receptionno;
    }

    public void setReceptionno(String receptionno) {
        this.receptionno = receptionno;
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

    private BigDecimal saleinventorydetailon0;

    @Basic
    @javax.persistence.Column(name = "SALEINVENTORYDETAILON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleinventorydetailon0() {
        return saleinventorydetailon0;
    }

    public void setSaleinventorydetailon0(BigDecimal saleinventorydetailon0) {
        this.saleinventorydetailon0 = saleinventorydetailon0;
    }

    private BigDecimal saleinventorydetailon1;

    @Basic
    @javax.persistence.Column(name = "SALEINVENTORYDETAILON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleinventorydetailon1() {
        return saleinventorydetailon1;
    }

    public void setSaleinventorydetailon1(BigDecimal saleinventorydetailon1) {
        this.saleinventorydetailon1 = saleinventorydetailon1;
    }

    private BigDecimal saleinventorydetailon2;

    @Basic
    @javax.persistence.Column(name = "SALEINVENTORYDETAILON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleinventorydetailon2() {
        return saleinventorydetailon2;
    }

    public void setSaleinventorydetailon2(BigDecimal saleinventorydetailon2) {
        this.saleinventorydetailon2 = saleinventorydetailon2;
    }

    private Timestamp saleinventorydetailod0;

    @Basic
    @javax.persistence.Column(name = "SALEINVENTORYDETAILOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleinventorydetailod0() {
        return saleinventorydetailod0;
    }

    public void setSaleinventorydetailod0(Timestamp saleinventorydetailod0) {
        this.saleinventorydetailod0 = saleinventorydetailod0;
    }

    private Timestamp saleinventorydetailod1;

    @Basic
    @javax.persistence.Column(name = "SALEINVENTORYDETAILOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleinventorydetailod1() {
        return saleinventorydetailod1;
    }

    public void setSaleinventorydetailod1(Timestamp saleinventorydetailod1) {
        this.saleinventorydetailod1 = saleinventorydetailod1;
    }

    private String saleinventorydetailom0;

    @Basic
    @javax.persistence.Column(name = "SALEINVENTORYDETAILOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleinventorydetailom0() {
        return saleinventorydetailom0;
    }

    public void setSaleinventorydetailom0(String saleinventorydetailom0) {
        this.saleinventorydetailom0 = saleinventorydetailom0;
    }

    private String saleinventorydetailom1;

    @Basic
    @javax.persistence.Column(name = "SALEINVENTORYDETAILOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleinventorydetailom1() {
        return saleinventorydetailom1;
    }

    public void setSaleinventorydetailom1(String saleinventorydetailom1) {
        this.saleinventorydetailom1 = saleinventorydetailom1;
    }

    private String saleinventorydetailot0;

    @Basic
    @javax.persistence.Column(name = "SALEINVENTORYDETAILOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleinventorydetailot0() {
        return saleinventorydetailot0;
    }

    public void setSaleinventorydetailot0(String saleinventorydetailot0) {
        this.saleinventorydetailot0 = saleinventorydetailot0;
    }

    private String saleinventorydetailot1;

    @Basic
    @javax.persistence.Column(name = "SALEINVENTORYDETAILOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleinventorydetailot1() {
        return saleinventorydetailot1;
    }

    public void setSaleinventorydetailot1(String saleinventorydetailot1) {
        this.saleinventorydetailot1 = saleinventorydetailot1;
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

    private int inventorydetailid;

    @Id
    @javax.persistence.Column(name = "INVENTORYDETAILID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getInventorydetailid() {
        return inventorydetailid;
    }

    public void setInventorydetailid(int inventorydetailid) {
        this.inventorydetailid = inventorydetailid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tbnsaleinventorydetail that = (Tbnsaleinventorydetail) o;

        if (inventorydetailid != that.inventorydetailid) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null)
            return false;
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
        if (saleinventorydetailod0 != null ? !saleinventorydetailod0.equals(that.saleinventorydetailod0) : that.saleinventorydetailod0 != null)
            return false;
        if (saleinventorydetailod1 != null ? !saleinventorydetailod1.equals(that.saleinventorydetailod1) : that.saleinventorydetailod1 != null)
            return false;
        if (saleinventorydetailom0 != null ? !saleinventorydetailom0.equals(that.saleinventorydetailom0) : that.saleinventorydetailom0 != null)
            return false;
        if (saleinventorydetailom1 != null ? !saleinventorydetailom1.equals(that.saleinventorydetailom1) : that.saleinventorydetailom1 != null)
            return false;
        if (saleinventorydetailon0 != null ? !saleinventorydetailon0.equals(that.saleinventorydetailon0) : that.saleinventorydetailon0 != null)
            return false;
        if (saleinventorydetailon1 != null ? !saleinventorydetailon1.equals(that.saleinventorydetailon1) : that.saleinventorydetailon1 != null)
            return false;
        if (saleinventorydetailon2 != null ? !saleinventorydetailon2.equals(that.saleinventorydetailon2) : that.saleinventorydetailon2 != null)
            return false;
        if (saleinventorydetailot0 != null ? !saleinventorydetailot0.equals(that.saleinventorydetailot0) : that.saleinventorydetailot0 != null)
            return false;
        if (saleinventorydetailot1 != null ? !saleinventorydetailot1.equals(that.saleinventorydetailot1) : that.saleinventorydetailot1 != null)
            return false;
        if (yearbuilt != null ? !yearbuilt.equals(that.yearbuilt) : that.yearbuilt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = receptionno != null ? receptionno.hashCode() : 0;
        result = 31 * result + (accountno != null ? accountno.hashCode() : 0);
        result = 31 * result + (detailtype != null ? detailtype.hashCode() : 0);
        result = 31 * result + (inventorydetailtype != null ? inventorydetailtype.hashCode() : 0);
        result = 31 * result + (inventorydetaildescription != null ? inventorydetaildescription.hashCode() : 0);
        result = 31 * result + (inventoryunitcount != null ? inventoryunitcount.hashCode() : 0);
        result = 31 * result + (saleinventorydetailon0 != null ? saleinventorydetailon0.hashCode() : 0);
        result = 31 * result + (saleinventorydetailon1 != null ? saleinventorydetailon1.hashCode() : 0);
        result = 31 * result + (saleinventorydetailon2 != null ? saleinventorydetailon2.hashCode() : 0);
        result = 31 * result + (saleinventorydetailod0 != null ? saleinventorydetailod0.hashCode() : 0);
        result = 31 * result + (saleinventorydetailod1 != null ? saleinventorydetailod1.hashCode() : 0);
        result = 31 * result + (saleinventorydetailom0 != null ? saleinventorydetailom0.hashCode() : 0);
        result = 31 * result + (saleinventorydetailom1 != null ? saleinventorydetailom1.hashCode() : 0);
        result = 31 * result + (saleinventorydetailot0 != null ? saleinventorydetailot0.hashCode() : 0);
        result = 31 * result + (saleinventorydetailot1 != null ? saleinventorydetailot1.hashCode() : 0);
        result = 31 * result + (yearbuilt != null ? yearbuilt.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        result = 31 * result + inventorydetailid;
        return result;
    }
}
