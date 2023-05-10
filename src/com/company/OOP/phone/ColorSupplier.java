package com.company.OOP.phone;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor(){
        int pick = random.nextInt(Color.values().length);
        return Color.values()[pick];
    }
}
