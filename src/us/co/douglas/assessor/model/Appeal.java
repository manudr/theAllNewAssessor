package us.co.douglas.assessor.model;

import java.io.Serializable;

/**
 * Created by mdronamr on 12/23/15.
 */
public class Appeal implements Serializable {

    private String taxYear;
    private String appealNo;
    private String appealType;
    private String appealMethod;
    private String assignedTo;
    private String initiatedBy;
    private String agentCode;
    private String mailTo;
    private String decisionBy;
    private String caseNo;
    private String reReviewStatus;
    private String reReviewInitials;
    private String reReviewDecision;
    private String appealReason;
    private String appealBasis;
    private String appealRecommendation;
    private String appealDecisionReason;
    private String appealEndValue;
    private String appealDate;
    private String appealDateReceived;
    private String appealBeginningValue;
    private String appraisalType;
    private String primaryAccount;
    private String jurisdictionId;
    private String appealStatus;
    private String appealReasonDescription;
    private String boardNo;
    private String appealDecision;
    private String seqId;

    public String getTaxYear() {
        return taxYear;
    }

    public void setTaxYear(String taxYear) {
        this.taxYear = taxYear;
    }

    public String getAppealNo() {
        return appealNo;
    }

    public void setAppealNo(String appealNo) {
        this.appealNo = appealNo;
    }

    public String getAppealType() {
        return appealType;
    }

    public void setAppealType(String appealType) {
        this.appealType = appealType;
    }

    public String getAppealMethod() {
        return appealMethod;
    }

    public void setAppealMethod(String appealMethod) {
        this.appealMethod = appealMethod;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getInitiatedBy() {
        return initiatedBy;
    }

    public void setInitiatedBy(String initiatedBy) {
        this.initiatedBy = initiatedBy;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    public String getDecisionBy() {
        return decisionBy;
    }

    public void setDecisionBy(String decisionBy) {
        this.decisionBy = decisionBy;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getReReviewStatus() {
        return reReviewStatus;
    }

    public void setReReviewStatus(String reReviewStatus) {
        this.reReviewStatus = reReviewStatus;
    }

    public String getReReviewInitials() {
        return reReviewInitials;
    }

    public void setReReviewInitials(String reReviewInitials) {
        this.reReviewInitials = reReviewInitials;
    }

    public String getReReviewDecision() {
        return reReviewDecision;
    }

    public void setReReviewDecision(String reReviewDecision) {
        this.reReviewDecision = reReviewDecision;
    }

    public String getAppealReason() {
        return appealReason;
    }

    public void setAppealReason(String appealReason) {
        this.appealReason = appealReason;
    }

    public String getAppealBasis() {
        return appealBasis;
    }

    public void setAppealBasis(String appealBasis) {
        this.appealBasis = appealBasis;
    }

    public String getAppealRecommendation() {
        return appealRecommendation;
    }

    public void setAppealRecommendation(String appealRecommendation) {
        this.appealRecommendation = appealRecommendation;
    }

    public String getAppealDecisionReason() {
        return appealDecisionReason;
    }

    public void setAppealDecisionReason(String appealDecisionReason) {
        this.appealDecisionReason = appealDecisionReason;
    }

    public String getAppealEndValue() {
        return appealEndValue;
    }

    public void setAppealEndValue(String appealEndValue) {
        this.appealEndValue = appealEndValue;
    }

    public String getAppealDate() {
        return appealDate;
    }

    public void setAppealDate(String appealDate) {
        this.appealDate = appealDate;
    }

    public String getAppealDateReceived() {
        return appealDateReceived;
    }

    public void setAppealDateReceived(String appealDateReceived) {
        this.appealDateReceived = appealDateReceived;
    }

    public String getAppealBeginningValue() {
        return appealBeginningValue;
    }

    public void setAppealBeginningValue(String appealBeginningValue) {
        this.appealBeginningValue = appealBeginningValue;
    }

    public String getAppraisalType() {
        return appraisalType;
    }

    public void setAppraisalType(String appraisalType) {
        this.appraisalType = appraisalType;
    }

    public String getPrimaryAccount() {
        return primaryAccount;
    }

    public void setPrimaryAccount(String primaryAccount) {
        this.primaryAccount = primaryAccount;
    }

    public String getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(String jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    public String getAppealStatus() {
        return appealStatus;
    }

    public void setAppealStatus(String appealStatus) {
        this.appealStatus = appealStatus;
    }

    public String getAppealReasonDescription() {
        return appealReasonDescription;
    }

    public void setAppealReasonDescription(String appealReasonDescription) {
        this.appealReasonDescription = appealReasonDescription;
    }

    public String getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(String boardNo) {
        this.boardNo = boardNo;
    }

    public String getAppealDecision() {
        return appealDecision;
    }

    public void setAppealDecision(String appealDecision) {
        this.appealDecision = appealDecision;
    }

    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    @Override
    public String toString() {
        return "Appeal{" +
                "taxYear='" + taxYear + '\'' +
                ", appealNo='" + appealNo + '\'' +
                ", appealType='" + appealType + '\'' +
                ", appealMethod='" + appealMethod + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", initiatedBy='" + initiatedBy + '\'' +
                ", agentCode='" + agentCode + '\'' +
                ", mailTo='" + mailTo + '\'' +
                ", decisionBy='" + decisionBy + '\'' +
                ", caseNo='" + caseNo + '\'' +
                ", reReviewStatus='" + reReviewStatus + '\'' +
                ", reReviewInitials='" + reReviewInitials + '\'' +
                ", reReviewDecision='" + reReviewDecision + '\'' +
                ", appealReason='" + appealReason + '\'' +
                ", appealBasis='" + appealBasis + '\'' +
                ", appealRecommendation='" + appealRecommendation + '\'' +
                ", appealDecisionReason='" + appealDecisionReason + '\'' +
                ", appealEndValue='" + appealEndValue + '\'' +
                ", appealDate='" + appealDate + '\'' +
                ", appealDateReceived='" + appealDateReceived + '\'' +
                ", appealBeginningValue='" + appealBeginningValue + '\'' +
                ", appraisalType='" + appraisalType + '\'' +
                ", primaryAccount='" + primaryAccount + '\'' +
                ", jurisdictionId='" + jurisdictionId + '\'' +
                ", appealStatus='" + appealStatus + '\'' +
                ", appealReasonDescription='" + appealReasonDescription + '\'' +
                ", boardNo='" + boardNo + '\'' +
                ", appealDecision='" + appealDecision + '\'' +
                ", seqId='" + seqId + '\'' +
                '}';
    }
}
