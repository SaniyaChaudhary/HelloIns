package com.InsuranceApplication.InsuranceAppBE.Service.Implementation;

import com.InsuranceApplication.InsuranceAppBE.Entity.User;
import com.InsuranceApplication.InsuranceAppBE.Entity.Userrole;
import com.InsuranceApplication.InsuranceAppBE.Repo.RoleRepository;
import com.InsuranceApplication.InsuranceAppBE.Repo.UserRepository;
import com.InsuranceApplication.InsuranceAppBE.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class UserImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;


    //Creating user
    @Override
    public User CreateUser(User user, Set<Userrole> userrole) throws Exception {

        User localuser=this.userRepository.findByEmail(user.getEmail());

        if(localuser!=null){
            System.out.println("User with this email-id already exist!");
            throw new Exception();
        }else{
                for(Userrole ur:userrole) {
                    this.roleRepository.save(ur.getRole());
                }

                user.getUsersroles().addAll(userrole);
                localuser=this.userRepository.save(user);
        }
        return localuser;
    }

    //get user by username
    @Override
    public User GetUser(String email) {
        return this.userRepository.findByEmail(email);
    }

    @Override
    public void DeleteUser(String email) {
        this.userRepository.deleteById(email);
    }

    @Override
    public User ChangePassword(User user) throws Exception {
        User user1=this.userRepository.findByEmail(user.getEmail());
        if(user1==null){
            throw new Exception();
        }else{
        user1=this.userRepository.save(user);
        }

        return user1;
    }

    @Override
    public List<User> getAlluser() {
        return this.userRepository.findAll();
    }

    @Override
    public List<User> getAdminUser(String role) {
        return this.userRepository.findAllByRole(role);
    }
}
