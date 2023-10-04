package com.InsuranceApplication.InsuranceAppBE.Controller;

import com.InsuranceApplication.InsuranceAppBE.Entity.DentalInsurance;
import com.InsuranceApplication.InsuranceAppBE.Service.DentalInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentalinsurance")
@CrossOrigin("*")
public class DentalInsuranceController {
    @Autowired
    private DentalInsuranceService dentalInsuranceService;

    @PostMapping("/")
    public ResponseEntity<DentalInsurance> addDentalInsurance(@RequestBody DentalInsurance dentalInsurance) throws Exception {
        DentalInsurance insurance=this.dentalInsuranceService.CreateInsurance(dentalInsurance);
        return ResponseEntity.ok(insurance);
    }

    @GetMapping("/{insuranceId}")
    public ResponseEntity<DentalInsurance> getDentalInsurance(@PathVariable("insuranceId") String insuranceId){
        return ResponseEntity.ok(this.dentalInsuranceService.getDentalInsurance(insuranceId));
    }

    @GetMapping("/")
    public ResponseEntity<List> getallDentalInsurance() {
        return ResponseEntity.ok( this.dentalInsuranceService.getallDentalInsurance());
    }

    @DeleteMapping("/{insuranceId}")
    public void deletedentalInsurance(@PathVariable("insuranceId") String insuranceId){
        this.dentalInsuranceService.DeleteDentalInsurance(insuranceId);
    }

    @PostMapping("/update")
    public ResponseEntity<DentalInsurance> updateDentalInsurance(@RequestBody DentalInsurance dentalInsurance){
        return ResponseEntity.ok(this.dentalInsuranceService.updateDentalInsurance(dentalInsurance));
    }
}
