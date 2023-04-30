package com.company.OOP.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Fish(), new Bird()};
        for (Animal animal : animals) {
            animal.say();
            animal.canFly();
            animal.canSwim();
        }
    }
}