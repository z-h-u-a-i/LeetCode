package com.zjh.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subsets78 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = new Subsets78().subsets(nums);
        System.out.println(subsets);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        for (int i = 0; i < nums.length + 1; i++) {
            flashBack(res, cur, nums, 0, i);
        }
        return res;
    }

    public void flashBack(List<List<Integer>> res, List<Integer> cur, int[] nums, int begin, int len) {
        if (cur.size() == len) {
            res.add(new ArrayList<>(cur));
        }
        for (int i = begin; i < nums.length; i++) {
            cur.add(nums[i]);
            flashBack(res, cur, nums, i + 1, len);
            cur.remove(cur.size() - 1);
        }
    }

//    public void flashBack(List<List<Integer>> res, List<Integer> cur, int[] nums, int begin) {
//        if (!res.contains(cur)) {
//            res.add(new ArrayList<>(cur));
//        }
//        for (int i = begin; i < nums.length; i++) {
//            cur.add(nums[i]);
//            flashBack(res, cur, nums, i + 1);
//            cur.remove(cur.size() - 1);
//        }
//    }
}
