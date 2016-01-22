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
public class Tblpermitapplicant {
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

    private String permitno;

    @Basic
    @javax.persistence.Column(name = "PERMITNO", nullable = false, insertable = true, updatable = true, length = 50)
    public String getPermitno() {
        return permitno;
    }

    public void setPermitno(String permitno) {
        this.permitno = permitno;
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

    private Integer addresscode;

    @Basic
    @javax.persistence.Column(name = "ADDRESSCODE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getAddresscode() {
        return addresscode;
    }

    public void setAddresscode(Integer addresscode) {
        this.addresscode = addresscode;
    }

    private String permitapplicantbusinessname;

    @Basic
    @javax.persistence.Column(name = "PERMITAPPLICANTBUSINESSNAME", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPermitapplicantbusinessname() {
        return permitapplicantbusinessname;
    }

    public void setPermitapplicantbusinessname(String permitapplicantbusinessname) {
        this.permitapplicantbusinessname = permitapplicantbusinessname;
    }

    private BigInteger ownerflag;

    @Basic
    @javax.persistence.Column(name = "OWNERFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getOwnerflag() {
        return ownerflag;
    }

    public void setOwnerflag(BigInteger ownerflag) {
        this.ownerflag = ownerflag;
    }

    private BigInteger primaryapplicantflag;

    @Basic
    @javax.persistence.Column(name = "PRIMARYAPPLICANTFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getPrimaryapplicantflag() {
        return primaryapplicantflag;
    }

    public void setPrimaryapplicantflag(BigInteger primaryapplicantflag) {
        this.primaryapplicantflag = primaryapplicantflag;
    }

    private BigDecimal permitapplicanton0;

    @Basic
    @javax.persistence.Column(name = "PERMITAPPLICANTON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getPermitapplicanton0() {
        return permitapplicanton0;
    }

    public void setPermitapplicanton0(BigDecimal permitapplicanton0) {
        this.permitapplicanton0 = permitapplicanton0;
    }

    private BigDecimal permitapplicanton1;

    @Basic
    @javax.persistence.Column(name = "PERMITAPPLICANTON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getPermitapplicanton1() {
        return permitapplicanton1;
    }

    public void setPermitapplicanton1(BigDecimal permitapplicanton1) {
        this.permitapplicanton1 = permitapplicanton1;
    }

    private BigDecimal permitapplicanton2;

    @Basic
    @javax.persistence.Column(name = "PERMITAPPLICANTON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getPermitapplicanton2() {
        return permitapplicanton2;
    }

    public void setPermitapplicanton2(BigDecimal permitapplicanton2) {
        this.permitapplicanton2 = permitapplicanton2;
    }

    private Timestamp permitapplicantod0;

    @Basic
    @javax.persistence.Column(name = "PERMITAPPLICANTOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getPermitapplicantod0() {
        return permitapplicantod0;
    }

    public void setPermitapplicantod0(Timestamp permitapplicantod0) {
        this.permitapplicantod0 = permitapplicantod0;
    }

    private Timestamp permitapplicantod1;

    @Basic
    @javax.persistence.Column(name = "PERMITAPPLICANTOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getPermitapplicantod1() {
        return permitapplicantod1;
    }

    public void setPermitapplicantod1(Timestamp permitapplicantod1) {
        this.permitapplicantod1 = permitapplicantod1;
    }

    private String permitapplicantom0;

    @Basic
    @javax.persistence.Column(name = "PERMITAPPLICANTOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPermitapplicantom0() {
        return permitapplicantom0;
    }

    public void setPermitapplicantom0(String permitapplicantom0) {
        this.permitapplicantom0 = permitapplicantom0;
    }

    private String permitapplicantom1;

    @Basic
    @javax.persistence.Column(name = "PERMITAPPLICANTOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPermitapplicantom1() {
        return permitapplicantom1;
    }

    public void setPermitapplicantom1(String permitapplicantom1) {
        this.permitapplicantom1 = permitapplicantom1;
    }

    private String permitapplicantot0;

    @Basic
    @javax.persistence.Column(name = "PERMITAPPLICANTOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPermitapplicantot0() {
        return permitapplicantot0;
    }

    public void setPermitapplicantot0(String permitapplicantot0) {
        this.permitapplicantot0 = permitapplicantot0;
    }

    private String permitapplicantot1;

    @Basic
    @javax.persistence.Column(name = "PERMITAPPLICANTOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPermitapplicantot1() {
        return permitapplicantot1;
    }

    public void setPermitapplicantot1(String permitapplicantot1) {
        this.permitapplicantot1 = permitapplicantot1;
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

    private Timestamp writedate;

    @Basic
    @javax.persistence.Column(name = "WRITEDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getWritedate() {
        return writedate;
    }

    public void setWritedate(Timestamp writedate) {
        this.writedate = writedate;
    }

    private int seqid;

    @Id
    @javax.persistence.Column(name = "SEQID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSeqid() {
        return seqid;
    }

    public void setSeqid(int seqid) {
        this.seqid = seqid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tblpermitapplicant that = (Tblpermitapplicant) o;

        if (jurisdictionid != that.jurisdictionid) return false;
        if (personcode != that.personcode) return false;
        if (seqid != that.seqid) return false;
        if (verend != that.verend) return false;
        if (verstart != that.verstart) return false;
        if (addresscode != null ? !addresscode.equals(that.addresscode) : that.addresscode != null)
            return false;
        if (ownerflag != null ? !ownerflag.equals(that.ownerflag) : that.ownerflag != null)
            return false;
        if (permitapplicantbusinessname != null ? !permitapplicantbusinessname.equals(that.permitapplicantbusinessname) : that.permitapplicantbusinessname != null)
            return false;
        if (permitapplicantod0 != null ? !permitapplicantod0.equals(that.permitapplicantod0) : that.permitapplicantod0 != null)
            return false;
        if (permitapplicantod1 != null ? !permitapplicantod1.equals(that.permitapplicantod1) : that.permitapplicantod1 != null)
            return false;
        if (permitapplicantom0 != null ? !permitapplicantom0.equals(that.permitapplicantom0) : that.permitapplicantom0 != null)
            return false;
        if (permitapplicantom1 != null ? !permitapplicantom1.equals(that.permitapplicantom1) : that.permitapplicantom1 != null)
            return false;
        if (permitapplicanton0 != null ? !permitapplicanton0.equals(that.permitapplicanton0) : that.permitapplicanton0 != null)
            return false;
        if (permitapplicanton1 != null ? !permitapplicanton1.equals(that.permitapplicanton1) : that.permitapplicanton1 != null)
            return false;
        if (permitapplicanton2 != null ? !permitapplicanton2.equals(that.permitapplicanton2) : that.permitapplicanton2 != null)
            return false;
        if (permitapplicantot0 != null ? !permitapplicantot0.equals(that.permitapplicantot0) : that.permitapplicantot0 != null)
            return false;
        if (permitapplicantot1 != null ? !permitapplicantot1.equals(that.permitapplicantot1) : that.permitapplicantot1 != null)
            return false;
        if (permitno != null ? !permitno.equals(that.permitno) : that.permitno != null)
            return false;
        if (primaryapplicantflag != null ? !primaryapplicantflag.equals(that.primaryapplicantflag) : that.primaryapplicantflag != null)
            return false;
        if (writedate != null ? !writedate.equals(that.writedate) : that.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + (permitno != null ? permitno.hashCode() : 0);
        result = 31 * result + personcode;
        result = 31 * result + (addresscode != null ? addresscode.hashCode() : 0);
        result = 31 * result + (permitapplicantbusinessname != null ? permitapplicantbusinessname.hashCode() : 0);
        result = 31 * result + (ownerflag != null ? ownerflag.hashCode() : 0);
        result = 31 * result + (primaryapplicantflag != null ? primaryapplicantflag.hashCode() : 0);
        result = 31 * result + (permitapplicanton0 != null ? permitapplicanton0.hashCode() : 0);
        result = 31 * result + (permitapplicanton1 != null ? permitapplicanton1.hashCode() : 0);
        result = 31 * result + (permitapplicanton2 != null ? permitapplicanton2.hashCode() : 0);
        result = 31 * result + (permitapplicantod0 != null ? permitapplicantod0.hashCode() : 0);
        result = 31 * result + (permitapplicantod1 != null ? permitapplicantod1.hashCode() : 0);
        result = 31 * result + (permitapplicantom0 != null ? permitapplicantom0.hashCode() : 0);
        result = 31 * result + (permitapplicantom1 != null ? permitapplicantom1.hashCode() : 0);
        result = 31 * result + (permitapplicantot0 != null ? permitapplicantot0.hashCode() : 0);
        result = 31 * result + (permitapplicantot1 != null ? permitapplicantot1.hashCode() : 0);
        result = 31 * result + jurisdictionid;
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
