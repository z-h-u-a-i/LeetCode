package com.zjh.simple;

import java.util.Arrays;

public class Merge88 {
    public static void main(String[] args) {
        int[] num1 = {-1, 0, 1, 1, 0, 0, 0, 0, 0};
        int[] num2 = {-1, 0, 2, 2, 3};
        new Merge88().merge(num1, 4, num2, 5);
        System.out.println(Arrays.toString(num1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int tail = nums1.length - 1;
        int cur;
        while (i >= 0 || j >= 0) {
            if (i == -1) {
                cur = nums2[j--];
            } else if (j == -1) {
                cur = nums1[i--];
            } else if (nums1[i] > nums2[j]) {
                cur = nums1[i--];
            } else {
                cur = nums2[j--];
            }
            nums1[tail--] = cur;
        }
    }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int k;
//        for (int i = 0; i < n; i++) {
//            int num1Len = m;
//            for (k = 0; k < num1Len; k++) {
//                if (nums2[i] < nums1[k]) {
//                    insert(nums1, k, nums2[i], m);
//                    m++;
//                    break;
//                }
//            }
//            if (k >= num1Len && k < nums1.length) {
//                nums1[k] = nums2[i];
//                m++;
//            }
//        }
//    }

    public void insert(int[] num1, int index, int num, int m) {
        for (int i = m - 1; i != index - 1; i--) {
            num1[i + 1] = num1[i];
        }
        num1[index] = num;
    }
}
