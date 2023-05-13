package com.company.OOP.text_encoder;

public class Encoder {

    public static final String WORD_SEPARATOR = " ";

    public String encodeText(String text) {
        String[] words = text.split(WORD_SEPARATOR);
        StringBuilder encodedText = new StringBuilder();
        for (String word : words) {
            encodedText.append(reverseWord(word)).append(WORD_SEPARATOR);
        }
        return encodedText.toString();
    }

    private String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        char tmp;

        for (int startIndex = 0, endIndex = word.length() - 1; startIndex < endIndex; ) {
            if (!Character.isLetter(charArray[startIndex])) {
                startIndex++;
                continue;
            }
            if (!Character.isLetter(charArray[endIndex])) {
                endIndex--;
                continue;
            }
            tmp = charArray[endIndex];
            charArray[endIndex] = charArray[startIndex];
            charArray[startIndex] = tmp;
            startIndex++;
            endIndex--;
        }
        return String.valueOf(charArray);
    }
}
