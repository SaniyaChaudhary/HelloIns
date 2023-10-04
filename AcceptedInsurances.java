package com.InsuranceApplication.InsuranceAppBE.Entity;

import javax.persistence.*;

@Entity
@Table(name="AcceptedInsurances")
public class AcceptedInsurances {
    @Id
    private String insuranceNumber;
    private String email;
    private String insuranceId;
    private String insuranceName;
    private String insuranceType;
    private String primarySubscriberFirstname;
    private String primarySubscriberMiddlename;
    private String primarySubscriberLastname;
    private Integer primarySubscriberAge;
    private String primarySubscriberAddress;
    private Long primarySubscriberAadharNo;
    private String primarySubscriberPanNo;
    private String primarySubscriberPhone;
    private String primarySubscriberGender;
    private String submittedDate;
    private String expiryDate;
    @Lob
    private String feedback;
    private int premium;

    public AcceptedInsurances(String insuranceNumber, String email, String insuranceId, String insuranceName, String insuranceType, String primarySubscriberFirstname, String primarySubscriberMiddlename, String primarySubscriberLastname, Integer primarySubscriberAge, String primarySubscriberAddress, Long primarySubscriberAadharNo, String primarySubscriberPanNo, String primarySubscriberPhone, String primarySubscriberGender, String submittedDate, String expiryDate, String feedback, int premium) {
        this.insuranceNumber = insuranceNumber;
        this.email = email;
        this.insuranceId = insuranceId;
        this.insuranceName = insuranceName;
        this.insuranceType = insuranceType;
        this.primarySubscriberFirstname = primarySubscriberFirstname;
        this.primarySubscriberMiddlename = primarySubscriberMiddlename;
        this.primarySubscriberLastname = primarySubscriberLastname;
        this.primarySubscriberAge = primarySubscriberAge;
        this.primarySubscriberAddress = primarySubscriberAddress;
        this.primarySubscriberAadharNo = primarySubscriberAadharNo;
        this.primarySubscriberPanNo = primarySubscriberPanNo;
        this.primarySubscriberPhone = primarySubscriberPhone;
        this.primarySubscriberGender = primarySubscriberGender;
        this.submittedDate = submittedDate;
        this.expiryDate = expiryDate;
        this.feedback = feedback;
        this.premium = premium;
    }

    public AcceptedInsurances() {
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public void setPrimarySubscriberAge(Integer primarySubscriberAge) {
        this.primarySubscriberAge = primarySubscriberAge;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getPrimarySubscriberFirstname() {
        return primarySubscriberFirstname;
    }

    public void setPrimarySubscriberFirstname(String primarySubscriberFirstname) {
        this.primarySubscriberFirstname = primarySubscriberFirstname;
    }

    public String getPrimarySubscriberMiddlename() {
        return primarySubscriberMiddlename;
    }

    public void setPrimarySubscriberMiddlename(String primarySubscriberMiddlename) {
        this.primarySubscriberMiddlename = primarySubscriberMiddlename;
    }

    public String getPrimarySubscriberLastname() {
        return primarySubscriberLastname;
    }

    public void setPrimarySubscriberLastname(String primarySubscriberLastname) {
        this.primarySubscriberLastname = primarySubscriberLastname;
    }

    public int getPrimarySubscriberAge() {
        return primarySubscriberAge;
    }

    public void setPrimarySubscriberAge(int primarySubscriberAge) {
        this.primarySubscriberAge = primarySubscriberAge;
    }

    public String getPrimarySubscriberAddress() {
        return primarySubscriberAddress;
    }

    public void setPrimarySubscriberAddress(String primarySubscriberAddress) {
        this.primarySubscriberAddress = primarySubscriberAddress;
    }

    public Long getPrimarySubscriberAadharNo() {
        return primarySubscriberAadharNo;
    }

    public void setPrimarySubscriberAadharNo(Long primarySubscriberAadharNo) {
        this.primarySubscriberAadharNo = primarySubscriberAadharNo;
    }

    public String getPrimarySubscriberPanNo() {
        return primarySubscriberPanNo;
    }

    public void setPrimarySubscriberPanNo(String primarySubscriberPanNo) {
        this.primarySubscriberPanNo = primarySubscriberPanNo;
    }

    public String getPrimarySubscriberPhone() {
        return primarySubscriberPhone;
    }

    public void setPrimarySubscriberPhone(String primarySubscriberPhone) {
        this.primarySubscriberPhone = primarySubscriberPhone;
    }

    public String getPrimarySubscriberGender() {
        return primarySubscriberGender;
    }

    public void setPrimarySubscriberGender(String primarySubscriberGender) {
        this.primarySubscriberGender = primarySubscriberGender;
    }

    public String getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(String submittedDate) {
        this.submittedDate = submittedDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public AcceptedInsurances(String insuranceNumber, String email, String insuranceName, String insuranceType, String primarySubscriberFirstname, String primarySubscriberMiddlename, String primarySubscriberLastname, Integer primarySubscriberAge, String primarySubscriberAddress, Long primarySubscriberAadharNo, String primarySubscriberPanNo, String primarySubscriberPhone, String primarySubscriberGender, String submittedDate, String expiryDate, String feedback, int premium) {
    }
}
