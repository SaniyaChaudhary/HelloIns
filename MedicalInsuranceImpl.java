package com.InsuranceApplication.InsuranceAppBE.Service.Implementation;

import com.InsuranceApplication.InsuranceAppBE.Entity.MedicalInsurance;
import com.InsuranceApplication.InsuranceAppBE.Repo.MedicalInsuranceRepo;
import com.InsuranceApplication.InsuranceAppBE.Service.MedicalInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalInsuranceImpl implements MedicalInsuranceService {

    @Autowired
    private MedicalInsuranceRepo medicalInsuranceRepo;

    @Override
    public MedicalInsurance CreateMedicalInsurance(MedicalInsurance medicalInsurance) throws Exception {
        MedicalInsurance medical=this.medicalInsuranceRepo.findByinsuranceId(medicalInsurance.getInsuranceId());
        if(medical!=null){
            System.out.println("Medical Insurance Already Exists");
            throw new Exception();
        }else{
            medical=this.medicalInsuranceRepo.save(medicalInsurance);
        }
        return medical;
    }

    @Override
    public MedicalInsurance getMedicalInsurance(String InsuranceId) {
        return this.medicalInsuranceRepo.findByinsuranceId(InsuranceId);
    }

    @Override
    public void DeleteMedicalInsurance(String InsuranceId) {
        this.medicalInsuranceRepo.deleteById(InsuranceId);
    }

    @Override
    public List<MedicalInsurance> getallMedicalInsurance() {
        return medicalInsuranceRepo.findAll();
    }

    @Override
    public MedicalInsurance updateMedicalInsurance(MedicalInsurance medicalInsurance) {
        return this.medicalInsuranceRepo.save(medicalInsurance);
    }
}
