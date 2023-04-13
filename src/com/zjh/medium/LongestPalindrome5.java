package com.zjh.medium;

public class LongestPalindrome5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("上海自来水来自海上"));
    }

    //答案：并不是说最后一个格子一定是最后的最优值，也可以边计算子问题边拿变量来计算最优值，格局打开
    public static String longestPalindrome2(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        // dp[i][j] 表示 s[i..j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        // 初始化：所有长度为 1 的子串都是回文串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();
        // 递推开始
        // 先枚举子串长度
        for (int L = 2; L <= len; L++) {
            // 枚举左边界，左边界的上限设置可以宽松一些
            for (int i = 0; i < len; i++) {
                // 由 L 和 i 可以确定右边界，即 j - i + 1 = L 得
                int j = L + i - 1;
                // 如果右边界越界，就可以退出当前循环
                if (j >= len) {
                    break;
                }

                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                // 只要 dp[i][L] == true 成立，就表示子串 s[i..L] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    //动态规划解决
    public static String longestPalindrome(String s) {
        if (isHuiWen(s)) {
            return s;
        }
        if (s == null || s.equals("")) {
            return null;
        }
        int[][] subproblem = new int[s.length() + 1][s.length() + 1];
//        int[][] begin = new int[s.length() + 1][s.length() + 1];
//        int[][] end = new int[s.length() + 1][s.length() + 1];
        int b = 0;
        int maxLen = 1;
        //先解决最小子问题：一个字符时，都是回文数，两个字符时，都不是回文
        for (int i = 1; i <= s.length(); i++) {
            subproblem[i][i] = 1;
//            begin[i][i] = i;
//            end[i][i] = i;
        }
        //解决其他问题(对角线遍历)
        for (int r = 2; r <= s.length(); r++) {//第几条对角线
            for (int i = 1; i <= s.length() - r + 1; i++) { //行下标
                int j = i + r - 1;//列下标
                //subproblem[i + 1][j] == r - 2时自身才可能是回文
                if (subproblem[i + 1][j - 1] == r - 2 && s.charAt(i - 1) == s.charAt(j - 1) /*isHuiWen(s.substring(i - 1, j))*/) {
                    subproblem[i][j] = r;
//                    begin[i][j] = i;
//                    end[i][j] = j;
                    if (j - i + 1 > maxLen) {
                        b = i - 1;
                        maxLen = j - i + 1;
                    }
                } else {
                    //自身不是回文
                    if (subproblem[i + 1][j] >= subproblem[i][j - 1]) {
                        subproblem[i][j] = subproblem[i + 1][j];
//                        begin[i][j] = begin[i + 1][j];
//                        end[i][j] = end[i + 1][j];
                    } else {
                        subproblem[i][j] = subproblem[i][j - 1];
//                        begin[i][j] = begin[i][j - 1];
//                        end[i][j] = end[i][j - 1];
                    }
                }
            }
        }
        //return s.substring(begin[1][s.length()] - 1, end[1][s.length()]);
        return s.substring(b, b + maxLen);
    }

    public static boolean isHuiWen(String s) {
        char[] charArray = s.toCharArray();
        boolean flag = true;
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
