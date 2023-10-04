package com.InsuranceApplication.InsuranceAppBE.Controller;

import com.InsuranceApplication.InsuranceAppBE.Config.JwtUtils;
import com.InsuranceApplication.InsuranceAppBE.Entity.JwtRequest;
import com.InsuranceApplication.InsuranceAppBE.Entity.JwtResponse;
import com.InsuranceApplication.InsuranceAppBE.Entity.User;
import com.InsuranceApplication.InsuranceAppBE.Service.Implementation.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.PrincipalMethodArgumentResolver;

import java.security.Principal;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AutenticateController {

    @Autowired
     private AuthenticationManager authenticationManager;
    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    @Autowired
    private JwtUtils jwtUtils;

    //Generate Token
    @PostMapping("/generate-token")
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        try{
            autenticate(jwtRequest.getEmail(),jwtRequest.getPassword());
        }catch (UsernameNotFoundException e){
            e.printStackTrace();
            throw new Exception("User not found");
        }

        UserDetails userDetails=this.userDetailsService.loadUserByUsername(jwtRequest.getEmail());
        String token=this.jwtUtils.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void autenticate(String email,String password) throws Exception {

        try{

        }catch (DisabledException e){
            throw new Exception("USER DISABLED "+e.getMessage());
        } catch (BadCredentialsException e){
            throw new Exception("Invalid Credentials "+e.getMessage());
        }
    }

    //Returns the detail of current user
    @GetMapping("/current-user")
    public User getCurrentUser(Principal principal){
        return ((User) this.userDetailsService.loadUserByUsername(principal.getName()));
    }
}
