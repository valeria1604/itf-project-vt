package com.company.ppj05;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a + " " + b + " " + c);
        // variant1(a, b, c);
        variant2(a, b, c);
    }

    private static void variant1(int a, int b, int c) {
        int min = findMin(a, b, c);
        int max = findMax(a, b, c);
        int mid = (a + b + c) - min - max;
        System.out.println(min + " " + mid + " " + max);
    }

    private static void variant2(int a, int b, int c) {
        int tmp;
        if (b < a) {
            tmp = b;
            b = a;
            a = tmp;
        }
        if (c < b) {
            tmp = c;
            c = b;
            b = tmp;
        }
        if (b < a) {
            tmp = b;
            b = a;
            a = tmp;
        }
        System.out.println(a + " " + b + " " + c);
    }

    private static int findMin(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        }
        if (b <= c) {
            return b;
        }
        return c;
    }

    private static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        }
        if (b >= c) {
            return b;
        }
        return c;
    }
}

