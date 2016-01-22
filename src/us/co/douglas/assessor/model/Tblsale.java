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
public class Tblsale {
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

    private String receptionno;

    @Basic
    @javax.persistence.Column(name = "RECEPTIONNO", nullable = false, insertable = true, updatable = true, length = 30)
    public String getReceptionno() {
        return receptionno;
    }

    public void setReceptionno(String receptionno) {
        this.receptionno = receptionno;
    }

    private String book;

    @Basic
    @javax.persistence.Column(name = "BOOK", nullable = true, insertable = true, updatable = true, length = 6)
    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    private String page;

    @Basic
    @javax.persistence.Column(name = "PAGE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    private String grantor;

    @Basic
    @javax.persistence.Column(name = "GRANTOR", nullable = true, insertable = true, updatable = true, length = 80)
    public String getGrantor() {
        return grantor;
    }

    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    private String grantee;

    @Basic
    @javax.persistence.Column(name = "GRANTEE", nullable = true, insertable = true, updatable = true, length = 80)
    public String getGrantee() {
        return grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    private Timestamp documentdate;

    @Basic
    @javax.persistence.Column(name = "DOCUMENTDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getDocumentdate() {
        return documentdate;
    }

    public void setDocumentdate(Timestamp documentdate) {
        this.documentdate = documentdate;
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

    private BigDecimal documentfee;

    @Basic
    @javax.persistence.Column(name = "DOCUMENTFEE", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getDocumentfee() {
        return documentfee;
    }

    public void setDocumentfee(BigDecimal documentfee) {
        this.documentfee = documentfee;
    }

    private BigInteger penaltyflag;

    @Basic
    @javax.persistence.Column(name = "PENALTYFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getPenaltyflag() {
        return penaltyflag;
    }

    public void setPenaltyflag(BigInteger penaltyflag) {
        this.penaltyflag = penaltyflag;
    }

    private Timestamp penaltydate;

    @Basic
    @javax.persistence.Column(name = "PENALTYDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getPenaltydate() {
        return penaltydate;
    }

    public void setPenaltydate(Timestamp penaltydate) {
        this.penaltydate = penaltydate;
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

    private BigDecimal ppadjamount;

    @Basic
    @javax.persistence.Column(name = "PPADJAMOUNT", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getPpadjamount() {
        return ppadjamount;
    }

    public void setPpadjamount(BigDecimal ppadjamount) {
        this.ppadjamount = ppadjamount;
    }

    private BigDecimal goodwilladjamount;

    @Basic
    @javax.persistence.Column(name = "GOODWILLADJAMOUNT", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getGoodwilladjamount() {
        return goodwilladjamount;
    }

    public void setGoodwilladjamount(BigDecimal goodwilladjamount) {
        this.goodwilladjamount = goodwilladjamount;
    }

    private BigDecimal otheradjamount;

    @Basic
    @javax.persistence.Column(name = "OTHERADJAMOUNT", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getOtheradjamount() {
        return otheradjamount;
    }

    public void setOtheradjamount(BigDecimal otheradjamount) {
        this.otheradjamount = otheradjamount;
    }

    private BigDecimal timeadj;

    @Basic
    @javax.persistence.Column(name = "TIMEADJ", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getTimeadj() {
        return timeadj;
    }

    public void setTimeadj(BigDecimal timeadj) {
        this.timeadj = timeadj;
    }

    private BigDecimal downpaymentamount;

    @Basic
    @javax.persistence.Column(name = "DOWNPAYMENTAMOUNT", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getDownpaymentamount() {
        return downpaymentamount;
    }

    public void setDownpaymentamount(BigDecimal downpaymentamount) {
        this.downpaymentamount = downpaymentamount;
    }

    private BigDecimal downpaymentpct;

    @Basic
    @javax.persistence.Column(name = "DOWNPAYMENTPCT", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getDownpaymentpct() {
        return downpaymentpct;
    }

    public void setDownpaymentpct(BigDecimal downpaymentpct) {
        this.downpaymentpct = downpaymentpct;
    }

    private BigDecimal noteamount;

    @Basic
    @javax.persistence.Column(name = "NOTEAMOUNT", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getNoteamount() {
        return noteamount;
    }

    public void setNoteamount(BigDecimal noteamount) {
        this.noteamount = noteamount;
    }

    private BigDecimal interestratepct;

    @Basic
    @javax.persistence.Column(name = "INTERESTRATEPCT", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getInterestratepct() {
        return interestratepct;
    }

    public void setInterestratepct(BigDecimal interestratepct) {
        this.interestratepct = interestratepct;
    }

    private BigDecimal loanterm;

    @Basic
    @javax.persistence.Column(name = "LOANTERM", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getLoanterm() {
        return loanterm;
    }

    public void setLoanterm(BigDecimal loanterm) {
        this.loanterm = loanterm;
    }

    private BigDecimal pointspaid;

    @Basic
    @javax.persistence.Column(name = "POINTSPAID", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPointspaid() {
        return pointspaid;
    }

    public void setPointspaid(BigDecimal pointspaid) {
        this.pointspaid = pointspaid;
    }

    private String pointspaidby;

    @Basic
    @javax.persistence.Column(name = "POINTSPAIDBY", nullable = true, insertable = true, updatable = true, length = 30)
    public String getPointspaidby() {
        return pointspaidby;
    }

    public void setPointspaidby(String pointspaidby) {
        this.pointspaidby = pointspaidby;
    }

    private String loaninstitution;

    @Basic
    @javax.persistence.Column(name = "LOANINSTITUTION", nullable = true, insertable = true, updatable = true, length = 50)
    public String getLoaninstitution() {
        return loaninstitution;
    }

    public void setLoaninstitution(String loaninstitution) {
        this.loaninstitution = loaninstitution;
    }

    private BigDecimal mktratepct;

    @Basic
    @javax.persistence.Column(name = "MKTRATEPCT", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMktratepct() {
        return mktratepct;
    }

    public void setMktratepct(BigDecimal mktratepct) {
        this.mktratepct = mktratepct;
    }

    private BigDecimal paymentamount;

    @Basic
    @javax.persistence.Column(name = "PAYMENTAMOUNT", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getPaymentamount() {
        return paymentamount;
    }

    public void setPaymentamount(BigDecimal paymentamount) {
        this.paymentamount = paymentamount;
    }

    private BigInteger recourseflag;

    @Basic
    @javax.persistence.Column(name = "RECOURSEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getRecourseflag() {
        return recourseflag;
    }

    public void setRecourseflag(BigInteger recourseflag) {
        this.recourseflag = recourseflag;
    }

    private String tenant;

    @Basic
    @javax.persistence.Column(name = "TENANT", nullable = true, insertable = true, updatable = true, length = 30)
    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    private BigInteger valid1Flag;

    @Basic
    @javax.persistence.Column(name = "VALID1FLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getValid1Flag() {
        return valid1Flag;
    }

    public void setValid1Flag(BigInteger valid1Flag) {
        this.valid1Flag = valid1Flag;
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

    private BigInteger confirmedflag;

    @Basic
    @javax.persistence.Column(name = "CONFIRMEDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getConfirmedflag() {
        return confirmedflag;
    }

    public void setConfirmedflag(BigInteger confirmedflag) {
        this.confirmedflag = confirmedflag;
    }

    private BigInteger improvedflag;

    @Basic
    @javax.persistence.Column(name = "IMPROVEDFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getImprovedflag() {
        return improvedflag;
    }

    public void setImprovedflag(BigInteger improvedflag) {
        this.improvedflag = improvedflag;
    }

    private String confirmby;

    @Basic
    @javax.persistence.Column(name = "CONFIRMBY", nullable = true, insertable = true, updatable = true, length = 30)
    public String getConfirmby() {
        return confirmby;
    }

    public void setConfirmby(String confirmby) {
        this.confirmby = confirmby;
    }

    private Timestamp confirmdate;

    @Basic
    @javax.persistence.Column(name = "CONFIRMDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getConfirmdate() {
        return confirmdate;
    }

    public void setConfirmdate(Timestamp confirmdate) {
        this.confirmdate = confirmdate;
    }

    private String comments;

    @Basic
    @javax.persistence.Column(name = "COMMENTS", nullable = true, insertable = true, updatable = true, length = 500)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    private BigInteger nonsaleflag;

    @Basic
    @javax.persistence.Column(name = "NONSALEFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getNonsaleflag() {
        return nonsaleflag;
    }

    public void setNonsaleflag(BigInteger nonsaleflag) {
        this.nonsaleflag = nonsaleflag;
    }

    private BigDecimal saleon0;

    @Basic
    @javax.persistence.Column(name = "SALEON0", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleon0() {
        return saleon0;
    }

    public void setSaleon0(BigDecimal saleon0) {
        this.saleon0 = saleon0;
    }

    private BigDecimal saleon1;

    @Basic
    @javax.persistence.Column(name = "SALEON1", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleon1() {
        return saleon1;
    }

    public void setSaleon1(BigDecimal saleon1) {
        this.saleon1 = saleon1;
    }

    private BigDecimal saleon2;

    @Basic
    @javax.persistence.Column(name = "SALEON2", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSaleon2() {
        return saleon2;
    }

    public void setSaleon2(BigDecimal saleon2) {
        this.saleon2 = saleon2;
    }

    private Timestamp saleod0;

    @Basic
    @javax.persistence.Column(name = "SALEOD0", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleod0() {
        return saleod0;
    }

    public void setSaleod0(Timestamp saleod0) {
        this.saleod0 = saleod0;
    }

    private Timestamp saleod1;

    @Basic
    @javax.persistence.Column(name = "SALEOD1", nullable = true, insertable = true, updatable = true)
    public Timestamp getSaleod1() {
        return saleod1;
    }

    public void setSaleod1(Timestamp saleod1) {
        this.saleod1 = saleod1;
    }

    private String saleom0;

    @Basic
    @javax.persistence.Column(name = "SALEOM0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleom0() {
        return saleom0;
    }

    public void setSaleom0(String saleom0) {
        this.saleom0 = saleom0;
    }

    private String saleom1;

    @Basic
    @javax.persistence.Column(name = "SALEOM1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleom1() {
        return saleom1;
    }

    public void setSaleom1(String saleom1) {
        this.saleom1 = saleom1;
    }

    private String saleot0;

    @Basic
    @javax.persistence.Column(name = "SALEOT0", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleot0() {
        return saleot0;
    }

    public void setSaleot0(String saleot0) {
        this.saleot0 = saleot0;
    }

    private String saleot1;

    @Basic
    @javax.persistence.Column(name = "SALEOT1", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSaleot1() {
        return saleot1;
    }

    public void setSaleot1(String saleot1) {
        this.saleot1 = saleot1;
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

    private Integer balloonpaymentyear;

    @Basic
    @javax.persistence.Column(name = "BALLOONPAYMENTYEAR", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getBalloonpaymentyear() {
        return balloonpaymentyear;
    }

    public void setBalloonpaymentyear(Integer balloonpaymentyear) {
        this.balloonpaymentyear = balloonpaymentyear;
    }

    private BigInteger transferdeclarationflag;

    @Basic
    @javax.persistence.Column(name = "TRANSFERDECLARATIONFLAG", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getTransferdeclarationflag() {
        return transferdeclarationflag;
    }

    public void setTransferdeclarationflag(BigInteger transferdeclarationflag) {
        this.transferdeclarationflag = transferdeclarationflag;
    }

    private Timestamp transferdeclarationdate;

    @Basic
    @javax.persistence.Column(name = "TRANSFERDECLARATIONDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getTransferdeclarationdate() {
        return transferdeclarationdate;
    }

    public void setTransferdeclarationdate(Timestamp transferdeclarationdate) {
        this.transferdeclarationdate = transferdeclarationdate;
    }

    private Timestamp questionnairemaildate;

    @Basic
    @javax.persistence.Column(name = "QUESTIONNAIREMAILDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getQuestionnairemaildate() {
        return questionnairemaildate;
    }

    public void setQuestionnairemaildate(Timestamp questionnairemaildate) {
        this.questionnairemaildate = questionnairemaildate;
    }

    private Timestamp questionnairereturndate;

    @Basic
    @javax.persistence.Column(name = "QUESTIONNAIRERETURNDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getQuestionnairereturndate() {
        return questionnairereturndate;
    }

    public void setQuestionnairereturndate(Timestamp questionnairereturndate) {
        this.questionnairereturndate = questionnairereturndate;
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

    private String documentstatus;

    @Basic
    @javax.persistence.Column(name = "DOCUMENTSTATUS", nullable = true, insertable = true, updatable = true, length = 50)
    public String getDocumentstatus() {
        return documentstatus;
    }

    public void setDocumentstatus(String documentstatus) {
        this.documentstatus = documentstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tblsale tblsale = (Tblsale) o;

        if (seqid != tblsale.seqid) return false;
        if (verend != tblsale.verend) return false;
        if (verstart != tblsale.verstart) return false;
        if (balloonpaymentyear != null ? !balloonpaymentyear.equals(tblsale.balloonpaymentyear) : tblsale.balloonpaymentyear != null)
            return false;
        if (book != null ? !book.equals(tblsale.book) : tblsale.book != null)
            return false;
        if (comments != null ? !comments.equals(tblsale.comments) : tblsale.comments != null)
            return false;
        if (confirmby != null ? !confirmby.equals(tblsale.confirmby) : tblsale.confirmby != null)
            return false;
        if (confirmdate != null ? !confirmdate.equals(tblsale.confirmdate) : tblsale.confirmdate != null)
            return false;
        if (confirmedflag != null ? !confirmedflag.equals(tblsale.confirmedflag) : tblsale.confirmedflag != null)
            return false;
        if (documentdate != null ? !documentdate.equals(tblsale.documentdate) : tblsale.documentdate != null)
            return false;
        if (documentfee != null ? !documentfee.equals(tblsale.documentfee) : tblsale.documentfee != null)
            return false;
        if (documentstatus != null ? !documentstatus.equals(tblsale.documentstatus) : tblsale.documentstatus != null)
            return false;
        if (downpaymentamount != null ? !downpaymentamount.equals(tblsale.downpaymentamount) : tblsale.downpaymentamount != null)
            return false;
        if (downpaymentpct != null ? !downpaymentpct.equals(tblsale.downpaymentpct) : tblsale.downpaymentpct != null)
            return false;
        if (goodwilladjamount != null ? !goodwilladjamount.equals(tblsale.goodwilladjamount) : tblsale.goodwilladjamount != null)
            return false;
        if (grantee != null ? !grantee.equals(tblsale.grantee) : tblsale.grantee != null)
            return false;
        if (grantor != null ? !grantor.equals(tblsale.grantor) : tblsale.grantor != null)
            return false;
        if (improvedflag != null ? !improvedflag.equals(tblsale.improvedflag) : tblsale.improvedflag != null)
            return false;
        if (interestratepct != null ? !interestratepct.equals(tblsale.interestratepct) : tblsale.interestratepct != null)
            return false;
        if (loaninstitution != null ? !loaninstitution.equals(tblsale.loaninstitution) : tblsale.loaninstitution != null)
            return false;
        if (loanterm != null ? !loanterm.equals(tblsale.loanterm) : tblsale.loanterm != null)
            return false;
        if (mktratepct != null ? !mktratepct.equals(tblsale.mktratepct) : tblsale.mktratepct != null)
            return false;
        if (nonsaleflag != null ? !nonsaleflag.equals(tblsale.nonsaleflag) : tblsale.nonsaleflag != null)
            return false;
        if (noteamount != null ? !noteamount.equals(tblsale.noteamount) : tblsale.noteamount != null)
            return false;
        if (otheradjamount != null ? !otheradjamount.equals(tblsale.otheradjamount) : tblsale.otheradjamount != null)
            return false;
        if (page != null ? !page.equals(tblsale.page) : tblsale.page != null)
            return false;
        if (paymentamount != null ? !paymentamount.equals(tblsale.paymentamount) : tblsale.paymentamount != null)
            return false;
        if (penaltydate != null ? !penaltydate.equals(tblsale.penaltydate) : tblsale.penaltydate != null)
            return false;
        if (penaltyflag != null ? !penaltyflag.equals(tblsale.penaltyflag) : tblsale.penaltyflag != null)
            return false;
        if (pointspaid != null ? !pointspaid.equals(tblsale.pointspaid) : tblsale.pointspaid != null)
            return false;
        if (pointspaidby != null ? !pointspaidby.equals(tblsale.pointspaidby) : tblsale.pointspaidby != null)
            return false;
        if (ppadjamount != null ? !ppadjamount.equals(tblsale.ppadjamount) : tblsale.ppadjamount != null)
            return false;
        if (questionnairemaildate != null ? !questionnairemaildate.equals(tblsale.questionnairemaildate) : tblsale.questionnairemaildate != null)
            return false;
        if (questionnairereturndate != null ? !questionnairereturndate.equals(tblsale.questionnairereturndate) : tblsale.questionnairereturndate != null)
            return false;
        if (receptionno != null ? !receptionno.equals(tblsale.receptionno) : tblsale.receptionno != null)
            return false;
        if (recourseflag != null ? !recourseflag.equals(tblsale.recourseflag) : tblsale.recourseflag != null)
            return false;
        if (saledate != null ? !saledate.equals(tblsale.saledate) : tblsale.saledate != null)
            return false;
        if (saleod0 != null ? !saleod0.equals(tblsale.saleod0) : tblsale.saleod0 != null)
            return false;
        if (saleod1 != null ? !saleod1.equals(tblsale.saleod1) : tblsale.saleod1 != null)
            return false;
        if (saleom0 != null ? !saleom0.equals(tblsale.saleom0) : tblsale.saleom0 != null)
            return false;
        if (saleom1 != null ? !saleom1.equals(tblsale.saleom1) : tblsale.saleom1 != null)
            return false;
        if (saleon0 != null ? !saleon0.equals(tblsale.saleon0) : tblsale.saleon0 != null)
            return false;
        if (saleon1 != null ? !saleon1.equals(tblsale.saleon1) : tblsale.saleon1 != null)
            return false;
        if (saleon2 != null ? !saleon2.equals(tblsale.saleon2) : tblsale.saleon2 != null)
            return false;
        if (saleot0 != null ? !saleot0.equals(tblsale.saleot0) : tblsale.saleot0 != null)
            return false;
        if (saleot1 != null ? !saleot1.equals(tblsale.saleot1) : tblsale.saleot1 != null)
            return false;
        if (saleprice != null ? !saleprice.equals(tblsale.saleprice) : tblsale.saleprice != null)
            return false;
        if (tenant != null ? !tenant.equals(tblsale.tenant) : tblsale.tenant != null)
            return false;
        if (timeadj != null ? !timeadj.equals(tblsale.timeadj) : tblsale.timeadj != null)
            return false;
        if (transferdeclarationdate != null ? !transferdeclarationdate.equals(tblsale.transferdeclarationdate) : tblsale.transferdeclarationdate != null)
            return false;
        if (transferdeclarationflag != null ? !transferdeclarationflag.equals(tblsale.transferdeclarationflag) : tblsale.transferdeclarationflag != null)
            return false;
        if (valid1Flag != null ? !valid1Flag.equals(tblsale.valid1Flag) : tblsale.valid1Flag != null)
            return false;
        if (valid2Flag != null ? !valid2Flag.equals(tblsale.valid2Flag) : tblsale.valid2Flag != null)
            return false;
        if (writedate != null ? !writedate.equals(tblsale.writedate) : tblsale.writedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verstart;
        result = 31 * result + verend;
        result = 31 * result + (receptionno != null ? receptionno.hashCode() : 0);
        result = 31 * result + (book != null ? book.hashCode() : 0);
        result = 31 * result + (page != null ? page.hashCode() : 0);
        result = 31 * result + (grantor != null ? grantor.hashCode() : 0);
        result = 31 * result + (grantee != null ? grantee.hashCode() : 0);
        result = 31 * result + (documentdate != null ? documentdate.hashCode() : 0);
        result = 31 * result + (saledate != null ? saledate.hashCode() : 0);
        result = 31 * result + (documentfee != null ? documentfee.hashCode() : 0);
        result = 31 * result + (penaltyflag != null ? penaltyflag.hashCode() : 0);
        result = 31 * result + (penaltydate != null ? penaltydate.hashCode() : 0);
        result = 31 * result + (saleprice != null ? saleprice.hashCode() : 0);
        result = 31 * result + (ppadjamount != null ? ppadjamount.hashCode() : 0);
        result = 31 * result + (goodwilladjamount != null ? goodwilladjamount.hashCode() : 0);
        result = 31 * result + (otheradjamount != null ? otheradjamount.hashCode() : 0);
        result = 31 * result + (timeadj != null ? timeadj.hashCode() : 0);
        result = 31 * result + (downpaymentamount != null ? downpaymentamount.hashCode() : 0);
        result = 31 * result + (downpaymentpct != null ? downpaymentpct.hashCode() : 0);
        result = 31 * result + (noteamount != null ? noteamount.hashCode() : 0);
        result = 31 * result + (interestratepct != null ? interestratepct.hashCode() : 0);
        result = 31 * result + (loanterm != null ? loanterm.hashCode() : 0);
        result = 31 * result + (pointspaid != null ? pointspaid.hashCode() : 0);
        result = 31 * result + (pointspaidby != null ? pointspaidby.hashCode() : 0);
        result = 31 * result + (loaninstitution != null ? loaninstitution.hashCode() : 0);
        result = 31 * result + (mktratepct != null ? mktratepct.hashCode() : 0);
        result = 31 * result + (paymentamount != null ? paymentamount.hashCode() : 0);
        result = 31 * result + (recourseflag != null ? recourseflag.hashCode() : 0);
        result = 31 * result + (tenant != null ? tenant.hashCode() : 0);
        result = 31 * result + (valid1Flag != null ? valid1Flag.hashCode() : 0);
        result = 31 * result + (valid2Flag != null ? valid2Flag.hashCode() : 0);
        result = 31 * result + (confirmedflag != null ? confirmedflag.hashCode() : 0);
        result = 31 * result + (improvedflag != null ? improvedflag.hashCode() : 0);
        result = 31 * result + (confirmby != null ? confirmby.hashCode() : 0);
        result = 31 * result + (confirmdate != null ? confirmdate.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (nonsaleflag != null ? nonsaleflag.hashCode() : 0);
        result = 31 * result + (saleon0 != null ? saleon0.hashCode() : 0);
        result = 31 * result + (saleon1 != null ? saleon1.hashCode() : 0);
        result = 31 * result + (saleon2 != null ? saleon2.hashCode() : 0);
        result = 31 * result + (saleod0 != null ? saleod0.hashCode() : 0);
        result = 31 * result + (saleod1 != null ? saleod1.hashCode() : 0);
        result = 31 * result + (saleom0 != null ? saleom0.hashCode() : 0);
        result = 31 * result + (saleom1 != null ? saleom1.hashCode() : 0);
        result = 31 * result + (saleot0 != null ? saleot0.hashCode() : 0);
        result = 31 * result + (saleot1 != null ? saleot1.hashCode() : 0);
        result = 31 * result + (writedate != null ? writedate.hashCode() : 0);
        result = 31 * result + (balloonpaymentyear != null ? balloonpaymentyear.hashCode() : 0);
        result = 31 * result + (transferdeclarationflag != null ? transferdeclarationflag.hashCode() : 0);
        result = 31 * result + (transferdeclarationdate != null ? transferdeclarationdate.hashCode() : 0);
        result = 31 * result + (questionnairemaildate != null ? questionnairemaildate.hashCode() : 0);
        result = 31 * result + (questionnairereturndate != null ? questionnairereturndate.hashCode() : 0);
        result = 31 * result + seqid;
        result = 31 * result + (documentstatus != null ? documentstatus.hashCode() : 0);
        return result;
    }
}
