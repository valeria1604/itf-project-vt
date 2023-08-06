package com.company.M2;

public class Task45 {
    public static void main(String[] args) {
        System.out.println("[null]: " + makeHalfOfName(null));
        System.out.println("[empty name]: " + makeHalfOfName(""));
        System.out.println("Magicoraxi: " + makeHalfOfName("Magicoraxi"));
        System.out.println("Javametro: " + makeHalfOfName("Javametro"));
    }

    public static String makeHalfOfName(String name) {
        if (name == null || name.isBlank()) {
            return "";
        }
        int startIndex = 0;
        int lastIndex = name.length() / 2;
        name = name.substring(startIndex, lastIndex);
        return name;
    }
}
