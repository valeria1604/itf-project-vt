package com.company.M6_20_29_tasks;

public class LevelLoader {
    private static LevelLoader instance = new LevelLoader();

    private LevelLoader() {
    }

    public static LevelLoader getInstance() {
        return instance;
    }

    public String load(String levelName) {
        return "Loading level " + levelName + "...";
    }
}
