package com.zjh.medium;

import java.util.*;
import java.util.stream.Collectors;

public class Insert57 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] insert = new Insert57().insert(intervals, newInterval);
        for (int[] ints : insert) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    //贪心法
//    public int[][] insert(int[][] intervals, int[] newInterval) {
//        List<int[]> res = new ArrayList<>();
//        int i;
//        for (i = 0; i < intervals.length; i++) {
//             if (intervals[i][1] <= newInterval[0]) {
//                 add(res, intervals[i]);
//             } else {
//                 if (res.isEmpty()) {
//                     add(res, intervals[i]);
//                 } else if (res.size() == intervals.length - 1) {
//                     break;
//                 } else {
//                     add(res, intervals[i]);
//                 }
//                 break;
//             }
//        }
//        add(res, newInterval);
//        for (int j = i; j < intervals.length; j++) {
//            add(res, intervals[j]);
//        }
//        return res.toArray(new int[res.size()][2]);
//    }
//
//    public void add(List<int[]> res, int[] interval) {
//        if (res.isEmpty() || interval[0] > res.get(res.size() - 1)[1]) {
//            res.add(interval);
//        } else {
//            res.get(res.size() - 1)[1] = Math.max(interval[1], res.get(res.size() - 1)[1]);
//        }
//    }


    //排序法
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> intsList = Arrays.stream(intervals).sequential().collect(Collectors.toList());
        intsList.add(newInterval);
        int[][] inserted = intsList.toArray(new int[intsList.size()][2]);
        return merge(inserted);

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
