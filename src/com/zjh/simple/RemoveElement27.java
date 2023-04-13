package com.zjh.simple;

public class RemoveElement27 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int i = removeElement(nums, 2);
        for (int j = 0; j < i; j++) {
            System.out.println(nums[j]);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1, temp;
        while (i <= j) {
            if (nums[i] == val) {
                if (nums[j] != val) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
                j--;
            } else {
                i++;
            }
        }
        return i;
    }
}
