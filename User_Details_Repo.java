package com.InsuranceApplication.InsuranceAppBE.Repo;

import com.InsuranceApplication.InsuranceAppBE.Entity.User;
import com.InsuranceApplication.InsuranceAppBE.Entity.User_Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_Details_Repo extends JpaRepository<User_Details,String> {
    public User_Details findByEmail(String email);
}
