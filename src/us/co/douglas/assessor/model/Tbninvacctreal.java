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
public class Tbninvacctreal {
    private int invacctrealid;

    @Id
    @javax.persistence.Column(name = "INVACCTREALID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getInvacctrealid() {
        return invacctrealid;
    }

    public void setInvacctrealid(int invacctrealid) {
        this.invacctrealid = invacctrealid;
    }

    private BigInteger imponlyflag;

    @Basic
    @javax.persistence.Column(name = "IMPONLYFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getImponlyflag() {
        return imponlyflag;
    }

    public void setImponlyflag(BigInteger imponlyflag) {
        this.imponlyflag = imponlyflag;
    }

    private BigInteger tifflag;

    @Basic
    @javax.persistence.Column(name = "TIFFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getTifflag() {
        return tifflag;
    }

    public void setTifflag(BigInteger tifflag) {
        this.tifflag = tifflag;
    }

    private BigInteger vacantflag;

    @Basic
    @javax.persistence.Column(name = "VACANTFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getVacantflag() {
        return vacantflag;
    }

    public void setVacantflag(BigInteger vacantflag) {
        this.vacantflag = vacantflag;
    }

    private Integer landwidth;

    @Basic
    @javax.persistence.Column(name = "LANDWIDTH", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getLandwidth() {
        return landwidth;
    }

    public void setLandwidth(Integer landwidth) {
        this.landwidth = landwidth;
    }

    private Integer landdepth;

    @Basic
    @javax.persistence.Column(name = "LANDDEPTH", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getLanddepth() {
        return landdepth;
    }

    public void setLanddepth(Integer landdepth) {
        this.landdepth = landdepth;
    }

    private BigDecimal landeasementsf;

    @Basic
    @javax.persistence.Column(name = "LANDEASEMENTSF", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandeasementsf() {
        return landeasementsf;
    }

    public void setLandeasementsf(BigDecimal landeasementsf) {
        this.landeasementsf = landeasementsf;
    }

    private BigDecimal landexcesssf;

    @Basic
    @javax.persistence.Column(name = "LANDEXCESSSF", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandexcesssf() {
        return landexcesssf;
    }

    public void setLandexcesssf(BigDecimal landexcesssf) {
        this.landexcesssf = landexcesssf;
    }

    private Integer trafficcount;

    @Basic
    @javax.persistence.Column(name = "TRAFFICCOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getTrafficcount() {
        return trafficcount;
    }

    public void setTrafficcount(Integer trafficcount) {
        this.trafficcount = trafficcount;
    }

    private Integer parkingspaces;

    @Basic
    @javax.persistence.Column(name = "PARKINGSPACES", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getParkingspaces() {
        return parkingspaces;
    }

    public void setParkingspaces(Integer parkingspaces) {
        this.parkingspaces = parkingspaces;
    }

    private String zoningcode;

    @Basic
    @javax.persistence.Column(name = "ZONINGCODE", nullable = true, insertable = true, updatable = true, length = 50)
    public String getZoningcode() {
        return zoningcode;
    }

    public void setZoningcode(String zoningcode) {
        this.zoningcode = zoningcode;
    }

    private Integer floodfringe;

    @Basic
    @javax.persistence.Column(name = "FLOODFRINGE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getFloodfringe() {
        return floodfringe;
    }

    public void setFloodfringe(Integer floodfringe) {
        this.floodfringe = floodfringe;
    }

    private Integer floodway;

    @Basic
    @javax.persistence.Column(name = "FLOODWAY", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getFloodway() {
        return floodway;
    }

    public void setFloodway(Integer floodway) {
        this.floodway = floodway;
    }

    private BigDecimal tapfee;

    @Basic
    @javax.persistence.Column(name = "TAPFEE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getTapfee() {
        return tapfee;
    }

    public void setTapfee(BigDecimal tapfee) {
        this.tapfee = tapfee;
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

    private String landcertificationcode;

    @Basic
    @javax.persistence.Column(name = "LANDCERTIFICATIONCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getLandcertificationcode() {
        return landcertificationcode;
    }

    public void setLandcertificationcode(String landcertificationcode) {
        this.landcertificationcode = landcertificationcode;
    }

    private String landappraiser;

    @Basic
    @javax.persistence.Column(name = "LANDAPPRAISER", nullable = true, insertable = true, updatable = true, length = 20)
    public String getLandappraiser() {
        return landappraiser;
    }

    public void setLandappraiser(String landappraiser) {
        this.landappraiser = landappraiser;
    }

    private Timestamp landappraisaldate;

    @Basic
    @javax.persistence.Column(name = "LANDAPPRAISALDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getLandappraisaldate() {
        return landappraisaldate;
    }

    public void setLandappraisaldate(Timestamp landappraisaldate) {
        this.landappraisaldate = landappraisaldate;
    }

    private BigDecimal landoverridesizeadj;

    @Basic
    @javax.persistence.Column(name = "LANDOVERRIDESIZEADJ", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandoverridesizeadj() {
        return landoverridesizeadj;
    }

    public void setLandoverridesizeadj(BigDecimal landoverridesizeadj) {
        this.landoverridesizeadj = landoverridesizeadj;
    }

    private BigDecimal landsizeadj;

    @Basic
    @javax.persistence.Column(name = "LANDSIZEADJ", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandsizeadj() {
        return landsizeadj;
    }

    public void setLandsizeadj(BigDecimal landsizeadj) {
        this.landsizeadj = landsizeadj;
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

    private BigDecimal landgrossacres;

    @Basic
    @javax.persistence.Column(name = "LANDGROSSACRES", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getLandgrossacres() {
        return landgrossacres;
    }

    public void setLandgrossacres(BigDecimal landgrossacres) {
        this.landgrossacres = landgrossacres;
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

    private BigDecimal acctrealon0;

    @Basic
    @javax.persistence.Column(name = "ACCTREALON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctrealon0() {
        return acctrealon0;
    }

    public void setAcctrealon0(BigDecimal acctrealon0) {
        this.acctrealon0 = acctrealon0;
    }

    private BigDecimal acctrealon1;

    @Basic
    @javax.persistence.Column(name = "ACCTREALON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctrealon1() {
        return acctrealon1;
    }

    public void setAcctrealon1(BigDecimal acctrealon1) {
        this.acctrealon1 = acctrealon1;
    }

    private BigDecimal acctrealon2;

    @Basic
    @javax.persistence.Column(name = "ACCTREALON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAcctrealon2() {
        return acctrealon2;
    }

    public void setAcctrealon2(BigDecimal acctrealon2) {
        this.acctrealon2 = acctrealon2;
    }

    private Timestamp acctrealod0;

    @Basic
    @javax.persistence.Column(name = "ACCTREALOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctrealod0() {
        return acctrealod0;
    }

    public void setAcctrealod0(Timestamp acctrealod0) {
        this.acctrealod0 = acctrealod0;
    }

    private Timestamp acctrealod1;

    @Basic
    @javax.persistence.Column(name = "ACCTREALOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getAcctrealod1() {
        return acctrealod1;
    }

    public void setAcctrealod1(Timestamp acctrealod1) {
        this.acctrealod1 = acctrealod1;
    }

    private String acctrealom0;

    @Basic
    @javax.persistence.Column(name = "ACCTREALOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctrealom0() {
        return acctrealom0;
    }

    public void setAcctrealom0(String acctrealom0) {
        this.acctrealom0 = acctrealom0;
    }

    private String acctrealom1;

    @Basic
    @javax.persistence.Column(name = "ACCTREALOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctrealom1() {
        return acctrealom1;
    }

    public void setAcctrealom1(String acctrealom1) {
        this.acctrealom1 = acctrealom1;
    }

    private String acctrealot0;

    @Basic
    @javax.persistence.Column(name = "ACCTREALOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctrealot0() {
        return acctrealot0;
    }

    public void setAcctrealot0(String acctrealot0) {
        this.acctrealot0 = acctrealot0;
    }

    private String acctrealot1;

    @Basic
    @javax.persistence.Column(name = "ACCTREALOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAcctrealot1() {
        return acctrealot1;
    }

    public void setAcctrealot1(String acctrealot1) {
        this.acctrealot1 = acctrealot1;
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

    private String defaultlea;

    @Basic
    @javax.persistence.Column(name = "DEFAULTLEA", nullable = true, insertable = true, updatable = true, length = 30)
    public String getDefaultlea() {
        return defaultlea;
    }

    public void setDefaultlea(String defaultlea) {
        this.defaultlea = defaultlea;
    }

    private BigDecimal totalacctimpinterestpct;

    @Basic
    @javax.persistence.Column(name = "TOTALACCTIMPINTERESTPCT", nullable = false, insertable = true, updatable = true, precision = 6)
    public BigDecimal getTotalacctimpinterestpct() {
        return totalacctimpinterestpct;
    }

    public void setTotalacctimpinterestpct(BigDecimal totalacctimpinterestpct) {
        this.totalacctimpinterestpct = totalacctimpinterestpct;
    }

    private BigDecimal totalacctlandinterestpct;

    @Basic
    @javax.persistence.Column(name = "TOTALACCTLANDINTERESTPCT", nullable = false, insertable = true, updatable = true, precision = 6)
    public BigDecimal getTotalacctlandinterestpct() {
        return totalacctlandinterestpct;
    }

    public void setTotalacctlandinterestpct(BigDecimal totalacctlandinterestpct) {
        this.totalacctlandinterestpct = totalacctlandinterestpct;
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

        Tbninvacctreal that = (Tbninvacctreal) o;

        if (invacctrealid != that.invacctrealid) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (acctrealod0 != null ? !acctrealod0.equals(that.acctrealod0) : that.acctrealod0 != null)
            return false;
        if (acctrealod1 != null ? !acctrealod1.equals(that.acctrealod1) : that.acctrealod1 != null)
            return false;
        if (acctrealom0 != null ? !acctrealom0.equals(that.acctrealom0) : that.acctrealom0 != null)
            return false;
        if (acctrealom1 != null ? !acctrealom1.equals(that.acctrealom1) : that.acctrealom1 != null)
            return false;
        if (acctrealon0 != null ? !acctrealon0.equals(that.acctrealon0) : that.acctrealon0 != null)
            return false;
        if (acctrealon1 != null ? !acctrealon1.equals(that.acctrealon1) : that.acctrealon1 != null)
            return false;
        if (acctrealon2 != null ? !acctrealon2.equals(that.acctrealon2) : that.acctrealon2 != null)
            return false;
        if (acctrealot0 != null ? !acctrealot0.equals(that.acctrealot0) : that.acctrealot0 != null)
            return false;
        if (acctrealot1 != null ? !acctrealot1.equals(that.acctrealot1) : that.acctrealot1 != null)
            return false;
        if (defaultlea != null ? !defaultlea.equals(that.defaultlea) : that.defaultlea != null)
            return false;
        if (floodfringe != null ? !floodfringe.equals(that.floodfringe) : that.floodfringe != null)
            return false;
        if (floodway != null ? !floodway.equals(that.floodway) : that.floodway != null)
            return false;
        if (imponlyflag != null ? !imponlyflag.equals(that.imponlyflag) : that.imponlyflag != null)
            return false;
        if (landappraisaldate != null ? !landappraisaldate.equals(that.landappraisaldate) : that.landappraisaldate != null)
            return false;
        if (landappraiser != null ? !landappraiser.equals(that.landappraiser) : that.landappraiser != null)
            return false;
        if (landcertificationcode != null ? !landcertificationcode.equals(that.landcertificationcode) : that.landcertificationcode != null)
            return false;
        if (landdepth != null ? !landdepth.equals(that.landdepth) : that.landdepth != null)
            return false;
        if (landeasementsf != null ? !landeasementsf.equals(that.landeasementsf) : that.landeasementsf != null)
            return false;
        if (landexcesssf != null ? !landexcesssf.equals(that.landexcesssf) : that.landexcesssf != null)
            return false;
        if (landgrossacres != null ? !landgrossacres.equals(that.landgrossacres) : that.landgrossacres != null)
            return false;
        if (landgrossff != null ? !landgrossff.equals(that.landgrossff) : that.landgrossff != null)
            return false;
        if (landgrosssf != null ? !landgrosssf.equals(that.landgrosssf) : that.landgrosssf != null)
            return false;
        if (landgrossunitcount != null ? !landgrossunitcount.equals(that.landgrossunitcount) : that.landgrossunitcount != null)
            return false;
        if (landoverridesizeadj != null ? !landoverridesizeadj.equals(that.landoverridesizeadj) : that.landoverridesizeadj != null)
            return false;
        if (landsizeadj != null ? !landsizeadj.equals(that.landsizeadj) : that.landsizeadj != null)
            return false;
        if (landwidth != null ? !landwidth.equals(that.landwidth) : that.landwidth != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (parkingspaces != null ? !parkingspaces.equals(that.parkingspaces) : that.parkingspaces != null)
            return false;
        if (plattedflag != null ? !plattedflag.equals(that.plattedflag) : that.plattedflag != null)
            return false;
        if (tapfee != null ? !tapfee.equals(that.tapfee) : that.tapfee != null)
            return false;
        if (tifflag != null ? !tifflag.equals(that.tifflag) : that.tifflag != null)
            return false;
        if (totalacctimpinterestpct != null ? !totalacctimpinterestpct.equals(that.totalacctimpinterestpct) : that.totalacctimpinterestpct != null)
            return false;
        if (totalacctlandinterestpct != null ? !totalacctlandinterestpct.equals(that.totalacctlandinterestpct) : that.totalacctlandinterestpct != null)
            return false;
        if (trafficcount != null ? !trafficcount.equals(that.trafficcount) : that.trafficcount != null)
            return false;
        if (vacantflag != null ? !vacantflag.equals(that.vacantflag) : that.vacantflag != null)
            return false;
        if (zoningcode != null ? !zoningcode.equals(that.zoningcode) : that.zoningcode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invacctrealid;
        result = 31 * result + (imponlyflag != null ? imponlyflag.hashCode() : 0);
        result = 31 * result + (tifflag != null ? tifflag.hashCode() : 0);
        result = 31 * result + (vacantflag != null ? vacantflag.hashCode() : 0);
        result = 31 * result + (landwidth != null ? landwidth.hashCode() : 0);
        result = 31 * result + (landdepth != null ? landdepth.hashCode() : 0);
        result = 31 * result + (landeasementsf != null ? landeasementsf.hashCode() : 0);
        result = 31 * result + (landexcesssf != null ? landexcesssf.hashCode() : 0);
        result = 31 * result + (trafficcount != null ? trafficcount.hashCode() : 0);
        result = 31 * result + (parkingspaces != null ? parkingspaces.hashCode() : 0);
        result = 31 * result + (zoningcode != null ? zoningcode.hashCode() : 0);
        result = 31 * result + (floodfringe != null ? floodfringe.hashCode() : 0);
        result = 31 * result + (floodway != null ? floodway.hashCode() : 0);
        result = 31 * result + (tapfee != null ? tapfee.hashCode() : 0);
        result = 31 * result + (plattedflag != null ? plattedflag.hashCode() : 0);
        result = 31 * result + (landcertificationcode != null ? landcertificationcode.hashCode() : 0);
        result = 31 * result + (landappraiser != null ? landappraiser.hashCode() : 0);
        result = 31 * result + (landappraisaldate != null ? landappraisaldate.hashCode() : 0);
        result = 31 * result + (landoverridesizeadj != null ? landoverridesizeadj.hashCode() : 0);
        result = 31 * result + (landsizeadj != null ? landsizeadj.hashCode() : 0);
        result = 31 * result + (landgrosssf != null ? landgrosssf.hashCode() : 0);
        result = 31 * result + (landgrossacres != null ? landgrossacres.hashCode() : 0);
        result = 31 * result + (landgrossff != null ? landgrossff.hashCode() : 0);
        result = 31 * result + (landgrossunitcount != null ? landgrossunitcount.hashCode() : 0);
        result = 31 * result + (acctrealon0 != null ? acctrealon0.hashCode() : 0);
        result = 31 * result + (acctrealon1 != null ? acctrealon1.hashCode() : 0);
        result = 31 * result + (acctrealon2 != null ? acctrealon2.hashCode() : 0);
        result = 31 * result + (acctrealod0 != null ? acctrealod0.hashCode() : 0);
        result = 31 * result + (acctrealod1 != null ? acctrealod1.hashCode() : 0);
        result = 31 * result + (acctrealom0 != null ? acctrealom0.hashCode() : 0);
        result = 31 * result + (acctrealom1 != null ? acctrealom1.hashCode() : 0);
        result = 31 * result + (acctrealot0 != null ? acctrealot0.hashCode() : 0);
        result = 31 * result + (acctrealot1 != null ? acctrealot1.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (defaultlea != null ? defaultlea.hashCode() : 0);
        result = 31 * result + (totalacctimpinterestpct != null ? totalacctimpinterestpct.hashCode() : 0);
        result = 31 * result + (totalacctlandinterestpct != null ? totalacctlandinterestpct.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
