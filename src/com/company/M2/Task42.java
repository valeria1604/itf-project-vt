package com.company.M2;

public class Task42 {
    public static void main(String[] args) {
        System.out.println("isInvisibleName([no name]): " + isInvisibleName(null));
        System.out.println("isInvisibleName(\"\"): " + isInvisibleName(""));
        System.out.println("isInvisibleName(\"\\n\"): " + isInvisibleName("\n"));
        System.out.println("isInvisibleName(\"\\nMiag \"): " + isInvisibleName("\nMiag"));
    }

    public static boolean isInvisibleName(String name) {
        return name == null || name.length() == 0 || name.equals(" ") || name.equals("\n") || name.equals("\t");
    }
}
