package com.zjh.medium;

import java.util.Arrays;

public class MajorityElement169 {
    public static void main(String[] args) {
        int[] nums = {1};
        int i = new MajorityElement169().majorityElement(nums);
        System.out.println(i);
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }


//    public int majorityElement(int[] nums) {
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        Map<Integer, Integer> hashMap = new HashMap<>();
//        int num;
//        Integer frequency;
//        for (int i = 0; i < nums.length; i++) {
//            num = nums[i];
//            frequency = hashMap.get(num);
//            if (frequency == null) {
//                hashMap.put(num, 1);
//            } else if (frequency + 1 > nums.length / 2) {
//                return num;
//            } else {
//                hashMap.put(num, frequency + 1);
//            }
//        }
//        return -1;
//    }
}
