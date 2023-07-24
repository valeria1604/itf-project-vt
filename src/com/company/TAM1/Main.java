package com.company.TAM1;

import java.util.Arrays;

public class Main {

    public static final String SPECIFIED_CHARACTER = "w";

    public static void main(String[] args) {
        String sentence1 = "Width world Wide web";
        String sentence2 = "WWW? Four-bedroom farmhouse in the countryside. Wave! All of the four double bedrooms are en suite.";

        System.out.println(Arrays.asList(getSentenceArray(sentence1)));
        System.out.println(Arrays.asList(getSentenceArray(sentence2)));
    }

    private static String[] getSentenceArray(String sentence) {
        sentence = sentence.toLowerCase();
        String[] splintedSentence = sentence.split("\\W+");

        int wordCount = 0;
        for (String word : splintedSentence) {
            if (word.startsWith(SPECIFIED_CHARACTER)) {
                wordCount++;
            }
        }

        String[] finalResult = new String[wordCount];
        int index = 0;

        for (String word : splintedSentence) {
            if (word.startsWith(SPECIFIED_CHARACTER)) {
                finalResult[index] = word;
                index++;
            }
        }
        return finalResult;
    }
}
