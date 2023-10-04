package com.InsuranceApplication.InsuranceAppBE.Repo;

import com.InsuranceApplication.InsuranceAppBE.Entity.AcceptedInsurances;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AcceptedInsurancesRepo extends JpaRepository<AcceptedInsurances, String> {
    public AcceptedInsurances findByinsuranceNumber(String insuranceNumber);
    public List<AcceptedInsurances> findAllByEmail(String email);

    public List<AcceptedInsurances> findAllByEmailAndInsuranceType(String email,String insuranceType);
}
