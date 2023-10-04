package com.InsuranceApplication.InsuranceAppBE.Service;

import com.InsuranceApplication.InsuranceAppBE.Entity.User;
import com.InsuranceApplication.InsuranceAppBE.Entity.User_Details;

public interface User_Details_Service {

    public User_Details CreateUserDeatils(User_Details userDetails);

    public User_Details GetUserDetails(String email);

    public void DeleteUserDetails(String email);
}
