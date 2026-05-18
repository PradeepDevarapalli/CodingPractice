package com.test.interview;

import java.util.stream.Stream;

public class StringReverse {
    public static void main(String[] args) {
        String s = "String Reverse";
        System.out.println("Reversed string: " +reverseString(s));
    }

    private static String reverseString(String s) {
        return Stream.of(s.split(" "))
                .reduce("", (p,n) -> n+ " " +p);
    }
}
