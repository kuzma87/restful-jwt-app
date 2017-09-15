package com.dataart.edu.security;

/**
 * Created by akuzmenko on 3/2/2017.
 */
public class JwtAuthRequest {
    private String username;
    private String password;

    public JwtAuthRequest() {

    }

    public JwtAuthRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
