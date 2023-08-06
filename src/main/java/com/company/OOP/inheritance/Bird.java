package com.company.OOP.inheritance;

public class Bird extends Animal{
    @Override
    public void say() {
        System.out.println("Bird: Chik-chirik :)");
    }

    @Override
    public void canFly() {
        System.out.println("Bird: can fly");
    }

    @Override
    public void canSwim() {
        System.out.println("Bird: can swim");
    }
}
