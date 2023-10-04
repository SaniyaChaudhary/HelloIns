package com.InsuranceApplication.InsuranceAppBE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableScheduling
public class InsuranceAppBeApplication implements CommandLineRunner {


    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(InsuranceAppBeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Starting the application");

		/*User user=new User();
		user.setEmail("pavangowda3113@gmail.com");
		user.setPassword(this.bCryptPasswordEncoder.encode("pavan3113"));
		user.setRole("ADMIN");
		user.setEnabled(true);

		Role role1=new Role();
		role1.setRoleId(44L);
		role1.setRoleName("ADMIN");

		Set<Userrole> userroleSet=new HashSet<>();
		Userrole userrole=new Userrole();
		userrole.setRole(role1);
		userrole.setUser(user);
		userroleSet.add(userrole);

		User user1=this.userService.CreateUser(user,userroleSet);*/

    }
}
