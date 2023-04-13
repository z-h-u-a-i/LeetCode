package com.zjh.simple;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        new MoveZeroes283().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 输入: nums = [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;//找非0
        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        for (int x = i; x < nums.length; x++) {
            nums[x] = 0;
        }
    }
//    public void moveZeroes(int[] nums) {
//        int step = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    step++;
//                    if (nums[j] != 0) {
//                        nums[j - step] = nums[j];
//                        nums[j] = 0;
//                        step = 0;
//                        break;
//                    }
//                }
//            }
//        }
//    }
}
