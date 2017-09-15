package com.dataart.edu.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by akuzmenko on 3/2/2017.
 */
public class PasswordEncoder {

    public static void main(String[] args) {

            String password = "ozkLJt20gj";
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String hashedPassword = passwordEncoder.encode(password);

            System.out.println(hashedPassword);

    }
}
