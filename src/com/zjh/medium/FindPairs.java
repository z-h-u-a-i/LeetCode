package com.zjh.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,4,4,3,3,0,9,2,3};
        System.out.println(findPairs(nums, 3));
    }

    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int anotherNumIndex = binarySearch(0, nums.length - 1, nums, k + nums[i]);
            if (anotherNumIndex != -1 && i != anotherNumIndex) {
                map.put(nums[i], nums[anotherNumIndex]);
            }
        }
        return map.size();
    }

    public static int binarySearch(int left, int right, int[] nums, int val) {
        if (left > right ) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (val > nums[mid]) {
            return binarySearch(mid + 1, right, nums, val);
        } else if (val < nums[mid]) {
            return binarySearch(left, mid - 1, nums, val);
        } else {
            return mid;
        }
    }
}
