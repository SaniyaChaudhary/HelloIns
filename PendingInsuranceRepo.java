package com.InsuranceApplication.InsuranceAppBE.Repo;

import com.InsuranceApplication.InsuranceAppBE.Entity.PendingInsurance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PendingInsuranceRepo extends JpaRepository<PendingInsurance,String> {
    public PendingInsurance findByinsuranceNumber(String insuranceNumber);
    public List<PendingInsurance> findAllByEmail(String email);
}
