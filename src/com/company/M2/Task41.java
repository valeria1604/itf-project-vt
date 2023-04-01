package com.company.M2;

public class Task41 {
    public static void main(String[] args) {
        System.out.println("isMoneyName(7Max9): " + isMoneyName("7Max9"));
        System.out.println("isMoneyName(77Hero): " + isMoneyName("77Hero"));
    }

    public static boolean isMoneyName(String name) {
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);
        return (isDigit(firstLetter) && isDigit(lastLetter));
    }

    public static boolean isDigit(char letter) {
        return letter >= '0' && letter <= '9';
    }
}
