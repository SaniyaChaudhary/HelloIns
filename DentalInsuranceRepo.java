package com.InsuranceApplication.InsuranceAppBE.Repo;

import com.InsuranceApplication.InsuranceAppBE.Entity.DentalInsurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentalInsuranceRepo extends JpaRepository<DentalInsurance, String> {

    public DentalInsurance findByinsuranceId(String insuranceId);
}
