package com.example.casemodune4.model.service.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Password {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder =new BCryptPasswordEncoder();
        System.out.printf(bCryptPasswordEncoder.encode("123"));
    }
}
