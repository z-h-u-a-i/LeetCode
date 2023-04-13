package com.zjh.simple;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatedNTimes961 {
    public static void main(String[] args) {
        int[] nums = {2,1,2,5,3,2};
        System.out.println(repeatedNTimes(nums));
    }

    public static int repeatedNTimes(int[] nums) {
        //除了重复的元素，其他元素都只出现一次
        HashSet<Integer> count = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!count.add(nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }

//    public static int repeatedNTimes(int[] nums) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            Integer count = hashMap.get(nums[i]);
//            if (count == null) {
//
//                hashMap.put(nums[i], 1);
//            } else {
//                hashMap.put(nums[i], count + 1);
//            }
//        }
//
//        Set<Map.Entry<Integer, Integer>> entrySet = hashMap.entrySet();
//        for (Map.Entry<Integer, Integer> entry : entrySet) {
//            if (entry.getValue() == nums.length / 2) {
//                return entry.getKey();
//            }
//        }
//        return -1;
//    }
}
