package com.company.M2;

public class Task44 {
    public static void main(String[] args) {
        System.out.println("1)[null]: " + makeNameClean(null));
        System.out.println("2)[empty name]: " + makeNameClean(""));
        System.out.println("3)bigar: " + makeNameClean("bigar"));
        System.out.println("4)   ytuki: " + makeNameClean("   ytuki"));
    }

    public static String makeNameClean(String name) {
        if (name == null || name.isBlank()) {
            return "";
        }
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
