package com.zjh.simple;

public class ClimbStairs70 {
    public static void main(String[] args) {
        int i = new ClimbStairs70().climbStairs(44);
        System.out.println(i);
    }

    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

//    public int backTracking(int n, int step) {
//        if (step == n) {
//            return 1;
//        } else if (step > n) {
//            return 0;
//        }
//        int one = backTracking(n, step + 1);
//        int two = backTracking(n, step + 2);
//        return one + two;
//    }
}
