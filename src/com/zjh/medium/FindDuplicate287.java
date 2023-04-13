package com.zjh.medium;

import java.util.HashSet;

public class FindDuplicate287 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};
        int duplicate = new FindDuplicate287().findDuplicate(nums);
        System.out.println(duplicate);
    }

    public int findDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                return nums[i];
            } else {
                hashSet.add(nums[i]);
            }
        }
        return -1;
    }

}
