package com.company.M6_10_19_tasks;

public class Rectangle {
    int firstSide;
    int secondSide;

    public Rectangle(int a, int b) {
        firstSide = a;
        secondSide = b;
    }

    public boolean canPlaceInto(Rectangle anotherRect) {
        return (firstSide <= anotherRect.firstSide && secondSide <= anotherRect.secondSide);
    }
}
