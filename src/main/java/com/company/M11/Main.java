package com.company.M11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        System.out.println(task1());
//        System.out.println(task2());
//        System.out.println(task3());
//        task4();
//        task5();
    }

    private static String task1() {
        List<String> names = Arrays.asList("John", "Bill", "Anthon", "Alex");

        return IntStream.range(0, names.size())
                .filter(index -> index % 2 != 0)
                .mapToObj(index -> index + ". " + names.get(index))
                .collect(Collectors.joining(", "));
    }

    private static List<String> task2() {
        List<String> names = Arrays.asList("John", "Bill", "Anthon", "Alex");
        return names.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    private static String task3() {
        String[] inputArray = {"1, 2, 0", "4, 5"};

        return Arrays.stream(inputArray)
                .flatMapToInt(s -> Arrays.stream(s.split(", "))
                        .mapToInt(Integer::parseInt))
                .sorted()
                .mapToObj(String::valueOf) // Convert back to String
                .collect(Collectors.joining(", "));
    }

    private static void task4() {
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        generateStream(1L, a, c, m, 10)
                .forEach(System.out::println);
    }

    private static List<Long> generateStream(long seed, long a, long c, long m, int limit) {
        return Stream.iterate(seed, x -> (a * x + c) % m)
                .limit(limit)
                .collect(Collectors.toList());
    }

    private static void task5() {
        Stream<Integer> stream1 = Stream.of(1, 3, 5, 7, 9);
        Stream<Integer> stream2 = Stream.of(2, 4, 6);
        zipStream(stream1, stream2)
                .forEach(System.out::println);
    }

    private static <T> Stream<T> zipStream(Stream<T> stream1, Stream<T> stream2) {
        List<T> firstList = stream1.toList();
        List<T> secondList = stream2.toList();
        return (Stream<T>) Stream.iterate(0, i -> i + 1)
                .map(i -> {
                    if (i < firstList.size() && i < secondList.size()) {
                        return Stream.of(firstList.get(i), secondList.get(i));
                    }
                    return Stream.empty();
                })
                .flatMap(stream -> stream);
    }
}
