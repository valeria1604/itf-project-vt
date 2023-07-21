package com.company.M10;

import java.util.Arrays;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
//        String sentence = "the day is sunny the the\n" +
//                "the sunny is is";
//        Map<String, Integer> words = new HashMap<>();
//        calculateRepetitions(words, sentence);

//        String inputFileName = "file.txt";
//        Map<String, Integer> words = new HashMap<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                calculateRepetitions(words, line);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        System.out.println(words);
    }

    private static void calculateRepetitions(Map<String, Integer> words, String line) {
        String[] data = line.split("\\s+");
        System.out.println(Arrays.toString(data));
        for (String word : data) {
            if (!words.containsKey(word)) {
                words.put(word, 1);
            } else {
                int currentFrequency = words.getOrDefault(word, 0);
                words.put(word, currentFrequency + 1);
            }
        }
        System.out.println(words);
    }
}
