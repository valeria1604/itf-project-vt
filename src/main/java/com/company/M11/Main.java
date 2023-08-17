package com.company.M11;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
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

        AtomicInteger index = new AtomicInteger(0);
        Stream<String> namesStream = names.stream().filter(name -> index.getAndIncrement() % 2 != 0);
        namesStream.forEachOrdered(name -> System.out.println(index.get() - 1 + ". " + name));
    }

    private static void task2() {
        List<String> names = Arrays.asList("John", "Bill", "Anthon", "Alex");
        Stream<String> namesStream = names.stream().sorted().map(String::toUpperCase);
        namesStream.forEachOrdered(System.out::println);
    }

    private static void task3() {
        int[] numbers = {1, 2, 0, 4, 5};
        IntStream numbersStream = Arrays.stream(numbers).sorted();
        numbersStream.forEach(number -> System.out.print(number + ", "));
    }

    private static void task4() {
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        Stream<Long> randomStream = generateStream(1L, a, c, m, 10);
        randomStream.forEach(System.out::println);
    }

    private static Stream<Long> generateStream(long seed, long a, long c, long m, int limit) {
        return Stream.iterate(seed, x -> (a * x + c) % m).limit(limit);
    }

    private static void task5() {
        Stream<Integer> stream1 = Stream.of(1, 3, 5, 7, 9);
        Stream<Integer> stream2 = Stream.of(2, 4, 6);
        Stream<Integer> zippedStream = zipStream(stream1, stream2);
        zippedStream.forEach(System.out::println);
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
