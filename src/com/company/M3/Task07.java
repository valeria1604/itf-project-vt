package com.company.M3;

import java.util.Arrays;

public class Task07 {
    public static void main(String[] args) {
        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha", "miksa", "tyu"};
        String[] toReplace = new String[]{"lopr", "boki", "tyul"};
        fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));
    }

    public static void fixNames(String[] names, String[] toReplace) {
        for (int j = 0; j < toReplace.length; j++) {
            names[j*2+1] = toReplace[j];
        }
    }
}
