package com.company.M2;

public class Task40 {
    public static void main(String[] args) {
        System.out.println("getNameCode(Morat): " + getNameCode("Morat"));
        System.out.println("getNameCode(x): " + getNameCode("x"));
    }

    public static String getNameCode(String name) {
        String firstLetter = String.valueOf(name.charAt(0));
        String lastLetter;
        if (name.length() > 1) {
            lastLetter = String.valueOf(name.charAt(name.length() - 1));
            return firstLetter + lastLetter.toUpperCase();
        }
        return firstLetter.toUpperCase();
    }
}
