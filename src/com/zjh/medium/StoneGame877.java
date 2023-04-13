package com.zjh.medium;

public class StoneGame877 {
    public static void main(String[] args) {
        int[] arr = {3,7,2,3};
        boolean b = new StoneGame877().stoneGame(arr);
        System.out.println(b);
    }
    public boolean stoneGame(int[] piles) {
        int len = piles.length;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = piles[i];
        }
        int x,y;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                x = j;
                y = i + j;
                //为什么是减法？因为选了这一个就说明当前玩家有piles[x或y]分，剩下的数字就是下一个玩家与当前
                //玩家的最大分差，是与当前玩家的最大分差相反的，因此要减去dp[x + 1][y]
                dp[x][y] = Math.max(piles[x] - dp[x + 1][y], piles[y] - dp[x][y - 1]);
            }
        }
        return dp[0][len - 1] > 0;
    }
}
