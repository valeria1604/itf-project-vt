package com.company.M6_1_9_tasks;

public class GameSaver {
    private int value;
    public static String key;

    static{
        key = "wer";
    }

    {
        value = 100;
        System.out.println("GameSaver created!");
    }

    public GameSaver(int value) {
        System.out.println(this.value);
        this.value = value;
        System.out.println(this.value);
    }

    @Override
    public String toString() {
        return "GameSaver{" +
                "value=" + value +
                ", key='" + key + '\'' +
                '}';
    }
}
