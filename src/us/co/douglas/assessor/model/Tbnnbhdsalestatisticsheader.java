package us.co.douglas.assessor.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
@IdClass(TbnnbhdsalestatisticsheaderPK.class)
public class Tbnnbhdsalestatisticsheader {
    private String propertytype;
    private int nbhdstatisticid;
    private Timestamp startsalerangedate;
    private Timestamp endsalerangedate;
    private int taxyear;
    private int jurisdictionid;
    private Timestamp lastupdated;

    @Id
    @Column(name = "PROPERTYTYPE", nullable = false, insertable = true, updatable = true, length = 15)
    public String getPropertytype() {
        return propertytype;
    }

    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }

    @Id
    @Column(name = "NBHDSTATISTICID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getNbhdstatisticid() {
        return nbhdstatisticid;
    }

    public void setNbhdstatisticid(int nbhdstatisticid) {
        this.nbhdstatisticid = nbhdstatisticid;
    }

    @Basic
    @Column(name = "STARTSALERANGEDATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getStartsalerangedate() {
        return startsalerangedate;
    }

    public void setStartsalerangedate(Timestamp startsalerangedate) {
        this.startsalerangedate = startsalerangedate;
    }

    @Basic
    @Column(name = "ENDSALERANGEDATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getEndsalerangedate() {
        return endsalerangedate;
    }

    public void setEndsalerangedate(Timestamp endsalerangedate) {
        this.endsalerangedate = endsalerangedate;
    }

    @Id
    @Column(name = "TAXYEAR", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getTaxyear() {
        return taxyear;
    }

    public void setTaxyear(int taxyear) {
        this.taxyear = taxyear;
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

        Tbnnbhdsalestatisticsheader that = (Tbnnbhdsalestatisticsheader) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (nbhdstatisticid != that.nbhdstatisticid) return false;
        if (taxyear != that.taxyear) return false;
        if (endsalerangedate != null ? !endsalerangedate.equals(that.endsalerangedate) : that.endsalerangedate != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (propertytype != null ? !propertytype.equals(that.propertytype) : that.propertytype != null)
            return false;
        if (startsalerangedate != null ? !startsalerangedate.equals(that.startsalerangedate) : that.startsalerangedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = propertytype != null ? propertytype.hashCode() : 0;
        result = 31 * result + nbhdstatisticid;
        result = 31 * result + (startsalerangedate != null ? startsalerangedate.hashCode() : 0);
        result = 31 * result + (endsalerangedate != null ? endsalerangedate.hashCode() : 0);
        result = 31 * result + taxyear;
        result = 31 * result + jurisdictionid;
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
