package com.company.M6_10_19_tasks;

public class Distance {
    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance() {
        return (int) Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
    }
}
