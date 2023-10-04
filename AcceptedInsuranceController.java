package com.InsuranceApplication.InsuranceAppBE.Controller;

import com.InsuranceApplication.InsuranceAppBE.Entity.AcceptedInsurances;
import com.InsuranceApplication.InsuranceAppBE.Service.AcceptedInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acceptedinsurances")
@CrossOrigin("*")
public class AcceptedInsuranceController {

    @Autowired
    private AcceptedInsuranceService acceptedInsuranceService;

    @PostMapping("/")
    public ResponseEntity<AcceptedInsurances> addAcceptedInsurances(@RequestBody AcceptedInsurances acceptedInsurances) throws Exception {
        AcceptedInsurances acceptedInsurances1=this.acceptedInsuranceService.addAcceptedInsurances(acceptedInsurances);
        return ResponseEntity.ok(acceptedInsurances1);
    }

    @GetMapping("/{insuranceId}")
    public ResponseEntity<AcceptedInsurances> getSingleAcceptedInsurance(@PathVariable("insuranceId") String insuranceId){
        return ResponseEntity.ok(this.acceptedInsuranceService.getAccepted(insuranceId));
    }

    @GetMapping("/")
    public ResponseEntity<List> getallAcceptedInsurances(){
        return ResponseEntity.ok(this.acceptedInsuranceService.getAllAccepted());
    }

    @DeleteMapping("/{insuranceId}")
    public void updateAcceptedInsurance(@PathVariable("insuranceId") String insuranceId){
        this.acceptedInsuranceService.deleteAccepted(insuranceId);
    }

    @GetMapping("/useracceptedinsurance/{email}")
    public ResponseEntity<List> getUserAcceptedInsurance(@PathVariable("email") String email){
        return ResponseEntity.ok(this.acceptedInsuranceService.getUserAcceptedInsurances(email));
    }

    @RequestMapping(path = "/countdental/{email}/{insuranceType}",method = RequestMethod.GET)
    public int gettypecount(@PathVariable("email") String email, @PathVariable("insuranceType") String insuranceType){
        return this.acceptedInsuranceService.getcountmedical(email,insuranceType);
    }

    @PostMapping("/update")
    public ResponseEntity<AcceptedInsurances> updateexpirydate(@RequestBody AcceptedInsurances acceptedInsurances){
        return ResponseEntity.ok(this.acceptedInsuranceService.updateInsurance(acceptedInsurances));
    }
}
