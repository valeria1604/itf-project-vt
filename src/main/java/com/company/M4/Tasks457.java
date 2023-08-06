package com.company.M4;
import java.util.Arrays;

public class Tasks457 {
    public static void main(String[] args) {
        //task4
        System.out.println("Min price: " + getMinPriceCount(new int[]{5, 10, 15, 3, 5}));
        System.out.println("Min price: " + getMinPriceCount(new int[]{}));
        //task5
        System.out.println("Result without chosen price: " + Arrays.toString(removePrice(new int[]{150, 100, 200}, 100)));
        System.out.println("Result without chosen price: " + Arrays.toString(removePrice(new int[]{100, 100, 100}, 100)));
        //task7
        System.out.println("Result of merged stocks: " + Arrays.toString(mergeStocks(new String[]{"gun", "bow"}, new String[]{"firegun"})));
        System.out.println("Result of merged stocks: " + Arrays.toString(mergeStocks(new String[]{}, new String[]{})));
    }

    public static int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
        }
        return minPrice;
    }

    public static int[] removePrice(int[] prices, int toRemove) {
        int sizeNewArray = 0;
        for (int price : prices) {
            if (price != toRemove) {
                sizeNewArray++;
            }
        }
        int[] newPrices = new int[sizeNewArray];
        int j = 0;
        for (int price : prices) {
            if (price != toRemove) {
                newPrices[j] = price;
                j++;
            }
        }
        return newPrices;
    }

    public static String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        if (showcaseStocks.length == 0 && warehouseStocks.length == 0) {
            return new String[]{};
        }
        String[] mergedStock = new String[showcaseStocks.length + warehouseStocks.length];
        int i;
        for (i = 0; i < showcaseStocks.length; i++) {
            mergedStock[i] = showcaseStocks[i];
        }
        int j = 0;
        for (i = showcaseStocks.length; i < mergedStock.length; i++) {
            mergedStock[i] = warehouseStocks[j];
            j++;
        }
        return mergedStock;
    }
}