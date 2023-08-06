package com.company.ppj08;

import java.util.Random;
import java.util.Scanner;

public class Task0 {
    public static final String[] FIGURES = new String[]{"disc", "triangle", "square"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double d;
        if (figure.equals("rand")) {
            Random random = new Random();
            int randomNumber = random.nextInt(FIGURES.length);
            figure = FIGURES[randomNumber];
            d = random.nextInt(10);
        } else {
            d = scanner.nextInt();
        }

        System.out.println("Figure: " + figure);
        System.out.println("Number: " + d);

        switch (figure) {
            case "disc" -> System.out.println("Area disc: " + Math.PI * Math.pow(d, 2));
            case "triangle" -> System.out.println("Area triangle: " + ((Math.pow(d, 2) * Math.sqrt(3)) / 4));
            case "square" -> System.out.println("Area square: " + Math.pow(d, 2));
            default -> throw new IllegalStateException("Unexpected value: " + figure);
        }
    }
}
