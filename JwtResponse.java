package com.InsuranceApplication.InsuranceAppBE.Entity;

public class JwtResponse {
    private String token;

    public JwtResponse() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public JwtResponse(String token) {
        this.token = token;
    }
}