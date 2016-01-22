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
public class Tblimps {
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

    private String accountno;

    @Basic
    @javax.persistence.Column(name = "ACCOUNTNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    private BigDecimal impno;

    @Basic
    @javax.persistence.Column(name = "IMPNO", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getImpno() {
        return impno;
    }

    public void setImpno(BigDecimal impno) {
        this.impno = impno;
    }

    private String impdescription;

    @Basic
    @javax.persistence.Column(name = "IMPDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 100)
    public String getImpdescription() {
        return impdescription;
    }

    public void setImpdescription(String impdescription) {
        this.impdescription = impdescription;
    }

    private String costvalueby;

    @Basic
    @javax.persistence.Column(name = "COSTVALUEBY", nullable = true, insertable = true, updatable = true, length = 10)
    public String getCostvalueby() {
        return costvalueby;
    }

    public void setCostvalueby(String costvalueby) {
        this.costvalueby = costvalueby;
    }

    private String marketvalueby;

    @Basic
    @javax.persistence.Column(name = "MARKETVALUEBY", nullable = true, insertable = true, updatable = true, length = 10)
    public String getMarketvalueby() {
        return marketvalueby;
    }

    public void setMarketvalueby(String marketvalueby) {
        this.marketvalueby = marketvalueby;
    }

    private String incomevalueby;

    @Basic
    @javax.persistence.Column(name = "INCOMEVALUEBY", nullable = true, insertable = true, updatable = true, length = 10)
    public String getIncomevalueby() {
        return incomevalueby;
    }

    public void setIncomevalueby(String incomevalueby) {
        this.incomevalueby = incomevalueby;
    }

    private BigDecimal landattributedpct;

    @Basic
    @javax.persistence.Column(name = "LANDATTRIBUTEDPCT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getLandattributedpct() {
        return landattributedpct;
    }

    public void setLandattributedpct(BigDecimal landattributedpct) {
        this.landattributedpct = landattributedpct;
    }

    private BigDecimal impcompletedpct;

    @Basic
    @javax.persistence.Column(name = "IMPCOMPLETEDPCT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getImpcompletedpct() {
        return impcompletedpct;
    }

    public void setImpcompletedpct(BigDecimal impcompletedpct) {
        this.impcompletedpct = impcompletedpct;
    }

    private String impunittype;

    @Basic
    @javax.persistence.Column(name = "IMPUNITTYPE", nullable = true, insertable = true, updatable = true, length = 30)
    public String getImpunittype() {
        return impunittype;
    }

    public void setImpunittype(String impunittype) {
        this.impunittype = impunittype;
    }

    private BigDecimal impdesignadjpct;

    @Basic
    @javax.persistence.Column(name = "IMPDESIGNADJPCT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getImpdesignadjpct() {
        return impdesignadjpct;
    }

    public void setImpdesignadjpct(BigDecimal impdesignadjpct) {
        this.impdesignadjpct = impdesignadjpct;
    }

    private BigDecimal impexterioradjpct;

    @Basic
    @javax.persistence.Column(name = "IMPEXTERIORADJPCT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getImpexterioradjpct() {
        return impexterioradjpct;
    }

    public void setImpexterioradjpct(BigDecimal impexterioradjpct) {
        this.impexterioradjpct = impexterioradjpct;
    }

    private BigDecimal impphysicaldeprpct;

    @Basic
    @javax.persistence.Column(name = "IMPPHYSICALDEPRPCT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getImpphysicaldeprpct() {
        return impphysicaldeprpct;
    }

    public void setImpphysicaldeprpct(BigDecimal impphysicaldeprpct) {
        this.impphysicaldeprpct = impphysicaldeprpct;
    }

    private BigDecimal functionalobsolescepct;

    @Basic
    @javax.persistence.Column(name = "FUNCTIONALOBSOLESCEPCT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getFunctionalobsolescepct() {
        return functionalobsolescepct;
    }

    public void setFunctionalobsolescepct(BigDecimal functionalobsolescepct) {
        this.functionalobsolescepct = functionalobsolescepct;
    }

    private BigDecimal economicobsolescepct;

    @Basic
    @javax.persistence.Column(name = "ECONOMICOBSOLESCEPCT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getEconomicobsolescepct() {
        return economicobsolescepct;
    }

    public void setEconomicobsolescepct(BigDecimal economicobsolescepct) {
        this.economicobsolescepct = economicobsolescepct;
    }

    private BigDecimal impotheradjpct;

    @Basic
    @javax.persistence.Column(name = "IMPOTHERADJPCT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getImpotheradjpct() {
        return impotheradjpct;
    }

    public void setImpotheradjpct(BigDecimal impotheradjpct) {
        this.impotheradjpct = impotheradjpct;
    }

    private String mhtitleno;

    @Basic
    @javax.persistence.Column(name = "MHTITLENO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getMhtitleno() {
        return mhtitleno;
    }

    public void setMhtitleno(String mhtitleno) {
        this.mhtitleno = mhtitleno;
    }

    private String mhserialno;

    @Basic
    @javax.persistence.Column(name = "MHSERIALNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getMhserialno() {
        return mhserialno;
    }

    public void setMhserialno(String mhserialno) {
        this.mhserialno = mhserialno;
    }

    private Integer mhtotallength;

    @Basic
    @javax.persistence.Column(name = "MHTOTALLENGTH", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getMhtotallength() {
        return mhtotallength;
    }

    public void setMhtotallength(Integer mhtotallength) {
        this.mhtotallength = mhtotallength;
    }

    private String mhdecalno;

    @Basic
    @javax.persistence.Column(name = "MHDECALNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getMhdecalno() {
        return mhdecalno;
    }

    public void setMhdecalno(String mhdecalno) {
        this.mhdecalno = mhdecalno;
    }

    private String mhtagno;

    @Basic
    @javax.persistence.Column(name = "MHTAGNO", nullable = true, insertable = true, updatable = true, length = 30)
    public String getMhtagno() {
        return mhtagno;
    }

    public void setMhtagno(String mhtagno) {
        this.mhtagno = mhtagno;
    }

    private String appraiser;

    @Basic
    @javax.persistence.Column(name = "APPRAISER", nullable = true, insertable = true, updatable = true, length = 20)
    public String getAppraiser() {
        return appraiser;
    }

    public void setAppraiser(String appraiser) {
        this.appraiser = appraiser;
    }

    private Timestamp appraisaldate;

    @Basic
    @javax.persistence.Column(name = "APPRAISALDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getAppraisaldate() {
        return appraisaldate;
    }

    public void setAppraisaldate(Timestamp appraisaldate) {
        this.appraisaldate = appraisaldate;
    }

    private BigInteger owneroccupiedflag;

    @Basic
    @javax.persistence.Column(name = "OWNEROCCUPIEDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getOwneroccupiedflag() {
        return owneroccupiedflag;
    }

    public void setOwneroccupiedflag(BigInteger owneroccupiedflag) {
        this.owneroccupiedflag = owneroccupiedflag;
    }

    private String costmethod;

    @Basic
    @javax.persistence.Column(name = "COSTMETHOD", nullable = true, insertable = true, updatable = true, length = 30)
    public String getCostmethod() {
        return costmethod;
    }

    public void setCostmethod(String costmethod) {
        this.costmethod = costmethod;
    }

    private String marketmethod;

    @Basic
    @javax.persistence.Column(name = "MARKETMETHOD", nullable = true, insertable = true, updatable = true, length = 30)
    public String getMarketmethod() {
        return marketmethod;
    }

    public void setMarketmethod(String marketmethod) {
        this.marketmethod = marketmethod;
    }

    private String incomemethod;

    @Basic
    @javax.persistence.Column(name = "INCOMEMETHOD", nullable = true, insertable = true, updatable = true, length = 30)
    public String getIncomemethod() {
        return incomemethod;
    }

    public void setIncomemethod(String incomemethod) {
        this.incomemethod = incomemethod;
    }

    private String impconditiontype;

    @Basic
    @javax.persistence.Column(name = "IMPCONDITIONTYPE", nullable = true, insertable = true, updatable = true, length = 40)
    public String getImpconditiontype() {
        return impconditiontype;
    }

    public void setImpconditiontype(String impconditiontype) {
        this.impconditiontype = impconditiontype;
    }

    private BigDecimal condolandpercent;

    @Basic
    @javax.persistence.Column(name = "CONDOLANDPERCENT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getCondolandpercent() {
        return condolandpercent;
    }

    public void setCondolandpercent(BigDecimal condolandpercent) {
        this.condolandpercent = condolandpercent;
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

    private BigDecimal condoimppercent;

    @Basic
    @javax.persistence.Column(name = "CONDOIMPPERCENT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getCondoimppercent() {
        return condoimppercent;
    }

    public void setCondoimppercent(BigDecimal condoimppercent) {
        this.condoimppercent = condoimppercent;
    }

    private Integer impperimeter;

    @Basic
    @javax.persistence.Column(name = "IMPPERIMETER", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getImpperimeter() {
        return impperimeter;
    }

    public void setImpperimeter(Integer impperimeter) {
        this.impperimeter = impperimeter;
    }

    private BigDecimal impinterioradjpct;

    @Basic
    @javax.persistence.Column(name = "IMPINTERIORADJPCT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getImpinterioradjpct() {
        return impinterioradjpct;
    }

    public void setImpinterioradjpct(BigDecimal impinterioradjpct) {
        this.impinterioradjpct = impinterioradjpct;
    }

    private Integer condoimpsf;

    @Basic
    @javax.persistence.Column(name = "CONDOIMPSF", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getCondoimpsf() {
        return condoimpsf;
    }

    public void setCondoimpsf(Integer condoimpsf) {
        this.condoimpsf = condoimpsf;
    }

    private BigDecimal impamateuradjpct;

    @Basic
    @javax.persistence.Column(name = "IMPAMATEURADJPCT", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getImpamateuradjpct() {
        return impamateuradjpct;
    }

    public void setImpamateuradjpct(BigDecimal impamateuradjpct) {
        this.impamateuradjpct = impamateuradjpct;
    }

    private Integer impnetsf;

    @Basic
    @javax.persistence.Column(name = "IMPNETSF", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getImpnetsf() {
        return impnetsf;
    }

    public void setImpnetsf(Integer impnetsf) {
        this.impnetsf = impnetsf;
    }

    private String impsot0;

    @Basic
    @javax.persistence.Column(name = "IMPSOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsot0() {
        return impsot0;
    }

    public void setImpsot0(String impsot0) {
        this.impsot0 = impsot0;
    }

    private String impsot1;

    @Basic
    @javax.persistence.Column(name = "IMPSOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsot1() {
        return impsot1;
    }

    public void setImpsot1(String impsot1) {
        this.impsot1 = impsot1;
    }

    private String impsom0;

    @Basic
    @javax.persistence.Column(name = "IMPSOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsom0() {
        return impsom0;
    }

    public void setImpsom0(String impsom0) {
        this.impsom0 = impsom0;
    }

    private String impsom1;

    @Basic
    @javax.persistence.Column(name = "IMPSOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getImpsom1() {
        return impsom1;
    }

    public void setImpsom1(String impsom1) {
        this.impsom1 = impsom1;
    }

    private Timestamp impsod0;

    @Basic
    @javax.persistence.Column(name = "IMPSOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getImpsod0() {
        return impsod0;
    }

    public void setImpsod0(Timestamp impsod0) {
        this.impsod0 = impsod0;
    }

    private Timestamp impsod1;

    @Basic
    @javax.persistence.Column(name = "IMPSOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getImpsod1() {
        return impsod1;
    }

    public void setImpsod1(Timestamp impsod1) {
        this.impsod1 = impsod1;
    }

    private BigDecimal impson0;

    @Basic
    @javax.persistence.Column(name = "IMPSON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getImpson0() {
        return impson0;
    }

    public void setImpson0(BigDecimal impson0) {
        this.impson0 = impson0;
    }

    private BigDecimal impson1;

    @Basic
    @javax.persistence.Column(name = "IMPSON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getImpson1() {
        return impson1;
    }

    public void setImpson1(BigDecimal impson1) {
        this.impson1 = impson1;
    }

    private BigDecimal impson2;

    @Basic
    @javax.persistence.Column(name = "IMPSON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getImpson2() {
        return impson2;
    }

    public void setImpson2(BigDecimal impson2) {
        this.impson2 = impson2;
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

        Tblimps tblimps = (Tblimps) o;

        if (seqid != tblimps.seqid) return false;
        if (verend != tblimps.verend) return false;
        if (verstart != tblimps.verstart) return false;
        if (accountno != null ? !accountno.equals(tblimps.accountno) : tblimps.accountno != null)
            return false;
        if (appraisaldate != null ? !appraisaldate.equals(tblimps.appraisaldate) : tblimps.appraisaldate != null)
            return false;
        if (appraiser != null ? !appraiser.equals(tblimps.appraiser) : tblimps.appraiser != null)
            return false;
        if (condoimppercent != null ? !condoimppercent.equals(tblimps.condoimppercent) : tblimps.condoimppercent != null)
            return false;
        if (condoimpsf != null ? !condoimpsf.equals(tblimps.condoimpsf) : tblimps.condoimpsf != null)
            return false;
        if (condolandpercent != null ? !condolandpercent.equals(tblimps.condolandpercent) : tblimps.condolandpercent != null)
            return false;
        if (costmethod != null ? !costmethod.equals(tblimps.costmethod) : tblimps.costmethod != null)
            return false;
        if (costvalueby != null ? !costvalueby.equals(tblimps.costvalueby) : tblimps.costvalueby != null)
            return false;
        if (economicobsolescepct != null ? !economicobsolescepct.equals(tblimps.economicobsolescepct) : tblimps.economicobsolescepct != null)
            return false;
        if (functionalobsolescepct != null ? !functionalobsolescepct.equals(tblimps.functionalobsolescepct) : tblimps.functionalobsolescepct != null)
            return false;
        if (impamateuradjpct != null ? !impamateuradjpct.equals(tblimps.impamateuradjpct) : tblimps.impamateuradjpct != null)
            return false;
        if (impcompletedpct != null ? !impcompletedpct.equals(tblimps.impcompletedpct) : tblimps.impcompletedpct != null)
            return false;
        if (impconditiontype != null ? !impconditiontype.equals(tblimps.impconditiontype) : tblimps.impconditiontype != null)
            return false;
        if (impdescription != null ? !impdescription.equals(tblimps.impdescription) : tblimps.impdescription != null)
            return false;
        if (impdesignadjpct != null ? !impdesignadjpct.equals(tblimps.impdesignadjpct) : tblimps.impdesignadjpct != null)
            return false;
        if (impexterioradjpct != null ? !impexterioradjpct.equals(tblimps.impexterioradjpct) : tblimps.impexterioradjpct != null)
            return false;
        if (impinterioradjpct != null ? !impinterioradjpct.equals(tblimps.impinterioradjpct) : tblimps.impinterioradjpct != null)
            return false;
        if (impnetsf != null ? !impnetsf.equals(tblimps.impnetsf) : tblimps.impnetsf != null)
            return false;
        if (impno != null ? !impno.equals(tblimps.impno) : tblimps.impno != null)
            return false;
        if (impotheradjpct != null ? !impotheradjpct.equals(tblimps.impotheradjpct) : tblimps.impotheradjpct != null)
            return false;
        if (impperimeter != null ? !impperimeter.equals(tblimps.impperimeter) : tblimps.impperimeter != null)
            return false;
        if (impphysicaldeprpct != null ? !impphysicaldeprpct.equals(tblimps.impphysicaldeprpct) : tblimps.impphysicaldeprpct != null)
            return false;
        if (impsf != null ? !impsf.equals(tblimps.impsf) : tblimps.impsf != null)
            return false;
        if (impsod0 != null ? !impsod0.equals(tblimps.impsod0) : tblimps.impsod0 != null)
            return false;
        if (impsod1 != null ? !impsod1.equals(tblimps.impsod1) : tblimps.impsod1 != null)
            return false;
        if (impsom0 != null ? !impsom0.equals(tblimps.impsom0) : tblimps.impsom0 != null)
            return false;
        if (impsom1 != null ? !impsom1.equals(tblimps.impsom1) : tblimps.impsom1 != null)
            return false;
        if (impson0 != null ? !impson0.equals(tblimps.impson0) : tblimps.impson0 != null)
            return false;
        if (impson1 != null ? !impson1.equals(tblimps.impson1) : tblimps.impson1 != null)
            return false;
        if (impson2 != null ? !impson2.equals(tblimps.impson2) : tblimps.impson2 != null)
            return false;
        if (impsot0 != null ? !impsot0.equals(tblimps.impsot0) : tblimps.impsot0 != null)
            return false;
        if (impsot1 != null ? !impsot1.equals(tblimps.impsot1) : tblimps.impsot1 != null)
            return false;
        if (impunittype != null ? !impunittype.equals(tblimps.impunittype) : tblimps.impunittype != null)
            return false;
        if (incomemethod != null ? !incomemethod.equals(tblimps.incomemethod) : tblimps.incomemethod != null)
            return false;
        if (incomevalueby != null ? !incomevalueby.equals(tblimps.incomevalueby) : tblimps.incomevalueby != null)
            return false;
        if (landattributedpct != null ? !landattributedpct.equals(tblimps.landattributedpct) : tblimps.landattributedpct != null)
            return false;
        if (marketmethod != null ? !marketmethod.equals(tblimps.marketmethod) : tblimps.marketmethod != null)
            return false;
        if (marketvalueby != null ? !marketvalueby.equals(tblimps.marketvalueby) : tblimps.marketvalueby != null)
            return false;
        if (mhdecalno != null ? !mhdecalno.equals(tblimps.mhdecalno) : tblimps.mhdecalno != null)
            return false;
        if (mhserialno != null ? !mhserialno.equals(tblimps.mhserialno) : tblimps.mhserialno != null)
            return false;
        if (mhtagno != null ? !mhtagno.equals(tblimps.mhtagno) : tblimps.mhtagno != null)
            return false;
        if (mhtitleno != null ? !mhtitleno.equals(tblimps.mhtitleno) : tblimps.mhtitleno != null)
            return false;
        if (mhtotallength != null ? !mhtotallength.equals(tblimps.mhtotallength) : tblimps.mhtotallength != null)
            return false;
        if (owneroccupiedflag != null ? !owneroccupiedflag.equals(tblimps.owneroccupiedflag) : tblimps.owneroccupiedflag != null)
            return false;
        if (writedate != null ? !writedate.equals(tblimps.writedate) : tblimps.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + (accountno != null ? accountno.hashCode() : 0);
        result = 31 * result + (impno != null ? impno.hashCode() : 0);
        result = 31 * result + (impdescription != null ? impdescription.hashCode() : 0);
        result = 31 * result + (costvalueby != null ? costvalueby.hashCode() : 0);
        result = 31 * result + (marketvalueby != null ? marketvalueby.hashCode() : 0);
        result = 31 * result + (incomevalueby != null ? incomevalueby.hashCode() : 0);
        result = 31 * result + (landattributedpct != null ? landattributedpct.hashCode() : 0);
        result = 31 * result + (impcompletedpct != null ? impcompletedpct.hashCode() : 0);
        result = 31 * result + (impunittype != null ? impunittype.hashCode() : 0);
        result = 31 * result + (impdesignadjpct != null ? impdesignadjpct.hashCode() : 0);
        result = 31 * result + (impexterioradjpct != null ? impexterioradjpct.hashCode() : 0);
        result = 31 * result + (impphysicaldeprpct != null ? impphysicaldeprpct.hashCode() : 0);
        result = 31 * result + (functionalobsolescepct != null ? functionalobsolescepct.hashCode() : 0);
        result = 31 * result + (economicobsolescepct != null ? economicobsolescepct.hashCode() : 0);
        result = 31 * result + (impotheradjpct != null ? impotheradjpct.hashCode() : 0);
        result = 31 * result + (mhtitleno != null ? mhtitleno.hashCode() : 0);
        result = 31 * result + (mhserialno != null ? mhserialno.hashCode() : 0);
        result = 31 * result + (mhtotallength != null ? mhtotallength.hashCode() : 0);
        result = 31 * result + (mhdecalno != null ? mhdecalno.hashCode() : 0);
        result = 31 * result + (mhtagno != null ? mhtagno.hashCode() : 0);
        result = 31 * result + (appraiser != null ? appraiser.hashCode() : 0);
        result = 31 * result + (appraisaldate != null ? appraisaldate.hashCode() : 0);
        result = 31 * result + (owneroccupiedflag != null ? owneroccupiedflag.hashCode() : 0);
        result = 31 * result + (costmethod != null ? costmethod.hashCode() : 0);
        result = 31 * result + (marketmethod != null ? marketmethod.hashCode() : 0);
        result = 31 * result + (incomemethod != null ? incomemethod.hashCode() : 0);
        result = 31 * result + (impconditiontype != null ? impconditiontype.hashCode() : 0);
        result = 31 * result + (condolandpercent != null ? condolandpercent.hashCode() : 0);
        result = 31 * result + (impsf != null ? impsf.hashCode() : 0);
        result = 31 * result + (condoimppercent != null ? condoimppercent.hashCode() : 0);
        result = 31 * result + (impperimeter != null ? impperimeter.hashCode() : 0);
        result = 31 * result + (impinterioradjpct != null ? impinterioradjpct.hashCode() : 0);
        result = 31 * result + (condoimpsf != null ? condoimpsf.hashCode() : 0);
        result = 31 * result + (impamateuradjpct != null ? impamateuradjpct.hashCode() : 0);
        result = 31 * result + (impnetsf != null ? impnetsf.hashCode() : 0);
        result = 31 * result + (impsot0 != null ? impsot0.hashCode() : 0);
        result = 31 * result + (impsot1 != null ? impsot1.hashCode() : 0);
        result = 31 * result + (impsom0 != null ? impsom0.hashCode() : 0);
        result = 31 * result + (impsom1 != null ? impsom1.hashCode() : 0);
        result = 31 * result + (impsod0 != null ? impsod0.hashCode() : 0);
        result = 31 * result + (impsod1 != null ? impsod1.hashCode() : 0);
        result = 31 * result + (impson0 != null ? impson0.hashCode() : 0);
        result = 31 * result + (impson1 != null ? impson1.hashCode() : 0);
        result = 31 * result + (impson2 != null ? impson2.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + seqid;
        return result;
    }
}
