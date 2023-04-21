package com.company.ppj09;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        //task01();
        //task02();
        //task03();
        task04();
    }

    private static void task01() {
        for (char i = 75; i < 150; i++) {
            System.out.println(i + " - " + (int) i);
        }
    }

    private static void task02() {
        double result = 1;
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            result = result / 2;
            System.out.println(result);
            sum = sum + result;
        }
        System.out.println("Sum: " + sum);
    }

    private static void task03() {
        for (byte i = 0; i <= 15; i++) {
            String hexValue = Integer.toHexString(i);
            char charValue = hexValue.charAt(0);
            System.out.println(charValue);
        }
    }

    private static void task04() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int widthAndHeight = 2 * size + 1;

        for (int rows = 1; rows <= widthAndHeight; rows++) {
            for (int columns = 1; columns <= widthAndHeight; columns++) {
                if ((columns + rows <= widthAndHeight / 2 + 1)
                        || (columns + rows >= widthAndHeight + 1 + (widthAndHeight / 2 + 1))
                        || (Math.abs(columns - rows) >= widthAndHeight / 2 + 1)) {
                    System.out.print(".");
                } else {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}