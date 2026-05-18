package com.test.interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayConcat {

    public static int[] arrayConcat(int[] a1, int[] a2) {
        return IntStream.concat(
                Arrays.stream(a1), Arrays.stream(a2)
        ).toArray();
    }

    public static void main(String[] args) {
        int[] array1 = {1,3,4,5};
        int[] array2 = {0,9,8};

        System.out.println("Final concatenated array:"+ Arrays.toString(arrayConcat(array1, array2)));
    }
}
