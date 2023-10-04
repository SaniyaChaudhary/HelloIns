package com.InsuranceApplication.InsuranceAppBE.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="users")
public class User implements UserDetails {
    @Id
    private String email;
    private String password;
    private boolean enabled=true;
    private String role="NORMAL";

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<Userrole> getUsersroles() {
        return usersroles;
    }

    public void setUsersroles(Set<Userrole> usersroles) {
        this.usersroles = usersroles;
    }

    @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "user")
    @JsonIgnore
    private Set<Userrole> usersroles=new HashSet<>();

    public String getProfile() {
        return role;
    }

    public void setProfile(String profile) {
        this.role = profile;
    }

    public User() {
    }

    public User(String email, String password, boolean enabled) {
        this.email = email;
        this.password = password;
        this.enabled = enabled;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       Set<Authority> set=new HashSet<>();
       this.usersroles.forEach(userrole -> {
           set.add(new Authority(userrole.getRole().getRoleName()));
       });
       return set;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
