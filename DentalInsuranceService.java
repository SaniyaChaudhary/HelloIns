package com.InsuranceApplication.InsuranceAppBE.Service;

import com.InsuranceApplication.InsuranceAppBE.Entity.DentalInsurance;

import java.util.List;

public interface DentalInsuranceService {

    public DentalInsurance CreateInsurance(DentalInsurance dentalInsurance) throws Exception;

    public DentalInsurance getDentalInsurance(String InsuranceId);

    public void DeleteDentalInsurance(String InsuranceId);

    public List<DentalInsurance> getallDentalInsurance();

    public DentalInsurance updateDentalInsurance(DentalInsurance dentalInsurance);
}
