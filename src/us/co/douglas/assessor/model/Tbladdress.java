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
public class Tbladdress {

    private int seqid;

    @Id
    @javax.persistence.Column(name = "SEQID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSeqid() {
        return seqid;
    }

    public void setSeqid(int seqid) {
        this.seqid = seqid;
    }

    private int verstart;

    @Basic
    @javax.persistence.Column(name = "VERSTART", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getVerstart() {
        return verstart;
    }

    public void setVerstart(int verstart) {
        this.verstart = verstart;
    }

    private int verend;

    @Basic
    @javax.persistence.Column(name = "VEREND", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getVerend() {
        return verend;
    }

    public void setVerend(int verend) {
        this.verend = verend;
    }

    private int addresscode;

    @Basic
    @javax.persistence.Column(name = "ADDRESSCODE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getAddresscode() {
        return addresscode;
    }

    public void setAddresscode(int addresscode) {
        this.addresscode = addresscode;
    }

    private String address1;

    @Basic
    @javax.persistence.Column(name = "ADDRESS1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    private String address2;

    @Basic
    @javax.persistence.Column(name = "ADDRESS2", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    private String city;

    @Basic
    @javax.persistence.Column(name = "CITY", nullable = true, insertable = true, updatable = true, length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String statecode;

    @Basic
    @javax.persistence.Column(name = "STATECODE", nullable = true, insertable = true, updatable = true, length = 2)
    public String getStatecode() {
        return statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    private String zipcode;

    @Basic
    @javax.persistence.Column(name = "ZIPCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    private int personcode;

    @Basic
    @javax.persistence.Column(name = "PERSONCODE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getPersoncode() {
        return personcode;
    }

    public void setPersoncode(int personcode) {
        this.personcode = personcode;
    }

    private String province;

    @Basic
    @javax.persistence.Column(name = "PROVINCE", nullable = true, insertable = true, updatable = true, length = 50)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    private BigDecimal addresson0;

    @Basic
    @javax.persistence.Column(name = "ADDRESSON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAddresson0() {
        return addresson0;
    }

    public void setAddresson0(BigDecimal addresson0) {
        this.addresson0 = addresson0;
    }

    private BigDecimal addresson1;

    @Basic
    @javax.persistence.Column(name = "ADDRESSON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAddresson1() {
        return addresson1;
    }

    public void setAddresson1(BigDecimal addresson1) {
        this.addresson1 = addresson1;
    }

    private BigDecimal addresson2;

    @Basic
    @javax.persistence.Column(name = "ADDRESSON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getAddresson2() {
        return addresson2;
    }

    public void setAddresson2(BigDecimal addresson2) {
        this.addresson2 = addresson2;
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

    private String country;

    @Basic
    @javax.persistence.Column(name = "COUNTRY", nullable = true, insertable = true, updatable = true, length = 100)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String postalcode;

    @Basic
    @javax.persistence.Column(name = "POSTALCODE", nullable = true, insertable = true, updatable = true, length = 20)
    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    private Timestamp addressod0;

    @Basic
    @javax.persistence.Column(name = "ADDRESSOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getAddressod0() {
        return addressod0;
    }

    public void setAddressod0(Timestamp addressod0) {
        this.addressod0 = addressod0;
    }

    private Timestamp addressod1;

    @Basic
    @javax.persistence.Column(name = "ADDRESSOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getAddressod1() {
        return addressod1;
    }

    public void setAddressod1(Timestamp addressod1) {
        this.addressod1 = addressod1;
    }

    private String addressom0;

    @Basic
    @javax.persistence.Column(name = "ADDRESSOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAddressom0() {
        return addressom0;
    }

    public void setAddressom0(String addressom0) {
        this.addressom0 = addressom0;
    }

    private String addressom1;

    @Basic
    @javax.persistence.Column(name = "ADDRESSOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAddressom1() {
        return addressom1;
    }

    public void setAddressom1(String addressom1) {
        this.addressom1 = addressom1;
    }

    private String addressot0;

    @Basic
    @javax.persistence.Column(name = "ADDRESSOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAddressot0() {
        return addressot0;
    }

    public void setAddressot0(String addressot0) {
        this.addressot0 = addressot0;
    }

    private String addressot1;

    @Basic
    @javax.persistence.Column(name = "ADDRESSOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAddressot1() {
        return addressot1;
    }

    public void setAddressot1(String addressot1) {
        this.addressot1 = addressot1;
    }

    private BigInteger addressvalidflag;

    @Basic
    @javax.persistence.Column(name = "ADDRESSVALIDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getAddressvalidflag() {
        return addressvalidflag;
    }

    public void setAddressvalidflag(BigInteger addressvalidflag) {
        this.addressvalidflag = addressvalidflag;
    }

    private Timestamp writedate;

    @Basic
    @javax.persistence.Column(name = "WRITEDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getWritedate() {
        return writedate;
    }

    public void setWritedate(Timestamp writedate) {
        this.writedate = writedate;
    }

    private BigInteger privateflag;

    @Basic
    @javax.persistence.Column(name = "PRIVATEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getPrivateflag() {
        return privateflag;
    }

    public void setPrivateflag(BigInteger privateflag) {
        this.privateflag = privateflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tbladdress that = (Tbladdress) o;

        if (addresscode != that.addresscode) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (personcode != that.personcode) return false;
        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null)
            return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null)
            return false;
        if (addressod0 != null ? !addressod0.equals(that.addressod0) : that.addressod0 != null)
            return false;
        if (addressod1 != null ? !addressod1.equals(that.addressod1) : that.addressod1 != null)
            return false;
        if (addressom0 != null ? !addressom0.equals(that.addressom0) : that.addressom0 != null)
            return false;
        if (addressom1 != null ? !addressom1.equals(that.addressom1) : that.addressom1 != null)
            return false;
        if (addresson0 != null ? !addresson0.equals(that.addresson0) : that.addresson0 != null)
            return false;
        if (addresson1 != null ? !addresson1.equals(that.addresson1) : that.addresson1 != null)
            return false;
        if (addresson2 != null ? !addresson2.equals(that.addresson2) : that.addresson2 != null)
            return false;
        if (addressot0 != null ? !addressot0.equals(that.addressot0) : that.addressot0 != null)
            return false;
        if (addressot1 != null ? !addressot1.equals(that.addressot1) : that.addressot1 != null)
            return false;
        if (addressvalidflag != null ? !addressvalidflag.equals(that.addressvalidflag) : that.addressvalidflag != null)
            return false;
        if (city != null ? !city.equals(that.city) : that.city != null)
            return false;
        if (country != null ? !country.equals(that.country) : that.country != null)
            return false;
        if (postalcode != null ? !postalcode.equals(that.postalcode) : that.postalcode != null)
            return false;
        if (privateflag != null ? !privateflag.equals(that.privateflag) : that.privateflag != null)
            return false;
        if (province != null ? !province.equals(that.province) : that.province != null)
            return false;
        if (statecode != null ? !statecode.equals(that.statecode) : that.statecode != null)
            return false;
        if (writedate != null ? !writedate.equals(that.writedate) : that.writedate != null)
            return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = seqid;
        result = 31 * result + verstart;
        result = 31 * result + verend;
        result = 31 * result + addresscode;
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (statecode != null ? statecode.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + personcode;
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (addresson0 != null ? addresson0.hashCode() : 0);
        result = 31 * result + (addresson1 != null ? addresson1.hashCode() : 0);
        result = 31 * result + (addresson2 != null ? addresson2.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (postalcode != null ? postalcode.hashCode() : 0);
        result = 31 * result + (addressod0 != null ? addressod0.hashCode() : 0);
        result = 31 * result + (addressod1 != null ? addressod1.hashCode() : 0);
        result = 31 * result + (addressom0 != null ? addressom0.hashCode() : 0);
        result = 31 * result + (addressom1 != null ? addressom1.hashCode() : 0);
        result = 31 * result + (addressot0 != null ? addressot0.hashCode() : 0);
        result = 31 * result + (addressot1 != null ? addressot1.hashCode() : 0);
        result = 31 * result + (addressvalidflag != null ? addressvalidflag.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + (privateflag != null ? privateflag.hashCode() : 0);
        return result;
    }
}
