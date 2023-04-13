package com.zjh.medium;

import java.util.Arrays;

public class MinMoves462 {
    public static void main(String[] args) {
        int[] nums = {1,10,2,9};
        System.out.println(minMoves2(nums));
    }

    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        if (nums.length % 2 != 0)  {
            int med = nums.length / 2;
            for (int i = 0, j = nums.length - 1; i != j; i++, j--) {
                res += nums[med] - nums[i];
                res += nums[j] - nums[med];
            }
        } else {
            int med1 = nums.length / 2;
            int med2 = nums.length / 2 - 1;
            int res1 = 0, res2 = 0;
            for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
                res1 += nums[med1] - nums[i];
                res1 += nums[j] - nums[med1];
            }
            for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
                res2 += nums[med2] - nums[i];
                res2 += nums[j] - nums[med2];
            }
            res = Math.min(res1, res2);
        }
        return res;
    }
}
