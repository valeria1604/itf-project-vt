package com.company.M4;

public class Tasks91417 {
    public static void main(String[] args) {
        //task 9
        System.out.println("Result with only stocks, which price is less than 200: " + getCheapStocks(new String[]{"gun 500", "firebow 70", "sunscreen 30", "pixboom 200"}));
        //task 14
        drawTriangle(4);
        drawTriangle(3);
        //task 17
        System.out.println("Number of banknotes: " + countBanknotes(500));
        System.out.println("Number of banknotes: " + countBanknotes(578));
    }

    public static String getCheapStocks(String[] stocks) {
        StringBuilder result = new StringBuilder();
        for (String stock : stocks) {
            result.append(checkIfLessThan200(stock));
        }
        return result.toString();
    }

    public static String checkIfLessThan200(String stock) {
        String[] parts = stock.split(" ");
        String nameStock = parts[0];
        int priceStock = Integer.parseInt(parts[1]);
        if (priceStock < 200) {
            return nameStock + " ";
        }
        return "";
    }

    public static void drawTriangle(int side) {
        int i = side;
        while (i > 0) {
            System.out.println("*".repeat(i));
            i--;
        }
    }

    public static int countBanknotes(int sum) {
        int count = 0;
        while (sum > 0) {
            if (500 <= sum) {
                sum -= 500;
                count++;
            } else if (200 <= sum) {
                sum -= 200;
                count++;
            } else if (100 <= sum) {
                sum -= 100;
                count++;
            } else if (50 <= sum) {
                sum -= 50;
                count++;
            } else if (20 <= sum) {
                sum -= 20;
                count++;
            } else if (10 <= sum) {
                sum -= 10;
                count++;
            } else if (5 <= sum) {
                sum -= 5;
                count++;
            } else if (2 <= sum) {
                sum -= 2;
                count++;
            } else if (1 <= sum) {
                sum -= 1;
                count++;
            }
        }
        return count;
    }
}
