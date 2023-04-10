package com.company.ppj11;

import java.util.Arrays;

public class Tasks45 {
    public static void main(String[] args) {
        task4();
        task5();
    }

    private static void task4() {
        int[] array = {1, 2, 3, 4, 5};
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            tmp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void task5() {
        int[] array = {2, 3, 4, 3, 2, 6, 3, 6, 8, 2, 9};
        int count = 0;
        boolean isWritten;
        for (int j = 0; j < array.length; j++) {
            isWritten = false;
            for (int i = 0; i < array.length; i++) {
                if (array[j] == array[i] && !isWritten && array[i] != 0) {
                    isWritten = true;
                    System.out.print(array[i] + " ");
                    count++;
                } else if (array[j] == array[i] && isWritten) {
                    array[i] = 0;
                }
            }
        }
        System.out.println();
        System.out.println("There were " + count + " different numbers");
    }
}
