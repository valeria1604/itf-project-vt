package com.company.TAM1;

import java.util.Arrays;

public class Main {

    public static final String FILTER_BY_CHARACTER = "w";

    public static void main(String[] args) {
        String fromFileName =  "test.txt";
        StringBuilder text = new StringBuilder();
        String line;

        try(
                BufferedReader reader = new BufferedReader(new FileReader(fromFileName));
        ) {
            while ((line = reader.readLine()) != null){
                text.append(line);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        String[] result = getSentenceArray(String.valueOf(text));
        Arrays.sort(result);
        System.out.println(Arrays.asList(result));
    }

    private static String[] getSentenceArray(String sentence) {
        sentence = sentence.toLowerCase();
        String[] splitedSentence = sentence.split("\\W+");

        int wordCount = 0;
        for (String word : splitedSentence) {
            if (word.startsWith(FILTER_BY_CHARACTER)) {
                wordCount++;
            }
        }

        String[] finalResult = new String[wordCount];
        int index = 0;

        for (String word : splitedSentence) {
            if (word.startsWith(FILTER_BY_CHARACTER)) {
                finalResult[index] = word;
                index++;
            }
        }
        return finalResult;
    }
}
