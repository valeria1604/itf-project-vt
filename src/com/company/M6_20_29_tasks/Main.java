package com.company.M6_20_29_tasks;

public class Main {
    public static void main(String[] args) {
        //testsForGameMenu();
        //testsForLevelLoader();
        //testsForTexturePool();
        //testsForAvgDamageCalculator();
        //testsForArrayWorker();
        //testsForAIPlayer();
        //testsForTotalScore();
    }

    private static void testsForGameMenu() {
        GameMenu menu = new GameMenu();
        //options
        menu.act(new GameMenu.Options());
        //start
        menu.act(new GameMenu.Start());
        //exit
        menu.act(new GameMenu.Exit());
    }

    private static void testsForLevelLoader() {
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
        System.out.println(LevelLoader.getInstance() == LevelLoader.getInstance());
    }

    private static void testsForTexturePool() {
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
        System.out.println(TexturePool.getInstance() == TexturePool.getInstance());
    }

    private static void testsForAvgDamageCalculator() {
        //5
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[]{2, 4, 6, 8}));
        //0
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));
    }

    private static void testsForArrayWorker() {
        int[] array = {1, 2, 3};
        //value is 1
        //index is 0
        new ArrayWorker().printElement(array, 0);
        //wrong index
        //index is 10
        new ArrayWorker().printElement(array, 10);
    }

    private static void testsForAIPlayer() {
        AIPlayer player = new AIPlayer();

        //Ok value
        try {
            player.setHp(50);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }

        //Invalid value
        try {
            player.setHp(-1);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }
    }

    private static void testsForTotalScore() {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore().sum(score));
    }
}
