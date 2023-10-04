package com.InsuranceApplication.InsuranceAppBE.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "DentalInsurance")
public class DentalInsurance {
    public DentalInsurance() {
    }

    @Id
    private String insuranceId;
    private String insuranceType;
    private String insuranceName;
    @Lob
    private String insuranceDescription;
    private String premium;
    private String coverage;

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsuranceDescription() {
        return insuranceDescription;
    }

    public void setInsuranceDescription(String insuranceDescription) {
        this.insuranceDescription = insuranceDescription;
    }

    public String getPremium() {
        return premium;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public DentalInsurance(String insuranceId, String insuranceType, String insuranceName, String insuranceDescription, String premium,String coverage) {
        this.insuranceId = insuranceId;
        this.insuranceType = insuranceType;
        this.insuranceName = insuranceName;
        this.insuranceDescription = insuranceDescription;
        this.premium = premium;
        this.coverage=coverage;
    }
}
