package com.zjh.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Combine77 {
    public static void main(String[] args) {
        List<List<Integer>> combine = new Combine77().combine(4, 2);
        combine.forEach(System.out::println);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Map<Integer, Boolean> isVisited = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            isVisited.put(i, false);
        }
        flashBack(res, cur, isVisited, n, k, 1);
        return res;
    }

    public void flashBack(List<List<Integer>> res, List<Integer> cur,Map<Integer, Boolean> isVisited, int n, int k, int begin) {
        if (cur.size() == k) {
            ArrayList<Integer> copy = new ArrayList<>(cur);
            res.add(copy);
            return;
        }
        for (int i = begin; i <= n; i++) {
            if (Boolean.FALSE.equals(isVisited.get(i))) {
                cur.add(i);
                isVisited.put(i, true);
                flashBack(res, cur, isVisited, n, k, i + 1);
                isVisited.put(i, false);
                cur.remove(cur.size() - 1);
            }
        }
    }
}
