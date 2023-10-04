package com.InsuranceApplication.InsuranceAppBE.Service.Implementation;

import com.InsuranceApplication.InsuranceAppBE.Entity.PendingInsurance;
import com.InsuranceApplication.InsuranceAppBE.Repo.PendingInsuranceRepo;
import com.InsuranceApplication.InsuranceAppBE.Service.PendingInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PendingInsuranceImpl implements PendingInsuranceService {

    @Autowired
   private PendingInsuranceRepo pendingInsuranceRepo;

    @Override
    public PendingInsurance addPendingInsurance(PendingInsurance pendingInsurance) throws Exception {
        PendingInsurance insurance;
            insurance=this.pendingInsuranceRepo.save(pendingInsurance);
        return insurance;
    }

    @Override
    public void deletePendingInsurance(String insuranceNumber) {
        this.pendingInsuranceRepo.deleteById(insuranceNumber);
    }

    @Override
    public PendingInsurance getPendingInsurance(String insuranceNumber) {
        return this.pendingInsuranceRepo.findByinsuranceNumber(insuranceNumber);
    }

    @Override
    public List<PendingInsurance> getAllpendingInsurance() {
        return this.pendingInsuranceRepo.findAll();
    }

    @Override
    public List<PendingInsurance> getUserPendingInsurance(String email) {
        return this.pendingInsuranceRepo.findAllByEmail(email);
    }
}
