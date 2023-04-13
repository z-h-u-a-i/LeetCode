package com.zjh.medium;


public class MaxSubArray53 {
    public static void main(String[] args) {
        int[] nums = {-2, 1};
        int res = new MaxSubArray53().maxSubArray(nums);
        System.out.println(res);
    }

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i], nums[i] + nums[i - 1]);
            res = Math.max(nums[i], res);
        }

        for (int ints : nums) {
            System.out.print(ints + "\t");
        }
        return res;
    }
}
