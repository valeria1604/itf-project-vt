package com.company.M6_20_29_tasks;

public class TotalScore {

    public int sum(int[] scores) {
        int result = 0;

        for (int score : scores) {
            result += score;
        }

        return result;
    }
}
