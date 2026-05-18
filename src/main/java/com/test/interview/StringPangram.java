package com.test.interview;

import java.util.HashSet;
import java.util.Set;

public class StringPangram {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Is " +s+ " is pangram: " +checkPangram(s));

    }

    private static boolean checkPangram(String s) {
        String lowerCase = s.toLowerCase();
        Set<Character> charSet = new HashSet<>();

        for(char c: lowerCase.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                charSet.add(c);
            }
        }
        return charSet.size() == 26;
    }
}
