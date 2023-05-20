package com.company.M6_1_9_tasks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //tasks1_4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
    }

    private static void tasks1_4() {
        Hero hero = new Hero();
        System.out.println(hero.getName());
        System.out.println(hero.getHp());

        System.out.println(new Hero().getName());
        System.out.println(new Hero("Stranger", 50).getName());

        System.out.println(new Hero("Stranger", 250).getHp());
        System.out.println(new Hero().getHp());
    }

    private static void task5() {
        //ExtraGun, ammo: 10000, damage: 300
        System.out.println(new BFG(10000, 300, "ExtraGun"));
        //BFG, ammo: 5000, damage: 200
        System.out.println(new BFG(5000, 200));
        //BFG, ammo: 2000, damage: 50
        System.out.println(new BFG(2000));
        //BFG, ammo: 1000, damage: 50
        System.out.println(new BFG());
    }

    private static void task6() {
        new Bullet();
        new Bullet();
    }

    private static void task7() {
        for(int i = 0; i < 10; i++) {
            new GameSaver();
        }
    }

    private static void task9() {
        for(int i = 0; i < 3; i++) {
            new AI();
        }
    }

    private static void task8() {
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}