package com.company.ppj05;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int min, max;

        min = findMin(a, b, c, d);
        max = findMax(a, b, c, d);
        System.out.println(max - min);
    }

    private static int findMin(int a, int b, int c, int d) {
        if (a <= b && a <= c && a <= d) {
            return a;
        }
        if (b <= c && b <= d) {
            return b;
        }
        if (c < d) {
            return c;
        }
        return d;
    }

    private static int findMax(int a, int b, int c, int d) {
        if (a >= b && a >= c && a >= d) {
            return a;
        }
        if (b >= c && b >= d) {
            return b;
        }
        if (c > d) {
            return c;
        }
        return d;
    }
}
