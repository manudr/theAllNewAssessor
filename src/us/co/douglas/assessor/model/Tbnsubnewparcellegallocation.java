package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
public class Tbnsubnewparcellegallocation {
    private int subnewparcellegallocationid;
    private String subnewparcelno;
    private int parcelsequence;
    private String section;
    private String township;
    private String range;
    private String qtr;
    private String qtrqtr;
    private String governmentlot;
    private String governmenttract;
    private String legalcomment;
    private Timestamp lastupdated;

    @Id
    @Column(name = "SUBNEWPARCELLEGALLOCATIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSubnewparcellegallocationid() {
        return subnewparcellegallocationid;
    }

    public void setSubnewparcellegallocationid(int subnewparcellegallocationid) {
        this.subnewparcellegallocationid = subnewparcellegallocationid;
    }

    @Basic
    @Column(name = "SUBNEWPARCELNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getSubnewparcelno() {
        return subnewparcelno;
    }

    public void setSubnewparcelno(String subnewparcelno) {
        this.subnewparcelno = subnewparcelno;
    }

    @Basic
    @Column(name = "PARCELSEQUENCE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getParcelsequence() {
        return parcelsequence;
    }

    public void setParcelsequence(int parcelsequence) {
        this.parcelsequence = parcelsequence;
    }

    @Basic
    @Column(name = "SECTION", nullable = true, insertable = true, updatable = true, length = 15)
    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Basic
    @Column(name = "TOWNSHIP", nullable = true, insertable = true, updatable = true, length = 15)
    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    @Basic
    @Column(name = "RANGE", nullable = true, insertable = true, updatable = true, length = 15)
    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    @Basic
    @Column(name = "QTR", nullable = true, insertable = true, updatable = true, length = 15)
    public String getQtr() {
        return qtr;
    }

    public void setQtr(String qtr) {
        this.qtr = qtr;
    }

    @Basic
    @Column(name = "QTRQTR", nullable = true, insertable = true, updatable = true, length = 15)
    public String getQtrqtr() {
        return qtrqtr;
    }

    public void setQtrqtr(String qtrqtr) {
        this.qtrqtr = qtrqtr;
    }

    @Basic
    @Column(name = "GOVERNMENTLOT", nullable = true, insertable = true, updatable = true, length = 20)
    public String getGovernmentlot() {
        return governmentlot;
    }

    public void setGovernmentlot(String governmentlot) {
        this.governmentlot = governmentlot;
    }

    @Basic
    @Column(name = "GOVERNMENTTRACT", nullable = true, insertable = true, updatable = true, length = 20)
    public String getGovernmenttract() {
        return governmenttract;
    }

    public void setGovernmenttract(String governmenttract) {
        this.governmenttract = governmenttract;
    }

    @Basic
    @Column(name = "LEGALCOMMENT", nullable = true, insertable = true, updatable = true, length = 500)
    public String getLegalcomment() {
        return legalcomment;
    }

    public void setLegalcomment(String legalcomment) {
        this.legalcomment = legalcomment;
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

        Tbnsubnewparcellegallocation that = (Tbnsubnewparcellegallocation) o;

        if (parcelsequence != that.parcelsequence) return false;
        if (subnewparcellegallocationid != that.subnewparcellegallocationid)
            return false;
        if (governmentlot != null ? !governmentlot.equals(that.governmentlot) : that.governmentlot != null)
            return false;
        if (governmenttract != null ? !governmenttract.equals(that.governmenttract) : that.governmenttract != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (legalcomment != null ? !legalcomment.equals(that.legalcomment) : that.legalcomment != null)
            return false;
        if (qtr != null ? !qtr.equals(that.qtr) : that.qtr != null)
            return false;
        if (qtrqtr != null ? !qtrqtr.equals(that.qtrqtr) : that.qtrqtr != null)
            return false;
        if (range != null ? !range.equals(that.range) : that.range != null)
            return false;
        if (section != null ? !section.equals(that.section) : that.section != null)
            return false;
        if (subnewparcelno != null ? !subnewparcelno.equals(that.subnewparcelno) : that.subnewparcelno != null)
            return false;
        if (township != null ? !township.equals(that.township) : that.township != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subnewparcellegallocationid;
        result = 31 * result + (subnewparcelno != null ? subnewparcelno.hashCode() : 0);
        result = 31 * result + parcelsequence;
        result = 31 * result + (section != null ? section.hashCode() : 0);
        result = 31 * result + (township != null ? township.hashCode() : 0);
        result = 31 * result + (range != null ? range.hashCode() : 0);
        result = 31 * result + (qtr != null ? qtr.hashCode() : 0);
        result = 31 * result + (qtrqtr != null ? qtrqtr.hashCode() : 0);
        result = 31 * result + (governmentlot != null ? governmentlot.hashCode() : 0);
        result = 31 * result + (governmenttract != null ? governmenttract.hashCode() : 0);
        result = 31 * result + (legalcomment != null ? legalcomment.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
