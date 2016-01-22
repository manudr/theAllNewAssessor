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
public class Tbninvlandattribute {
    private int invlandattributeid;

    @Id
    @javax.persistence.Column(name = "INVLANDATTRIBUTEID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getInvlandattributeid() {
        return invlandattributeid;
    }

    public void setInvlandattributeid(int invlandattributeid) {
        this.invlandattributeid = invlandattributeid;
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

    private String attributetype;

    @Basic
    @javax.persistence.Column(name = "ATTRIBUTETYPE", nullable = false, insertable = true, updatable = true, length = 30)
    public String getAttributetype() {
        return attributetype;
    }

    public void setAttributetype(String attributetype) {
        this.attributetype = attributetype;
    }

    private String attributesubtype;

    @Basic
    @javax.persistence.Column(name = "ATTRIBUTESUBTYPE", nullable = false, insertable = true, updatable = true, length = 50)
    public String getAttributesubtype() {
        return attributesubtype;
    }

    public void setAttributesubtype(String attributesubtype) {
        this.attributesubtype = attributesubtype;
    }

    private BigDecimal attributeadjustment;

    @Basic
    @javax.persistence.Column(name = "ATTRIBUTEADJUSTMENT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAttributeadjustment() {
        return attributeadjustment;
    }

    public void setAttributeadjustment(BigDecimal attributeadjustment) {
        this.attributeadjustment = attributeadjustment;
    }

    private String filtertype;

    @Basic
    @javax.persistence.Column(name = "FILTERTYPE", nullable = true, insertable = true, updatable = true, length = 15)
    public String getFiltertype() {
        return filtertype;
    }

    public void setFiltertype(String filtertype) {
        this.filtertype = filtertype;
    }

    private String landattributeot0;

    @Basic
    @javax.persistence.Column(name = "LANDATTRIBUTEOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getLandattributeot0() {
        return landattributeot0;
    }

    public void setLandattributeot0(String landattributeot0) {
        this.landattributeot0 = landattributeot0;
    }

    private String landattributeot1;

    @Basic
    @javax.persistence.Column(name = "LANDATTRIBUTEOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getLandattributeot1() {
        return landattributeot1;
    }

    public void setLandattributeot1(String landattributeot1) {
        this.landattributeot1 = landattributeot1;
    }

    private BigDecimal landattributeon0;

    @Basic
    @javax.persistence.Column(name = "LANDATTRIBUTEON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandattributeon0() {
        return landattributeon0;
    }

    public void setLandattributeon0(BigDecimal landattributeon0) {
        this.landattributeon0 = landattributeon0;
    }

    private BigDecimal landattributeon1;

    @Basic
    @javax.persistence.Column(name = "LANDATTRIBUTEON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandattributeon1() {
        return landattributeon1;
    }

    public void setLandattributeon1(BigDecimal landattributeon1) {
        this.landattributeon1 = landattributeon1;
    }

    private BigDecimal landattributeon2;

    @Basic
    @javax.persistence.Column(name = "LANDATTRIBUTEON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandattributeon2() {
        return landattributeon2;
    }

    public void setLandattributeon2(BigDecimal landattributeon2) {
        this.landattributeon2 = landattributeon2;
    }

    private Timestamp landattributeod0;

    @Basic
    @javax.persistence.Column(name = "LANDATTRIBUTEOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getLandattributeod0() {
        return landattributeod0;
    }

    public void setLandattributeod0(Timestamp landattributeod0) {
        this.landattributeod0 = landattributeod0;
    }

    private Timestamp landattributeod1;

    @Basic
    @javax.persistence.Column(name = "LANDATTRIBUTEOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getLandattributeod1() {
        return landattributeod1;
    }

    public void setLandattributeod1(Timestamp landattributeod1) {
        this.landattributeod1 = landattributeod1;
    }

    private String landattributeom0;

    @Basic
    @javax.persistence.Column(name = "LANDATTRIBUTEOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getLandattributeom0() {
        return landattributeom0;
    }

    public void setLandattributeom0(String landattributeom0) {
        this.landattributeom0 = landattributeom0;
    }

    private String landattributeom1;

    @Basic
    @javax.persistence.Column(name = "LANDATTRIBUTEOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getLandattributeom1() {
        return landattributeom1;
    }

    public void setLandattributeom1(String landattributeom1) {
        this.landattributeom1 = landattributeom1;
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

        Tbninvlandattribute that = (Tbninvlandattribute) o;

        if (detailid != that.detailid) return false;
        if (invlandattributeid != that.invlandattributeid) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (attributeadjustment != null ? !attributeadjustment.equals(that.attributeadjustment) : that.attributeadjustment != null)
            return false;
        if (attributesubtype != null ? !attributesubtype.equals(that.attributesubtype) : that.attributesubtype != null)
            return false;
        if (attributetype != null ? !attributetype.equals(that.attributetype) : that.attributetype != null)
            return false;
        if (filtertype != null ? !filtertype.equals(that.filtertype) : that.filtertype != null)
            return false;
        if (landattributeod0 != null ? !landattributeod0.equals(that.landattributeod0) : that.landattributeod0 != null)
            return false;
        if (landattributeod1 != null ? !landattributeod1.equals(that.landattributeod1) : that.landattributeod1 != null)
            return false;
        if (landattributeom0 != null ? !landattributeom0.equals(that.landattributeom0) : that.landattributeom0 != null)
            return false;
        if (landattributeom1 != null ? !landattributeom1.equals(that.landattributeom1) : that.landattributeom1 != null)
            return false;
        if (landattributeon0 != null ? !landattributeon0.equals(that.landattributeon0) : that.landattributeon0 != null)
            return false;
        if (landattributeon1 != null ? !landattributeon1.equals(that.landattributeon1) : that.landattributeon1 != null)
            return false;
        if (landattributeon2 != null ? !landattributeon2.equals(that.landattributeon2) : that.landattributeon2 != null)
            return false;
        if (landattributeot0 != null ? !landattributeot0.equals(that.landattributeot0) : that.landattributeot0 != null)
            return false;
        if (landattributeot1 != null ? !landattributeot1.equals(that.landattributeot1) : that.landattributeot1 != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invlandattributeid;
        result = 31 * result + detailid;
        result = 31 * result + (attributetype != null ? attributetype.hashCode() : 0);
        result = 31 * result + (attributesubtype != null ? attributesubtype.hashCode() : 0);
        result = 31 * result + (attributeadjustment != null ? attributeadjustment.hashCode() : 0);
        result = 31 * result + (filtertype != null ? filtertype.hashCode() : 0);
        result = 31 * result + (landattributeot0 != null ? landattributeot0.hashCode() : 0);
        result = 31 * result + (landattributeot1 != null ? landattributeot1.hashCode() : 0);
        result = 31 * result + (landattributeon0 != null ? landattributeon0.hashCode() : 0);
        result = 31 * result + (landattributeon1 != null ? landattributeon1.hashCode() : 0);
        result = 31 * result + (landattributeon2 != null ? landattributeon2.hashCode() : 0);
        result = 31 * result + (landattributeod0 != null ? landattributeod0.hashCode() : 0);
        result = 31 * result + (landattributeod1 != null ? landattributeod1.hashCode() : 0);
        result = 31 * result + (landattributeom0 != null ? landattributeom0.hashCode() : 0);
        result = 31 * result + (landattributeom1 != null ? landattributeom1.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
