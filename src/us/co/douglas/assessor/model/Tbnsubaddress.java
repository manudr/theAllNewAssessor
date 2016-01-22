package us.co.douglas.assessor.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
@IdClass(TbnsubaddressPK.class)
public class Tbnsubaddress {
    private String subno;
    private String filingno;
    private int addresscode;
    private String address1;
    private String address2;
    private String city;
    private String city2;
    private String countrycode;
    private String province;
    private String zipcode;
    private Integer personcode;
    private int jurisdictionid;
    private Timestamp lastupdated;

    @Id
    @Column(name = "SUBNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getSubno() {
        return subno;
    }

    public void setSubno(String subno) {
        this.subno = subno;
    }

    @Id
    @Column(name = "FILINGNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getFilingno() {
        return filingno;
    }

    public void setFilingno(String filingno) {
        this.filingno = filingno;
    }

    @Id
    @Column(name = "ADDRESSCODE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getAddresscode() {
        return addresscode;
    }

    public void setAddresscode(int addresscode) {
        this.addresscode = addresscode;
    }

    @Basic
    @Column(name = "ADDRESS1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Basic
    @Column(name = "ADDRESS2", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Basic
    @Column(name = "CITY", nullable = true, insertable = true, updatable = true, length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "CITY2", nullable = true, insertable = true, updatable = true, length = 50)
    public String getCity2() {
        return city2;
    }

    public void setCity2(String city2) {
        this.city2 = city2;
    }

    @Basic
    @Column(name = "COUNTRYCODE", nullable = true, insertable = true, updatable = true, length = 5)
    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @Basic
    @Column(name = "PROVINCE", nullable = true, insertable = true, updatable = true, length = 50)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "ZIPCODE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Basic
    @Column(name = "PERSONCODE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getPersoncode() {
        return personcode;
    }

    public void setPersoncode(Integer personcode) {
        this.personcode = personcode;
    }

    @Id
    @Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
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

        Tbnsubaddress that = (Tbnsubaddress) o;

        if (addresscode != that.addresscode) return false;
        if (jurisdictionid != that.jurisdictionid) return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null)
            return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null)
            return false;
        if (city != null ? !city.equals(that.city) : that.city != null)
            return false;
        if (city2 != null ? !city2.equals(that.city2) : that.city2 != null)
            return false;
        if (countrycode != null ? !countrycode.equals(that.countrycode) : that.countrycode != null)
            return false;
        if (filingno != null ? !filingno.equals(that.filingno) : that.filingno != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (personcode != null ? !personcode.equals(that.personcode) : that.personcode != null)
            return false;
        if (province != null ? !province.equals(that.province) : that.province != null)
            return false;
        if (subno != null ? !subno.equals(that.subno) : that.subno != null)
            return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subno != null ? subno.hashCode() : 0;
        result = 31 * result + (filingno != null ? filingno.hashCode() : 0);
        result = 31 * result + addresscode;
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (city2 != null ? city2.hashCode() : 0);
        result = 31 * result + (countrycode != null ? countrycode.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (personcode != null ? personcode.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
