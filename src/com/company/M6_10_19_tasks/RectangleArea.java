package com.company.M6_10_19_tasks;

public class RectangleArea {
    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    public RectangleArea(int[] coords) {
        startX = coords[0];
        startY = coords[1];
        endX = coords[2];
        endY = coords[3];
    }

    public int getArea() {
        return (int) Math.abs(endX - startX) * Math.abs(endY - startY);
    }
}
