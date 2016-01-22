package us.co.douglas.assessor.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
@IdClass(TbnsubparcelimpPK.class)
public class Tbnsubparcelimp {
    private int subparcelimpid;
    private String originalaccountno;
    private int originalimpno;
    private int jurisdictionid;
    private Timestamp lastupdated;

    @Id
    @Column(name = "SUBPARCELIMPID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSubparcelimpid() {
        return subparcelimpid;
    }

    public void setSubparcelimpid(int subparcelimpid) {
        this.subparcelimpid = subparcelimpid;
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

        Tbnsubparcelimp that = (Tbnsubparcelimp) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (originalimpno != that.originalimpno) return false;
        if (subparcelimpid != that.subparcelimpid) return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (originalaccountno != null ? !originalaccountno.equals(that.originalaccountno) : that.originalaccountno != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subparcelimpid;
        result = 31 * result + (originalaccountno != null ? originalaccountno.hashCode() : 0);
        result = 31 * result + originalimpno;
        result = 31 * result + jurisdictionid;
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
