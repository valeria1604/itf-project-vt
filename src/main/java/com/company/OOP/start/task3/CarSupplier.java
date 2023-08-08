package com.company.OOP.start.task3;

public class CarSupplier {
    public static Car[] supply(){
        Car[] cars = new Car[10];
        cars[0] = new Car(5, "Toyota", "400x", 2014, "Black", 500, "re4 xyz");
        cars[1] = new Car(5, "Mazda", "500x", 2020, "Red", 200, "re5 xyz");
        cars[2] = new Car(5, "Toyota", "600x", 2022, "Orange", 900, "re6 xyz");
        cars[3] = new Car(5, "Toyota", "700x", 2011, "Yellow", 500, "re7 xyz");
        cars[4] = new Car(5, "Mercedes", "800x", 2007, "Black", 200, "re8 xyz");
        cars[5] = new Car(5, "Toyota", "900x", 2005, "Yellow", 100, "re0 xyz");
        cars[6] = new Car(5, "Toyota", "100x", 2022, "Black", 1000, "re3 xyz");
        cars[7] = new Car(5, "Mazda", "200x", 2011, "Blue", 800, "re2 xyz");
        cars[8] = new Car(5, "Toyota", "300x", 2019, "Violet", 600, "re1 xyz");
        cars[9] = new Car(5, "Toyota", "1100x", 2009, "Black", 500, "re4 xyz");
        return cars;
    }
}
