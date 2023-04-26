package com.company.OOP.start.task3;

public class CarSupplier {
    public static Car[] supply(){
        Car[] cars = new Car[10];
        cars[0] = new Car(5, "Toyota", "400x", 2014, "Black", 500, "re4 xyz");
        cars[1] = new Car(5, "Mazda", "400x", 2020, "Black", 200, "re4 xyz");
        cars[2] = new Car(5, "Toyota", "400x", 2022, "Black", 900, "re4 xyz");
        cars[3] = new Car(5, "Toyota", "400x", 2011, "Black", 500, "re4 xyz");
        cars[4] = new Car(5, "Mercedes", "400x", 2007, "Black", 200, "re4 xyz");
        cars[5] = new Car(5, "Toyota", "400x", 2005, "Black", 100, "re4 xyz");
        cars[6] = new Car(5, "Toyota", "400x", 2022, "Black", 1000, "re4 xyz");
        cars[7] = new Car(5, "Mazda", "400x", 2011, "Black", 800, "re4 xyz");
        cars[8] = new Car(5, "Toyota", "400x", 2019, "Black", 600, "re4 xyz");
        cars[9] = new Car(5, "Toyota", "400x", 2009, "Black", 500, "re4 xyz");
        return cars;
    }
}
