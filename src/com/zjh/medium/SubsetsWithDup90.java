package com.zjh.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubsetsWithDup90 {
    public static void main(String[] args) {
        int[] nums = {4, 4, 4, 1, 4};
        List<List<Integer>> lists = new SubsetsWithDup90().subsetsWithDup(nums);
        System.out.println(lists);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        dfs(res, cur, 0, nums);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> cur, int begin, int[] nums) {
        res.add(new ArrayList<>(cur));
        for (int i = begin; i < nums.length; i++) {
            if (i > begin && nums[i] == nums[i - 1]) {
                continue;
            }
            cur.add(nums[i]);
            dfs(res, cur, i + 1, nums);
            cur.remove(cur.size() - 1);
        }
    }
}
