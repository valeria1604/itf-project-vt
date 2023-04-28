package com.company.OOP.start.task1;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.println(printer.print("string"));
        System.out.println(printer.print(4));
        System.out.println(printer.print(4.7));
        System.out.println(printer.print("string", 4));
        System.out.println(printer.print(new String[]{"a", "b", "c"}));
    }
}