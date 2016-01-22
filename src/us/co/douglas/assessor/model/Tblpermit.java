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
public class Tblpermit {
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

    private String accountno;

    @Basic
    @javax.persistence.Column(name = "ACCOUNTNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    private String localpermitno;

    @Basic
    @javax.persistence.Column(name = "LOCALPERMITNO", nullable = true, insertable = true, updatable = true, length = 50)
    public String getLocalpermitno() {
        return localpermitno;
    }

    public void setLocalpermitno(String localpermitno) {
        this.localpermitno = localpermitno;
    }

    private Timestamp permitdate;

    @Basic
    @javax.persistence.Column(name = "PERMITDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getPermitdate() {
        return permitdate;
    }

    public void setPermitdate(Timestamp permitdate) {
        this.permitdate = permitdate;
    }

    private BigDecimal permitamount;

    @Basic
    @javax.persistence.Column(name = "PERMITAMOUNT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getPermitamount() {
        return permitamount;
    }

    public void setPermitamount(BigDecimal permitamount) {
        this.permitamount = permitamount;
    }

    private BigDecimal permitfee;

    @Basic
    @javax.persistence.Column(name = "PERMITFEE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getPermitfee() {
        return permitfee;
    }

    public void setPermitfee(BigDecimal permitfee) {
        this.permitfee = permitfee;
    }

    private String permitreasondetail;

    @Basic
    @javax.persistence.Column(name = "PERMITREASONDETAIL", nullable = true, insertable = true, updatable = true, length = 1000)
    public String getPermitreasondetail() {
        return permitreasondetail;
    }

    public void setPermitreasondetail(String permitreasondetail) {
        this.permitreasondetail = permitreasondetail;
    }

    private String issuedby;

    @Basic
    @javax.persistence.Column(name = "ISSUEDBY", nullable = true, insertable = true, updatable = true, length = 50)
    public String getIssuedby() {
        return issuedby;
    }

    public void setIssuedby(String issuedby) {
        this.issuedby = issuedby;
    }

    private String plannersapproval;

    @Basic
    @javax.persistence.Column(name = "PLANNERSAPPROVAL", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPlannersapproval() {
        return plannersapproval;
    }

    public void setPlannersapproval(String plannersapproval) {
        this.plannersapproval = plannersapproval;
    }

    private BigDecimal valuechangevalue;

    @Basic
    @javax.persistence.Column(name = "VALUECHANGEVALUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getValuechangevalue() {
        return valuechangevalue;
    }

    public void setValuechangevalue(BigDecimal valuechangevalue) {
        this.valuechangevalue = valuechangevalue;
    }

    private Timestamp permitexpirationdate;

    @Basic
    @javax.persistence.Column(name = "PERMITEXPIRATIONDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getPermitexpirationdate() {
        return permitexpirationdate;
    }

    public void setPermitexpirationdate(Timestamp permitexpirationdate) {
        this.permitexpirationdate = permitexpirationdate;
    }

    private String permituse;

    @Basic
    @javax.persistence.Column(name = "PERMITUSE", nullable = true, insertable = true, updatable = true, length = 30)
    public String getPermituse() {
        return permituse;
    }

    public void setPermituse(String permituse) {
        this.permituse = permituse;
    }

    private BigInteger permitactiveflag;

    @Basic
    @javax.persistence.Column(name = "PERMITACTIVEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getPermitactiveflag() {
        return permitactiveflag;
    }

    public void setPermitactiveflag(BigInteger permitactiveflag) {
        this.permitactiveflag = permitactiveflag;
    }

    private String septicpermitno;

    @Basic
    @javax.persistence.Column(name = "SEPTICPERMITNO", nullable = true, insertable = true, updatable = true, length = 15)
    public String getSepticpermitno() {
        return septicpermitno;
    }

    public void setSepticpermitno(String septicpermitno) {
        this.septicpermitno = septicpermitno;
    }

    private Integer valuechangetaxyear;

    @Basic
    @javax.persistence.Column(name = "VALUECHANGETAXYEAR", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getValuechangetaxyear() {
        return valuechangetaxyear;
    }

    public void setValuechangetaxyear(Integer valuechangetaxyear) {
        this.valuechangetaxyear = valuechangetaxyear;
    }

    private String permitbatchnumber;

    @Basic
    @javax.persistence.Column(name = "PERMITBATCHNUMBER", nullable = true, insertable = true, updatable = true, length = 15)
    public String getPermitbatchnumber() {
        return permitbatchnumber;
    }

    public void setPermitbatchnumber(String permitbatchnumber) {
        this.permitbatchnumber = permitbatchnumber;
    }

    private Integer contractorcode;

    @Basic
    @javax.persistence.Column(name = "CONTRACTORCODE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getContractorcode() {
        return contractorcode;
    }

    public void setContractorcode(Integer contractorcode) {
        this.contractorcode = contractorcode;
    }

    private Integer lendercode;

    @Basic
    @javax.persistence.Column(name = "LENDERCODE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getLendercode() {
        return lendercode;
    }

    public void setLendercode(Integer lendercode) {
        this.lendercode = lendercode;
    }

    private String valuechangeappliedto;

    @Basic
    @javax.persistence.Column(name = "VALUECHANGEAPPLIEDTO", nullable = true, insertable = true, updatable = true, length = 20)
    public String getValuechangeappliedto() {
        return valuechangeappliedto;
    }

    public void setValuechangeappliedto(String valuechangeappliedto) {
        this.valuechangeappliedto = valuechangeappliedto;
    }

    private String permitot0;

    @Basic
    @javax.persistence.Column(name = "PERMITOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPermitot0() {
        return permitot0;
    }

    public void setPermitot0(String permitot0) {
        this.permitot0 = permitot0;
    }

    private String permitot1;

    @Basic
    @javax.persistence.Column(name = "PERMITOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPermitot1() {
        return permitot1;
    }

    public void setPermitot1(String permitot1) {
        this.permitot1 = permitot1;
    }

    private String permitom0;

    @Basic
    @javax.persistence.Column(name = "PERMITOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPermitom0() {
        return permitom0;
    }

    public void setPermitom0(String permitom0) {
        this.permitom0 = permitom0;
    }

    private String permitom1;

    @Basic
    @javax.persistence.Column(name = "PERMITOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPermitom1() {
        return permitom1;
    }

    public void setPermitom1(String permitom1) {
        this.permitom1 = permitom1;
    }

    private BigDecimal permiton0;

    @Basic
    @javax.persistence.Column(name = "PERMITON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getPermiton0() {
        return permiton0;
    }

    public void setPermiton0(BigDecimal permiton0) {
        this.permiton0 = permiton0;
    }

    private BigDecimal permiton1;

    @Basic
    @javax.persistence.Column(name = "PERMITON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getPermiton1() {
        return permiton1;
    }

    public void setPermiton1(BigDecimal permiton1) {
        this.permiton1 = permiton1;
    }

    private BigDecimal permiton2;

    @Basic
    @javax.persistence.Column(name = "PERMITON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getPermiton2() {
        return permiton2;
    }

    public void setPermiton2(BigDecimal permiton2) {
        this.permiton2 = permiton2;
    }

    private BigDecimal primaryimpno;

    @Basic
    @javax.persistence.Column(name = "PRIMARYIMPNO", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getPrimaryimpno() {
        return primaryimpno;
    }

    public void setPrimaryimpno(BigDecimal primaryimpno) {
        this.primaryimpno = primaryimpno;
    }

    private Timestamp permitod0;

    @Basic
    @javax.persistence.Column(name = "PERMITOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getPermitod0() {
        return permitod0;
    }

    public void setPermitod0(Timestamp permitod0) {
        this.permitod0 = permitod0;
    }

    private Timestamp permitod1;

    @Basic
    @javax.persistence.Column(name = "PERMITOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getPermitod1() {
        return permitod1;
    }

    public void setPermitod1(Timestamp permitod1) {
        this.permitod1 = permitod1;
    }

    private String assignedto;

    @Basic
    @javax.persistence.Column(name = "ASSIGNEDTO", nullable = true, insertable = true, updatable = true, length = 20)
    public String getAssignedto() {
        return assignedto;
    }

    public void setAssignedto(String assignedto) {
        this.assignedto = assignedto;
    }

    private String permitworkedby;

    @Basic
    @javax.persistence.Column(name = "PERMITWORKEDBY", nullable = true, insertable = true, updatable = true, length = 30)
    public String getPermitworkedby() {
        return permitworkedby;
    }

    public void setPermitworkedby(String permitworkedby) {
        this.permitworkedby = permitworkedby;
    }

    private Timestamp permitworkdate;

    @Basic
    @javax.persistence.Column(name = "PERMITWORKDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getPermitworkdate() {
        return permitworkdate;
    }

    public void setPermitworkdate(Timestamp permitworkdate) {
        this.permitworkdate = permitworkdate;
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

    private String ownername;

    @Basic
    @javax.persistence.Column(name = "OWNERNAME", nullable = true, insertable = true, updatable = true, length = 60)
    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    private String ownerphonenumber;

    @Basic
    @javax.persistence.Column(name = "OWNERPHONENUMBER", nullable = true, insertable = true, updatable = true, length = 18)
    public String getOwnerphonenumber() {
        return ownerphonenumber;
    }

    public void setOwnerphonenumber(String ownerphonenumber) {
        this.ownerphonenumber = ownerphonenumber;
    }

    private Timestamp certificateofoccupancydate;

    @Basic
    @javax.persistence.Column(name = "CERTIFICATEOFOCCUPANCYDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getCertificateofoccupancydate() {
        return certificateofoccupancydate;
    }

    public void setCertificateofoccupancydate(Timestamp certificateofoccupancydate) {
        this.certificateofoccupancydate = certificateofoccupancydate;
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

        Tblpermit tblpermit = (Tblpermit) o;

        if (seqid != tblpermit.seqid) return false;
        if (verend != tblpermit.verend) return false;
        if (verstart != tblpermit.verstart) return false;
        if (accountno != null ? !accountno.equals(tblpermit.accountno) : tblpermit.accountno != null)
            return false;
        if (assignedto != null ? !assignedto.equals(tblpermit.assignedto) : tblpermit.assignedto != null)
            return false;
        if (certificateofoccupancydate != null ? !certificateofoccupancydate.equals(tblpermit.certificateofoccupancydate) : tblpermit.certificateofoccupancydate != null)
            return false;
        if (contractorcode != null ? !contractorcode.equals(tblpermit.contractorcode) : tblpermit.contractorcode != null)
            return false;
        if (issuedby != null ? !issuedby.equals(tblpermit.issuedby) : tblpermit.issuedby != null)
            return false;
        if (lendercode != null ? !lendercode.equals(tblpermit.lendercode) : tblpermit.lendercode != null)
            return false;
        if (localpermitno != null ? !localpermitno.equals(tblpermit.localpermitno) : tblpermit.localpermitno != null)
            return false;
        if (ownername != null ? !ownername.equals(tblpermit.ownername) : tblpermit.ownername != null)
            return false;
        if (ownerphonenumber != null ? !ownerphonenumber.equals(tblpermit.ownerphonenumber) : tblpermit.ownerphonenumber != null)
            return false;
        if (permitactiveflag != null ? !permitactiveflag.equals(tblpermit.permitactiveflag) : tblpermit.permitactiveflag != null)
            return false;
        if (permitamount != null ? !permitamount.equals(tblpermit.permitamount) : tblpermit.permitamount != null)
            return false;
        if (permitbatchnumber != null ? !permitbatchnumber.equals(tblpermit.permitbatchnumber) : tblpermit.permitbatchnumber != null)
            return false;
        if (permitdate != null ? !permitdate.equals(tblpermit.permitdate) : tblpermit.permitdate != null)
            return false;
        if (permitexpirationdate != null ? !permitexpirationdate.equals(tblpermit.permitexpirationdate) : tblpermit.permitexpirationdate != null)
            return false;
        if (permitfee != null ? !permitfee.equals(tblpermit.permitfee) : tblpermit.permitfee != null)
            return false;
        if (permitno != null ? !permitno.equals(tblpermit.permitno) : tblpermit.permitno != null)
            return false;
        if (permitod0 != null ? !permitod0.equals(tblpermit.permitod0) : tblpermit.permitod0 != null)
            return false;
        if (permitod1 != null ? !permitod1.equals(tblpermit.permitod1) : tblpermit.permitod1 != null)
            return false;
        if (permitom0 != null ? !permitom0.equals(tblpermit.permitom0) : tblpermit.permitom0 != null)
            return false;
        if (permitom1 != null ? !permitom1.equals(tblpermit.permitom1) : tblpermit.permitom1 != null)
            return false;
        if (permiton0 != null ? !permiton0.equals(tblpermit.permiton0) : tblpermit.permiton0 != null)
            return false;
        if (permiton1 != null ? !permiton1.equals(tblpermit.permiton1) : tblpermit.permiton1 != null)
            return false;
        if (permiton2 != null ? !permiton2.equals(tblpermit.permiton2) : tblpermit.permiton2 != null)
            return false;
        if (permitot0 != null ? !permitot0.equals(tblpermit.permitot0) : tblpermit.permitot0 != null)
            return false;
        if (permitot1 != null ? !permitot1.equals(tblpermit.permitot1) : tblpermit.permitot1 != null)
            return false;
        if (permitreasondetail != null ? !permitreasondetail.equals(tblpermit.permitreasondetail) : tblpermit.permitreasondetail != null)
            return false;
        if (permituse != null ? !permituse.equals(tblpermit.permituse) : tblpermit.permituse != null)
            return false;
        if (permitworkdate != null ? !permitworkdate.equals(tblpermit.permitworkdate) : tblpermit.permitworkdate != null)
            return false;
        if (permitworkedby != null ? !permitworkedby.equals(tblpermit.permitworkedby) : tblpermit.permitworkedby != null)
            return false;
        if (plannersapproval != null ? !plannersapproval.equals(tblpermit.plannersapproval) : tblpermit.plannersapproval != null)
            return false;
        if (primaryimpno != null ? !primaryimpno.equals(tblpermit.primaryimpno) : tblpermit.primaryimpno != null)
            return false;
        if (septicpermitno != null ? !septicpermitno.equals(tblpermit.septicpermitno) : tblpermit.septicpermitno != null)
            return false;
        if (valuechangeappliedto != null ? !valuechangeappliedto.equals(tblpermit.valuechangeappliedto) : tblpermit.valuechangeappliedto != null)
            return false;
        if (valuechangetaxyear != null ? !valuechangetaxyear.equals(tblpermit.valuechangetaxyear) : tblpermit.valuechangetaxyear != null)
            return false;
        if (valuechangevalue != null ? !valuechangevalue.equals(tblpermit.valuechangevalue) : tblpermit.valuechangevalue != null)
            return false;
        if (writedate != null ? !writedate.equals(tblpermit.writedate) : tblpermit.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + (permitno != null ? permitno.hashCode() : 0);
        result = 31 * result + (accountno != null ? accountno.hashCode() : 0);
        result = 31 * result + (localpermitno != null ? localpermitno.hashCode() : 0);
        result = 31 * result + (permitdate != null ? permitdate.hashCode() : 0);
        result = 31 * result + (permitamount != null ? permitamount.hashCode() : 0);
        result = 31 * result + (permitfee != null ? permitfee.hashCode() : 0);
        result = 31 * result + (permitreasondetail != null ? permitreasondetail.hashCode() : 0);
        result = 31 * result + (issuedby != null ? issuedby.hashCode() : 0);
        result = 31 * result + (plannersapproval != null ? plannersapproval.hashCode() : 0);
        result = 31 * result + (valuechangevalue != null ? valuechangevalue.hashCode() : 0);
        result = 31 * result + (permitexpirationdate != null ? permitexpirationdate.hashCode() : 0);
        result = 31 * result + (permituse != null ? permituse.hashCode() : 0);
        result = 31 * result + (permitactiveflag != null ? permitactiveflag.hashCode() : 0);
        result = 31 * result + (septicpermitno != null ? septicpermitno.hashCode() : 0);
        result = 31 * result + (valuechangetaxyear != null ? valuechangetaxyear.hashCode() : 0);
        result = 31 * result + (permitbatchnumber != null ? permitbatchnumber.hashCode() : 0);
        result = 31 * result + (contractorcode != null ? contractorcode.hashCode() : 0);
        result = 31 * result + (lendercode != null ? lendercode.hashCode() : 0);
        result = 31 * result + (valuechangeappliedto != null ? valuechangeappliedto.hashCode() : 0);
        result = 31 * result + (permitot0 != null ? permitot0.hashCode() : 0);
        result = 31 * result + (permitot1 != null ? permitot1.hashCode() : 0);
        result = 31 * result + (permitom0 != null ? permitom0.hashCode() : 0);
        result = 31 * result + (permitom1 != null ? permitom1.hashCode() : 0);
        result = 31 * result + (permiton0 != null ? permiton0.hashCode() : 0);
        result = 31 * result + (permiton1 != null ? permiton1.hashCode() : 0);
        result = 31 * result + (permiton2 != null ? permiton2.hashCode() : 0);
        result = 31 * result + (primaryimpno != null ? primaryimpno.hashCode() : 0);
        result = 31 * result + (permitod0 != null ? permitod0.hashCode() : 0);
        result = 31 * result + (permitod1 != null ? permitod1.hashCode() : 0);
        result = 31 * result + (assignedto != null ? assignedto.hashCode() : 0);
        result = 31 * result + (permitworkedby != null ? permitworkedby.hashCode() : 0);
        result = 31 * result + (permitworkdate != null ? permitworkdate.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + (ownername != null ? ownername.hashCode() : 0);
        result = 31 * result + (ownerphonenumber != null ? ownerphonenumber.hashCode() : 0);
        result = 31 * result + (certificateofoccupancydate != null ? certificateofoccupancydate.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
