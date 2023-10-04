package com.InsuranceApplication.InsuranceAppBE.Service.Implementation;

import com.InsuranceApplication.InsuranceAppBE.Entity.User_Details;
import com.InsuranceApplication.InsuranceAppBE.Repo.User_Details_Repo;
import com.InsuranceApplication.InsuranceAppBE.Service.User_Details_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User_DetailsImpl implements User_Details_Service {

    @Autowired
    private User_Details_Repo user_details_repo;

    @Override
    public User_Details CreateUserDeatils(User_Details userDetails) {
        User_Details userDetails1=this.user_details_repo.findByEmail(userDetails.getEmail());

            userDetails1=this.user_details_repo.save(userDetails);
        return userDetails1;
    }

    @Override
    public User_Details GetUserDetails(String email) {

        return this.user_details_repo.findByEmail(email);
    }

    @Override
    public void DeleteUserDetails(String email) {
        this.user_details_repo.deleteById(email);
    }
}
