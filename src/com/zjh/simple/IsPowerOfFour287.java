package com.zjh.simple;

public class IsPowerOfFour287 {
    public static void main(String[] args) {
        boolean powerOfFour = new IsPowerOfFour287().isPowerOfFour(5);
        System.out.println(powerOfFour);
    }

    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }
}
