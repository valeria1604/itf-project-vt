package com.company.M3;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = scanner.nextInt();
        createForms(name, surname, age);
    }

    public static void createForms(String name, String surname, int age) {
        System.out.println(name + " " + surname + " " + (age * 10) + " ");
        System.out.println(name.toUpperCase() + "\n" + surname.toUpperCase() + "\n" + age * 10);
    }
}
