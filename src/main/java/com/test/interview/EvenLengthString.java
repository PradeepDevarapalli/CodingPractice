package com.test.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EvenLengthString {
    /* Given a string with multiple words separated by spaces,
    find the words that have even lengths.*/

    public static List<String> evenLengthFilter(String inputString) {
        return Arrays.stream(inputString.replace("\\s+", "")
                .split("\\s+"))
                .filter(word -> word.length() %2 ==0)
                .toList();
    }

    public static void main(String[] args) {
        String inputString = "This is a test String";
        System.out.println("Even length words: " +evenLengthFilter(inputString));
    }
}
