package com.company.ppj08;

public class Tasks123 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
    }

    private static void task2() {
        for (double pow = 1; Math.pow(2, pow) <= 1024; ) {
            System.out.println(Math.pow(2, pow));
            pow++;
        }
    }

    private static void task3() {
        int i = 5;
        do {
            System.out.println(i);
        }
        while (i != 5);

        while (i != 5) {
            System.out.println(i);
        }
    }
}
