package com.test.interview;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] input) {
        Set<Integer> setInteger = new HashSet<>();
        return Arrays.stream(input)
                .filter(n -> !setInteger.add(n))
                .distinct()
                .boxed()
                //.mapToInt(Integer::intValue)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,1,2,3,4,5};
        System.out.println("Duplicate numbers: " +findDuplicates(nums));
    }
}
