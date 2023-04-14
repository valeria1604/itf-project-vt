package com.company.ppj09;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        //task01();
        //task02();
        //task03();
        //task04();
    }

    private static void task01() {
        for (int i = 75; i < 150; i++) {
            System.out.println((char) i + " - " + i);
        }
    }

    private static void task02() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(1 / Math.pow(2, i));
        }
    }

    private static void task03() {
        for (int i = 1; i <= 15; i++) {
            convertByteToHexAndSaveAsChar((byte) i);
        }
    }

    private static void convertByteToHexAndSaveAsChar(byte a) {
        String hexadecimalValue = String.format("%02x", a);
        char charValue = (char) Integer.parseInt(hexadecimalValue, 16);
        System.out.println(String.valueOf(charValue));
    }

    private static void task04() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int widthAndHeight = 2 * size + 1;
        int x = 1;
        for (int rows = 1; rows <= widthAndHeight; rows++) {
            for (int columns = 1; columns <= widthAndHeight; columns++) {
                if ((columns <= (widthAndHeight / 2 + 1) - x) || (columns >= (widthAndHeight / 2 + 1) + x)) {
                    System.out.print(".");
                } else {
                    System.out.print("x");
                }
            }
            if (rows < widthAndHeight / 2 + 1) {
                x++;
            } else {
                x--;
            }
            System.out.println();
        }
    }
}