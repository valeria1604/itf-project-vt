package com.company.M3;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticket = scanner.nextInt();
        System.out.println(getMyPrizes(ticket));
    }

    public static String getMyPrizes(int ticket) {
        String[] prizes = new String[3];
        if (ticket % 10 == 0) {
            prizes[0] = "crystal";
        }
        if (ticket % 10 == 7) {
            prizes[1] = "chip";
        }
        if (ticket > 200) {
            prizes[2] = "coin";
        }
        String result = "";
        for (String prize : prizes) {
            if (prize != null) {
                result += prize + " ";
            }
        }
       // result = String.join(" ", prizes);
        return result;
    }
}
