package com.company.ppj08;

import java.util.Random;
import java.util.Scanner;

public class Task0 {
    public static String[] figures = new String[]{"disc", "triangle", "square"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double d;
        if (figure.equals("rand")) {
            int randomNumber = new Random().nextInt(figures.length + 1);
            figure = figures[randomNumber];
            d = Math.random();
        } else {
            d = scanner.nextInt();
        }
        System.out.println("Figure: " + figure);
        System.out.println("Number: " + d);
        switch (figure) {
            case "disc" -> System.out.println("Area disc: " + Math.PI * Math.pow(d, 2));
            case "triangle" -> System.out.println("Area triangle: " + (Math.pow(d, 2) * Math.sqrt(3) / 4));
            case "square" -> System.out.println("Area square: " + Math.pow(d, 2));
            default -> throw new IllegalStateException("Unexpected value: " + figure);
        }
    }
}
