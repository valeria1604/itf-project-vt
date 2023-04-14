package com.company.ppj11;
import java.util.Arrays;

public class Tasks123 {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
    }

    private static void task1() {
        int[] array = new int[]{7, 6, 8, 4, 2, 9, 9};
        System.out.println(Arrays.toString(array));
        System.out.println("Max: " + getMax(array));
        System.out.println("Min: " + getMin(array));
    }

    private static void task2() {
        int[] array = new int[]{7, 6, 8, 4, 2, 9, 10};
        System.out.println(Arrays.toString(array));
        int indexMin = 0;
        int indexMax = 0;
        int min = getMin(array);
        int max = getMax(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                indexMin = i;
            } else if (array[i] == max) {
                indexMax = i;
            }
        }
        array[indexMin] = max;
        array[indexMax] = min;
        System.out.println(Arrays.toString(array));
    }

    private static void task3() {
        int[] array = new int[]{1, 5, 8, 2, 6};
        System.out.println(Arrays.toString(array));
        int max = getMax(array);
        for (int rows = max; rows > 0; rows--) {
            for (int elementValue : array) {
                if (elementValue < rows) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static int getMin(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }
}