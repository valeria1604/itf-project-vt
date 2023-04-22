package com.company.ppj14;

public class Task5 {
    public static void main(String[] args) {
        int rows = 10;
        int columns = rows;
        int[][] array = new int[rows][columns];
        firstHalf(0, rows / 2, columns, array);
        secondHalf((rows / 2), rows, columns, array);
        printArray(rows, columns, array);
    }

    private static void printArray(int rows, int columns, int[][] array) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void firstHalf(int row, int rows, int columns, int[][] array) {
        if (row == rows) {
            return;
        }
        int number = 1;
        for (int i = 0; i < columns; i++) {
            array[row][i] = number;
            if (number < row + 1 && i < columns - row) {
                number++;
            } else if (i >= columns - row - 1) {
                number--;
            }
        }
        firstHalf(row + 1, rows, columns, array);
    }

    public static void secondHalf(int row, int rows, int columns, int[][] array) {
        if (row == rows) {
            return;
        }
        int number = 1;
        for (int i = 0; i < columns; i++) {
            array[row][i] = number;
            if (number <= (row+1)/2+1  && i < columns - row) {
                number++;
            } else if (i > columns - row - 1) {
                number--;
            }
        }
        firstHalf(row + 1, rows, columns, array);
    }


}
