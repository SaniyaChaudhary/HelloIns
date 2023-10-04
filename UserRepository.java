package com.InsuranceApplication.InsuranceAppBE.Repo;

import com.InsuranceApplication.InsuranceAppBE.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {
    public User findByEmail(String email);
    public List<User> findAllByRole(String role);
    public User findByEmailAndPassword(String email,String password);
    //public Void deleteByEmail(String email);
}
