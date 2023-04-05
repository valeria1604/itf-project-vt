package com.company.M3;

import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        int age3 = scanner.nextInt();
        int age4 = scanner.nextInt();
        System.out.println(Arrays.toString(createAgeArray(age1, age2, age3, age4)));
    }

    public static int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }
}
