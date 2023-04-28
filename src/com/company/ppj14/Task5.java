package com.company.ppj14;

public class Task5 {
    public static void main(String[] args) {
        int rows = 10;
        int columns = rows;
        int[][] array = new int[rows][columns];
        printRow(1, 1, columns);
    }

    private static void printRow(int row, int col, int size) {
        if (row > size / 2) {
            return;
        }
        printCol(row, col, size);
        System.out.println();
        printRow(row + 1, col, size);
        printCol(row, col, size);
        System.out.println();
    }

    private static void printCol(int max, int col, int size) {
        if (col > size / 2) {
            return;
        }
        int value = col < max ? col : max;
        System.out.print(value + " ");
        printCol(max, col + 1, size);
        System.out.print(value + " ");
    }
}