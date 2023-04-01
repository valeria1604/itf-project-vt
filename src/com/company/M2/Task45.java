package com.company.M2;

public class Task45 {
    public static void main(String[] args) {
        System.out.println("Magicoraxi: " + makeHalfOfName("Magicoraxi"));
        System.out.println("Javametro: " + makeHalfOfName("Javametro"));
    }

    public static String makeHalfOfName(String name) {
        int size;
        if (name.length() % 2 == 0) {
            size = name.length() / 2;
        } else {
            size = (name.length() - 1) / 2;
        }
        char[] chars = new char[size];
        int poz = 0;
        for (int i = 0; i < size; i++) {
            chars[poz] = name.charAt(i);
            poz++;
        }
        return String.valueOf(chars);
    }
}
