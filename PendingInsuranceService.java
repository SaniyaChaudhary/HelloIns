package com.InsuranceApplication.InsuranceAppBE.Service;

import com.InsuranceApplication.InsuranceAppBE.Entity.PendingInsurance;
import com.InsuranceApplication.InsuranceAppBE.Repo.PendingInsuranceRepo;

import java.util.List;

public interface PendingInsuranceService {

    //add pendingInsurance
    public PendingInsurance addPendingInsurance(PendingInsurance pendingInsurance) throws Exception;

    //delete pendingInsurance
    public void deletePendingInsurance(String insuranceNumber);

    //get single pending insurance
    public PendingInsurance getPendingInsurance(String insuranceNumber);

    //get all pending Insurance
    public List<PendingInsurance> getAllpendingInsurance();

    //get current user pending Insurances
    public List<PendingInsurance> getUserPendingInsurance(String email);
}
