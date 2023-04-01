package com.company.M2;

public class Task46 {
    public static void main(String[] args) {
        System.out.println("encode([null]): " + encode(null));
        System.out.println("encode([emty name]): " + encode(""));
        System.out.println("encode(\"Crab\"): " + encode("Crab"));
        System.out.println("decode(\"NOTFORYOUCr5bYESNOTFORYOU\"): " + decode("NOTFORYOUCr5bYESNOTFORYOU"));
        System.out.println("decode(\"NOTFORYOUNOTFORYOUYESNOTFORYOU\"): " + decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
    }

    public static String encode(String name) {
        if (name == null || name.isBlank()) {
            return "";
        }
        char[] chars = new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'e') {
                chars[i] = '1';
            }
            if (name.charAt(i) == 'u') {
                chars[i] = '2';
            }
            if (name.charAt(i) == 'i') {
                chars[i] = '3';
            }
            if (name.charAt(i) == 'o') {
                chars[i] = '4';
            }
            if (name.charAt(i) == 'a') {
                chars[i] = '5';
            } else {
                chars[i] = name.charAt(i);
            }
        }
        return "NOTFORYOU" + String.valueOf(chars) + "YESNOTFORYOU";
    }

    public static String decode(String name) {
        char[] chars = new char[name.length() - 21];
        int poz = 0;
        for (int i = 9; i < name.length() - 12; i++) {
            if (name.charAt(i) == '1') {
                chars[poz] = 'e';
            }
            if (name.charAt(i) == '2') {
                chars[poz] = 'u';
            }
            if (name.charAt(i) == '3') {
                chars[poz] = 'i';
            }
            if (name.charAt(i) == '4') {
                chars[poz] = 'o';
            }
            if (name.charAt(i) == '5') {
                chars[poz] = 'a';
            } else {
                chars[poz] = name.charAt(i);
            }
            poz++;
        }
        return String.valueOf(chars);
    }
}
