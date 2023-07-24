package com.company.M10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static final String SPACE = " ";
    public static final int NAME_PLACE = 0;
    public static final int AGE_PLACE = 1;
    public static final int TWO_VALUES = 2;

    public static void main(String[] args) {
        String inputFileName = "file.txt";
        String outputFileName = "user.json";

        List<User> users = readFromFile(inputFileName);
        writeToFile(outputFileName, users);
    }

    private static List<User> readFromFile(String inputFileName) {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(SPACE);
                if (data.length == TWO_VALUES) {
                    users.add(new User(data[NAME_PLACE], Integer.parseInt(data[AGE_PLACE])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    private static void writeToFile(String outputFileName, List<User> users) {
//        Gson gson = new Gson();
//        try {
//            gson.toJson(users, new FileWriter(outputFileName));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}