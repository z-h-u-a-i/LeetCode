package com.zjh.medium;

import java.util.*;
import java.util.stream.Collectors;

public class Permute46 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permute = new Permute46().permute(nums);
        System.out.println(permute);
    }

    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Map<Integer, Boolean> visited = new HashMap<>();
        for (int num : nums) {
            visited.put(num, false);
        }
        backFlash(nums, visited, new ArrayList<>(), res);
        return res;
    }

    public void backFlash(int[] nums, Map<Integer, Boolean> visited, List<Integer> cur, List<List<Integer>> res) {
        if (cur.size() == nums.length) {
            List<Integer> copy = new ArrayList<>(cur);
            res.add(copy);
            return;
        }

        for (int num : nums) {
            if (Boolean.FALSE.equals(visited.get(num))) {
                cur.add(num);
                visited.put(num, true);
                backFlash(nums, visited, cur, res);
                cur.remove(cur.size() - 1);
                visited.put(num, false);
            }
        }
    }
}
