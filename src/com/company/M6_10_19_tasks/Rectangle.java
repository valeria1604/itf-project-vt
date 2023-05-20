package com.company.M6_10_19_tasks;

public class Rectangle {
    int firstSide;
    int secondSide;

    public Rectangle(int a, int b) {
        this.firstSide = a;
        this.secondSide = b;
    }

    public boolean canPlaceInto(Rectangle anotherRect) {
        return (this.firstSide <= anotherRect.firstSide && this.secondSide <= anotherRect.secondSide);
    }
}
