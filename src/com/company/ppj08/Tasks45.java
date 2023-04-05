package com.company.ppj08;

public class Tasks45 {
    public static void main(String[] args) {
        task4();
        task5();
    }

    private static void task4() {
        int day = 4;
        int month = 4;
        int countDays = 0;
        for (int numberMonth = 1; numberMonth < month; numberMonth++) {
            countDays += 31;
            if (numberMonth == 2) {
                countDays = countDays - 3;
            }
        }
        System.out.println(countDays + day);
    }

    private static void task5() {
        int countRows = 5;
        int countColumns = 8;
        for (int rows = 1; rows <= countRows; rows++) {
            for (int columns = 1; columns <= countColumns; columns++) {
                if (rows % 2 == 0) {
                    if (columns % 2 == 0) {
                        System.out.print("o");
                    } else {
                        System.out.print("x");
                    }
                } else {
                    if (columns % 2 == 0) {
                        System.out.print("x");
                    } else {
                        System.out.print("o");
                    }
                }
                if (columns == countColumns) {
                    System.out.println();
                }
            }
        }
    }
}