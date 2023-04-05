package com.company.M2;

public class Task36 {
    public static void main(String[] args) {
        System.out.println("changeMoneyAmount: " + changeMoneyAmount(100f, 40.5f));
        System.out.println("calculateMoneySum: " + calculateMoneySum(50, 40));
        System.out.println("halfOfMoney: " + halfOfMoney(1000.9999));
    }

    public static int changeMoneyAmount(float startAmount, float toRemove) {
        return (int) (startAmount - toRemove);
    }

    public static byte calculateMoneySum(int sum1, int sum2) {
        return (byte) (sum1 + sum2);
    }

    public static short halfOfMoney(double startMoney) {
        return (short) (startMoney / 2);
    }
}
