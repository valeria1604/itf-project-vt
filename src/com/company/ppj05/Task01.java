package com.company.ppj05;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((c >= b && b >= a) || (a >= b && b >= c)) {
            System.out.println(b);
        } else if ((b > c && c > a) || (a > c && c > b)) {
            System.out.println(c);
        } else {
            System.out.println(a);
        }
        System.out.println("Exit");
    }
}