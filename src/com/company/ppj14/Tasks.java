package com.company.ppj14;

public class Tasks {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
    }

    private static void task1() {
        System.out.println(powerValue(2, 5));
    }

    private static void task2() {
        int value = 4;
        System.out.println(sumBetweenZeroNumber(value - 1));
    }

    private static void task3() {
        System.out.println(findCommonDivisor(24, 36));
    }

    public static void task4() {
        int[] array = {1, 2, 3, 3, 2, 1};
        System.out.println(checkIsItPalindrome(array));
        int[] array2 = {1, 2, 3, 4, 5, 6};
        System.out.println(checkIsItPalindrome(array2));
    }

    public static int powerValue(int number, int power) {
        if (power == 1) {
            return number;
        }
        return number * powerValue(number, power - 1);
    }

    public static int sumBetweenZeroNumber(int value) {
        if (value == 0) {
            return 0;
        }
        return value + sumBetweenZeroNumber(value - 1);
    }

    public static int findCommonDivisor(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        } else {
            return findCommonDivisor(secondNumber, firstNumber % secondNumber);
        }
    }

    public static boolean checkIsItPalindrome(int[] array) {
        int startIndex = 0;
        int lastIndex = array.length - 1;
        return checkAreElementsEqual(startIndex, lastIndex, array);
    }

    public static boolean checkAreElementsEqual(int firstIndex, int secondIndex, int[] array) {
        if (array[firstIndex] != array[secondIndex]) {
            return false;
        } else {
            if (array.length / 2 - 1 == firstIndex) {
                return array[firstIndex] == array[secondIndex];
            } else {
                return checkAreElementsEqual(firstIndex + 1, secondIndex - 1, array);
            }
        }
    }
}