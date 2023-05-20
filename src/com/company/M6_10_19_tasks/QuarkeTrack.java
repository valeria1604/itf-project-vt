package com.company.M6_10_19_tasks;

public class QuarkeTrack {
    private final int sum;

    public QuarkeTrack(int[] lines) {
        int sum = 0;
        for (int element : lines) {
            sum += element;
        }
        this.sum = sum;
    }

    @Override
    public int hashCode() {
        return sum;
    }

    @Override
    public boolean equals(Object obj) {
        QuarkeTrack otherObject = (QuarkeTrack) obj;
        return this.sum == otherObject.sum;
    }
}
