package com.zjh.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDisappearedNumbers448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = new FindDisappearedNumbers448().findDisappearedNumbers(nums);
        System.out.println(disappearedNumbers);
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                res.add(i + 1);
            }
        }
        return res;
    }
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        HashSet<Integer> hashSet = new HashSet<>();
//        for (int i = 1; i <= nums.length; i++) {
//            hashSet.add(i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            hashSet.remove(nums[i]);
//        }
//        return new ArrayList<>(hashSet);
//    }
}
