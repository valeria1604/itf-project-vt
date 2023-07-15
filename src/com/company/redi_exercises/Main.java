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
        ArrayList<String> inputWords = new ArrayList<>();
        for (int i = 0; i <= numberWords; i++) {
            inputWords.add(scanner.nextLine());
        }
        System.out.println("Min length: ");
        int numberLetters = scanner.nextInt();
        System.out.println(removeShortWords(inputWords, numberLetters));
    }

    public static ArrayList<String> removeShortWords(ArrayList<String> words, int minLength) {
        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            if (!(word.length() < minLength)) {
                result.add(word);
            }
        }
        return result;
    }

    private static void seventhExercise(Scanner scanner) {
        ArrayList<String> inputWords = new ArrayList<>(Arrays.asList("Qwerty", "Uiop", "Asdfg", "Hjkl", "Zxcvb"));
        System.out.println("Input word: ");
        String inputWord = scanner.nextLine();
        System.out.println(findValue(inputWords, inputWord));
    }

    public static int findValue(ArrayList<String> words, String inputWord) {

        if (words.contains(inputWord)) {
            return words.indexOf(inputWord);
        }
        return -1;
    }

    private static void eighthExercise() {
        ArrayList<String> inputWords = new ArrayList<>(Arrays.asList("Qwerty", "Qwerty", "Uiop", "Uiop", "Asdfg", "Asdfg", "Hjkl", "Zxcvb"));
        System.out.println(removeDuplicates(inputWords));
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> words) {
        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            if (!result.contains(word)) {
                result.add(word);
            }
        }
        return result;
    }

    private static void twelfthExercise() {
        ArrayList<Integer> firstList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> secondList = new ArrayList<>(Arrays.asList(1, 4, 5, 9));

        ArrayList<Integer> result = new ArrayList<>();

        result = findDistinctNumbers(firstList, secondList, result);
        result = findDistinctNumbers(secondList, firstList, result);

        System.out.println("Output");
        System.out.println(result);
    }

    private static ArrayList<Integer> findDistinctNumbers(ArrayList<Integer> firstList, ArrayList<Integer> secondList, ArrayList<Integer> result) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int number : firstList) {
            if (!secondList.contains(number)) {
                tmp.add(number);
            }
        }
        tmp.addAll(result);
        return tmp;

    }

    private static void thirteenthExercise() {
        ArrayList<String> inputWords = new ArrayList<>();
        inputWords.add("hello");
        inputWords.add("world");
        inputWords.add("hello");
        inputWords.add("germany");
        inputWords.add("hello");
        inputWords.add("berlin");

        HashSet<String> distinctWords = new HashSet<>();
        distinctWords.addAll(inputWords);
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
        ArrayList<Integer> inputNumbers = new ArrayList<>();
        int newNumber = 0;
        while (true) {
            newNumber = scanner.nextInt();

            if (newNumber == -1) {
                break;
            }
            inputNumbers.add(newNumber);
        }
        System.out.println(inputNumbers);

        int firstIndice = scanner.nextInt();
        int secondIndice = scanner.nextInt();
        int tmpValue = inputNumbers.get(secondIndice);
        inputNumbers.set(secondIndice, inputNumbers.get(firstIndice));
        inputNumbers.set(firstIndice, tmpValue);

        System.out.println(inputNumbers);
    }

    private static void fourteenthExercise() {
        ArrayList<Character> firstList = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd'));
        ArrayList<Character> secondList = new ArrayList<>(Arrays.asList('x', 'y'));

        ArrayList<Character> resultingList = new ArrayList<>();

        int maxLength = Integer.max(firstList.size(), secondList.size());

        for (int i = 0; i < maxLength; i++) {
            if (i < firstList.size()) {
                resultingList.add(firstList.get(i));
            }
            if (i < secondList.size()) {
                resultingList.add(secondList.get(i));
            }
        }
        System.out.println(resultingList);
    }
}
