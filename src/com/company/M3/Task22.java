package com.company.M3;
import java.util.Arrays;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticket = scanner.nextInt();
        System.out.println(getMyPrizes(ticket));
    }

    public static String getMyPrizes(int ticket) {
        String[] prizes = new String[]{"", "", ""};
        int size = 0;
        if (ticket % 10 == 0) {
            prizes[0] = "crystal";
            size++;
        }
        if (ticket % 10 == 7) {
            prizes[1] = "chip";
            size++;
        }
        if (ticket > 200) {
            prizes[2] = "coin";
            size++;
        }
        for (int i = 0; i < size; i++) {
            if(prizes[i].isEmpty()) {
                prizes[i] = prizes[i + 1];
                prizes[i+1]="";
            }
        }
        return (Arrays.toString(prizes).replace("[" , "").replace("]", "").replace("," , ""));
    }
}
