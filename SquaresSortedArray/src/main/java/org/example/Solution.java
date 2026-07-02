package org.example;

import java.util.Arrays;

public class Solution {

    //Solution (n log n)
    public void nlognSolution() {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString( Arrays.stream(nums).map(num -> num * num).sorted().toArray()));

    }

    public void nSolution() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] output = new int[nums.length];
        int head = 0, tail = nums.length - 1;
        int index = tail;

        while (index >= 0) {
            int squareHead = nums[head] * nums[head];
            int squareTail = nums[tail] * nums[tail];
            if (squareHead >= squareTail) {
                output[index--] = squareHead;
                head++;
            } else {
                output[index--] = squareTail;
                tail--;
            }
        }
        System.out.println(Arrays.toString(output));
    }



}

