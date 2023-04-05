package com.company.M2;

public class Task42 {
    public static void main(String[] args) {
        System.out.println("isInvisibleName(null): " + isInvisibleName(null));
        System.out.println("isInvisibleName(\"\"): " + isInvisibleName(""));
        System.out.println("isInvisibleName(\"   \"): " + isInvisibleName("   "));
        System.out.println("isInvisibleName(\"\\n\"): " + isInvisibleName("\n"));
        System.out.println("isInvisibleName(\"\\n\\t\"): " + isInvisibleName("\n\t"));
        System.out.println("isInvisibleName(\"\\nMiag \"): " + isInvisibleName("\nMiag"));
    }

    public static boolean isInvisibleName(String name) {
        return name == null || name.isBlank();
    }
}
