package com.company.M10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
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
            while ((line = reader.readLine()) != null){
                String[] data = line.split(" ");
                if(data.length == 2){
                    users.add(new User(data[0], Integer.parseInt(data[1])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    private static void writeToFile(String outputFileName, List<User> users) {
//        Gson gson = new Gson();
//        String json = gson.toJson(users);
//        System.out.println(json);
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
//            writer.write(json);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}