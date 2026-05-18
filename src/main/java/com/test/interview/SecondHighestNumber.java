package com.test.interview;

import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> intList = List.of(10,17,16,90,36,90,37,45);
        System.out.println("Second highest number is: " +findSecondHighest(intList));
    }

    public static int findSecondHighest(List<Integer> input){
        return input.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);
    }
}
