package com.zjh.simple;

public class MaxProfit121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int i = new MaxProfit121().maxProfit(prices);
        System.out.println(i);
    }

    public int maxProfit(int[] prices) {
//        int[] dp = new int[prices.length];
//        dp[0] = prices[0];
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
//            dp[i] = Math.min(dp[i - 1], prices[i]);
//            maxProfit = Math.max(prices[i] - dp[i - 1], maxProfit);
            maxProfit = Math.max(prices[i] - minPrice, maxProfit);
            minPrice = Math.min(prices[i], minPrice);
        }
        return maxProfit;
    }

//    public int maxProfit(int[] prices) {
//        int maxProfit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                maxProfit = Math.max(prices[j] - prices[i], maxProfit);
//            }
//        }
//        return maxProfit;
//    }
}
