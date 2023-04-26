package com.company.OOP.start.task1;

import java.util.Arrays;

public class Printer {
    public String print(String message) {
        return message;
    }

    public String print(int message) {
        return String.valueOf(message);
    }

    public String print(double message) {
        return String.valueOf(message);
    }

    public String print(String firstPart, int secondPart) {
        return firstPart + " and " + String.valueOf(secondPart);
    }

    public String print(String[] message) {
        return Arrays.toString(message);
    }
}
