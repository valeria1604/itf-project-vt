package com.company.ppj05;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a + " " + b + " " + c);
        int min = 0;
        int mid = 0;
        int max = 0;

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                if (checkMin(a, b, c)) min = a;
                else if (checkMax(a, b, c)) max = a;
                else {
                    mid = a;
                }
            }
            if (i == 1) {
                if (checkMin(b, a, c)) min = b;
                else if (checkMax(b, a, c)) max = b;
                else {
                    mid = b;
                }
            }
            if (i == 2) {
                if (min == 0) min = c;
                if (mid == 0) mid = c;
                if (max == 0) max = c;
            }
        }
        System.out.println(min + " " + mid + " " + max);
    }

    private static boolean checkMin(int tmp, int x1, int x2) {
        return (tmp <= x1 && tmp <= x2);
    }

    private static boolean checkMax(int tmp, int x1, int x2) {
        return (tmp >= x1 && tmp >= x2);
    }
}

