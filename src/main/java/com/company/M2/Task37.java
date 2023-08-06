package com.company.M2;

public class Task37 {
    public static void main(String[] args) {
        System.out.println("areNamesEqual(Exor, Exor): " + areNamesEqual("Exor", "Exor"));
        System.out.println("areNamesEqual(gork, Maxon): " + areNamesEqual("gork", "Maxon"));
    }

    public static boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }
}
