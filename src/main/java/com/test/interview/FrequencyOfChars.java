package com.test.interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String s = "This is a test string";
        System.out.println("Frequency: " +findFrequency(s));

    }
    public static Map<Character,Long> findFrequency(String s) {
        return s.replaceAll("\\s+", "")
                .chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }
}
