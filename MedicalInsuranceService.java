package com.InsuranceApplication.InsuranceAppBE.Service;

import com.InsuranceApplication.InsuranceAppBE.Entity.MedicalInsurance;

import java.util.List;

public interface MedicalInsuranceService {

    public MedicalInsurance CreateMedicalInsurance(MedicalInsurance medicalInsurance) throws Exception;

    public MedicalInsurance getMedicalInsurance(String InsuranceId);

    public void DeleteMedicalInsurance(String InsuranceId);

    public List<MedicalInsurance> getallMedicalInsurance();

    public MedicalInsurance updateMedicalInsurance(MedicalInsurance medicalInsurance);

}
