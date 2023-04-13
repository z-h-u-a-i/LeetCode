package com.zjh.simple;

import java.util.HashSet;

public class MissingNumber268 {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int i = new MissingNumber268().missingNumber(nums);
        System.out.println(i);
    }

    public int missingNumber(int[] nums) {
        int total = nums.length * (nums.length + 1) / 2;//等差数列求和，首位加末尾乘以项数除以二
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return total - sum;
    }

//    public int missingNumber(int[] nums) {
//        HashSet<Integer> hashSet = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            hashSet.add(nums[i]);
//        }
//        for (int i = 0; i <= nums.length; i++) {
//            if (!hashSet.contains(i)) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
