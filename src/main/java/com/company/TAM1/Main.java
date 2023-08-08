package com.company.TAM1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static final String FILTER_BY_CHARACTER = "w";

    public static void main(String[] args) {
        String fromFileName = "src/main/resources/test.txt";
        String stringFromFile = readFromFile(fromFileName);

        String[] filteredWords = getFilteredWords(stringFromFile, FILTER_BY_CHARACTER);
        Arrays.sort(filteredWords);
        System.out.println(Arrays.asList(filteredWords));
    }

    private static String readFromFile(String fromFileName) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fromFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

    private static String[] getFilteredWords(String sentence, String filterCharacter) {
        sentence = sentence.toLowerCase();
        String[] splitSentence = sentence.split("\\W+");

        int filteredWordsCount = 0;
        for (String word : splitSentence) {
            if (word.startsWith(filterCharacter)) {
                filteredWordsCount++;
            }
        }

        String[] filteredWords = new String[filteredWordsCount];
        int index = 0;

        for (String word : splitSentence) {
            if (word.startsWith(filterCharacter)) {
                filteredWords[index] = word;
                index++;
            }
        }
        return filteredWords;
    }
}
