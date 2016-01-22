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
public class Tbnsubdivision {
    private String subno;

    @Id
    @javax.persistence.Column(name = "SUBNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getSubno() {
        return subno;
    }

    public void setSubno(String subno) {
        this.subno = subno;
    }

    private String subname;

    @Basic
    @javax.persistence.Column(name = "SUBNAME", nullable = false, insertable = true, updatable = true, length = 255)
    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    private Timestamp subdatecreated;

    @Basic
    @javax.persistence.Column(name = "SUBDATECREATED", nullable = false, insertable = true, updatable = true)
    public Timestamp getSubdatecreated() {
        return subdatecreated;
    }

    public void setSubdatecreated(Timestamp subdatecreated) {
        this.subdatecreated = subdatecreated;
    }

    private BigDecimal subon2;

    @Basic
    @javax.persistence.Column(name = "SUBON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSubon2() {
        return subon2;
    }

    public void setSubon2(BigDecimal subon2) {
        this.subon2 = subon2;
    }

    private String subot0;

    @Basic
    @javax.persistence.Column(name = "SUBOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSubot0() {
        return subot0;
    }

    public void setSubot0(String subot0) {
        this.subot0 = subot0;
    }

    private String subot1;

    @Basic
    @javax.persistence.Column(name = "SUBOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSubot1() {
        return subot1;
    }

    public void setSubot1(String subot1) {
        this.subot1 = subot1;
    }

    private Timestamp subod0;

    @Basic
    @javax.persistence.Column(name = "SUBOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getSubod0() {
        return subod0;
    }

    public void setSubod0(Timestamp subod0) {
        this.subod0 = subod0;
    }

    private Timestamp subod1;

    @Basic
    @javax.persistence.Column(name = "SUBOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getSubod1() {
        return subod1;
    }

    public void setSubod1(Timestamp subod1) {
        this.subod1 = subod1;
    }

    private String subom0;

    @Basic
    @javax.persistence.Column(name = "SUBOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSubom0() {
        return subom0;
    }

    public void setSubom0(String subom0) {
        this.subom0 = subom0;
    }

    private String subom1;

    @Basic
    @javax.persistence.Column(name = "SUBOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSubom1() {
        return subom1;
    }

    public void setSubom1(String subom1) {
        this.subom1 = subom1;
    }

    private BigDecimal subon0;

    @Basic
    @javax.persistence.Column(name = "SUBON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSubon0() {
        return subon0;
    }

    public void setSubon0(BigDecimal subon0) {
        this.subon0 = subon0;
    }

    private BigDecimal subon1;

    @Basic
    @javax.persistence.Column(name = "SUBON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSubon1() {
        return subon1;
    }

    public void setSubon1(BigDecimal subon1) {
        this.subon1 = subon1;
    }

    private int jurisdictionid;

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

        Tbnsubdivision that = (Tbnsubdivision) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (subdatecreated != null ? !subdatecreated.equals(that.subdatecreated) : that.subdatecreated != null)
            return false;
        if (subname != null ? !subname.equals(that.subname) : that.subname != null)
            return false;
        if (subno != null ? !subno.equals(that.subno) : that.subno != null)
            return false;
        if (subod0 != null ? !subod0.equals(that.subod0) : that.subod0 != null)
            return false;
        if (subod1 != null ? !subod1.equals(that.subod1) : that.subod1 != null)
            return false;
        if (subom0 != null ? !subom0.equals(that.subom0) : that.subom0 != null)
            return false;
        if (subom1 != null ? !subom1.equals(that.subom1) : that.subom1 != null)
            return false;
        if (subon0 != null ? !subon0.equals(that.subon0) : that.subon0 != null)
            return false;
        if (subon1 != null ? !subon1.equals(that.subon1) : that.subon1 != null)
            return false;
        if (subon2 != null ? !subon2.equals(that.subon2) : that.subon2 != null)
            return false;
        if (subot0 != null ? !subot0.equals(that.subot0) : that.subot0 != null)
            return false;
        if (subot1 != null ? !subot1.equals(that.subot1) : that.subot1 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subno != null ? subno.hashCode() : 0;
        result = 31 * result + (subname != null ? subname.hashCode() : 0);
        result = 31 * result + (subdatecreated != null ? subdatecreated.hashCode() : 0);
        result = 31 * result + (subon2 != null ? subon2.hashCode() : 0);
        result = 31 * result + (subot0 != null ? subot0.hashCode() : 0);
        result = 31 * result + (subot1 != null ? subot1.hashCode() : 0);
        result = 31 * result + (subod0 != null ? subod0.hashCode() : 0);
        result = 31 * result + (subod1 != null ? subod1.hashCode() : 0);
        result = 31 * result + (subom0 != null ? subom0.hashCode() : 0);
        result = 31 * result + (subom1 != null ? subom1.hashCode() : 0);
        result = 31 * result + (subon0 != null ? subon0.hashCode() : 0);
        result = 31 * result + (subon1 != null ? subon1.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
