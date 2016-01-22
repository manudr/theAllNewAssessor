package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
public class Tbninvsale {
    private int invsaleid;

    @Id
    @javax.persistence.Column(name = "INVSALEID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getInvsaleid() {
        return invsaleid;
    }

    public void setInvsaleid(int invsaleid) {
        this.invsaleid = invsaleid;
    }

    private String receptionno;

    @Basic
    @javax.persistence.Column(name = "RECEPTIONNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getReceptionno() {
        return receptionno;
    }

    public void setReceptionno(String receptionno) {
        this.receptionno = receptionno;
    }

    private Timestamp saledate;

    @Basic
    @javax.persistence.Column(name = "SALEDATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getSaledate() {
        return saledate;
    }

    public void setSaledate(Timestamp saledate) {
        this.saledate = saledate;
    }

    private BigDecimal saleprice;

    @Basic
    @javax.persistence.Column(name = "SALEPRICE", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    private BigInteger valid1Flag;

    @Basic
    @javax.persistence.Column(name = "VALID1FLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getValid1Flag() {
        return valid1Flag;
    }

    public void setValid1Flag(BigInteger valid1Flag) {
        this.valid1Flag = valid1Flag;
    }

    private BigInteger valid2Flag;

    @Basic
    @javax.persistence.Column(name = "VALID2FLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getValid2Flag() {
        return valid2Flag;
    }

    public void setValid2Flag(BigInteger valid2Flag) {
        this.valid2Flag = valid2Flag;
    }

    private BigInteger confirmedflag;

    @Basic
    @javax.persistence.Column(name = "CONFIRMEDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getConfirmedflag() {
        return confirmedflag;
    }

    public void setConfirmedflag(BigInteger confirmedflag) {
        this.confirmedflag = confirmedflag;
    }

    private BigInteger improvedflag;

    @Basic
    @javax.persistence.Column(name = "IMPROVEDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getImprovedflag() {
        return improvedflag;
    }

    public void setImprovedflag(BigInteger improvedflag) {
        this.improvedflag = improvedflag;
    }

    private BigInteger nonsaleflag;

    @Basic
    @javax.persistence.Column(name = "NONSALEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getNonsaleflag() {
        return nonsaleflag;
    }

    public void setNonsaleflag(BigInteger nonsaleflag) {
        this.nonsaleflag = nonsaleflag;
    }

    private BigDecimal saleon0;

    @Basic
    @javax.persistence.Column(name = "SALEON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleon0() {
        return saleon0;
    }

    public void setSaleon0(BigDecimal saleon0) {
        this.saleon0 = saleon0;
    }

    private BigDecimal saleon1;

    @Basic
    @javax.persistence.Column(name = "SALEON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleon1() {
        return saleon1;
    }

    public void setSaleon1(BigDecimal saleon1) {
        this.saleon1 = saleon1;
    }

    private BigDecimal saleon2;

    @Basic
    @javax.persistence.Column(name = "SALEON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleon2() {
        return saleon2;
    }

    public void setSaleon2(BigDecimal saleon2) {
        this.saleon2 = saleon2;
    }

    private Timestamp saleod0;

    @Basic
    @javax.persistence.Column(name = "SALEOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleod0() {
        return saleod0;
    }

    public void setSaleod0(Timestamp saleod0) {
        this.saleod0 = saleod0;
    }

    private Timestamp saleod1;

    @Basic
    @javax.persistence.Column(name = "SALEOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleod1() {
        return saleod1;
    }

    public void setSaleod1(Timestamp saleod1) {
        this.saleod1 = saleod1;
    }

    private String saleom0;

    @Basic
    @javax.persistence.Column(name = "SALEOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleom0() {
        return saleom0;
    }

    public void setSaleom0(String saleom0) {
        this.saleom0 = saleom0;
    }

    private String saleom1;

    @Basic
    @javax.persistence.Column(name = "SALEOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleom1() {
        return saleom1;
    }

    public void setSaleom1(String saleom1) {
        this.saleom1 = saleom1;
    }

    private String saleot0;

    @Basic
    @javax.persistence.Column(name = "SALEOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleot0() {
        return saleot0;
    }

    public void setSaleot0(String saleot0) {
        this.saleot0 = saleot0;
    }

    private String saleot1;

    @Basic
    @javax.persistence.Column(name = "SALEOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleot1() {
        return saleot1;
    }

    public void setSaleot1(String saleot1) {
        this.saleot1 = saleot1;
    }

    private int jurisdictionid;

    @Basic
    @javax.persistence.Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    private Timestamp lastupdated;

    @Basic
    @javax.persistence.Column(name = "LASTUPDATED", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Timestamp lastupdated) {
        this.lastupdated = lastupdated;
    }

    private BigInteger spssinventoryoverrideflag;

    @Basic
    @javax.persistence.Column(name = "SPSSINVENTORYOVERRIDEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getSpssinventoryoverrideflag() {
        return spssinventoryoverrideflag;
    }

    public void setSpssinventoryoverrideflag(BigInteger spssinventoryoverrideflag) {
        this.spssinventoryoverrideflag = spssinventoryoverrideflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tbninvsale that = (Tbninvsale) o;

        if (invsaleid != that.invsaleid) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (confirmedflag != null ? !confirmedflag.equals(that.confirmedflag) : that.confirmedflag != null)
            return false;
        if (improvedflag != null ? !improvedflag.equals(that.improvedflag) : that.improvedflag != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (nonsaleflag != null ? !nonsaleflag.equals(that.nonsaleflag) : that.nonsaleflag != null)
            return false;
        if (receptionno != null ? !receptionno.equals(that.receptionno) : that.receptionno != null)
            return false;
        if (saledate != null ? !saledate.equals(that.saledate) : that.saledate != null)
            return false;
        if (saleod0 != null ? !saleod0.equals(that.saleod0) : that.saleod0 != null)
            return false;
        if (saleod1 != null ? !saleod1.equals(that.saleod1) : that.saleod1 != null)
            return false;
        if (saleom0 != null ? !saleom0.equals(that.saleom0) : that.saleom0 != null)
            return false;
        if (saleom1 != null ? !saleom1.equals(that.saleom1) : that.saleom1 != null)
            return false;
        if (saleon0 != null ? !saleon0.equals(that.saleon0) : that.saleon0 != null)
            return false;
        if (saleon1 != null ? !saleon1.equals(that.saleon1) : that.saleon1 != null)
            return false;
        if (saleon2 != null ? !saleon2.equals(that.saleon2) : that.saleon2 != null)
            return false;
        if (saleot0 != null ? !saleot0.equals(that.saleot0) : that.saleot0 != null)
            return false;
        if (saleot1 != null ? !saleot1.equals(that.saleot1) : that.saleot1 != null)
            return false;
        if (saleprice != null ? !saleprice.equals(that.saleprice) : that.saleprice != null)
            return false;
        if (spssinventoryoverrideflag != null ? !spssinventoryoverrideflag.equals(that.spssinventoryoverrideflag) : that.spssinventoryoverrideflag != null)
            return false;
        if (valid1Flag != null ? !valid1Flag.equals(that.valid1Flag) : that.valid1Flag != null)
            return false;
        if (valid2Flag != null ? !valid2Flag.equals(that.valid2Flag) : that.valid2Flag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invsaleid;
        result = 31 * result + (receptionno != null ? receptionno.hashCode() : 0);
        result = 31 * result + (saledate != null ? saledate.hashCode() : 0);
        result = 31 * result + (saleprice != null ? saleprice.hashCode() : 0);
        result = 31 * result + (valid1Flag != null ? valid1Flag.hashCode() : 0);
        result = 31 * result + (valid2Flag != null ? valid2Flag.hashCode() : 0);
        result = 31 * result + (confirmedflag != null ? confirmedflag.hashCode() : 0);
        result = 31 * result + (improvedflag != null ? improvedflag.hashCode() : 0);
        result = 31 * result + (nonsaleflag != null ? nonsaleflag.hashCode() : 0);
        result = 31 * result + (saleon0 != null ? saleon0.hashCode() : 0);
        result = 31 * result + (saleon1 != null ? saleon1.hashCode() : 0);
        result = 31 * result + (saleon2 != null ? saleon2.hashCode() : 0);
        result = 31 * result + (saleod0 != null ? saleod0.hashCode() : 0);
        result = 31 * result + (saleod1 != null ? saleod1.hashCode() : 0);
        result = 31 * result + (saleom0 != null ? saleom0.hashCode() : 0);
        result = 31 * result + (saleom1 != null ? saleom1.hashCode() : 0);
        result = 31 * result + (saleot0 != null ? saleot0.hashCode() : 0);
        result = 31 * result + (saleot1 != null ? saleot1.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        result = 31 * result + (spssinventoryoverrideflag != null ? spssinventoryoverrideflag.hashCode() : 0);
        return result;
    }
}
