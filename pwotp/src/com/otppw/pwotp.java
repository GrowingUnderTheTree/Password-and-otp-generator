package com.otppw;

import java.util.Random;

public class pwotp {
        public static void main(String args[]) {
        String THESTRING = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder Cool = new StringBuilder();
        Random rnd = new Random();
        while(Cool.length() < 12) {
            int guess = (int) (rnd.nextFloat() * THESTRING.length());
            Cool.append(THESTRING.charAt(guess));
        }
        String Stringstr = Cool.toString();
        System.out.println("the password generated is " + Stringstr);
    }
}