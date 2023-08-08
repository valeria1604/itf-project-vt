package com.company.ppj05;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();
        scanner.close();
        System.out.println("a, b, c: " + a + " " + b + " " + c);
        System.out.println("allThree: " + allThree(a, b, c));
        System.out.println("exactlyOne: " + exactlyOne(a, b, c));
        System.out.println("exactlyTwo: " + exactlyTwo(a, b, c));
        System.out.println("atLestOne: " + atLeastOne(a, b, c));
        System.out.println("atLeastTwo: " + atLeastTwo(a, b, c));
    }

    private static boolean allThree(boolean x, boolean y, boolean z) {
        return x && y && z;
    }

    private static boolean exactlyOne(boolean x, boolean y, boolean z) {
        if ((x && !y && !z) || (!x && y && !z)) {
            return true;
        }
        return z;
    }

    private static boolean exactlyTwo(boolean x, boolean y, boolean z) {
        if ((x && y && !z) || (y && z && !x)) {
            return true;
        }
        return z && x && !y;
    }

    private static boolean atLeastOne(boolean x, boolean y, boolean z) {
        return x || y || z;
    }

    private static boolean atLeastTwo(boolean x, boolean y, boolean z) {
        if ((x && y) || (y && z)) {
            return true;
        }
        return z && x;
    }
}
