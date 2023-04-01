package com.company.M2;

public class Task38 {
    public static void main(String[] args) {
        System.out.println("makeFullName(Exor, Max): "+makeFullName("Exor", "Max"));
    }

    public static String makeFullName(String firstName, String lastName){
        firstName = firstName.toLowerCase();
        lastName = lastName.toUpperCase();
        return firstName+" "+lastName;
    }
}
