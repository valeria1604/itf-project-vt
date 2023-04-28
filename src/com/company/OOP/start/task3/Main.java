package com.company.OOP.start.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car[] cars = CarSupplier.supply();
        System.out.println("1 task");
        System.out.println(findCarsByBrand("Mazda", cars));
        System.out.println("2 task");
        System.out.println(findModelsWithExpMoreThan(10, cars));
        System.out.println("3 task");
        System.out.println(findCarsByYearAndPriceMoreThan(2022, 800, cars));
    }

    public static List<Car> findCarsByBrand(String brand, Car[] cars) {
        if (brand == null) {
            return Collections.emptyList();
        }
        List<Car> carsByBrand = new ArrayList<>();
        for (Car car : cars) {
            if (brand.equals(car.getBrand())) {
                carsByBrand.add(car);
            }
        }
        return carsByBrand;
    }

    public static List<String> findModelsWithExpMoreThan(int years, Car[] cars) {
        if (years == 0) {
            return Collections.emptyList();
        }
        List<String> models = new ArrayList<>();
        for (Car car : cars) {
            if (2023 - car.getIssueYear() >= years) {
                models.add(car.getModel());
            }
        }
        return models;
    }

    public static List<Car> findCarsByYearAndPriceMoreThan(int issueYear, int price, Car[] cars) {
        if (issueYear == 0 || price == 0) {
            return Collections.emptyList();
        }
        List<Car> carsByYearAndPrice = new ArrayList<>();
        for (Car car : cars) {
            if (issueYear == car.getIssueYear() && car.getPrice() > price) {
                carsByYearAndPrice.add(car);
            }
        }
        return carsByYearAndPrice;
    }
}
