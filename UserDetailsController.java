package com.InsuranceApplication.InsuranceAppBE.Controller;


import com.InsuranceApplication.InsuranceAppBE.Entity.User_Details;
import com.InsuranceApplication.InsuranceAppBE.Service.User_Details_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userdetails")
@CrossOrigin("*")
public class UserDetailsController {

    @Autowired
    private User_Details_Service userDetailsService;

    @PostMapping("/")
    public ResponseEntity<?> addUserDetails(@RequestBody User_Details userDetails) {
        User_Details userDetails1=this.userDetailsService.CreateUserDeatils(userDetails);
        return ResponseEntity.ok(userDetails1);
    }

    @GetMapping("/{email}")
    public User_Details getUserDetail(@PathVariable("email") String email){
        return this.userDetailsService.GetUserDetails(email);
    }
}
