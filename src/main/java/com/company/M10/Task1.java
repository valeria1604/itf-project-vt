package com.company.M10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        String fileName = "file.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (isValidPhoneNumber(line)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(isValidPhoneNumber("987-123-4567"));
//        System.out.println(isValidPhoneNumber("123 456 7890"));
//        System.out.println(isValidPhoneNumber("(123) 456-7890"));
    }

    public static boolean isValidPhoneNumber(String phoneNumber){
        return (phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}") || phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}"));
    }
}