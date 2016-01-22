package us.co.douglas.assessor.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
@IdClass(TbnstatusaccttrcPK.class)
public class Tbnstatusaccttrc {
    private int jurisdictionid;
    private String accountno;
    private int taxyear;
    private int adminno;
    private Timestamp lastupdated;

    @Id
    @Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    @Basic
    @Column(name = "ACCOUNTNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    @Basic
    @Column(name = "TAXYEAR", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getTaxyear() {
        return taxyear;
    }

    public void setTaxyear(int taxyear) {
        this.taxyear = taxyear;
    }

    @Id
    @Column(name = "ADMINNO", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getAdminno() {
        return adminno;
    }

    public void setAdminno(int adminno) {
        this.adminno = adminno;
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

        Tbnstatusaccttrc that = (Tbnstatusaccttrc) o;

        if (adminno != that.adminno) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (taxyear != that.taxyear) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jurisdictionid;
        result = 31 * result + (accountno != null ? accountno.hashCode() : 0);
        result = 31 * result + taxyear;
        result = 31 * result + adminno;
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
