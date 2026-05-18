package com.test.interview;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String s = "This is a test String";
        System.out.println("Non repeating char: " +nonRepeating(s));
    }

    public static List<Character> nonRepeating(String s) {
        return s.replaceAll("\\s+", "").chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() != 1)
                .map(Map.Entry::getKey)
                .toList();

    }
}
