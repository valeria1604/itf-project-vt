package com.company.OOP.space_ship;

public class SpaceShip {
    private String name;
    private String serialNumber;

    public void printInfo() {
        System.out.println("Name is " + name + ", serial number is " + serialNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}