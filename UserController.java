package com.InsuranceApplication.InsuranceAppBE.Controller;


import com.InsuranceApplication.InsuranceAppBE.Entity.Role;
import com.InsuranceApplication.InsuranceAppBE.Entity.User;
import com.InsuranceApplication.InsuranceAppBE.Entity.Userrole;
import com.InsuranceApplication.InsuranceAppBE.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    private String E_password=null;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    //creating user
    @PostMapping("/")
    public User CreateUser(@RequestBody User user) throws Exception {
            user.setRole("NORMAL");
            user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
            System.out.println(user.getPassword());
            Set<Userrole> roles=new HashSet<>();
            Role role=new Role();
            role.setRoleId(45L);
            role.setRoleName("NORMAL");
            Userrole userrole=new Userrole();
            userrole.setUser(user);
            userrole.setRole(role);
            roles.add(userrole);
            return this.userService.CreateUser(user,roles);
    }
    @GetMapping("/{email}")
    public User getUser(@PathVariable("email") String email){
        return this.userService.GetUser(email);
    }


    //Delete User by Email
    @DeleteMapping("/{email}")
    public void deleteUser(@PathVariable("email") String email){
        this.userService.DeleteUser(email);
    }

    @PostMapping("/changepassword")
    public User changePassword(@RequestBody User user) throws Exception {
        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
        return this.userService.ChangePassword(user);
    }

    @PostMapping("/addadmin")
    public User Addadmin(@RequestBody User user) throws Exception {
        user.setRole("ADMIN");
        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Userrole> userroles=new HashSet<>();
        Role role=new Role();
        role.setRoleId(44L);
        role.setRoleName("ADMIN");
        Userrole userrole=new Userrole();
        userrole.setUser(user);
        userrole.setRole(role);
        userroles.add(userrole);
        return this.userService.CreateUser(user,userroles);
    }

    @GetMapping("/getadmin")
    public ResponseEntity<List> getAllUsers(){
        return ResponseEntity.ok(this.userService.getAdminUser("ADMIN"));
    }

    @GetMapping("/encode/{email}/{password}")
    public Map getencodedpassword(@PathVariable("email")  String email,@PathVariable("password") String password){
        User user=this.userService.GetUser(email);
        boolean matches=this.bCryptPasswordEncoder.matches(password,user.getPassword());
        return Collections.singletonMap("status",matches);
    }
}
