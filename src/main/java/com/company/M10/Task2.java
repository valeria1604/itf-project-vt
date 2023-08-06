package com.company.M10;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static final String DELIMITER = " ";
    public static final int NAME_INDEX = 0;
    public static final int AGE_INDEX = 1;
    public static final int COLUMNS_COUNT = 2;

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
                String[] data = line.split(DELIMITER);
                if (data.length == COLUMNS_COUNT) {
                    users.add(new User(data[NAME_INDEX], Integer.parseInt(data[AGE_INDEX])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    private static void writeToFile(String outputFileName, List<User> users) {
        Gson gson = new Gson();
        try {
            gson.toJson(users, new FileWriter(outputFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}