package com.company.redi_exercises;

import java.util.HashMap;
import java.util.Map;

public class CharCounter {
    public static void main(String[] args) {
        String word = "hello world";
        Map<Character, Integer> charsCount = new HashMap<>();

        int currentCount;
        for (int i = 0; i < word.length(); i++) {
            currentCount = charsCount.getOrDefault(word.charAt(i), 0);
            charsCount.put(word.charAt(i), currentCount + 1);
        }
        System.out.println(charsCount);
    }
}
