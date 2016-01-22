package us.co.douglas.assessor.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mdronamr on 12/24/15.
 */
public class TbnsubparcelimpdetailPK implements Serializable {
    private int subparcelimpdetailid;
    private int jurisdictionid;

    @Column(name = "SUBPARCELIMPDETAILID", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public int getSubparcelimpdetailid() {
        return subparcelimpdetailid;
    }

    public void setSubparcelimpdetailid(int subparcelimpdetailid) {
        this.subparcelimpdetailid = subparcelimpdetailid;
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

        TbnsubparcelimpdetailPK that = (TbnsubparcelimpdetailPK) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (subparcelimpdetailid != that.subparcelimpdetailid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subparcelimpdetailid;
        result = 31 * result + jurisdictionid;
        return result;
    }
}
