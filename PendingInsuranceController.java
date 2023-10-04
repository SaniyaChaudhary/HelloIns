package com.InsuranceApplication.InsuranceAppBE.Controller;

import com.InsuranceApplication.InsuranceAppBE.Entity.PendingInsurance;
import com.InsuranceApplication.InsuranceAppBE.Service.PendingInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pendinginsurance")
@CrossOrigin("*")
public class PendingInsuranceController {

    @Autowired
    private PendingInsuranceService service;

    @PostMapping("/")
    public ResponseEntity<PendingInsurance> addPendingInsurance(@RequestBody PendingInsurance pendingInsurance) throws Exception {
        UUID insuranceNumber=UUID.randomUUID();
        System.out.println("The value of insuranceNumber is"+String.valueOf(insuranceNumber));
        pendingInsurance.setInsuranceNumber(String.valueOf(insuranceNumber));
        PendingInsurance insurance=this.service.addPendingInsurance(pendingInsurance);
        return ResponseEntity.ok(insurance);
    }

    @PostMapping("/update")
    public ResponseEntity<PendingInsurance> updatePendingInsurance(@RequestBody PendingInsurance pendingInsurance) throws Exception {
        PendingInsurance insurance=this.service.addPendingInsurance(pendingInsurance);
        return ResponseEntity.ok(insurance);
    }


    @GetMapping("/getcount")
    public int getPendingInsuranceCount(){
        List<PendingInsurance> pendingInsurances=this.service.getAllpendingInsurance();
        return pendingInsurances.toArray().length;
    }

    @GetMapping("/getuserpendinginsurancecount/{email}")
    public int getUserPendingInsuranceCount(@PathVariable("email") String email){
        List<PendingInsurance> list=this.service.getUserPendingInsurance(email);
        return list.toArray().length;
    }

    @GetMapping("/{insuranceNumber}")
    public ResponseEntity<PendingInsurance> getPendingInsurance(@PathVariable("insuranceNumber") String insuranceNumber){
        return ResponseEntity.ok(this.service.getPendingInsurance(insuranceNumber));
    }

    @GetMapping("/getuserpendinginsurance/{email}")
    public ResponseEntity<List> getUserPendingInsurance(@PathVariable("email") String email){
        return ResponseEntity.ok(this.service.getUserPendingInsurance(email));
    }

    @GetMapping("/")
    public ResponseEntity<List> getAllPendingInsurance(){
        return ResponseEntity.ok(this.service.getAllpendingInsurance());
    }

    @DeleteMapping("/{insuranceNumber}")
    public void deletePendingInsurance(@PathVariable("insuranceNumber") String insuranceNumber){
        this.service.deletePendingInsurance(insuranceNumber);
    }
}
