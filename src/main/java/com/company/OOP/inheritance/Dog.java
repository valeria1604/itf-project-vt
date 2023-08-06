package com.company.OOP.inheritance;

public class Dog extends Animal{
    @Override
    public void say() {
        System.out.println("Dog: Woof");
    }

    @Override
    public void canFly() {
        System.out.println("Dog: can't fly");
    }

    @Override
    public void canSwim() {
        System.out.println("Dog: can swim");
    }
}
