package com.learning.services;

public class OTPService {

    public int generateOtp() {
        return (int)(Math.random()*9000)+1000;
    }
}
