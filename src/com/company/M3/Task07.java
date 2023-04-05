package com.company.M3;

import java.util.Arrays;

public class Task07 {
    public static void main(String[] args) {
        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[]{"lopr", "boki"};
        fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));
    }

    public static void fixNames(String[] names, String[] toReplace) {
        int j = 0;
        for (int i = 1; i < names.length; ) {
            names[i] = toReplace[j];
            i = i + 2;
            j++;
        }
    }
}

