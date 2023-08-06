package com.company.M6_10_19_tasks;

public class TargetFinder {

    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int[] result = new int[2];
        int tmp;
        int difference = (int) Math.sqrt(Math.pow(aiCoords[0] - targets[0][0], 2) + Math.pow(aiCoords[1] - targets[0][1], 2));
        for (int i = 1; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length; j++) {
                tmp = (int) Math.sqrt(Math.pow(aiCoords[0] - targets[i][0], 2) + Math.pow(aiCoords[1] - targets[i][1], 2));
                if (tmp <= difference) {
                    result[0] = targets[i][0];
                    result[1] = targets[i][1];
                }
            }
        }
        return result;
    }
}
