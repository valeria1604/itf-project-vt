package com.company.M3;

public class Task08 {
    public static void main(String[] args) {
        String[] names = new String[]{"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
        System.out.println(firstAndLastTogether(names));
    }

    public static String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[names.length - 1] + " TOGETHER";
    }
}
