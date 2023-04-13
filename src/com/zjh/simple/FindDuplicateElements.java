package com.zjh.simple;

import java.util.HashMap;
import java.util.Map;


public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 1, 4, 8, 2, 7, 5, 4, 10, 6, 5, 9};
        method2(arr);
        System.out.println();
        method1(arr);
    }

    //计数再输出(利用List、Map计数都可以) 时间复杂度：O(n)
    public static void method2(int[] arr) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : arr) {
            if (counter.containsKey(num)) {
                counter.put(num, counter.get(num) + 1);
            } else {
                counter.put(num, 1);
            }
        }
        System.out.print("计数器方式输出：");
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() > 1) {
                int tmp = entry.getValue();
                while (tmp-- > 0) {
                    System.out.print(entry.getKey() + "  ");
                }
            }
        }
    }

    //双重for  时间复杂度：O(n^2)
    public static void method1(int[] arr) {
        int[] isVisited = new int[arr.length];
        System.out.print("双重for方式输出：");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i] && isVisited[j] == 0) {
                    System.out.print(arr[j] + "  ");
                    isVisited[j] = 1;
                    if (isVisited[i] == 0) {
                        System.out.print(arr[i] + "  ");
                        isVisited[i] = 1;
                    }
                }
            }
        }
    }
}
