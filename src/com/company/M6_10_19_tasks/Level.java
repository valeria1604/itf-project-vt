package com.company.M6_10_19_tasks;

public class Level {
    private LevelInfo levelInfo;
    private Point[] points;

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    public int calculateLevelHash() {
        int result = 0;
        for (Point point : points) {
            result += point.x * point.y;
        }
        return result;
    }

    static class LevelInfo {
        private String name;
        private String difficulty;

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDifficulty(String difficulty) {
            this.difficulty = difficulty;
        }
    }

    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.name
                + ", difficulty is " + levelInfo.difficulty
                + ", point count is " + points.length;
    }
}
