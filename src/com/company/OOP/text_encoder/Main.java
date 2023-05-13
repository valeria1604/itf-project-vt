package com.company.OOP.text_encoder;

public class Main {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        System.out.println("abcd efghu");
        System.out.println(encoder.encodeText("abcd efghu"));

        System.out.println("a1bcd efg!h");
        System.out.println(encoder.encodeText("a1bcd efg!h"));

        System.out.println("!^#*ab");
        System.out.println(encoder.encodeText("!^#*ab"));

        System.out.println("ab!^#*");
        System.out.println(encoder.encodeText("ab!^#*"));

        System.out.println("ab$y%iog 7re*0abcd)");
        System.out.println(encoder.encodeText("ab$y%iog 7re*0abcd)"));
    }
}
