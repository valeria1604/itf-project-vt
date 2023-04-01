package com.company.M2;

public class MarsValueConverter {

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
