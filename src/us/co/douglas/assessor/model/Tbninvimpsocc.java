package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
public class Tbninvimpsocc {
    private int invimpsoccid;

    @Id
    @javax.persistence.Column(name = "INVIMPSOCCID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getInvimpsoccid() {
        return invimpsoccid;
    }

    public void setInvimpsoccid(int invimpsoccid) {
        this.invimpsoccid = invimpsoccid;
    }

    private int detailid;

    @Basic
    @javax.persistence.Column(name = "DETAILID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getDetailid() {
        return detailid;
    }

    public void setDetailid(int detailid) {
        this.detailid = detailid;
    }

    private int occcode;

    @Basic
    @javax.persistence.Column(name = "OCCCODE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getOcccode() {
        return occcode;
    }

    public void setOcccode(int occcode) {
        this.occcode = occcode;
    }

    private BigDecimal occpercent;

    @Basic
    @javax.persistence.Column(name = "OCCPERCENT", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getOccpercent() {
        return occpercent;
    }

    public void setOccpercent(BigDecimal occpercent) {
        this.occpercent = occpercent;
    }

    private String abstractcode;

    @Basic
    @javax.persistence.Column(name = "ABSTRACTCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getAbstractcode() {
        return abstractcode;
    }

    public void setAbstractcode(String abstractcode) {
        this.abstractcode = abstractcode;
    }

    private BigDecimal impabstractvalue;

    @Basic
    @javax.persistence.Column(name = "IMPABSTRACTVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getImpabstractvalue() {
        return impabstractvalue;
    }

    public void setImpabstractvalue(BigDecimal impabstractvalue) {
        this.impabstractvalue = impabstractvalue;
    }

    private Timestamp abstractindate;

    @Basic
    @javax.persistence.Column(name = "ABSTRACTINDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getAbstractindate() {
        return abstractindate;
    }

    public void setAbstractindate(Timestamp abstractindate) {
        this.abstractindate = abstractindate;
    }

    private Timestamp abstractoutdate;

    @Basic
    @javax.persistence.Column(name = "ABSTRACTOUTDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getAbstractoutdate() {
        return abstractoutdate;
    }

    public void setAbstractoutdate(Timestamp abstractoutdate) {
        this.abstractoutdate = abstractoutdate;
    }

    private String abstractadjcode;

    @Basic
    @javax.persistence.Column(name = "ABSTRACTADJCODE", nullable = true, insertable = true, updatable = true, length = 5)
    public String getAbstractadjcode() {
        return abstractadjcode;
    }

    public void setAbstractadjcode(String abstractadjcode) {
        this.abstractadjcode = abstractadjcode;
    }

    private String proratetype;

    @Basic
    @javax.persistence.Column(name = "PRORATETYPE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getProratetype() {
        return proratetype;
    }

    public void setProratetype(String proratetype) {
        this.proratetype = proratetype;
    }

    private String taxdistrict;

    @Basic
    @javax.persistence.Column(name = "TAXDISTRICT", nullable = false, insertable = true, updatable = true, length = 10)
    public String getTaxdistrict() {
        return taxdistrict;
    }

    public void setTaxdistrict(String taxdistrict) {
        this.taxdistrict = taxdistrict;
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

    private String impsoccot0;

    @Basic
    @javax.persistence.Column(name = "IMPSOCCOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsoccot0() {
        return impsoccot0;
    }

    public void setImpsoccot0(String impsoccot0) {
        this.impsoccot0 = impsoccot0;
    }

    private String impsoccot1;

    @Basic
    @javax.persistence.Column(name = "IMPSOCCOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsoccot1() {
        return impsoccot1;
    }

    public void setImpsoccot1(String impsoccot1) {
        this.impsoccot1 = impsoccot1;
    }

    private String impsoccom0;

    @Basic
    @javax.persistence.Column(name = "IMPSOCCOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsoccom0() {
        return impsoccom0;
    }

    public void setImpsoccom0(String impsoccom0) {
        this.impsoccom0 = impsoccom0;
    }

    private String impsoccom1;

    @Basic
    @javax.persistence.Column(name = "IMPSOCCOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsoccom1() {
        return impsoccom1;
    }

    public void setImpsoccom1(String impsoccom1) {
        this.impsoccom1 = impsoccom1;
    }

    private Timestamp impsoccod0;

    @Basic
    @javax.persistence.Column(name = "IMPSOCCOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getImpsoccod0() {
        return impsoccod0;
    }

    public void setImpsoccod0(Timestamp impsoccod0) {
        this.impsoccod0 = impsoccod0;
    }

    private Timestamp impsoccod1;

    @Basic
    @javax.persistence.Column(name = "IMPSOCCOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getImpsoccod1() {
        return impsoccod1;
    }

    public void setImpsoccod1(Timestamp impsoccod1) {
        this.impsoccod1 = impsoccod1;
    }

    private BigDecimal impsoccon0;

    @Basic
    @javax.persistence.Column(name = "IMPSOCCON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getImpsoccon0() {
        return impsoccon0;
    }

    public void setImpsoccon0(BigDecimal impsoccon0) {
        this.impsoccon0 = impsoccon0;
    }

    private BigDecimal impsoccon1;

    @Basic
    @javax.persistence.Column(name = "IMPSOCCON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getImpsoccon1() {
        return impsoccon1;
    }

    public void setImpsoccon1(BigDecimal impsoccon1) {
        this.impsoccon1 = impsoccon1;
    }

    private BigDecimal impsoccon2;

    @Basic
    @javax.persistence.Column(name = "IMPSOCCON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getImpsoccon2() {
        return impsoccon2;
    }

    public void setImpsoccon2(BigDecimal impsoccon2) {
        this.impsoccon2 = impsoccon2;
    }

    private BigDecimal occcompletedpct;

    @Basic
    @javax.persistence.Column(name = "OCCCOMPLETEDPCT", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getOcccompletedpct() {
        return occcompletedpct;
    }

    public void setOcccompletedpct(BigDecimal occcompletedpct) {
        this.occcompletedpct = occcompletedpct;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tbninvimpsocc that = (Tbninvimpsocc) o;

        if (detailid != that.detailid) return false;
        if (invimpsoccid != that.invimpsoccid) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (occcode != that.occcode) return false;
        if (abstractadjcode != null ? !abstractadjcode.equals(that.abstractadjcode) : that.abstractadjcode != null)
            return false;
        if (abstractcode != null ? !abstractcode.equals(that.abstractcode) : that.abstractcode != null)
            return false;
        if (abstractindate != null ? !abstractindate.equals(that.abstractindate) : that.abstractindate != null)
            return false;
        if (abstractoutdate != null ? !abstractoutdate.equals(that.abstractoutdate) : that.abstractoutdate != null)
            return false;
        if (impabstractvalue != null ? !impabstractvalue.equals(that.impabstractvalue) : that.impabstractvalue != null)
            return false;
        if (impsoccod0 != null ? !impsoccod0.equals(that.impsoccod0) : that.impsoccod0 != null)
            return false;
        if (impsoccod1 != null ? !impsoccod1.equals(that.impsoccod1) : that.impsoccod1 != null)
            return false;
        if (impsoccom0 != null ? !impsoccom0.equals(that.impsoccom0) : that.impsoccom0 != null)
            return false;
        if (impsoccom1 != null ? !impsoccom1.equals(that.impsoccom1) : that.impsoccom1 != null)
            return false;
        if (impsoccon0 != null ? !impsoccon0.equals(that.impsoccon0) : that.impsoccon0 != null)
            return false;
        if (impsoccon1 != null ? !impsoccon1.equals(that.impsoccon1) : that.impsoccon1 != null)
            return false;
        if (impsoccon2 != null ? !impsoccon2.equals(that.impsoccon2) : that.impsoccon2 != null)
            return false;
        if (impsoccot0 != null ? !impsoccot0.equals(that.impsoccot0) : that.impsoccot0 != null)
            return false;
        if (impsoccot1 != null ? !impsoccot1.equals(that.impsoccot1) : that.impsoccot1 != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (occcompletedpct != null ? !occcompletedpct.equals(that.occcompletedpct) : that.occcompletedpct != null)
            return false;
        if (occpercent != null ? !occpercent.equals(that.occpercent) : that.occpercent != null)
            return false;
        if (proratetype != null ? !proratetype.equals(that.proratetype) : that.proratetype != null)
            return false;
        if (taxdistrict != null ? !taxdistrict.equals(that.taxdistrict) : that.taxdistrict != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invimpsoccid;
        result = 31 * result + detailid;
        result = 31 * result + occcode;
        result = 31 * result + (occpercent != null ? occpercent.hashCode() : 0);
        result = 31 * result + (abstractcode != null ? abstractcode.hashCode() : 0);
        result = 31 * result + (impabstractvalue != null ? impabstractvalue.hashCode() : 0);
        result = 31 * result + (abstractindate != null ? abstractindate.hashCode() : 0);
        result = 31 * result + (abstractoutdate != null ? abstractoutdate.hashCode() : 0);
        result = 31 * result + (abstractadjcode != null ? abstractadjcode.hashCode() : 0);
        result = 31 * result + (proratetype != null ? proratetype.hashCode() : 0);
        result = 31 * result + (taxdistrict != null ? taxdistrict.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (impsoccot0 != null ? impsoccot0.hashCode() : 0);
        result = 31 * result + (impsoccot1 != null ? impsoccot1.hashCode() : 0);
        result = 31 * result + (impsoccom0 != null ? impsoccom0.hashCode() : 0);
        result = 31 * result + (impsoccom1 != null ? impsoccom1.hashCode() : 0);
        result = 31 * result + (impsoccod0 != null ? impsoccod0.hashCode() : 0);
        result = 31 * result + (impsoccod1 != null ? impsoccod1.hashCode() : 0);
        result = 31 * result + (impsoccon0 != null ? impsoccon0.hashCode() : 0);
        result = 31 * result + (impsoccon1 != null ? impsoccon1.hashCode() : 0);
        result = 31 * result + (impsoccon2 != null ? impsoccon2.hashCode() : 0);
        result = 31 * result + (occcompletedpct != null ? occcompletedpct.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
