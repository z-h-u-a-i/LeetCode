package com.zjh.simple;

import java.util.HashMap;

public class LongestCommonPre {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(new LongestCommonPre().longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        String res = strs[0];
        for(int i = 1; i < strs.length; i++) {
            res = findPre(res, strs[i]);
            //如果res在寻找过程中已经为空，删除
            if(res.equals("")) {
                break;
            }
        }
        return res;
    }

    //寻找两个字符串之间一样的前缀
    public String findPre(String s1, String s2) {
        int minLen = Math.min(s1.length(), s2.length());
        int index = 0;
        for(int i = 0; i < minLen; i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                break;
            }
            index++;
        }
        return s1.substring(0, index);
    }
}
