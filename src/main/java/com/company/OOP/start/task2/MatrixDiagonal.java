package com.company.OOP.start.task2;

public class MatrixDiagonal {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonalArray = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    diagonalArray[i] = matrix[i][j];
                }
            }
        }
        return diagonalArray;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonalArray = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (matrix[i][j] == matrix[i][matrix[i].length - 1 - i]) {
                    counterDiagonalArray[i] = matrix[i][j];
                }
            }
        }
        return counterDiagonalArray;
    }
}