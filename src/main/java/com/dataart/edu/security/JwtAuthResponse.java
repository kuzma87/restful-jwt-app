package com.dataart.edu.security;

/**
 * Created by akuzmenko on 3/2/2017.
 */

//todo: immutable
public class JwtAuthResponse {
    private String token;
    //todo: add all necessary additional fields


    public JwtAuthResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
