package com.zjh.simple;

public class SplitBalanceString1221 {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        System.out.println( balancedStringSplit(s));
    }

    //从左到右遍历字符串，遇到R就d++,L就d--，若d == 0，则说明该字串是平衡的
    public static int balancedStringSplit(String s) {
        int res = 0, d = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                d++;
            } else {
                d--;
            }
            if (d == 0) {
                res++;
            }
        }
        return res;
    }

    //自己写的O(n方)
//    public static int balancedStringSplit(String s) {
//        int count = 0;
//        StringBuilder temp = new StringBuilder();
//        for (int i = 0; i < s.length() - 1; i += 2) {
//            temp.append(s.substring(i, i + 2));
//            if (isBalance(temp.toString())) {
//                count++;//计数
//                temp.replace(0, temp.length(), "");//temp置空
//            }
//        }
//        return count;
//    }
//
//    public static boolean isBalance(String s) {
//        int lNum = 0, rNum = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'R') {
//                rNum++;
//            } else {
//                lNum++;
//            }
//        }
//        if (rNum == lNum) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
