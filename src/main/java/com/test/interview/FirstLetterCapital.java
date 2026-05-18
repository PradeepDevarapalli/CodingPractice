package com.test.interview;

import java.util.List;

public class FirstLetterCapital {
    public static void main(String[] args) {
        List<String> cities = List.of("dallas", "irving", "plano");
        System.out.println("Transformed cities: " +transformCities(cities));
    }

    public static List<String> transformCities(List<String> cities) {
        return cities.stream()
                .map(city -> city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase())
                .toList();
    }
}
