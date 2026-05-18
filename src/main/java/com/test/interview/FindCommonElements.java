package com.test.interview;

import java.util.List;

public class FindCommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,0,9,8);
        List<Integer> list2 = List.of(4,5,7,0,9,8);

        System.out.println("Common elements: " +findCommon(list1, list2));

    }

    private static List<Integer> findCommon(List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                .filter(list2::contains)
                .toList();
    }
}
