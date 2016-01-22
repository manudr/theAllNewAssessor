package us.co.douglas.assessor.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mdronamr on 12/24/15.
 */
public class TbnsubparcelimpPK implements Serializable {
    private int subparcelimpid;
    private int jurisdictionid;

    @Column(name = "SUBPARCELIMPID", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public int getSubparcelimpid() {
        return subparcelimpid;
    }

    public void setSubparcelimpid(int subparcelimpid) {
        this.subparcelimpid = subparcelimpid;
    }

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

        TbnsubparcelimpPK that = (TbnsubparcelimpPK) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (subparcelimpid != that.subparcelimpid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subparcelimpid;
        result = 31 * result + jurisdictionid;
        return result;
    }
}
