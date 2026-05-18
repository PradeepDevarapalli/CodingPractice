package com.test.interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,8,9};
        System.out.println("Missing numbers:" +findMissingNumbers(nums));
    }

    private static List<Integer> findMissingNumbers(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt() ;

        Set<Integer> setElements = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        return IntStream.rangeClosed(min, max)
                .filter( n -> !setElements.contains(n))
                .boxed()
                .toList();
    }
}
