package com.company.redi_exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //fifthExercise(scanner);
        //seventhExercise(scanner);
        //eighthExercise();
        //twelfthExercise();
        //thirteenthExercise();
        //thirteenthExercisePartTwo(scanner);
        //fourteenthExercise();

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
        ArrayList<String> earnedWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() > minLength || word.length() == minLength) {
                earnedWords.add(word);
            }
        }
        return earnedWords;
    }

    private static void seventhExercise(Scanner scanner) {
        ArrayList<String> inputWords = new ArrayList<>();
        inputWords.add("Qwerty");
        inputWords.add("Uiop");
        inputWords.add("Asdfg");
        inputWords.add("Hjkl");
        inputWords.add("Zxcvb");
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
        ArrayList<String> inputWords = new ArrayList<>();
        inputWords.add("Qwerty");
        inputWords.add("Qwerty");
        inputWords.add("Uiop");
        inputWords.add("Uiop");
        inputWords.add("Asdfg");
        inputWords.add("Asdfg");
        inputWords.add("Hjkl");
        inputWords.add("Zxcvb");
        System.out.println(removeDuplicates(inputWords));
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> words) {
        ArrayList<String> earnedWords = new ArrayList<>();
        for (String word : words) {
            if (!earnedWords.contains(word) && words.contains(word)) {
                earnedWords.add(word);
            }
        }
        return earnedWords;
    }

    private static void twelfthExercise() {
        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);
        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(1);
        secondList.add(4);
        secondList.add(5);
        secondList.add(9);

        ArrayList<Integer> earnedList = new ArrayList<>();

        findDistinctNumbers(firstList, secondList, earnedList);
        findDistinctNumbers(secondList, firstList, earnedList);

        System.out.println("Output");
        System.out.println(earnedList);
    }

    private static void findDistinctNumbers(ArrayList<Integer> firstList, ArrayList<Integer> secondList, ArrayList<Integer> earnedList) {
        for (int number : firstList) {
            if (!secondList.contains(number)) {
                earnedList.add(number);
            }
        }
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
        for (String checkWord : distinctWords) {
            for (String word : inputWords) {
                if (checkWord == word) {
                    count++;
                }
            }
            System.out.println(checkWord + ", count: " + count);
            count = 0;
        }
    }

    private static void thirteenthExercisePartTwo(Scanner scanner) {
        ArrayList<Integer> inputWords = new ArrayList<>();
        int newNumber = 0;
        while (true) {
            newNumber = scanner.nextInt();

            if (newNumber == -1) {
                break;
            }
            inputWords.add(newNumber);
        }
        System.out.println(inputWords);

        int firstIndice = scanner.nextInt();
        int secondIndice = scanner.nextInt();
        int tmpValue = inputWords.get(secondIndice);
        inputWords.set(secondIndice, inputWords.get(firstIndice));
        inputWords.set(firstIndice, tmpValue);

        System.out.println(inputWords);
    }

    private static void fourteenthExercise() {
        ArrayList<Character> firstList = new ArrayList<>();
        firstList.add('a');
        firstList.add('b');
        firstList.add('c');
        firstList.add('d');

        ArrayList<Character> secondList = new ArrayList<>();
        secondList.add('x');
        secondList.add('y');

        ArrayList<Character> resultingList = new ArrayList<>();

        for (int i = 0; i < Integer.max(firstList.size(), secondList.size()); i++) {
            addChar(i, firstList, resultingList);
            addChar(i, secondList, resultingList);
        }
        System.out.println(resultingList);
    }

    private static void addChar(int i, ArrayList<Character> firstList, ArrayList<Character> resultingList) {
        if (i < firstList.size()) {
            resultingList.add(firstList.get(i));
        }
    }

}
