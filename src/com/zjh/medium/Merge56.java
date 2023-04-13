package com.zjh.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge56 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {2, 3}};
        int[][] merge = new Merge56().merge(intervals);
        for (int[] ints : merge) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        List<int[]> resList = new ArrayList<>();
        for (int[] interval : intervals) {
            if (resList.isEmpty() || interval[0] > resList.get(resList.size() - 1)[1]) {
                resList.add(interval);
            } else {
                resList.get(resList.size() - 1)[1] = Math.max(interval[1], resList.get(resList.size() - 1)[1]);
            }
        }
        return resList.toArray(new int[resList.size()][2]);
    }
}
