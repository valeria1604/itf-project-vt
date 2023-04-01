package com.company.M2;

public class Task44 {
    public static void main(String[] args) {
        System.out.println("1)bigar: " + makeNameClean("bigar"));
        System.out.println("2)   ytuki: " + makeNameClean("   ytuki"));
    }

    public static String makeNameClean(String name) {
        int amount = 0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))) {
                amount++;
            }
        }
        char[] chars = new char[amount];
        int poz = 0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))) {
                chars[poz] = name.charAt(i);
                poz++;
            }
        }
        return "CLEAN" + String.valueOf(chars) + "CLEAN";
    }
}
