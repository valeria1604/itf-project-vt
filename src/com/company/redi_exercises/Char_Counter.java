package com.company.redi_exercises;

import java.util.HashMap;
import java.util.Map;

public class Char_Counter {
    public static void main(String[] args) {
        String word = "hello world";
        Map<Character, Integer> repeatsChar = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (!repeatsChar.containsKey(word.charAt(i))) {
                repeatsChar.put(word.charAt(i), 1);
            } else {
                int newValue = repeatsChar.get(word.charAt(i)) + 1;
                repeatsChar.replace(word.charAt(i), newValue);
            }
        }
        System.out.println(repeatsChar);
    }
}
