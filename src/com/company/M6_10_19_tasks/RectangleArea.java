package com.company.M6_10_19_tasks;

public class RectangleArea {
    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    public RectangleArea(int[] coordinates) {
        startX = coordinates[0];
        startY = coordinates[1];
        endX = coordinates[2];
        endY = coordinates[3];
    }

    public int getArea() {
        return Math.abs(endX - startX) * Math.abs(endY - startY);
    }
}
