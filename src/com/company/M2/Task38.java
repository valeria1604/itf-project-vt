package com.company.M2;

public class Task38 {
    public static void main(String[] args) {
        System.out.println("makeFullName(Exor, Max): " + makeFullName("Exor", "Max"));
    }

    public static String makeFullName(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            return "";
        }
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }
}
