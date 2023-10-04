package com.InsuranceApplication.InsuranceAppBE.Service.Implementation;

import com.InsuranceApplication.InsuranceAppBE.Entity.AcceptedInsurances;
import com.InsuranceApplication.InsuranceAppBE.Repo.AcceptedInsurancesRepo;
import com.InsuranceApplication.InsuranceAppBE.Service.AcceptedInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AcceptedInsuranceImpl implements AcceptedInsuranceService {
    @Autowired
    private AcceptedInsurancesRepo acceptedInsurancesRepo;

    @Override
    public AcceptedInsurances getAccepted(String InsuranceId) {
        return this.acceptedInsurancesRepo.findByinsuranceNumber(InsuranceId);
    }

    @Override
    public List<AcceptedInsurances> getAllAccepted() {
        return this.acceptedInsurancesRepo.findAll();
    }

    @Override
    public void deleteAccepted(String InsuranceId) {
        this.acceptedInsurancesRepo.deleteById(InsuranceId);
    }

    @Override
    public AcceptedInsurances addAcceptedInsurances(AcceptedInsurances acceptedInsurances) throws Exception {
        AcceptedInsurances acceptedInsurances1=this.acceptedInsurancesRepo.findByinsuranceNumber(acceptedInsurances.getInsuranceNumber());
        if(acceptedInsurances1!=null){
            System.out.println("Accepted Insurance Already Present");
            throw new Exception();
        }else{
            acceptedInsurances1=this.acceptedInsurancesRepo.save(acceptedInsurances);
        }
        return acceptedInsurances1;
    }

    @Override
    public List<AcceptedInsurances> getUserAcceptedInsurances(String email) {
        return this.acceptedInsurancesRepo.findAllByEmail(email);
    }

    @Override
    public int getcountmedical(String email, String insuranceType) {
        return (this.acceptedInsurancesRepo.findAllByEmailAndInsuranceType(email,insuranceType)).toArray().length;
    }

    @Override
    public AcceptedInsurances updateInsurance(AcceptedInsurances acceptedInsurances) {
        return this.acceptedInsurancesRepo.save(acceptedInsurances);
    }
}
