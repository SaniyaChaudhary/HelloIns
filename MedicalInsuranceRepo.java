package com.InsuranceApplication.InsuranceAppBE.Repo;

import com.InsuranceApplication.InsuranceAppBE.Entity.MedicalInsurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalInsuranceRepo extends JpaRepository<MedicalInsurance,String> {
    public MedicalInsurance findByinsuranceId(String InsuranceId);
}
