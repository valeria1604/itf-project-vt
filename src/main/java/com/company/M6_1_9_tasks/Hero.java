package com.company.M6_1_9_tasks;

public class Hero {
    private String name;
    private int hp;

    public Hero() {
        this("Paratrooper", 100);
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = Math.min(hp, 200);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}
