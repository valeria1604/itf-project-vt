package com.company.OOP.start.task3;

import java.util.LinkedList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Car[] cars = CarSupplier.supply();
        System.out.println("1 task");
        System.out.println(createListBySpecificBrand("Mazda", cars));
        System.out.println("2 task");
        System.out.println(createListWithModelWhichWorksMoreThan(10, cars));
        System.out.println("3 task");
        System.out.println(createListBySpecificIssueYearAndPriceMoreThan(2022, 800, cars));
    }

    public static LinkedList<Car> createListBySpecificBrand(String brand, Car[] cars) {
        LinkedList<Car> carsWithSpecificBrand = new LinkedList<Car>();
        for (Car car : cars) {
            if (Objects.equals(car.getBrand(), brand)) {
                carsWithSpecificBrand.add(car);
            }
        }
        return carsWithSpecificBrand;
    }

    public static LinkedList<Car> createListWithModelWhichWorksMoreThan(int years, Car[] cars) {
        LinkedList<Car> carsWithModel = new LinkedList<Car>();
        for (Car car : cars) {
            if (2023 - car.getIssueYear() >= years) {
                carsWithModel.add(car);
            }
        }
        return carsWithModel;
    }

    public static LinkedList<Car> createListBySpecificIssueYearAndPriceMoreThan(int issueYear, int price, Car[] cars) {
        LinkedList<Car> carsWithSpecificIssueYearAndPrice = new LinkedList<Car>();
        for (Car car : cars) {
            if (Objects.equals(car.getIssueYear(), issueYear) && car.getPrice() > price) {
                carsWithSpecificIssueYearAndPrice.add(car);
            }
        }
        return carsWithSpecificIssueYearAndPrice;
    }
}
