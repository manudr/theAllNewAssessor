package us.co.douglas.assessor.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mdronamr on 12/24/15.
 */
public class TbnnbhdsalestatisticsPK implements Serializable {
    private String propertytype;

    @Column(name = "PROPERTYTYPE", nullable = false, insertable = true, updatable = true, length = 15)
    @Id
    public String getPropertytype() {
        return propertytype;
    }

    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }

    private String nbhdcode;

    @Column(name = "NBHDCODE", nullable = false, insertable = true, updatable = true, length = 10)
    @Id
    public String getNbhdcode() {
        return nbhdcode;
    }

    public void setNbhdcode(String nbhdcode) {
        this.nbhdcode = nbhdcode;
    }

    private String nbhdextension;

    @Column(name = "NBHDEXTENSION", nullable = false, insertable = true, updatable = true, length = 10)
    @Id
    public String getNbhdextension() {
        return nbhdextension;
    }

    public void setNbhdextension(String nbhdextension) {
        this.nbhdextension = nbhdextension;
    }

    private int nbhdstatisticid;

    @Column(name = "NBHDSTATISTICID", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public int getNbhdstatisticid() {
        return nbhdstatisticid;
    }

    public void setNbhdstatisticid(int nbhdstatisticid) {
        this.nbhdstatisticid = nbhdstatisticid;
    }

    private int taxyear;

    @Column(name = "TAXYEAR", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public int getTaxyear() {
        return taxyear;
    }

    public void setTaxyear(int taxyear) {
        this.taxyear = taxyear;
    }

    private int jurisdictionid;

    @Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbnnbhdsalestatisticsPK that = (TbnnbhdsalestatisticsPK) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (nbhdstatisticid != that.nbhdstatisticid) return false;
        if (taxyear != that.taxyear) return false;
        if (nbhdcode != null ? !nbhdcode.equals(that.nbhdcode) : that.nbhdcode != null)
            return false;
        if (nbhdextension != null ? !nbhdextension.equals(that.nbhdextension) : that.nbhdextension != null)
            return false;
        if (propertytype != null ? !propertytype.equals(that.propertytype) : that.propertytype != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = propertytype != null ? propertytype.hashCode() : 0;
        result = 31 * result + (nbhdcode != null ? nbhdcode.hashCode() : 0);
        result = 31 * result + (nbhdextension != null ? nbhdextension.hashCode() : 0);
        result = 31 * result + nbhdstatisticid;
        result = 31 * result + taxyear;
        result = 31 * result + jurisdictionid;
        return result;
    }
}
