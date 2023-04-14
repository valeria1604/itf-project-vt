package com.company.M4;

public class Tasks91417 {

    public static final int PRODUCT_INDEX = 0;
    public static final int PRICE_INDEX = 1;
    public static final String SEPARATOR = " ";

    public static void main(String[] args) {
        //task 9
        //System.out.println("Result with only stocks, which price is less than 200: " + getCheapStocks(new String[]{"gun 500", "firebow 70", "sunscreen 30", "pixboom 200"}));
        //task 14
        //drawTriangle(4);
        //drawTriangle(3);
        //task 17
        System.out.println("Number of banknotes: " + countBanknotes(500));
        System.out.println("Number of banknotes: " + countBanknotes(578));
        System.out.println("Number of banknotes: " + countBanknotes(1078));
        System.out.println("Number of banknotes: " + countBanknotes(22));
        System.out.println("Number of banknotes: " + countBanknotes(105));
        System.out.println("Number of banknotes: " + countBanknotes(199));
        System.out.println("Number of banknotes: " + countBanknotes(191));
    }

    public static String getCheapStocks(String[] stocks) {
        StringBuilder result = new StringBuilder();
        for (String stock : stocks) {
            result.append(checkIfLessThan200(stock));
        }
        return result.toString();
    }

    public static String checkIfLessThan200(String stock) {
        String[] tokens = stock.split(SEPARATOR);
        String productName = tokens[PRODUCT_INDEX];
        int price = Integer.parseInt(tokens[PRICE_INDEX]);
        return (price < 200)?  productName + SEPARATOR : "";
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
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < banknotes.length; i++) {
            if ((sum / banknotes[i]) > 0) {
                count += sum / banknotes[i];
                sum %= banknotes[i];
            }
        }
        return count;
    }
}
