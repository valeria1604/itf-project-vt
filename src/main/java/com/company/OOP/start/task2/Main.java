package com.company.OOP.start.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2}, {4, 5, 6}, {7, 8, 1}};
        MatrixDiagonal matrixDiagonal = new MatrixDiagonal();
        System.out.println(Arrays.toString(matrixDiagonal.getDiagonal(matrix)));
        System.out.println(Arrays.toString(matrixDiagonal.getCounterDiagonal(matrix)));
    }
}

