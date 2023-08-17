package com.company.Functional_interface;

import java.util.Random;

@FunctionalInterface
interface RandomColorGetter {
    String getRandomColor();
}

public class Main {
    public static void main(String[] args) {
        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple"};

        RandomColorGetter colorGetter = () -> {
            Random random = new Random();
            int index = random.nextInt(colors.length);
            return colors[index];
        };

        System.out.println(colorGetter.getRandomColor());
    }
}
