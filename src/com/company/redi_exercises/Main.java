package com.company.redi_exercises;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //fifthExercise(scanner);
        //seventhExercise(scanner);
        //eighthExercise();
        //twelfthExercise();
        //thirteenthExercise();
        //thirteenthExercisePartTwo(scanner);
        fourteenthExercise();

    }

    private static void fifthExercise(Scanner scanner) {
        int numberWords = scanner.nextInt();
        List<String> inputWords = new ArrayList<>();
        for (int i = 0; i <= numberWords; i++) {
            inputWords.add(scanner.nextLine());
        }
        System.out.println("Min length: ");
        int numberLetters = scanner.nextInt();
        System.out.println(removeShortWords(inputWords, numberLetters));
    }

    public static ArrayList<String> removeShortWords(List<String> words, int minLength) {
        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() >= minLength) {
                result.add(word);
            }
        }
        return result;
    }

    private static void seventhExercise(Scanner scanner) {
        List<String> inputWords = Arrays.asList("Qwerty", "Uiop", "Asdfg", "Hjkl", "Zxcvb");
        System.out.println("Input word: ");
        String inputWord = scanner.nextLine();

        System.out.println(findValue(inputWords, inputWord));
    }

    public static int findValue(List<String> words, String inputWord) {
        return words.indexOf(inputWord);
    }

    private static void eighthExercise() {
        List<String> inputWords = Arrays.asList("Qwerty", "Qwerty", "Uiop", "Uiop", "Asdfg", "Asdfg", "Hjkl", "Zxcvb");
        System.out.println(removeDuplicates(inputWords));
    }

    public static List<String> removeDuplicates(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (!result.contains(word)) {
                result.add(word);
            }
        }
        return result;
    }

    private static void twelfthExercise() {
        List<Integer> firstList = Arrays.asList(1, 2, 3, 4);
        List<Integer> secondList = Arrays.asList(1, 4, 5, 9);

        List<Integer> result = findDistinctNumbers(firstList, secondList);
        System.out.println("Output");
        System.out.println(result);
    }

    private static List<Integer> findDistinctNumbers(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList<>();
        for (int number : firstList) {
            if (!secondList.contains(number)) {
                result.add(number);
            }
        }
        for (int number : secondList) {
            if (!firstList.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }

    private static void thirteenthExercise() {
        List<String> inputWords = Arrays.asList("hello", "world", "hello", "germany", "hello", "berlin");

        HashSet<String> distinctWords = new HashSet<>(inputWords);
        System.out.println(distinctWords);

        int count = 0;
        for (String distinctWord : distinctWords) {
            for (String word : inputWords) {
                if (Objects.equals(distinctWord, word)) {
                    count++;
                }
            }
            System.out.println(distinctWord + ", count: " + count);
            count = 0;
        }
    }

    private static void thirteenthExercisePartTwo(Scanner scanner) {
        List<Integer> inputNumbers = new ArrayList<>();
        int newNumber = 0;
        while (true) {
            newNumber = scanner.nextInt();

            if (newNumber == -1) {
                break;
            }
            inputNumbers.add(newNumber);
        }
        System.out.println(inputNumbers);

        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();
        int tmpValue = inputNumbers.get(secondIndex);
        inputNumbers.set(secondIndex, inputNumbers.get(firstIndex));
        inputNumbers.set(firstIndex, tmpValue);

        System.out.println(inputNumbers);
    }

    private static void fourteenthExercise() {
        List<Character> firstList = Arrays.asList('a', 'b', 'c', 'd');
        List<Character> secondList = Arrays.asList('x', 'y');

        List<Character> resultingList = new ArrayList<>();

        int minLength = Integer.min(firstList.size(), secondList.size());

        for (int i = 0; i < minLength; i++) {
            resultingList.add(firstList.get(i));
            resultingList.add(secondList.get(i));
        }

        if (firstList.size() > minLength) {
            for (int i = minLength; i < firstList.size(); i++) {
                resultingList.add(firstList.get(i));
            }
        } else {
            for (int i = minLength; i < secondList.size(); i++) {
                resultingList.add(secondList.get(i));
            }
        }

        System.out.println(resultingList);
    }

}
