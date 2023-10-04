package com.InsuranceApplication.InsuranceAppBE.Service;

import com.InsuranceApplication.InsuranceAppBE.Entity.AcceptedInsurances;

import java.util.List;

public interface AcceptedInsuranceService {
    //get a single Accepted Insurance
    public AcceptedInsurances getAccepted(String InsuranceId);

    //get all the accepted Insurances
    public List<AcceptedInsurances> getAllAccepted();

    //delete Accepted Insurances
    public void deleteAccepted(String InsuranceId);

    //add new Insurance
    public AcceptedInsurances addAcceptedInsurances(AcceptedInsurances acceptedInsurances) throws Exception;

    //get current users accepted insurances
    public List<AcceptedInsurances> getUserAcceptedInsurances(String email);

    //get count of medical insurances
    public int getcountmedical(String email,String insuranceType);

    //update insurance
    public AcceptedInsurances updateInsurance(AcceptedInsurances acceptedInsurances);
}
