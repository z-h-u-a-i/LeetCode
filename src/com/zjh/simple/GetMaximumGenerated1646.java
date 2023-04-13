package com.zjh.simple;

import java.util.Arrays;

public class GetMaximumGenerated1646 {
    public static void main(String[] args) {
        int i = new GetMaximumGenerated1646().getMaximumGenerated(2);
        System.out.println(i);
    }
    public int getMaximumGenerated(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int max = 1;
        for (int i = 2; i < n + 1; i++) {
            nums[i] = (i % 2 == 0 ? nums[i / 2] : nums[i / 2] + nums[i / 2 + 1]);
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
