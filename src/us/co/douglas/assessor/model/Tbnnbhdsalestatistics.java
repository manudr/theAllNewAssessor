package us.co.douglas.assessor.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
@IdClass(TbnnbhdsalestatisticsPK.class)
public class Tbnnbhdsalestatistics {
    private String propertytype;
    private String nbhdcode;
    private String nbhdextension;
    private int nbhdstatisticid;
    private int taxyear;
    private Integer numberofsalesfound;
    private Integer averageimpsquarefeet;
    private Integer minimumsaleprice;
    private Integer maximumsaleprice;
    private Integer averagesaleprice;
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
    @Column(name = "NBHDCODE", nullable = false, insertable = true, updatable = true, length = 10)
    public String getNbhdcode() {
        return nbhdcode;
    }

    public void setNbhdcode(String nbhdcode) {
        this.nbhdcode = nbhdcode;
    }

    @Id
    @Column(name = "NBHDEXTENSION", nullable = false, insertable = true, updatable = true, length = 10)
    public String getNbhdextension() {
        return nbhdextension;
    }

    public void setNbhdextension(String nbhdextension) {
        this.nbhdextension = nbhdextension;
    }

    @Id
    @Column(name = "NBHDSTATISTICID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getNbhdstatisticid() {
        return nbhdstatisticid;
    }

    public void setNbhdstatisticid(int nbhdstatisticid) {
        this.nbhdstatisticid = nbhdstatisticid;
    }

    @Id
    @Column(name = "TAXYEAR", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getTaxyear() {
        return taxyear;
    }

    public void setTaxyear(int taxyear) {
        this.taxyear = taxyear;
    }

    @Basic
    @Column(name = "NUMBEROFSALESFOUND", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getNumberofsalesfound() {
        return numberofsalesfound;
    }

    public void setNumberofsalesfound(Integer numberofsalesfound) {
        this.numberofsalesfound = numberofsalesfound;
    }

    @Basic
    @Column(name = "AVERAGEIMPSQUAREFEET", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getAverageimpsquarefeet() {
        return averageimpsquarefeet;
    }

    public void setAverageimpsquarefeet(Integer averageimpsquarefeet) {
        this.averageimpsquarefeet = averageimpsquarefeet;
    }

    @Basic
    @Column(name = "MINIMUMSALEPRICE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getMinimumsaleprice() {
        return minimumsaleprice;
    }

    public void setMinimumsaleprice(Integer minimumsaleprice) {
        this.minimumsaleprice = minimumsaleprice;
    }

    @Basic
    @Column(name = "MAXIMUMSALEPRICE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getMaximumsaleprice() {
        return maximumsaleprice;
    }

    public void setMaximumsaleprice(Integer maximumsaleprice) {
        this.maximumsaleprice = maximumsaleprice;
    }

    @Basic
    @Column(name = "AVERAGESALEPRICE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getAveragesaleprice() {
        return averagesaleprice;
    }

    public void setAveragesaleprice(Integer averagesaleprice) {
        this.averagesaleprice = averagesaleprice;
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

        Tbnnbhdsalestatistics that = (Tbnnbhdsalestatistics) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (nbhdstatisticid != that.nbhdstatisticid) return false;
        if (taxyear != that.taxyear) return false;
        if (averageimpsquarefeet != null ? !averageimpsquarefeet.equals(that.averageimpsquarefeet) : that.averageimpsquarefeet != null)
            return false;
        if (averagesaleprice != null ? !averagesaleprice.equals(that.averagesaleprice) : that.averagesaleprice != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (maximumsaleprice != null ? !maximumsaleprice.equals(that.maximumsaleprice) : that.maximumsaleprice != null)
            return false;
        if (minimumsaleprice != null ? !minimumsaleprice.equals(that.minimumsaleprice) : that.minimumsaleprice != null)
            return false;
        if (nbhdcode != null ? !nbhdcode.equals(that.nbhdcode) : that.nbhdcode != null)
            return false;
        if (nbhdextension != null ? !nbhdextension.equals(that.nbhdextension) : that.nbhdextension != null)
            return false;
        if (numberofsalesfound != null ? !numberofsalesfound.equals(that.numberofsalesfound) : that.numberofsalesfound != null)
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
        result = 31 * result + (numberofsalesfound != null ? numberofsalesfound.hashCode() : 0);
        result = 31 * result + (averageimpsquarefeet != null ? averageimpsquarefeet.hashCode() : 0);
        result = 31 * result + (minimumsaleprice != null ? minimumsaleprice.hashCode() : 0);
        result = 31 * result + (maximumsaleprice != null ? maximumsaleprice.hashCode() : 0);
        result = 31 * result + (averagesaleprice != null ? averagesaleprice.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
