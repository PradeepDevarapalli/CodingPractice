package com.test.interview;

import java.util.Comparator;
import java.util.List;

public class SortByLength {
    public static void main(String[] args) {
        List<String> names = List.of("Pradeep", "Navya", "Buddi", "Mittu");
        System.out.println("Sorted names:" +sortByLength(names));
    }

    public static List<String> sortByLength(List<String> names) {
        return names.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .toList();
    }
}
