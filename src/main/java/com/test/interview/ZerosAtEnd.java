package com.test.interview;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ZerosAtEnd {
    public static int[] appendZeros(int[] nums) {
        return IntStream.concat(
                Arrays.stream(nums)
                        .filter(num -> num !=0),
                Arrays.stream(nums)
                        .filter(num -> num ==0)
        ).toArray();
    }

    public static int[] appendZerosLegacy(int[] nums){
        int index=0;
        for(int num:nums) {
            if(num != 0) {
                nums[index++] = num;
            }
        }
        while(index < nums.length) {
            nums[index++] = 0;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,2,0,3,0,4,0};
        System.out.println("Zeros appended:" + Arrays.toString(appendZerosLegacy(nums)));
        //System.out.println("Zeros appended:" + Arrays.toString(appendZeros(nums)));
    }
}
