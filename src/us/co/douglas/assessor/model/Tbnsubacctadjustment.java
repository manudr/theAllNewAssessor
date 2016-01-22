package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
public class Tbnsubacctadjustment {
    private int subacctadjustmentid;
    private int detailid;
    private int effectiveyear;
    private BigDecimal adjustmentoverridevalue;
    private BigInteger adjustmentoverrideflag;
    private BigDecimal adjustmentoverridepercent;
    private String adjustmentvaluemeasure;
    private BigDecimal adjustmentunitcount;
    private String adjustmentcomments;
    private String adjustmenteffectivedate;
    private BigDecimal adjustmentappliedpercent;
    private String applicationrecordno;
    private Timestamp lastupdated;

    @Id
    @Column(name = "SUBACCTADJUSTMENTID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSubacctadjustmentid() {
        return subacctadjustmentid;
    }

    public void setSubacctadjustmentid(int subacctadjustmentid) {
        this.subacctadjustmentid = subacctadjustmentid;
    }

    @Basic
    @Column(name = "DETAILID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getDetailid() {
        return detailid;
    }

    public void setDetailid(int detailid) {
        this.detailid = detailid;
    }

    @Basic
    @Column(name = "EFFECTIVEYEAR", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getEffectiveyear() {
        return effectiveyear;
    }

    public void setEffectiveyear(int effectiveyear) {
        this.effectiveyear = effectiveyear;
    }

    @Basic
    @Column(name = "ADJUSTMENTOVERRIDEVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAdjustmentoverridevalue() {
        return adjustmentoverridevalue;
    }

    public void setAdjustmentoverridevalue(BigDecimal adjustmentoverridevalue) {
        this.adjustmentoverridevalue = adjustmentoverridevalue;
    }

    @Basic
    @Column(name = "ADJUSTMENTOVERRIDEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getAdjustmentoverrideflag() {
        return adjustmentoverrideflag;
    }

    public void setAdjustmentoverrideflag(BigInteger adjustmentoverrideflag) {
        this.adjustmentoverrideflag = adjustmentoverrideflag;
    }

    @Basic
    @Column(name = "ADJUSTMENTOVERRIDEPERCENT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAdjustmentoverridepercent() {
        return adjustmentoverridepercent;
    }

    public void setAdjustmentoverridepercent(BigDecimal adjustmentoverridepercent) {
        this.adjustmentoverridepercent = adjustmentoverridepercent;
    }

    @Basic
    @Column(name = "ADJUSTMENTVALUEMEASURE", nullable = true, insertable = true, updatable = true, length = 30)
    public String getAdjustmentvaluemeasure() {
        return adjustmentvaluemeasure;
    }

    public void setAdjustmentvaluemeasure(String adjustmentvaluemeasure) {
        this.adjustmentvaluemeasure = adjustmentvaluemeasure;
    }

    @Basic
    @Column(name = "ADJUSTMENTUNITCOUNT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAdjustmentunitcount() {
        return adjustmentunitcount;
    }

    public void setAdjustmentunitcount(BigDecimal adjustmentunitcount) {
        this.adjustmentunitcount = adjustmentunitcount;
    }

    @Basic
    @Column(name = "ADJUSTMENTCOMMENTS", nullable = true, insertable = true, updatable = true, length = 500)
    public String getAdjustmentcomments() {
        return adjustmentcomments;
    }

    public void setAdjustmentcomments(String adjustmentcomments) {
        this.adjustmentcomments = adjustmentcomments;
    }

    @Basic
    @Column(name = "ADJUSTMENTEFFECTIVEDATE", nullable = true, insertable = true, updatable = true, length = 4)
    public String getAdjustmenteffectivedate() {
        return adjustmenteffectivedate;
    }

    public void setAdjustmenteffectivedate(String adjustmenteffectivedate) {
        this.adjustmenteffectivedate = adjustmenteffectivedate;
    }

    @Basic
    @Column(name = "ADJUSTMENTAPPLIEDPERCENT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAdjustmentappliedpercent() {
        return adjustmentappliedpercent;
    }

    public void setAdjustmentappliedpercent(BigDecimal adjustmentappliedpercent) {
        this.adjustmentappliedpercent = adjustmentappliedpercent;
    }

    @Basic
    @Column(name = "APPLICATIONRECORDNO", nullable = true, insertable = true, updatable = true, length = 15)
    public String getApplicationrecordno() {
        return applicationrecordno;
    }

    public void setApplicationrecordno(String applicationrecordno) {
        this.applicationrecordno = applicationrecordno;
    }

    @Basic
    @Column(name = "LASTUPDATED", nullable = true, insertable = true, updatable = true)
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

        Tbnsubacctadjustment that = (Tbnsubacctadjustment) o;

        if (detailid != that.detailid) return false;
        if (effectiveyear != that.effectiveyear) return false;
        if (subacctadjustmentid != that.subacctadjustmentid) return false;
        if (adjustmentappliedpercent != null ? !adjustmentappliedpercent.equals(that.adjustmentappliedpercent) : that.adjustmentappliedpercent != null)
            return false;
        if (adjustmentcomments != null ? !adjustmentcomments.equals(that.adjustmentcomments) : that.adjustmentcomments != null)
            return false;
        if (adjustmenteffectivedate != null ? !adjustmenteffectivedate.equals(that.adjustmenteffectivedate) : that.adjustmenteffectivedate != null)
            return false;
        if (adjustmentoverrideflag != null ? !adjustmentoverrideflag.equals(that.adjustmentoverrideflag) : that.adjustmentoverrideflag != null)
            return false;
        if (adjustmentoverridepercent != null ? !adjustmentoverridepercent.equals(that.adjustmentoverridepercent) : that.adjustmentoverridepercent != null)
            return false;
        if (adjustmentoverridevalue != null ? !adjustmentoverridevalue.equals(that.adjustmentoverridevalue) : that.adjustmentoverridevalue != null)
            return false;
        if (adjustmentunitcount != null ? !adjustmentunitcount.equals(that.adjustmentunitcount) : that.adjustmentunitcount != null)
            return false;
        if (adjustmentvaluemeasure != null ? !adjustmentvaluemeasure.equals(that.adjustmentvaluemeasure) : that.adjustmentvaluemeasure != null)
            return false;
        if (applicationrecordno != null ? !applicationrecordno.equals(that.applicationrecordno) : that.applicationrecordno != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subacctadjustmentid;
        result = 31 * result + detailid;
        result = 31 * result + effectiveyear;
        result = 31 * result + (adjustmentoverridevalue != null ? adjustmentoverridevalue.hashCode() : 0);
        result = 31 * result + (adjustmentoverrideflag != null ? adjustmentoverrideflag.hashCode() : 0);
        result = 31 * result + (adjustmentoverridepercent != null ? adjustmentoverridepercent.hashCode() : 0);
        result = 31 * result + (adjustmentvaluemeasure != null ? adjustmentvaluemeasure.hashCode() : 0);
        result = 31 * result + (adjustmentunitcount != null ? adjustmentunitcount.hashCode() : 0);
        result = 31 * result + (adjustmentcomments != null ? adjustmentcomments.hashCode() : 0);
        result = 31 * result + (adjustmenteffectivedate != null ? adjustmenteffectivedate.hashCode() : 0);
        result = 31 * result + (adjustmentappliedpercent != null ? adjustmentappliedpercent.hashCode() : 0);
        result = 31 * result + (applicationrecordno != null ? applicationrecordno.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
