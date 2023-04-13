package com.zjh.simple;

public class IncrementTheArray1827 {
    public static void main(String[] args) {
        int[] nums = {8};
        System.out.println(minOperations(nums));
    }

    public static int minOperations(int[] nums) {
        int res = 0;
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                temp = nums[i - 1] - nums[i] + 1;
                nums[i] += temp;
                res += temp;
            }
        }
        return res;
    }
}
