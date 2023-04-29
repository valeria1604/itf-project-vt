package com.company.OOP.inheritance;

public class Fish extends Animal{
    @Override
    public void say() {
        System.out.println("Fish: can't say");
    }

    @Override
    public void canFly() {
        System.out.println("Fish: can't fly");
    }

    @Override
    public void canSwim() {
        System.out.println("Fish: can swim");
    }
}
