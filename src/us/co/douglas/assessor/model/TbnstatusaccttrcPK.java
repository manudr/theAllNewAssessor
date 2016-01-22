package us.co.douglas.assessor.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mdronamr on 12/24/15.
 */
public class TbnstatusaccttrcPK implements Serializable {
    private int jurisdictionid;
    private int adminno;

    @Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    @Column(name = "ADMINNO", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public int getAdminno() {
        return adminno;
    }

    public void setAdminno(int adminno) {
        this.adminno = adminno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbnstatusaccttrcPK that = (TbnstatusaccttrcPK) o;

        if (adminno != that.adminno) return false;
        if (jurisdictionid != that.jurisdictionid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jurisdictionid;
        result = 31 * result + adminno;
        return result;
    }
}
