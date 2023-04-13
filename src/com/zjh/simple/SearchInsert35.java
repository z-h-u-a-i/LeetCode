package com.zjh.simple;

public class SearchInsert35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int i = new SearchInsert35().searchInsert(nums, 3);
        System.out.println(i);
    }

    public int searchInsert(int[] nums, int target) {
        return binarySearch(target, 0, nums.length, nums);
    }

    public int binarySearch(int target, int left, int right, int[] nums) {
        if (left >= right) {
            if (left < nums.length) {
                return target > nums[left] ? left + 1 : left;
            }
            return left;
        }
        int mid = (left + right) / 2;
        if (target > nums[mid]) {
            return binarySearch(target, mid + 1, right, nums);
        } else if (target < nums[mid]) {
            return binarySearch(target, left, mid - 1, nums);
        } else {
            return mid;
        }
    }
}
