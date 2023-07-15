package com.company.M6_20_29_tasks;

public class ArrayWorker {

    public void printElement(int[] array, int index) {
        try {
            System.out.println("value is " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("wrong index");
        } finally {
            System.out.println("index is " + index);
        }
    }

}
