package com.company.M11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
    }

    private static void task1() {
        List<String> names = Arrays.asList("John", "Bill", "Anthon", "Alex");

        IntStream.range(0, names.size())
                .filter(index -> index % 2 != 0)
                .forEachOrdered(index -> System.out.println(index + ". " + names.get(index)));
    }

    private static void task2() {
        List<String> names = Arrays.asList("John", "Bill", "Anthon", "Alex");
        names.stream()
                .sorted()
                .map(String::toUpperCase)
                .forEachOrdered(System.out::println);
    }

    private static void task3() {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        int[] numbers = Arrays.stream(inputArray)
                .flatMapToInt(s -> Arrays.stream(s.split(", "))
                        .mapToInt(Integer::parseInt))
                .toArray();
        Arrays.stream(numbers).
                sorted()
                .forEach(number -> System.out.print(number + ", "));
    }

    private static void task4() {
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        generateStream(1L, a, c, m, 10)
                .forEach(System.out::println);
    }

    private static Stream<Long> generateStream(long seed, long a, long c, long m, int limit) {
        return Stream.iterate(seed, x -> (a * x + c) % m)
                .limit(limit);
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
