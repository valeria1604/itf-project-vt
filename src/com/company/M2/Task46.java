package com.company.M2;

public class Task46 {
    public static final String NOTFORYOU = "NOTFORYOU";
    public static final String YESNOTFORYOU = "YESNOTFORYOU";

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
        name = name.replace('e', '1');
        name = name.replace('u', '2');
        name = name.replace('i', '3');
        name = name.replace('o', '4');
        name = name.replace('a', '5');
        return String.join("", NOTFORYOU, name, YESNOTFORYOU);
    }

    public static String decode(String name) {
        if (name == null || name.isBlank()) {
            return "";
        }
        name = name.replace('1', 'e');
        name = name.replace('2', 'u');
        name = name.replace('3', 'i');
        name = name.replace('4', 'o');
        name = name.replace('5', 'a');
        name = name.replaceFirst(YESNOTFORYOU, "");
        name = name.replaceFirst(NOTFORYOU, "");
        return name;
    }
}
