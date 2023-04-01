package com.company.M2;

public class Task40 {
    public static void main(String[] args) {
        System.out.println("getNameCode(Morat): " + getNameCode(null));
        System.out.println("getNameCode(Morat): " + getNameCode(""));
        System.out.println("getNameCode(x): " + getNameCode("x"));
        System.out.println("getNameCode(Morat): " + getNameCode("Morat"));
    }

    public static String getNameCode(String name) {
        if (name == null || name.isBlank()) {
            return "";
        }
        String firstLetter = String.valueOf(name.charAt(0));
        if (name.length() == 1) {
            return firstLetter.toUpperCase();
        }
        String lastLetter = String.valueOf(name.charAt(name.length() - 1));
        return firstLetter.toUpperCase() + lastLetter.toUpperCase();
    }
}
