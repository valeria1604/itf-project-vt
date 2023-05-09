package com.company.OOP.phone;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor(){
        int pick = new Random().nextInt(Color.values().length);
        return Color.values()[pick];
    }
}
