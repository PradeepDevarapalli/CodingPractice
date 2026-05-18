package com.test.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        String input= "This is a test word word";
        System.out.println("Word Freq: " +checkWordFreq(input));
    }

    private static Map<String, Long> checkWordFreq(String input) {
        return Arrays.stream(input.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}

