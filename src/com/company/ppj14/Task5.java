package com.company.ppj14;

public class Task5 {
    public static void main(String[] args) {
        int rows = 10;
        int columns = rows;
        int[][] array = new int[rows][columns];
        //printCol(3, 1, columns);
        printCol(1, 1, columns);
//        firstHalf(0, rows / 2, columns, array);
//        secondHalf((rows / 2), rows, columns, array);
//        printArray(rows, columns, array);
    }

    //printRow (row, col, size) {
    // printCol()
    //printRow()
    // printCol()
    // }
    private static void printCol(int max, int col, int size) {
        if (col > size/2) {
            return;
        }
        int value = col<max ? col: max;
        System.out.print(value + " ");
        printCol(max, col + 1, size);
        System.out.print(value + " ");
    }
//printCol(5, 1, 10); it should print
//"1234554321",
//    printCol(4, 1, 10); it should print
//"1234444321",
//    printCol(3, 1, 10); it should print
//"1233333321"

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
            if (number <= (row + 1) / 2 + 1 && i < columns - row) {
                number++;
            } else if (i > columns - row - 1) {
                number--;
            }
        }
        firstHalf(row + 1, rows, columns, array);
    }


}
