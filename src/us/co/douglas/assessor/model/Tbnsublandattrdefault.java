package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
public class Tbnsublandattrdefault {
    private int sublandattrdefaultid;
    private String startingparcel;
    private String endingparcel;
    private int startingparcelsequence;
    private int endingparcelsequence;
    private BigDecimal attributeadjustment;
    private String filtertype;
    private Timestamp lastupdated;

    @Id
    @Column(name = "SUBLANDATTRDEFAULTID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSublandattrdefaultid() {
        return sublandattrdefaultid;
    }

    public void setSublandattrdefaultid(int sublandattrdefaultid) {
        this.sublandattrdefaultid = sublandattrdefaultid;
    }

    @Basic
    @Column(name = "STARTINGPARCEL", nullable = false, insertable = true, updatable = true, length = 30)
    public String getStartingparcel() {
        return startingparcel;
    }

    public void setStartingparcel(String startingparcel) {
        this.startingparcel = startingparcel;
    }

    @Basic
    @Column(name = "ENDINGPARCEL", nullable = false, insertable = true, updatable = true, length = 30)
    public String getEndingparcel() {
        return endingparcel;
    }

    public void setEndingparcel(String endingparcel) {
        this.endingparcel = endingparcel;
    }

    @Basic
    @Column(name = "STARTINGPARCELSEQUENCE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getStartingparcelsequence() {
        return startingparcelsequence;
    }

    public void setStartingparcelsequence(int startingparcelsequence) {
        this.startingparcelsequence = startingparcelsequence;
    }

    @Basic
    @Column(name = "ENDINGPARCELSEQUENCE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getEndingparcelsequence() {
        return endingparcelsequence;
    }

    public void setEndingparcelsequence(int endingparcelsequence) {
        this.endingparcelsequence = endingparcelsequence;
    }

    @Basic
    @Column(name = "ATTRIBUTEADJUSTMENT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAttributeadjustment() {
        return attributeadjustment;
    }

    public void setAttributeadjustment(BigDecimal attributeadjustment) {
        this.attributeadjustment = attributeadjustment;
    }

    @Basic
    @Column(name = "FILTERTYPE", nullable = true, insertable = true, updatable = true, length = 15)
    public String getFiltertype() {
        return filtertype;
    }

    public void setFiltertype(String filtertype) {
        this.filtertype = filtertype;
    }

    @Basic
    @Column(name = "LASTUPDATED", nullable = false, insertable = true, updatable = true)
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

        Tbnsublandattrdefault that = (Tbnsublandattrdefault) o;

        if (endingparcelsequence != that.endingparcelsequence) return false;
        if (startingparcelsequence != that.startingparcelsequence) return false;
        if (sublandattrdefaultid != that.sublandattrdefaultid) return false;
        if (attributeadjustment != null ? !attributeadjustment.equals(that.attributeadjustment) : that.attributeadjustment != null)
            return false;
        if (endingparcel != null ? !endingparcel.equals(that.endingparcel) : that.endingparcel != null)
            return false;
        if (filtertype != null ? !filtertype.equals(that.filtertype) : that.filtertype != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (startingparcel != null ? !startingparcel.equals(that.startingparcel) : that.startingparcel != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sublandattrdefaultid;
        result = 31 * result + (startingparcel != null ? startingparcel.hashCode() : 0);
        result = 31 * result + (endingparcel != null ? endingparcel.hashCode() : 0);
        result = 31 * result + startingparcelsequence;
        result = 31 * result + endingparcelsequence;
        result = 31 * result + (attributeadjustment != null ? attributeadjustment.hashCode() : 0);
        result = 31 * result + (filtertype != null ? filtertype.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
