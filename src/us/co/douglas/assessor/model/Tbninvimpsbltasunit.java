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
public class Tbninvimpsbltasunit {
    private int invimpsbltasunitid;

    @Id
    @javax.persistence.Column(name = "INVIMPSBLTASUNITID", nullable = false, insertable = true, updatable = true)
    public int getInvimpsbltasunitid() {
        return invimpsbltasunitid;
    }

    public void setInvimpsbltasunitid(int invimpsbltasunitid) {
        this.invimpsbltasunitid = invimpsbltasunitid;
    }

    private int bltasdetailid;

    @Basic
    @javax.persistence.Column(name = "BLTASDETAILID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getBltasdetailid() {
        return bltasdetailid;
    }

    public void setBltasdetailid(int bltasdetailid) {
        this.bltasdetailid = bltasdetailid;
    }

    private int bltascode;

    @Basic
    @javax.persistence.Column(name = "BLTASCODE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getBltascode() {
        return bltascode;
    }

    public void setBltascode(int bltascode) {
        this.bltascode = bltascode;
    }

    private String unittype;

    @Basic
    @javax.persistence.Column(name = "UNITTYPE", nullable = true, insertable = true, updatable = true, length = 50)
    public String getUnittype() {
        return unittype;
    }

    public void setUnittype(String unittype) {
        this.unittype = unittype;
    }

    private Integer bltasunitcount;

    @Basic
    @javax.persistence.Column(name = "BLTASUNITCOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getBltasunitcount() {
        return bltasunitcount;
    }

    public void setBltasunitcount(Integer bltasunitcount) {
        this.bltasunitcount = bltasunitcount;
    }

    private String ihpresentationtype;

    @Basic
    @javax.persistence.Column(name = "IHPRESENTATIONTYPE", nullable = false, insertable = true, updatable = true, length = 20)
    public String getIhpresentationtype() {
        return ihpresentationtype;
    }

