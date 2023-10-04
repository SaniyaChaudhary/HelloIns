package com.InsuranceApplication.InsuranceAppBE.Service;

import com.InsuranceApplication.InsuranceAppBE.Entity.User;
import com.InsuranceApplication.InsuranceAppBE.Entity.Userrole;

import java.util.List;
import java.util.Set;

public interface UserService {
    //creating user
    public User CreateUser(User user, Set<Userrole> userrole) throws Exception;

    public User GetUser(String email);
    public void DeleteUser(String email);

    public User ChangePassword(User user) throws Exception;

    public List<User> getAlluser();

    public List<User> getAdminUser(String role);
}

