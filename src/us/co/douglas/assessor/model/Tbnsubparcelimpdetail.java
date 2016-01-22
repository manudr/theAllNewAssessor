package us.co.douglas.assessor.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
@IdClass(TbnsubparcelimpdetailPK.class)
public class Tbnsubparcelimpdetail {
    private int subparcelimpdetailid;
    private String originalaccountno;
    private int originalimpno;
    private String newparcelno;
    private int parcelsequence;
    private int newimpno;
    private BigDecimal condobldgpercent;
    private BigDecimal landpercent;
    private int jurisdictionid;
    private Timestamp lastupdated;

    @Id
    @Column(name = "SUBPARCELIMPDETAILID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSubparcelimpdetailid() {
        return subparcelimpdetailid;
    }

    public void setSubparcelimpdetailid(int subparcelimpdetailid) {
        this.subparcelimpdetailid = subparcelimpdetailid;
    }

    @Basic
    @Column(name = "ORIGINALACCOUNTNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getOriginalaccountno() {
        return originalaccountno;
    }

    public void setOriginalaccountno(String originalaccountno) {
        this.originalaccountno = originalaccountno;
    }

    @Basic
    @Column(name = "ORIGINALIMPNO", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getOriginalimpno() {
        return originalimpno;
    }

    public void setOriginalimpno(int originalimpno) {
        this.originalimpno = originalimpno;
    }

    @Basic
    @Column(name = "NEWPARCELNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getNewparcelno() {
        return newparcelno;
    }

    public void setNewparcelno(String newparcelno) {
        this.newparcelno = newparcelno;
    }

    @Basic
    @Column(name = "PARCELSEQUENCE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getParcelsequence() {
        return parcelsequence;
    }

    public void setParcelsequence(int parcelsequence) {
        this.parcelsequence = parcelsequence;
    }

    @Basic
    @Column(name = "NEWIMPNO", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getNewimpno() {
        return newimpno;
    }

    public void setNewimpno(int newimpno) {
        this.newimpno = newimpno;
    }

    @Basic
    @Column(name = "CONDOBLDGPERCENT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getCondobldgpercent() {
        return condobldgpercent;
    }

    public void setCondobldgpercent(BigDecimal condobldgpercent) {
        this.condobldgpercent = condobldgpercent;
    }

    @Basic
    @Column(name = "LANDPERCENT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getLandpercent() {
        return landpercent;
    }

    public void setLandpercent(BigDecimal landpercent) {
        this.landpercent = landpercent;
    }

    @Id
    @Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
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

        Tbnsubparcelimpdetail that = (Tbnsubparcelimpdetail) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (newimpno != that.newimpno) return false;
        if (originalimpno != that.originalimpno) return false;
        if (parcelsequence != that.parcelsequence) return false;
        if (subparcelimpdetailid != that.subparcelimpdetailid) return false;
        if (condobldgpercent != null ? !condobldgpercent.equals(that.condobldgpercent) : that.condobldgpercent != null)
            return false;
        if (landpercent != null ? !landpercent.equals(that.landpercent) : that.landpercent != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (newparcelno != null ? !newparcelno.equals(that.newparcelno) : that.newparcelno != null)
            return false;
        if (originalaccountno != null ? !originalaccountno.equals(that.originalaccountno) : that.originalaccountno != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subparcelimpdetailid;
        result = 31 * result + (originalaccountno != null ? originalaccountno.hashCode() : 0);
        result = 31 * result + originalimpno;
        result = 31 * result + (newparcelno != null ? newparcelno.hashCode() : 0);
        result = 31 * result + parcelsequence;
        result = 31 * result + newimpno;
        result = 31 * result + (condobldgpercent != null ? condobldgpercent.hashCode() : 0);
        result = 31 * result + (landpercent != null ? landpercent.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
