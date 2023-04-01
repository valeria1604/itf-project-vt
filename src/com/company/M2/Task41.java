package com.company.M2;

public class Task41 {
    public static void main(String[] args) {
        System.out.println("isMoneyName(null): " + isMoneyName(null));
        System.out.println("isMoneyName( ): " + isMoneyName(""));
        System.out.println("isMoneyName(7Max9): " + isMoneyName("7Max9"));
        System.out.println("isMoneyName(77Hero): " + isMoneyName("77Hero"));
    }

    public static boolean isMoneyName(String name) {
        if (name == null || name.isBlank()) {
            return false;
        }
        return (isDigit(name.charAt(0)) && isDigit(name.charAt(name.length() - 1)));
    }

    public static boolean isDigit(char letter) {
        return letter >= '0' && letter <= '9';
    }
}
