package com.zjh.medium;

public class NthUglyNumber264 {
    public static void main(String[] args) {
        int i = new NthUglyNumber264().nthUglyNumber(10);
        System.out.println(i);
    }

    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int p1 = 0;//乘2
        int p2 = 0;//乘3
        int p3 = 0;//乘5
        int num1, num2, num3;
        for (int i = 1; i < n; i++) {
            num1 = dp[p1] * 2;
            num2 = dp[p2] * 3;
            num3 = dp[p3] * 5;
            dp[i] = Math.min(Math.min(num1, num2), num3);
            if (dp[i] == num1) {
                p1++;
            }
            if (dp[i] == num2) {
                p2++;
            }
            if (dp[i] == num3) {
                p3++;
            }
        }
        return dp[n - 1];
    }
}
