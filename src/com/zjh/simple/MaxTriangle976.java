package com.zjh.simple;

import java.util.Arrays;

public class MaxTriangle976 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(new MaxTriangle976().largestPerimeter(arr));
    }
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        //贪心
        for(int i = nums.length - 1; i >= 2; i--) {
            //如果nums[i]的后面两个数加起来都没有它大，那么再后面的数相加也肯定比他小
            if(nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }
        return 0;
    }
}
