package com.test.interview;

import java.util.stream.IntStream;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println("Is " +s+ " palindrome: " +isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("\\s+", "");
        return IntStream.range(0, s1.length()/2)
                .allMatch(i -> s1.charAt(i) ==s1.charAt(s1.length()-1-i));
    }
}
