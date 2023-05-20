package com.company.M6_10_19_tasks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task10();
        //task11();
        //task12();
        task13();
        //task14();
        //task15();
        //tasks16_17_18_19();
    }

    private static void task10() {
        System.out.println(new Distance(10, 10, 20, 20).getDistance());
    }

    private static void task11() {
        int[] coordinates = {2, 2, 12, 12};
        System.out.println(new RectangleArea(coordinates).getArea());
    }

    private static void task12() {
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }

    private static void task13() {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        System.out.println(track1.equals(track2));
        System.out.println(track1.equals(track3));
        System.out.println(track1.hashCode() == track2.hashCode());
        System.out.println(track1.hashCode() == track3.hashCode());
    }

    private static void task14() {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));
        //true
        System.out.println(r1.canPlaceInto(r3));
        //true
        System.out.println(r2.canPlaceInto(r3));
        //false
        System.out.println(r3.canPlaceInto(r2));
    }

    private static void task15() {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);
        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }

    private static void tasks16_17_18_19() {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
        System.out.println(new Level(info, points));
        System.out.println(new Level(info, points).calculateLevelHash());
    }
}