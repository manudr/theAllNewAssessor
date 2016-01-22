package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
public class Tbnsubperson {
    private int personcode;

    @Id
    @javax.persistence.Column(name = "PERSONCODE", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getPersoncode() {
        return personcode;
    }

    public void setPersoncode(int personcode) {
        this.personcode = personcode;
    }

    private String subno;

    @javax.persistence.Column(name = "SUBNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getSubno() {
        return subno;
    }

    public void setSubno(String subno) {
        this.subno = subno;
    }

    private String filingno;

    @javax.persistence.Column(name = "FILINGNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getFilingno() {
        return filingno;
    }

    public void setFilingno(String filingno) {
        this.filingno = filingno;
    }

    private String name1;

    @Basic
    @javax.persistence.Column(name = "NAME1", nullable = true, insertable = true, updatable = true, length = 60)
    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    private String name2;

    @Basic
    @javax.persistence.Column(name = "NAME2", nullable = true, insertable = true, updatable = true, length = 60)
    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    private String phone;

    @Basic
    @javax.persistence.Column(name = "PHONE", nullable = true, insertable = true, updatable = true, length = 18)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String mobile;

    @Basic
    @javax.persistence.Column(name = "MOBILE", nullable = true, insertable = true, updatable = true, length = 18)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    private String pager;

    @Basic
    @javax.persistence.Column(name = "PAGER", nullable = true, insertable = true, updatable = true, length = 18)
    public String getPager() {
        return pager;
    }

    public void setPager(String pager) {
        this.pager = pager;
    }

    private String fax;

    @Basic
    @javax.persistence.Column(name = "FAX", nullable = true, insertable = true, updatable = true, length = 18)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    private String emailaddress;

    @Basic
    @javax.persistence.Column(name = "EMAILADDRESS", nullable = true, insertable = true, updatable = true, length = 100)
    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    private String federalidno;

    @Basic
    @javax.persistence.Column(name = "FEDERALIDNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getFederalidno() {
        return federalidno;
    }

    public void setFederalidno(String federalidno) {
        this.federalidno = federalidno;
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

    private int jurisdictionid;

    @javax.persistence.Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(int jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    private String altname1;

    @Basic
    @javax.persistence.Column(name = "ALTNAME1", nullable = true, insertable = true, updatable = true, length = 60)
    public String getAltname1() {
        return altname1;
    }

    public void setAltname1(String altname1) {
        this.altname1 = altname1;
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

        Tbnsubperson that = (Tbnsubperson) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (personcode != that.personcode) return false;
        if (altname1 != null ? !altname1.equals(that.altname1) : that.altname1 != null)
            return false;
        if (emailaddress != null ? !emailaddress.equals(that.emailaddress) : that.emailaddress != null)
            return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null)
            return false;
        if (federalidno != null ? !federalidno.equals(that.federalidno) : that.federalidno != null)
            return false;
        if (filingno != null ? !filingno.equals(that.filingno) : that.filingno != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null)
            return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null)
            return false;
        if (name1 != null ? !name1.equals(that.name1) : that.name1 != null)
            return false;
        if (name2 != null ? !name2.equals(that.name2) : that.name2 != null)
            return false;
        if (pager != null ? !pager.equals(that.pager) : that.pager != null)
            return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null)
            return false;
        if (privateflag != null ? !privateflag.equals(that.privateflag) : that.privateflag != null)
            return false;
        if (subno != null ? !subno.equals(that.subno) : that.subno != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personcode;
        result = 31 * result + (subno != null ? subno.hashCode() : 0);
        result = 31 * result + (filingno != null ? filingno.hashCode() : 0);
        result = 31 * result + (name1 != null ? name1.hashCode() : 0);
        result = 31 * result + (name2 != null ? name2.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (pager != null ? pager.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (emailaddress != null ? emailaddress.hashCode() : 0);
        result = 31 * result + (federalidno != null ? federalidno.hashCode() : 0);
        result = 31 * result + (privateflag != null ? privateflag.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (altname1 != null ? altname1.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        return result;
    }
}
