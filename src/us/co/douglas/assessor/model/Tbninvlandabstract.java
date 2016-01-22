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
public class Tbninvlandabstract {
    private int invlandabstractid;

    @Id
    @javax.persistence.Column(name = "INVLANDABSTRACTID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getInvlandabstractid() {
        return invlandabstractid;
    }

    public void setInvlandabstractid(int invlandabstractid) {
        this.invlandabstractid = invlandabstractid;
    }

    private String landtype;

    @Basic
    @javax.persistence.Column(name = "LANDTYPE", nullable = true, insertable = true, updatable = true, length = 15)
    public String getLandtype() {
        return landtype;
    }

    public void setLandtype(String landtype) {
        this.landtype = landtype;
    }

    private String abstractcode;

    @Basic
    @javax.persistence.Column(name = "ABSTRACTCODE", nullable = false, insertable = true, updatable = true, length = 10)
    public String getAbstractcode() {
        return abstractcode;
    }

    public void setAbstractcode(String abstractcode) {
        this.abstractcode = abstractcode;
    }

    private BigDecimal landacres;

    @Basic
    @javax.persistence.Column(name = "LANDACRES", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandacres() {
        return landacres;
    }

    public void setLandacres(BigDecimal landacres) {
        this.landacres = landacres;
    }

    private BigDecimal landsf;

    @Basic
    @javax.persistence.Column(name = "LANDSF", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandsf() {
        return landsf;
    }

    public void setLandsf(BigDecimal landsf) {
        this.landsf = landsf;
    }

    private BigDecimal landff;

    @Basic
    @javax.persistence.Column(name = "LANDFF", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandff() {
        return landff;
    }

    public void setLandff(BigDecimal landff) {
        this.landff = landff;
    }

    private BigDecimal landunitcount;

    @Basic
    @javax.persistence.Column(name = "LANDUNITCOUNT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandunitcount() {
        return landunitcount;
    }

    public void setLandunitcount(BigDecimal landunitcount) {
        this.landunitcount = landunitcount;
    }

    private BigDecimal landvalueper;

    @Basic
    @javax.persistence.Column(name = "LANDVALUEPER", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getLandvalueper() {
        return landvalueper;
    }

    public void setLandvalueper(BigDecimal landvalueper) {
        this.landvalueper = landvalueper;
    }

    private BigDecimal landvalue;

    @Basic
    @javax.persistence.Column(name = "LANDVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getLandvalue() {
        return landvalue;
    }

    public void setLandvalue(BigDecimal landvalue) {
        this.landvalue = landvalue;
    }

    private BigInteger landoverrideflag;

    @Basic
    @javax.persistence.Column(name = "LANDOVERRIDEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getLandoverrideflag() {
        return landoverrideflag;
    }

    public void setLandoverrideflag(BigInteger landoverrideflag) {
        this.landoverrideflag = landoverrideflag;
    }

    private BigDecimal landoverridetotal;

    @Basic
    @javax.persistence.Column(name = "LANDOVERRIDETOTAL", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getLandoverridetotal() {
        return landoverridetotal;
    }

    public void setLandoverridetotal(BigDecimal landoverridetotal) {
        this.landoverridetotal = landoverridetotal;
    }

    private BigDecimal landactualtotal;

    @Basic
    @javax.persistence.Column(name = "LANDACTUALTOTAL", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getLandactualtotal() {
        return landactualtotal;
    }

    public void setLandactualtotal(BigDecimal landactualtotal) {
        this.landactualtotal = landactualtotal;
    }

    private String landclass;

    @Basic
    @javax.persistence.Column(name = "LANDCLASS", nullable = true, insertable = true, updatable = true, length = 10)
    public String getLandclass() {
        return landclass;
    }

    public void setLandclass(String landclass) {
        this.landclass = landclass;
    }

    private String landsubclass;

    @Basic
    @javax.persistence.Column(name = "LANDSUBCLASS", nullable = true, insertable = true, updatable = true, length = 10)
    public String getLandsubclass() {
        return landsubclass;
    }

    public void setLandsubclass(String landsubclass) {
        this.landsubclass = landsubclass;
    }

    private String landvalueby;

    @Basic
    @javax.persistence.Column(name = "LANDVALUEBY", nullable = true, insertable = true, updatable = true, length = 20)
    public String getLandvalueby() {
        return landvalueby;
    }

    public void setLandvalueby(String landvalueby) {
        this.landvalueby = landvalueby;
    }

    private String landvaluemeasure;

    @Basic
    @javax.persistence.Column(name = "LANDVALUEMEASURE", nullable = true, insertable = true, updatable = true, length = 20)
    public String getLandvaluemeasure() {
        return landvaluemeasure;
    }

    public void setLandvaluemeasure(String landvaluemeasure) {
        this.landvaluemeasure = landvaluemeasure;
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

    private String proratetype;

    @Basic
    @javax.persistence.Column(name = "PRORATETYPE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getProratetype() {
        return proratetype;
    }

    public void setProratetype(String proratetype) {
        this.proratetype = proratetype;
    }

    private BigInteger landactiveflag;

    @Basic
    @javax.persistence.Column(name = "LANDACTIVEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getLandactiveflag() {
        return landactiveflag;
    }

    public void setLandactiveflag(BigInteger landactiveflag) {
        this.landactiveflag = landactiveflag;
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

    private String abstractadjcode;

    @Basic
    @javax.persistence.Column(name = "ABSTRACTADJCODE", nullable = true, insertable = true, updatable = true, length = 5)
    public String getAbstractadjcode() {
        return abstractadjcode;
    }

    public void setAbstractadjcode(String abstractadjcode) {
        this.abstractadjcode = abstractadjcode;
    }

    private BigDecimal landvalueperadjfactor;

    @Basic
    @javax.persistence.Column(name = "LANDVALUEPERADJFACTOR", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandvalueperadjfactor() {
        return landvalueperadjfactor;
    }

    public void setLandvalueperadjfactor(BigDecimal landvalueperadjfactor) {
        this.landvalueperadjfactor = landvalueperadjfactor;
    }

    private BigInteger attributeadjflag;

    @Basic
    @javax.persistence.Column(name = "ATTRIBUTEADJFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getAttributeadjflag() {
        return attributeadjflag;
    }

    public void setAttributeadjflag(BigInteger attributeadjflag) {
        this.attributeadjflag = attributeadjflag;
    }

    private BigDecimal landadjsize;

    @Basic
    @javax.persistence.Column(name = "LANDADJSIZE", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandadjsize() {
        return landadjsize;
    }

    public void setLandadjsize(BigDecimal landadjsize) {
        this.landadjsize = landadjsize;
    }

    private BigDecimal landoverrideadjsize;

    @Basic
    @javax.persistence.Column(name = "LANDOVERRIDEADJSIZE", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandoverrideadjsize() {
        return landoverrideadjsize;
    }

    public void setLandoverrideadjsize(BigDecimal landoverrideadjsize) {
        this.landoverrideadjsize = landoverrideadjsize;
    }

    private BigDecimal landabstracton0;

    @Basic
    @javax.persistence.Column(name = "LANDABSTRACTON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandabstracton0() {
        return landabstracton0;
    }

    public void setLandabstracton0(BigDecimal landabstracton0) {
        this.landabstracton0 = landabstracton0;
    }

    private BigDecimal landabstracton1;

    @Basic
    @javax.persistence.Column(name = "LANDABSTRACTON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandabstracton1() {
        return landabstracton1;
    }

    public void setLandabstracton1(BigDecimal landabstracton1) {
        this.landabstracton1 = landabstracton1;
    }

    private BigDecimal landabstracton2;

    @Basic
    @javax.persistence.Column(name = "LANDABSTRACTON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandabstracton2() {
        return landabstracton2;
    }

    public void setLandabstracton2(BigDecimal landabstracton2) {
        this.landabstracton2 = landabstracton2;
    }

    private BigDecimal landoverridevalueper;

    @Basic
    @javax.persistence.Column(name = "LANDOVERRIDEVALUEPER", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getLandoverridevalueper() {
        return landoverridevalueper;
    }

    public void setLandoverridevalueper(BigDecimal landoverridevalueper) {
        this.landoverridevalueper = landoverridevalueper;
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

    private Timestamp landabstractod0;

    @Basic
    @javax.persistence.Column(name = "LANDABSTRACTOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getLandabstractod0() {
        return landabstractod0;
    }

    public void setLandabstractod0(Timestamp landabstractod0) {
        this.landabstractod0 = landabstractod0;
    }

    private Timestamp landabstractod1;

    @Basic
    @javax.persistence.Column(name = "LANDABSTRACTOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getLandabstractod1() {
        return landabstractod1;
    }

    public void setLandabstractod1(Timestamp landabstractod1) {
        this.landabstractod1 = landabstractod1;
    }

    private String landabstractom0;

    @Basic
    @javax.persistence.Column(name = "LANDABSTRACTOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getLandabstractom0() {
        return landabstractom0;
    }

    public void setLandabstractom0(String landabstractom0) {
        this.landabstractom0 = landabstractom0;
    }

    private String landabstractom1;

    @Basic
    @javax.persistence.Column(name = "LANDABSTRACTOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getLandabstractom1() {
        return landabstractom1;
    }

    public void setLandabstractom1(String landabstractom1) {
        this.landabstractom1 = landabstractom1;
    }

    private String landabstractot0;

    @Basic
    @javax.persistence.Column(name = "LANDABSTRACTOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getLandabstractot0() {
        return landabstractot0;
    }

    public void setLandabstractot0(String landabstractot0) {
        this.landabstractot0 = landabstractot0;
    }

    private String landabstractot1;

    @Basic
    @javax.persistence.Column(name = "LANDABSTRACTOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getLandabstractot1() {
        return landabstractot1;
    }

    public void setLandabstractot1(String landabstractot1) {
        this.landabstractot1 = landabstractot1;
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

    private BigDecimal msalandvalue;

    @Basic
    @javax.persistence.Column(name = "MSALANDVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getMsalandvalue() {
        return msalandvalue;
    }

    public void setMsalandvalue(BigDecimal msalandvalue) {
        this.msalandvalue = msalandvalue;
    }

    private BigDecimal msalandvalueper;

    @Basic
    @javax.persistence.Column(name = "MSALANDVALUEPER", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getMsalandvalueper() {
        return msalandvalueper;
    }

    public void setMsalandvalueper(BigDecimal msalandvalueper) {
        this.msalandvalueper = msalandvalueper;
    }

    private String lea;

    @Basic
    @javax.persistence.Column(name = "LEA", nullable = true, insertable = true, updatable = true, length = 30)
    public String getLea() {
        return lea;
    }

    public void setLea(String lea) {
        this.lea = lea;
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

        Tbninvlandabstract that = (Tbninvlandabstract) o;

        if (detailid != that.detailid) return false;
        if (invlandabstractid != that.invlandabstractid) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (abstractadjcode != null ? !abstractadjcode.equals(that.abstractadjcode) : that.abstractadjcode != null)
            return false;
        if (abstractcode != null ? !abstractcode.equals(that.abstractcode) : that.abstractcode != null)
            return false;
        if (abstractindate != null ? !abstractindate.equals(that.abstractindate) : that.abstractindate != null)
            return false;
        if (abstractoutdate != null ? !abstractoutdate.equals(that.abstractoutdate) : that.abstractoutdate != null)
            return false;
        if (attributeadjflag != null ? !attributeadjflag.equals(that.attributeadjflag) : that.attributeadjflag != null)
            return false;
        if (landabstractod0 != null ? !landabstractod0.equals(that.landabstractod0) : that.landabstractod0 != null)
            return false;
        if (landabstractod1 != null ? !landabstractod1.equals(that.landabstractod1) : that.landabstractod1 != null)
            return false;
        if (landabstractom0 != null ? !landabstractom0.equals(that.landabstractom0) : that.landabstractom0 != null)
            return false;
        if (landabstractom1 != null ? !landabstractom1.equals(that.landabstractom1) : that.landabstractom1 != null)
            return false;
        if (landabstracton0 != null ? !landabstracton0.equals(that.landabstracton0) : that.landabstracton0 != null)
            return false;
        if (landabstracton1 != null ? !landabstracton1.equals(that.landabstracton1) : that.landabstracton1 != null)
            return false;
        if (landabstracton2 != null ? !landabstracton2.equals(that.landabstracton2) : that.landabstracton2 != null)
            return false;
        if (landabstractot0 != null ? !landabstractot0.equals(that.landabstractot0) : that.landabstractot0 != null)
            return false;
        if (landabstractot1 != null ? !landabstractot1.equals(that.landabstractot1) : that.landabstractot1 != null)
            return false;
        if (landacres != null ? !landacres.equals(that.landacres) : that.landacres != null)
            return false;
        if (landactiveflag != null ? !landactiveflag.equals(that.landactiveflag) : that.landactiveflag != null)
            return false;
        if (landactualtotal != null ? !landactualtotal.equals(that.landactualtotal) : that.landactualtotal != null)
            return false;
        if (landadjsize != null ? !landadjsize.equals(that.landadjsize) : that.landadjsize != null)
            return false;
        if (landclass != null ? !landclass.equals(that.landclass) : that.landclass != null)
            return false;
        if (landff != null ? !landff.equals(that.landff) : that.landff != null)
            return false;
        if (landoverrideadjsize != null ? !landoverrideadjsize.equals(that.landoverrideadjsize) : that.landoverrideadjsize != null)
            return false;
        if (landoverrideflag != null ? !landoverrideflag.equals(that.landoverrideflag) : that.landoverrideflag != null)
            return false;
        if (landoverridetotal != null ? !landoverridetotal.equals(that.landoverridetotal) : that.landoverridetotal != null)
            return false;
        if (landoverridevalueper != null ? !landoverridevalueper.equals(that.landoverridevalueper) : that.landoverridevalueper != null)
            return false;
        if (landsf != null ? !landsf.equals(that.landsf) : that.landsf != null)
            return false;
        if (landsubclass != null ? !landsubclass.equals(that.landsubclass) : that.landsubclass != null)
            return false;
        if (landtype != null ? !landtype.equals(that.landtype) : that.landtype != null)
            return false;
        if (landunitcount != null ? !landunitcount.equals(that.landunitcount) : that.landunitcount != null)
            return false;
        if (landvalue != null ? !landvalue.equals(that.landvalue) : that.landvalue != null)
            return false;
        if (landvalueby != null ? !landvalueby.equals(that.landvalueby) : that.landvalueby != null)
            return false;
        if (landvaluemeasure != null ? !landvaluemeasure.equals(that.landvaluemeasure) : that.landvaluemeasure != null)
            return false;
        if (landvalueper != null ? !landvalueper.equals(that.landvalueper) : that.landvalueper != null)
            return false;
        if (landvalueperadjfactor != null ? !landvalueperadjfactor.equals(that.landvalueperadjfactor) : that.landvalueperadjfactor != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (lea != null ? !lea.equals(that.lea) : that.lea != null)
            return false;
        if (msalandvalue != null ? !msalandvalue.equals(that.msalandvalue) : that.msalandvalue != null)
            return false;
        if (msalandvalueper != null ? !msalandvalueper.equals(that.msalandvalueper) : that.msalandvalueper != null)
            return false;
        if (proratetype != null ? !proratetype.equals(that.proratetype) : that.proratetype != null)
            return false;
        if (taxdistrict != null ? !taxdistrict.equals(that.taxdistrict) : that.taxdistrict != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invlandabstractid;
        result = 31 * result + (landtype != null ? landtype.hashCode() : 0);
        result = 31 * result + (abstractcode != null ? abstractcode.hashCode() : 0);
        result = 31 * result + (landacres != null ? landacres.hashCode() : 0);
        result = 31 * result + (landsf != null ? landsf.hashCode() : 0);
        result = 31 * result + (landff != null ? landff.hashCode() : 0);
        result = 31 * result + (landunitcount != null ? landunitcount.hashCode() : 0);
        result = 31 * result + (landvalueper != null ? landvalueper.hashCode() : 0);
        result = 31 * result + (landvalue != null ? landvalue.hashCode() : 0);
        result = 31 * result + (landoverrideflag != null ? landoverrideflag.hashCode() : 0);
        result = 31 * result + (landoverridetotal != null ? landoverridetotal.hashCode() : 0);
        result = 31 * result + (landactualtotal != null ? landactualtotal.hashCode() : 0);
        result = 31 * result + (landclass != null ? landclass.hashCode() : 0);
        result = 31 * result + (landsubclass != null ? landsubclass.hashCode() : 0);
        result = 31 * result + (landvalueby != null ? landvalueby.hashCode() : 0);
        result = 31 * result + (landvaluemeasure != null ? landvaluemeasure.hashCode() : 0);
        result = 31 * result + (abstractindate != null ? abstractindate.hashCode() : 0);
        result = 31 * result + (abstractoutdate != null ? abstractoutdate.hashCode() : 0);
        result = 31 * result + (proratetype != null ? proratetype.hashCode() : 0);
        result = 31 * result + (landactiveflag != null ? landactiveflag.hashCode() : 0);
        result = 31 * result + detailid;
        result = 31 * result + (abstractadjcode != null ? abstractadjcode.hashCode() : 0);
        result = 31 * result + (landvalueperadjfactor != null ? landvalueperadjfactor.hashCode() : 0);
        result = 31 * result + (attributeadjflag != null ? attributeadjflag.hashCode() : 0);
        result = 31 * result + (landadjsize != null ? landadjsize.hashCode() : 0);
        result = 31 * result + (landoverrideadjsize != null ? landoverrideadjsize.hashCode() : 0);
        result = 31 * result + (landabstracton0 != null ? landabstracton0.hashCode() : 0);
        result = 31 * result + (landabstracton1 != null ? landabstracton1.hashCode() : 0);
        result = 31 * result + (landabstracton2 != null ? landabstracton2.hashCode() : 0);
        result = 31 * result + (landoverridevalueper != null ? landoverridevalueper.hashCode() : 0);
        result = 31 * result + (taxdistrict != null ? taxdistrict.hashCode() : 0);
        result = 31 * result + (landabstractod0 != null ? landabstractod0.hashCode() : 0);
        result = 31 * result + (landabstractod1 != null ? landabstractod1.hashCode() : 0);
        result = 31 * result + (landabstractom0 != null ? landabstractom0.hashCode() : 0);
        result = 31 * result + (landabstractom1 != null ? landabstractom1.hashCode() : 0);
        result = 31 * result + (landabstractot0 != null ? landabstractot0.hashCode() : 0);
        result = 31 * result + (landabstractot1 != null ? landabstractot1.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (msalandvalue != null ? msalandvalue.hashCode() : 0);
        result = 31 * result + (msalandvalueper != null ? msalandvalueper.hashCode() : 0);
        result = 31 * result + (lea != null ? lea.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
