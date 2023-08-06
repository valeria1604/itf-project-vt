package com.company.M2;

public class Task46 {
    private static final String NOT_FOR_YOU = "NOTFORYOU";
    private static final String YES_NOT_FOR_YOU = "YESNOTFORYOU";

    public static void main(String[] args) {
        Task46 task = new Task46();
        System.out.println("encode([null]): " + task.encode(null));
        System.out.println("encode([emty name]): " + task.encode(""));
        System.out.println("encode(\"Crab\"): " + task.encode("Crab"));
        System.out.println("decode(\"NOTFORYOUCr5bYESNOTFORYOU\"): " + task.decode("NOTFORYOUCr5bYESNOTFORYOU"));
        System.out.println("decode(\"NOTFORYOUNOTFORYOUYESNOTFORYOU\"): " + task.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
    }

    public String encode(String name) {
        if (name == null || name.isBlank()) {
            return "";
        }
        name = name.replace('e', '1');
        name = name.replace('u', '2');
        name = name.replace('i', '3');
        name = name.replace('o', '4');
        name = name.replace('a', '5');
        return String.join("", NOT_FOR_YOU, name, YES_NOT_FOR_YOU);
    }

    public String decode(String name) {
        if (name == null || name.isBlank()) {
            return "";
        }
        name = name.replace('1', 'e');
        name = name.replace('2', 'u');
        name = name.replace('3', 'i');
        name = name.replace('4', 'o');
        name = name.replace('5', 'a');
        name = name.replaceFirst(YES_NOT_FOR_YOU, "");
        name = name.replaceFirst(NOT_FOR_YOU, "");
        return name;
    }
}
