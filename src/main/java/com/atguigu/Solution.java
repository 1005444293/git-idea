package com.atguigu;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] num = new int[]{-4, -2, 0, 0, 5, 6, 9};
        sortNums(num);
        for (int i : num) {
            System.out.println(i);
        }
//        System.out.println();
    }

    public static int[] sortNums(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
