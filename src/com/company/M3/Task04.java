package com.company.M3;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int earthAge = scanner.nextInt();
        createForms(name, surname, earthAge);
    }

    public static void createForms(String name, String surname, int earthAge) {
        int moonAge = earthAge * 10;
        System.out.println(name + " " + surname + " " + moonAge + " ");
        System.out.println(name.toUpperCase() + "\n" + surname.toUpperCase() + "\n" + moonAge);
    }
}