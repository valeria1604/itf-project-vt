package com.company.OOP.inheritance;

public class Cat extends Animal{
    @Override
    public void say() {
        System.out.println("Cat: Meow");
    }

    @Override
    public void canFly() {
        System.out.println("Cat: can't fly");
    }

    @Override
    public void canSwim() {
        System.out.println("Cat: can swim");
    }
}
