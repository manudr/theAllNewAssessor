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
public class Tbnsaleoutofarea {
    private String receptionno;

    @Id
    @javax.persistence.Column(name = "RECEPTIONNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getReceptionno() {
        return receptionno;
    }

    public void setReceptionno(String receptionno) {
        this.receptionno = receptionno;
    }

    private String ooaaccountno;

    @javax.persistence.Column(name = "OOAACCOUNTNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getOoaaccountno() {
        return ooaaccountno;
    }

    public void setOoaaccountno(String ooaaccountno) {
        this.ooaaccountno = ooaaccountno;
    }

    private String ooaparcelno;

    @Basic
    @javax.persistence.Column(name = "OOAPARCELNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getOoaparcelno() {
        return ooaparcelno;
    }

    public void setOoaparcelno(String ooaparcelno) {
        this.ooaparcelno = ooaparcelno;
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

    private BigDecimal salevalueper;

    @Basic
    @javax.persistence.Column(name = "SALEVALUEPER", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getSalevalueper() {
        return salevalueper;
    }

    public void setSalevalueper(BigDecimal salevalueper) {
        this.salevalueper = salevalueper;
    }

    private String salejurisdiction;

    @Basic
    @javax.persistence.Column(name = "SALEJURISDICTION", nullable = true, insertable = true, updatable = true, length = 30)
    public String getSalejurisdiction() {
        return salejurisdiction;
    }

    public void setSalejurisdiction(String salejurisdiction) {
        this.salejurisdiction = salejurisdiction;
    }

    private String accttype;

    @Basic
    @javax.persistence.Column(name = "ACCTTYPE", nullable = true, insertable = true, updatable = true, length = 15)
    public String getAccttype() {
        return accttype;
    }

    public void setAccttype(String accttype) {
        this.accttype = accttype;
    }

    private String ooalea;

    @Basic
    @javax.persistence.Column(name = "OOALEA", nullable = true, insertable = true, updatable = true, length = 30)
    public String getOoalea() {
        return ooalea;
    }

    public void setOoalea(String ooalea) {
        this.ooalea = ooalea;
    }

    private Integer bltasyearbuilt;

    @Basic
    @javax.persistence.Column(name = "BLTASYEARBUILT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getBltasyearbuilt() {
        return bltasyearbuilt;
    }

    public void setBltasyearbuilt(Integer bltasyearbuilt) {
        this.bltasyearbuilt = bltasyearbuilt;
    }

    private String impexterior;

    @Basic
    @javax.persistence.Column(name = "IMPEXTERIOR", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpexterior() {
        return impexterior;
    }

    public void setImpexterior(String impexterior) {
        this.impexterior = impexterior;
    }

    private Integer impcount;

    @Basic
    @javax.persistence.Column(name = "IMPCOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getImpcount() {
        return impcount;
    }

    public void setImpcount(Integer impcount) {
        this.impcount = impcount;
    }

    private Integer roomcount;

    @Basic
    @javax.persistence.Column(name = "ROOMCOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getRoomcount() {
        return roomcount;
    }

    public void setRoomcount(Integer roomcount) {
        this.roomcount = roomcount;
    }

    private BigDecimal bedroomcount;

    @Basic
    @javax.persistence.Column(name = "BEDROOMCOUNT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getBedroomcount() {
        return bedroomcount;
    }

    public void setBedroomcount(BigDecimal bedroomcount) {
        this.bedroomcount = bedroomcount;
    }

    private BigDecimal bathcount;

    @Basic
    @javax.persistence.Column(name = "BATHCOUNT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getBathcount() {
        return bathcount;
    }

    public void setBathcount(BigDecimal bathcount) {
        this.bathcount = bathcount;
    }

    private Integer impsf;

    @Basic
    @javax.persistence.Column(name = "IMPSF", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getImpsf() {
        return impsf;
    }

    public void setImpsf(Integer impsf) {
        this.impsf = impsf;
    }

    private BigInteger multipleuseflag;

    @Basic
    @javax.persistence.Column(name = "MULTIPLEUSEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getMultipleuseflag() {
        return multipleuseflag;
    }

    public void setMultipleuseflag(BigInteger multipleuseflag) {
        this.multipleuseflag = multipleuseflag;
    }

    private BigDecimal landgrossacrecount;

    @Basic
    @javax.persistence.Column(name = "LANDGROSSACRECOUNT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandgrossacrecount() {
        return landgrossacrecount;
    }

    public void setLandgrossacrecount(BigDecimal landgrossacrecount) {
        this.landgrossacrecount = landgrossacrecount;
    }

    private BigDecimal landgrosssf;

    @Basic
    @javax.persistence.Column(name = "LANDGROSSSF", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandgrosssf() {
        return landgrosssf;
    }

    public void setLandgrosssf(BigDecimal landgrosssf) {
        this.landgrosssf = landgrosssf;
    }

    private BigDecimal landgrossff;

    @Basic
    @javax.persistence.Column(name = "LANDGROSSFF", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandgrossff() {
        return landgrossff;
    }

    public void setLandgrossff(BigDecimal landgrossff) {
        this.landgrossff = landgrossff;
    }

    private BigDecimal landgrossunitcount;

    @Basic
    @javax.persistence.Column(name = "LANDGROSSUNITCOUNT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandgrossunitcount() {
        return landgrossunitcount;
    }

    public void setLandgrossunitcount(BigDecimal landgrossunitcount) {
        this.landgrossunitcount = landgrossunitcount;
    }

    private BigInteger plattedflag;

    @Basic
    @javax.persistence.Column(name = "PLATTEDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getPlattedflag() {
        return plattedflag;
    }

    public void setPlattedflag(BigInteger plattedflag) {
        this.plattedflag = plattedflag;
    }

    private BigDecimal totallandvaluetimeofsale;

    @Basic
    @javax.persistence.Column(name = "TOTALLANDVALUETIMEOFSALE", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getTotallandvaluetimeofsale() {
        return totallandvaluetimeofsale;
    }

    public void setTotallandvaluetimeofsale(BigDecimal totallandvaluetimeofsale) {
        this.totallandvaluetimeofsale = totallandvaluetimeofsale;
    }

    private String nbhdcode;

    @Basic
    @javax.persistence.Column(name = "NBHDCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getNbhdcode() {
        return nbhdcode;
    }

    public void setNbhdcode(String nbhdcode) {
        this.nbhdcode = nbhdcode;
    }

    private BigInteger validflag;

    @Basic
    @javax.persistence.Column(name = "VALIDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getValidflag() {
        return validflag;
    }

    public void setValidflag(BigInteger validflag) {
        this.validflag = validflag;
    }

    private BigDecimal saleoutofareaon0;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREAON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleoutofareaon0() {
        return saleoutofareaon0;
    }

    public void setSaleoutofareaon0(BigDecimal saleoutofareaon0) {
        this.saleoutofareaon0 = saleoutofareaon0;
    }

    private BigDecimal saleoutofareaon1;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREAON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleoutofareaon1() {
        return saleoutofareaon1;
    }

    public void setSaleoutofareaon1(BigDecimal saleoutofareaon1) {
        this.saleoutofareaon1 = saleoutofareaon1;
    }

    private BigDecimal saleoutofareaon2;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREAON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleoutofareaon2() {
        return saleoutofareaon2;
    }

    public void setSaleoutofareaon2(BigDecimal saleoutofareaon2) {
        this.saleoutofareaon2 = saleoutofareaon2;
    }

    private Timestamp saleoutofareaod0;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREAOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleoutofareaod0() {
        return saleoutofareaod0;
    }

    public void setSaleoutofareaod0(Timestamp saleoutofareaod0) {
        this.saleoutofareaod0 = saleoutofareaod0;
    }

    private Timestamp saleoutofareaod1;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREAOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleoutofareaod1() {
        return saleoutofareaod1;
    }

    public void setSaleoutofareaod1(Timestamp saleoutofareaod1) {
        this.saleoutofareaod1 = saleoutofareaod1;
    }

    private String saleoutofareaom0;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREAOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleoutofareaom0() {
        return saleoutofareaom0;
    }

    public void setSaleoutofareaom0(String saleoutofareaom0) {
        this.saleoutofareaom0 = saleoutofareaom0;
    }

    private String saleoutofareaom1;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREAOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleoutofareaom1() {
        return saleoutofareaom1;
    }

    public void setSaleoutofareaom1(String saleoutofareaom1) {
        this.saleoutofareaom1 = saleoutofareaom1;
    }

    private String saleoutofareaot0;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREAOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleoutofareaot0() {
        return saleoutofareaot0;
    }

    public void setSaleoutofareaot0(String saleoutofareaot0) {
        this.saleoutofareaot0 = saleoutofareaot0;
    }

    private String saleoutofareaot1;

    @Basic
    @javax.persistence.Column(name = "SALEOUTOFAREAOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleoutofareaot1() {
        return saleoutofareaot1;
    }

    public void setSaleoutofareaot1(String saleoutofareaot1) {
        this.saleoutofareaot1 = saleoutofareaot1;
    }

    private String bltasdescription;

    @Basic
    @javax.persistence.Column(name = "BLTASDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 50)
    public String getBltasdescription() {
        return bltasdescription;
    }

    public void setBltasdescription(String bltasdescription) {
        this.bltasdescription = bltasdescription;
    }

    private int jurisdictionid;

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

    private BigInteger valid2Flag;

    @Basic
    @javax.persistence.Column(name = "VALID2FLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getValid2Flag() {
        return valid2Flag;
    }

    public void setValid2Flag(BigInteger valid2Flag) {
        this.valid2Flag = valid2Flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tbnsaleoutofarea that = (Tbnsaleoutofarea) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (accttype != null ? !accttype.equals(that.accttype) : that.accttype != null)
            return false;
        if (bathcount != null ? !bathcount.equals(that.bathcount) : that.bathcount != null)
            return false;
        if (bedroomcount != null ? !bedroomcount.equals(that.bedroomcount) : that.bedroomcount != null)
            return false;
        if (bltasdescription != null ? !bltasdescription.equals(that.bltasdescription) : that.bltasdescription != null)
            return false;
        if (bltasyearbuilt != null ? !bltasyearbuilt.equals(that.bltasyearbuilt) : that.bltasyearbuilt != null)
            return false;
        if (impcount != null ? !impcount.equals(that.impcount) : that.impcount != null)
            return false;
        if (impexterior != null ? !impexterior.equals(that.impexterior) : that.impexterior != null)
            return false;
        if (impsf != null ? !impsf.equals(that.impsf) : that.impsf != null)
            return false;
        if (landgrossacrecount != null ? !landgrossacrecount.equals(that.landgrossacrecount) : that.landgrossacrecount != null)
            return false;
        if (landgrossff != null ? !landgrossff.equals(that.landgrossff) : that.landgrossff != null)
            return false;
        if (landgrosssf != null ? !landgrosssf.equals(that.landgrosssf) : that.landgrosssf != null)
            return false;
        if (landgrossunitcount != null ? !landgrossunitcount.equals(that.landgrossunitcount) : that.landgrossunitcount != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (multipleuseflag != null ? !multipleuseflag.equals(that.multipleuseflag) : that.multipleuseflag != null)
            return false;
        if (nbhdcode != null ? !nbhdcode.equals(that.nbhdcode) : that.nbhdcode != null)
            return false;
        if (ooaaccountno != null ? !ooaaccountno.equals(that.ooaaccountno) : that.ooaaccountno != null)
            return false;
        if (ooalea != null ? !ooalea.equals(that.ooalea) : that.ooalea != null)
            return false;
        if (ooaparcelno != null ? !ooaparcelno.equals(that.ooaparcelno) : that.ooaparcelno != null)
            return false;
        if (plattedflag != null ? !plattedflag.equals(that.plattedflag) : that.plattedflag != null)
            return false;
        if (receptionno != null ? !receptionno.equals(that.receptionno) : that.receptionno != null)
            return false;
        if (roomcount != null ? !roomcount.equals(that.roomcount) : that.roomcount != null)
            return false;
        if (saledate != null ? !saledate.equals(that.saledate) : that.saledate != null)
            return false;
        if (salejurisdiction != null ? !salejurisdiction.equals(that.salejurisdiction) : that.salejurisdiction != null)
            return false;
        if (saleoutofareaod0 != null ? !saleoutofareaod0.equals(that.saleoutofareaod0) : that.saleoutofareaod0 != null)
            return false;
        if (saleoutofareaod1 != null ? !saleoutofareaod1.equals(that.saleoutofareaod1) : that.saleoutofareaod1 != null)
            return false;
        if (saleoutofareaom0 != null ? !saleoutofareaom0.equals(that.saleoutofareaom0) : that.saleoutofareaom0 != null)
            return false;
        if (saleoutofareaom1 != null ? !saleoutofareaom1.equals(that.saleoutofareaom1) : that.saleoutofareaom1 != null)
            return false;
        if (saleoutofareaon0 != null ? !saleoutofareaon0.equals(that.saleoutofareaon0) : that.saleoutofareaon0 != null)
            return false;
        if (saleoutofareaon1 != null ? !saleoutofareaon1.equals(that.saleoutofareaon1) : that.saleoutofareaon1 != null)
            return false;
        if (saleoutofareaon2 != null ? !saleoutofareaon2.equals(that.saleoutofareaon2) : that.saleoutofareaon2 != null)
            return false;
        if (saleoutofareaot0 != null ? !saleoutofareaot0.equals(that.saleoutofareaot0) : that.saleoutofareaot0 != null)
            return false;
        if (saleoutofareaot1 != null ? !saleoutofareaot1.equals(that.saleoutofareaot1) : that.saleoutofareaot1 != null)
            return false;
        if (saleprice != null ? !saleprice.equals(that.saleprice) : that.saleprice != null)
            return false;
        if (salevalueper != null ? !salevalueper.equals(that.salevalueper) : that.salevalueper != null)
            return false;
        if (totallandvaluetimeofsale != null ? !totallandvaluetimeofsale.equals(that.totallandvaluetimeofsale) : that.totallandvaluetimeofsale != null)
            return false;
        if (valid2Flag != null ? !valid2Flag.equals(that.valid2Flag) : that.valid2Flag != null)
            return false;
        if (validflag != null ? !validflag.equals(that.validflag) : that.validflag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = receptionno != null ? receptionno.hashCode() : 0;
        result = 31 * result + (ooaaccountno != null ? ooaaccountno.hashCode() : 0);
        result = 31 * result + (ooaparcelno != null ? ooaparcelno.hashCode() : 0);
        result = 31 * result + (saledate != null ? saledate.hashCode() : 0);
        result = 31 * result + (saleprice != null ? saleprice.hashCode() : 0);
        result = 31 * result + (salevalueper != null ? salevalueper.hashCode() : 0);
        result = 31 * result + (salejurisdiction != null ? salejurisdiction.hashCode() : 0);
        result = 31 * result + (accttype != null ? accttype.hashCode() : 0);
        result = 31 * result + (ooalea != null ? ooalea.hashCode() : 0);
        result = 31 * result + (bltasyearbuilt != null ? bltasyearbuilt.hashCode() : 0);
        result = 31 * result + (impexterior != null ? impexterior.hashCode() : 0);
        result = 31 * result + (impcount != null ? impcount.hashCode() : 0);
        result = 31 * result + (roomcount != null ? roomcount.hashCode() : 0);
        result = 31 * result + (bedroomcount != null ? bedroomcount.hashCode() : 0);
        result = 31 * result + (bathcount != null ? bathcount.hashCode() : 0);
        result = 31 * result + (impsf != null ? impsf.hashCode() : 0);
        result = 31 * result + (multipleuseflag != null ? multipleuseflag.hashCode() : 0);
        result = 31 * result + (landgrossacrecount != null ? landgrossacrecount.hashCode() : 0);
        result = 31 * result + (landgrosssf != null ? landgrosssf.hashCode() : 0);
        result = 31 * result + (landgrossff != null ? landgrossff.hashCode() : 0);
        result = 31 * result + (landgrossunitcount != null ? landgrossunitcount.hashCode() : 0);
        result = 31 * result + (plattedflag != null ? plattedflag.hashCode() : 0);
        result = 31 * result + (totallandvaluetimeofsale != null ? totallandvaluetimeofsale.hashCode() : 0);
        result = 31 * result + (nbhdcode != null ? nbhdcode.hashCode() : 0);
        result = 31 * result + (validflag != null ? validflag.hashCode() : 0);
        result = 31 * result + (saleoutofareaon0 != null ? saleoutofareaon0.hashCode() : 0);
        result = 31 * result + (saleoutofareaon1 != null ? saleoutofareaon1.hashCode() : 0);
        result = 31 * result + (saleoutofareaon2 != null ? saleoutofareaon2.hashCode() : 0);
        result = 31 * result + (saleoutofareaod0 != null ? saleoutofareaod0.hashCode() : 0);
        result = 31 * result + (saleoutofareaod1 != null ? saleoutofareaod1.hashCode() : 0);
        result = 31 * result + (saleoutofareaom0 != null ? saleoutofareaom0.hashCode() : 0);
        result = 31 * result + (saleoutofareaom1 != null ? saleoutofareaom1.hashCode() : 0);
        result = 31 * result + (saleoutofareaot0 != null ? saleoutofareaot0.hashCode() : 0);
        result = 31 * result + (saleoutofareaot1 != null ? saleoutofareaot1.hashCode() : 0);
        result = 31 * result + (bltasdescription != null ? bltasdescription.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        result = 31 * result + (valid2Flag != null ? valid2Flag.hashCode() : 0);
        return result;
    }
}
