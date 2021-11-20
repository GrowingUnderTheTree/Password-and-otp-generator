package com.otppw;

import java.util.Random;

public class otp {
    public static void main(String args[]) {
        String numbers = "0123456789";
        StringBuilder Gen = new StringBuilder();
        Random rnd = new Random();
        while (Gen.length() < 4) {
            int otp = (int) (rnd.nextFloat() * numbers.length());
            Gen.append(numbers.charAt(otp));
        }
        String otpstr = Gen.toString();
        System.out.println("the otp generated is " + otpstr);
    }
}
