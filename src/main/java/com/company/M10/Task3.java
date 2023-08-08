package com.company.M10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static final String WHITESPACE = "\\s+";

    public static void main(String[] args) {
        String inputFileName = "file.txt";
        Map<String, Integer> words = calculateWordFrequencies(inputFileName);
        System.out.println(words);
    }

    private static Map<String, Integer> calculateWordFrequencies(String inputFileName) {
        Map<String, Integer> words = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(WHITESPACE);
                for (String word : data) {
                    int currentFrequency = words.getOrDefault(word, 0);
                    words.put(word, currentFrequency + 1);
                }
                System.out.println(words);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return words;
    }
}