package com.zjh.simple;

public class FindMaxConsecutiveOnes485 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        int maxConsecutiveOnes = new FindMaxConsecutiveOnes485().findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cur++;
            }else {
                max = Math.max(cur, max);
                cur = 0;
            }
        }
        max = Math.max(cur, max);
        return max;
    }
}
