package us.co.douglas.assessor.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by mdronamr on 12/24/15.
 */
@Entity
@Table(name="TBLSALEACCT", schema = "ENCOMPASS")
public class SaleAccount {
    private String receptionNo;

    @Basic
    @javax.persistence.Column(name = "RECEPTIONNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getReceptionNo() {
        return receptionNo;
    }

    public void setReceptionNo(String receptionNo) {
        this.receptionNo = receptionNo;
    }

    private String accountNo;

    @Basic
    @javax.persistence.Column(name = "ACCOUNTNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    private Timestamp inventoryEffectiveDate;

    @Basic
    @javax.persistence.Column(name = "INVENTORYEFFECTIVEDATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getInventoryEffectiveDate() {
        return inventoryEffectiveDate;
    }

    public void setInventoryEffectiveDate(Timestamp inventoryEffectiveDate) {
        this.inventoryEffectiveDate = inventoryEffectiveDate;
    }

    private BigDecimal acctAdjSalePrice;

    @Basic
    @javax.persistence.Column(name = "ACCTADJSALEPRICE", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAcctAdjSalePrice() {
        return acctAdjSalePrice;
    }

    public void setAcctAdjSalePrice(BigDecimal acctAdjSalePrice) {
        this.acctAdjSalePrice = acctAdjSalePrice;
    }

    private BigInteger groupPrimaryAcctFlag;

    @Basic
    @javax.persistence.Column(name = "GROUPPRIMARYACCTFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getGroupPrimaryAcctFlag() {
        return groupPrimaryAcctFlag;
    }

    public void setGroupPrimaryAcctFlag(BigInteger groupPrimaryAcctFlag) {
        this.groupPrimaryAcctFlag = groupPrimaryAcctFlag;
    }

    private BigDecimal saleAcctOn0;

    @Basic
    @javax.persistence.Column(name = "SALEACCTON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleAcctOn0() {
        return saleAcctOn0;
    }

    public void setSaleAcctOn0(BigDecimal saleAcctOn0) {
        this.saleAcctOn0 = saleAcctOn0;
    }

    private BigDecimal saleAcctOn1;

    @Basic
    @javax.persistence.Column(name = "SALEACCTON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleAcctOn1() {
        return saleAcctOn1;
    }

    public void setSaleAcctOn1(BigDecimal saleAcctOn1) {
        this.saleAcctOn1 = saleAcctOn1;
    }

    private BigDecimal saleAcctOn2;

    @Basic
    @javax.persistence.Column(name = "SALEACCTON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleAcctOn2() {
        return saleAcctOn2;
    }

    public void setSaleAcctOn2(BigDecimal saleAcctOn2) {
        this.saleAcctOn2 = saleAcctOn2;
    }

    private Timestamp saleAcctOd0;

    @Basic
    @javax.persistence.Column(name = "SALEACCTOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleAcctOd0() {
        return saleAcctOd0;
    }

    public void setSaleAcctOd0(Timestamp saleAcctOd0) {
        this.saleAcctOd0 = saleAcctOd0;
    }

    private Timestamp saleAcctOd1;

    @Basic
    @javax.persistence.Column(name = "SALEACCTOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleAcctOd1() {
        return saleAcctOd1;
    }

    public void setSaleAcctOd1(Timestamp saleAcctOd1) {
        this.saleAcctOd1 = saleAcctOd1;
    }

    private String saleAcctOm0;

    @Basic
    @javax.persistence.Column(name = "SALEACCTOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleAcctOm0() {
        return saleAcctOm0;
    }

    public void setSaleAcctOm0(String saleAcctOm0) {
        this.saleAcctOm0 = saleAcctOm0;
    }

    private String saleAcctOm1;

    @Basic
    @javax.persistence.Column(name = "SALEACCTOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleAcctOm1() {
        return saleAcctOm1;
    }

    public void setSaleAcctOm1(String saleAcctOm1) {
        this.saleAcctOm1 = saleAcctOm1;
    }

    private String saleAcctOt0;

    @Basic
    @javax.persistence.Column(name = "SALEACCTOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleAcctOt0() {
        return saleAcctOt0;
    }

    public void setSaleAcctOt0(String saleAcctOt0) {
        this.saleAcctOt0 = saleAcctOt0;
    }

    private String saleAcctOt1;

    @Basic
    @javax.persistence.Column(name = "SALEACCTOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleAcctOt1() {
        return saleAcctOt1;
    }

    public void setSaleAcctOt1(String saleAcctOt1) {
        this.saleAcctOt1 = saleAcctOt1;
    }

    private int jurisdictionId;

    @Basic
    @javax.persistence.Column(name = "JURISDICTIONID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(int jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    private Timestamp writeDate;

    @Basic
    @javax.persistence.Column(name = "WRITEDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate;
    }

    private Timestamp saleAcctPenaltyDate;

    @Basic
    @javax.persistence.Column(name = "SALEACCTPENALTYDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleAcctPenaltyDate() {
        return saleAcctPenaltyDate;
    }

    public void setSaleAcctPenaltyDate(Timestamp saleAcctPenaltyDate) {
        this.saleAcctPenaltyDate = saleAcctPenaltyDate;
    }

    private BigInteger saleAcctPenaltyFlag;

    @Basic
    @javax.persistence.Column(name = "SALEACCTPENALTYFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getSaleAcctPenaltyFlag() {
        return saleAcctPenaltyFlag;
    }

    public void setSaleAcctPenaltyFlag(BigInteger saleAcctPenaltyFlag) {
        this.saleAcctPenaltyFlag = saleAcctPenaltyFlag;
    }

    private int seqId;

    @Id
    @javax.persistence.Column(name = "SEQID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSeqId() {
        return seqId;
    }

    public void setSeqId(int seqId) {
        this.seqId = seqId;
    }


}
