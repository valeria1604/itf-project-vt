package com.company.ppj08;

import java.util.Scanner;

public class Tasks123 {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task2_variant2();
        //task3();
        //task3_example2();
    }

    private static void task1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
    }

    private static void task2_variant2() {
        int result = 1;
        for (int i = 0; i <= 10; i++) {
            System.out.println(result);
            result = result * 2;
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
        while (i < 5) {
            System.out.println(i++);
        }
        i = 5;
        do {
            System.out.println(i++);
        } while (i < 5);
    }

    private static void task3_example2() {
        int answer;
        do {
            System.out.println("What is 2+2?");
            Scanner scan = new Scanner(System.in);
            answer = scan.nextInt();
        } while (answer != 4);
    }
}
