package com.company.ppj08;

import java.util.Scanner;

public class Tasks45 {
    public static void main(String[] args) {
        task4();
        task5();
    }

    private static void task4() {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int fullMonthDaysCount = 0;
        for (int numberMonth = 1; numberMonth < month; numberMonth++) {
            fullMonthDaysCount += 31;
            if (numberMonth == 2) {
                fullMonthDaysCount = fullMonthDaysCount - 3;
            } else if (numberMonth == 4 || numberMonth == 6 || numberMonth == 9 || numberMonth == 11) {
                fullMonthDaysCount = fullMonthDaysCount - 1;
            }
        }
        System.out.println(fullMonthDaysCount + day);
    }

    private static void task5() {
        int countRows = 5;
        int countColumns = 8;
        for (int rows = 1; rows <= countRows; rows++) {
            for (int columns = 1; columns <= countColumns; columns++) {
                if ((rows + columns) % 2 == 0) {
                    System.out.print("o");
                } else {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}