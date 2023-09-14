package com.company.Coding_game;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Oliver", "Jake", "Noah", "James", "Jack", "Connor"};
        System.out.println(getNumberOfLettersOfNamesLongerThanFive(names));

        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        System.out.println(transform(collection));
    }

    public static int getNumberOfLettersOfNamesLongerThanFive(String[] names) {
        return Arrays.stream(names)
                .filter(name -> name.length() > 5)
                .mapToInt(String::length)
                .sum();
    }

    public static List<String> transform(List<List<String>> collection) {
        return collection.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