    public void setIhpresentationtype(String ihpresentationtype) {
        this.ihpresentationtype = ihpresentationtype;
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

    private int jurisdictionid;

    @Basic
    @javax.persistence.Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    private String impsbltasunitot0;

    @Basic
    @javax.persistence.Column(name = "IMPSBLTASUNITOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsbltasunitot0() {
        return impsbltasunitot0;
    }

    public void setImpsbltasunitot0(String impsbltasunitot0) {
        this.impsbltasunitot0 = impsbltasunitot0;
    }

    private String impsbltasunitot1;

    @Basic
    @javax.persistence.Column(name = "IMPSBLTASUNITOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsbltasunitot1() {
        return impsbltasunitot1;
    }

    public void setImpsbltasunitot1(String impsbltasunitot1) {
        this.impsbltasunitot1 = impsbltasunitot1;
    }

    private String impsbltasunitom0;

    @Basic
    @javax.persistence.Column(name = "IMPSBLTASUNITOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsbltasunitom0() {
        return impsbltasunitom0;
    }

    public void setImpsbltasunitom0(String impsbltasunitom0) {
        this.impsbltasunitom0 = impsbltasunitom0;
    }

    private String impsbltasunitom1;

    @Basic
    @javax.persistence.Column(name = "IMPSBLTASUNITOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsbltasunitom1() {
        return impsbltasunitom1;
    }

    public void setImpsbltasunitom1(String impsbltasunitom1) {
        this.impsbltasunitom1 = impsbltasunitom1;
    }

    private Timestamp impsbltasunitod0;

    @Basic
    @javax.persistence.Column(name = "IMPSBLTASUNITOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getImpsbltasunitod0() {
        return impsbltasunitod0;
    }

    public void setImpsbltasunitod0(Timestamp impsbltasunitod0) {
        this.impsbltasunitod0 = impsbltasunitod0;
    }

    private Timestamp impsbltasunitod1;

    @Basic
    @javax.persistence.Column(name = "IMPSBLTASUNITOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getImpsbltasunitod1() {
        return impsbltasunitod1;
    }

    public void setImpsbltasunitod1(Timestamp impsbltasunitod1) {
        this.impsbltasunitod1 = impsbltasunitod1;
    }

    private BigDecimal impsbltasuniton0;

    @Basic
    @javax.persistence.Column(name = "IMPSBLTASUNITON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getImpsbltasuniton0() {
        return impsbltasuniton0;
    }

    public void setImpsbltasuniton0(BigDecimal impsbltasuniton0) {
        this.impsbltasuniton0 = impsbltasuniton0;
    }

    private BigDecimal impsbltasuniton1;

    @Basic
    @javax.persistence.Column(name = "IMPSBLTASUNITON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getImpsbltasuniton1() {
        return impsbltasuniton1;
    }

    public void setImpsbltasuniton1(BigDecimal impsbltasuniton1) {
        this.impsbltasuniton1 = impsbltasuniton1;
    }

    private BigDecimal impsbltasuniton2;

    @Basic
    @javax.persistence.Column(name = "IMPSBLTASUNITON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getImpsbltasuniton2() {
        return impsbltasuniton2;
    }

    public void setImpsbltasuniton2(BigDecimal impsbltasuniton2) {
        this.impsbltasuniton2 = impsbltasuniton2;
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

        Tbninvimpsbltasunit that = (Tbninvimpsbltasunit) o;

        if (bltascode != that.bltascode) return false;
        if (bltasdetailid != that.bltasdetailid) return false;
        if (detailid != that.detailid) return false;
        if (invimpsbltasunitid != that.invimpsbltasunitid) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (bltasunitcount != null ? !bltasunitcount.equals(that.bltasunitcount) : that.bltasunitcount != null)
            return false;
        if (ihpresentationtype != null ? !ihpresentationtype.equals(that.ihpresentationtype) : that.ihpresentationtype != null)
            return false;
        if (impsbltasunitod0 != null ? !impsbltasunitod0.equals(that.impsbltasunitod0) : that.impsbltasunitod0 != null)
            return false;
        if (impsbltasunitod1 != null ? !impsbltasunitod1.equals(that.impsbltasunitod1) : that.impsbltasunitod1 != null)
            return false;
        if (impsbltasunitom0 != null ? !impsbltasunitom0.equals(that.impsbltasunitom0) : that.impsbltasunitom0 != null)
            return false;
        if (impsbltasunitom1 != null ? !impsbltasunitom1.equals(that.impsbltasunitom1) : that.impsbltasunitom1 != null)
            return false;
        if (impsbltasuniton0 != null ? !impsbltasuniton0.equals(that.impsbltasuniton0) : that.impsbltasuniton0 != null)
            return false;
        if (impsbltasuniton1 != null ? !impsbltasuniton1.equals(that.impsbltasuniton1) : that.impsbltasuniton1 != null)
            return false;
        if (impsbltasuniton2 != null ? !impsbltasuniton2.equals(that.impsbltasuniton2) : that.impsbltasuniton2 != null)
            return false;
        if (impsbltasunitot0 != null ? !impsbltasunitot0.equals(that.impsbltasunitot0) : that.impsbltasunitot0 != null)
            return false;
        if (impsbltasunitot1 != null ? !impsbltasunitot1.equals(that.impsbltasunitot1) : that.impsbltasunitot1 != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (unittype != null ? !unittype.equals(that.unittype) : that.unittype != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invimpsbltasunitid;
        result = 31 * result + bltasdetailid;
        result = 31 * result + bltascode;
        result = 31 * result + (unittype != null ? unittype.hashCode() : 0);
        result = 31 * result + (bltasunitcount != null ? bltasunitcount.hashCode() : 0);
        result = 31 * result + (ihpresentationtype != null ? ihpresentationtype.hashCode() : 0);
        result = 31 * result + detailid;
        result = 31 * result + jurisdictionid;
        result = 31 * result + (impsbltasunitot0 != null ? impsbltasunitot0.hashCode() : 0);
        result = 31 * result + (impsbltasunitot1 != null ? impsbltasunitot1.hashCode() : 0);
        result = 31 * result + (impsbltasunitom0 != null ? impsbltasunitom0.hashCode() : 0);
        result = 31 * result + (impsbltasunitom1 != null ? impsbltasunitom1.hashCode() : 0);
        result = 31 * result + (impsbltasunitod0 != null ? impsbltasunitod0.hashCode() : 0);
        result = 31 * result + (impsbltasunitod1 != null ? impsbltasunitod1.hashCode() : 0);
        result = 31 * result + (impsbltasuniton0 != null ? impsbltasuniton0.hashCode() : 0);
        result = 31 * result + (impsbltasuniton1 != null ? impsbltasuniton1.hashCode() : 0);
        result = 31 * result + (impsbltasuniton2 != null ? impsbltasuniton2.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
