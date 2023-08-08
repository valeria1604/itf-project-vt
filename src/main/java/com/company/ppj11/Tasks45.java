package com.company.ppj11;

import java.util.Arrays;

public class Tasks45 {
    public static void main(String[] args) {
        //task4();
        int[] array = {2, 3, 4, 3, 2, 6, 3, 6, 8, 2, 9};
        task5(array);
    }

    private static void task4() {
        int[] array = {1, 2, 3, 4, 5};
        int tmp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            tmp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void task5(int[] array) {
        if (array.length == 0) {
            System.out.println("Empty array");
        }
        int count = 1;
        for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[j] == array[i]) {
                    break;
                }
                if (i == array.length - 1) {
                    System.out.print(array[j] + " ");
                    count++;
                }
            }
        }
        System.out.print(array[array.length - 1] + "");
        System.out.println();
        System.out.println("There were " + count + " different numbers");
    }
}
