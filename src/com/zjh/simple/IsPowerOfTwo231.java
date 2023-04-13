package com.zjh.simple;

public class IsPowerOfTwo231 {
    public static void main(String[] args) {
        System.out.println(new IsPowerOfTwo231().isPowerOfTwo(5));
    }

    public boolean isPowerOfTwo(int n) {
        int start = 0;
        int end = 31;
        while(end >= start) {
            int mid = (start + end) / 2;
            double pow = Math.pow(2.0, mid);
            if (pow > n) {
                end = mid - 1;
            } else if (pow < n) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
