package com.company.M6_10_19_tasks;

public class CircleIntersector {
    private final int x1;
    private final int y1;
    private final int r1;
    private final int x2;
    private final int y2;
    private final int r2;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        this.x1 = x1;
        this.y1 = y1;
        this.r1 = r1;
        this.x2 = x2;
        this.y2 = y2;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        return getDistance() <= r1 + r2 ? "intersects" : "not intersects";
    }

    private double getDistance() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
