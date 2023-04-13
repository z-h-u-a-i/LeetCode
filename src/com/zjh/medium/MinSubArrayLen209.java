package com.zjh.medium;

import java.util.Arrays;

public class MinSubArrayLen209 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 11;
        int i = new MinSubArrayLen209().minSubArrayLen(target, nums);
        System.out.println(i);
    }

    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int total = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;

        while (end < nums.length) {
            total += nums[end];
            while (total >= target) {
                minLength = Math.min(minLength, end - start + 1);
                total -= nums[start];
                start++;
            }
            end++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

//    public int minSubArrayLen(int target, int[] nums) {
//        int minLength = 0;
//        int[][] m = new int[nums.length + 1][nums.length + 1];
//        for (int i = 1; i < m.length; i++) {
//            m[i][i] = nums[i - 1];
//            if (m[i][i] >= target) {
//                minLength = 1;
//            }
//        }
//        for (int i = 2; i < m.length; i++) {
//            for (int j = 1; j < m.length - i + 1; j++) {
//                int x = i + j - 1;
//                m[x][j] = m[x - 1][j] + m[x][x];
//                if (m[x][j] >= target) {
//                    if (minLength == 0) {
//                        minLength = x - j + 1;
//                    } else {
//                        minLength = Math.min(minLength, x - j + 1);
//                    }
//                }
//            }
//        }
//
//        for (int[] ints : m) {
//            for (int anInt : ints) {
//                System.out.print(anInt);
//                System.out.print('\t');
//            }
//            System.out.println();
//        }
//        return minLength;
//    }
}
