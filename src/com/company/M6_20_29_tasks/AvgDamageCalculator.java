package com.company.M6_20_29_tasks;

public class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {
        try {
            int sum = 0;
            for (int sampleValue : samples) {
                sum += sampleValue;
            }
            return sum / samples.length;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
