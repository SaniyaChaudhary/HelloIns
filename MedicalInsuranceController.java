package com.InsuranceApplication.InsuranceAppBE.Controller;


import com.InsuranceApplication.InsuranceAppBE.Entity.MedicalInsurance;
import com.InsuranceApplication.InsuranceAppBE.Repo.MedicalInsuranceRepo;
import com.InsuranceApplication.InsuranceAppBE.Service.MedicalInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicalinsurance")
@CrossOrigin("*")
public class MedicalInsuranceController {
    @Autowired
    private MedicalInsuranceService medicalInsuranceService;

    @PostMapping("/")
    public ResponseEntity<MedicalInsurance> addMedicalInsurance(@RequestBody  MedicalInsurance insurance ) throws Exception {
        MedicalInsurance medicalInsurance=this.medicalInsuranceService.CreateMedicalInsurance(insurance);
        return ResponseEntity.ok(medicalInsurance);
    }

    @GetMapping("/{insuranceId}")
    public ResponseEntity<MedicalInsurance> getMedicalInsurance(@PathVariable("insuranceId") String insuranceId){
        return ResponseEntity.ok(this.medicalInsuranceService.getMedicalInsurance(insuranceId));
    }

    @GetMapping("/")
    public List<MedicalInsurance> getallMedicalInsurance(){
        return this.medicalInsuranceService.getallMedicalInsurance();
    }

    @PutMapping("/updateplan")
    public ResponseEntity<MedicalInsurance> updateMedicalInsurance(@RequestBody MedicalInsurance medicalInsurance){
        return ResponseEntity.ok(this.medicalInsuranceService.updateMedicalInsurance(medicalInsurance));
    }

    @DeleteMapping("/{insuranceId}")
    public void deleteMedicalInsurance(@PathVariable("insuranceId") String InsuranceId){
        this.medicalInsuranceService.DeleteMedicalInsurance(InsuranceId);
    }
}
