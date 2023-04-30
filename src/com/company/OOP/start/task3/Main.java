package com.company.OOP.start.task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static final int APPLICATION_START = 2023;
    public static final int FIRST_CAR_ISSUE_YEAR = 1885;

    public static void main(String[] args) {
        Car[] cars = CarSupplier.supply();
        System.out.println(cars[1]);
        System.out.println("1 task: findCarsByBrand by brand Mazda");
        printCars(findCarsByBrand("Mazda", cars));
        System.out.println("2 task: findModelsWithExpMoreThan 10");
        int currentYear = getCurrentYear();
        System.out.println(findModelsWithExpMoreThan(currentYear, 10, cars));
        System.out.println("3 task: findCarsByYearAndPriceMoreThan (2022, 800)");
        printCars(findCarsByYearAndPriceMoreThan(2022, 800, cars));
    }

    private static int getCurrentYear() {
        return LocalDate.now().getYear();
    }

    private static List<Car> findCarsByBrand(String brand, Car[] cars) {
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

    private static List<String> findModelsWithExpMoreThan(int currentYear, int years, Car[] cars) {
        if (years < 0 || currentYear < APPLICATION_START) {
            return Collections.emptyList();
        }
        List<String> models = new ArrayList<>();
        for (Car car : cars) {
            if (currentYear - car.getIssueYear() >= years) {
                models.add(car.getModel());
            }
        }
        return models;
    }

    private static List<Car> findCarsByYearAndPriceMoreThan(int issueYear, int price, Car[] cars) {
        if (issueYear < FIRST_CAR_ISSUE_YEAR || price == 0) {
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

    private static void printCars(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}