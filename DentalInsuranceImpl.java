package com.InsuranceApplication.InsuranceAppBE.Service.Implementation;

import com.InsuranceApplication.InsuranceAppBE.Entity.DentalInsurance;
import com.InsuranceApplication.InsuranceAppBE.Repo.DentalInsuranceRepo;
import com.InsuranceApplication.InsuranceAppBE.Service.DentalInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentalInsuranceImpl implements DentalInsuranceService {
    @Autowired
    private DentalInsuranceRepo dentalInsuranceRepo;

    @Override
    public DentalInsurance CreateInsurance(DentalInsurance dentalInsurance) throws Exception {
        DentalInsurance dental=this.dentalInsuranceRepo.findByinsuranceId(dentalInsurance.getInsuranceId());
        if(dental!=null){
            System.out.println("Dental Insurance already exists.");
                    throw new Exception();
        }else{
            dental=this.dentalInsuranceRepo.save(dentalInsurance);
        }
        return dental;
    }

    @Override
    public DentalInsurance getDentalInsurance(String InsuranceId) {
        return this.dentalInsuranceRepo.findByinsuranceId(InsuranceId);
    }

    @Override
    public void DeleteDentalInsurance(String InsuranceId) {
        this.dentalInsuranceRepo.deleteById(InsuranceId);
    }

    @Override
    public List<DentalInsurance> getallDentalInsurance() {
        return this.dentalInsuranceRepo.findAll();
    }

    @Override
    public DentalInsurance updateDentalInsurance(DentalInsurance dentalInsurance) {
        return this.dentalInsuranceRepo.save(dentalInsurance);
    }
}
