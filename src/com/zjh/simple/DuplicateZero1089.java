package com.zjh.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateZero1089 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    //使用双指针来解决
    public static void duplicateZero(int[] arr) {
        int i = -1;//用i记录最后一个需要留下的元素下标
        int top = 0;
        while(top < arr.length) {
            i++;
            if (arr[i] == 0) {
                top += 2;
            } else {
                top++;
            }
        }
        int j = arr.length - 1;
        if (top == arr.length + 1) {
            arr[j] = 0;
            j--;
            i--;
        }
        while (j >= 0) {
            arr[j] = arr[i];
            j--;
            if (arr[i] == 0) {
                arr[j] = 0;
                j--;
            }
            i--;
        }
    }


    //使用了额外空间来解决
//    public static void duplicateZero(int[] arr) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length && list.size() < arr.length; i++) {
//            if (arr[i] == 0) {
//                list.add(0);
//                list.add(0);
//            } else {
//                list.add(arr[i]);
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = list.get(i);
//        }
//    }

}
