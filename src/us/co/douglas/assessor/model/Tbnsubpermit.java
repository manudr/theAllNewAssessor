package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
public class Tbnsubpermit {
    private int subpermitid;
    private String subnewparcelno;
    private String originalaccountno;
    private String originalpermitno;
    private BigDecimal impno;
    private Integer parcelsequence;
    private Timestamp lastupdated;

    @Id
    @Column(name = "SUBPERMITID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSubpermitid() {
        return subpermitid;
    }

    public void setSubpermitid(int subpermitid) {
        this.subpermitid = subpermitid;
    }

    @Basic
    @Column(name = "SUBNEWPARCELNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getSubnewparcelno() {
        return subnewparcelno;
    }

    public void setSubnewparcelno(String subnewparcelno) {
        this.subnewparcelno = subnewparcelno;
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
    @Column(name = "ORIGINALPERMITNO", nullable = false, insertable = true, updatable = true, length = 50)
    public String getOriginalpermitno() {
        return originalpermitno;
    }

    public void setOriginalpermitno(String originalpermitno) {
        this.originalpermitno = originalpermitno;
    }

    @Basic
    @Column(name = "IMPNO", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getImpno() {
        return impno;
    }

    public void setImpno(BigDecimal impno) {
        this.impno = impno;
    }

    @Basic
    @Column(name = "PARCELSEQUENCE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getParcelsequence() {
        return parcelsequence;
    }

    public void setParcelsequence(Integer parcelsequence) {
        this.parcelsequence = parcelsequence;
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

        Tbnsubpermit that = (Tbnsubpermit) o;

        if (subpermitid != that.subpermitid) return false;
        if (impno != null ? !impno.equals(that.impno) : that.impno != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (originalaccountno != null ? !originalaccountno.equals(that.originalaccountno) : that.originalaccountno != null)
            return false;
        if (originalpermitno != null ? !originalpermitno.equals(that.originalpermitno) : that.originalpermitno != null)
            return false;
        if (parcelsequence != null ? !parcelsequence.equals(that.parcelsequence) : that.parcelsequence != null)
            return false;
        if (subnewparcelno != null ? !subnewparcelno.equals(that.subnewparcelno) : that.subnewparcelno != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subpermitid;
        result = 31 * result + (subnewparcelno != null ? subnewparcelno.hashCode() : 0);
        result = 31 * result + (originalaccountno != null ? originalaccountno.hashCode() : 0);
        result = 31 * result + (originalpermitno != null ? originalpermitno.hashCode() : 0);
        result = 31 * result + (impno != null ? impno.hashCode() : 0);
        result = 31 * result + (parcelsequence != null ? parcelsequence.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
