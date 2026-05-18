package com.test.interview;

import java.awt.print.PrinterGraphics;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfEven {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println("Sum of even numbers: " +sumofEven(nums));
        separateEvenAndOdd(nums);
    }

    private static int sumofEven(int[] nums) {
        return Arrays.stream(nums)
                .filter(n->n%2 == 0)
                .sum();
    }

    private static void separateEvenAndOdd(int[] nums) {
        Map<Boolean, List<Integer>> list =  IntStream.of(nums)
                .boxed()
                .collect(Collectors.partitioningBy(n->n%2==0));

        System.out.println("Even: " +list.get(true));
        System.out.println("Odd: " +list.get(false));
    }
}
