package com.company.M2;

public class Task39 {
    public static void main(String[] args) {
        System.out.println("isNameLucky (Exma): "+isNameLucky("Exma"));
        System.out.println("isNameLucky (Igun): "+isNameLucky("Igun"));
    }

    public static boolean isNameLucky(String name){
        return name.contains("a") || name.contains("o");
    }
}
