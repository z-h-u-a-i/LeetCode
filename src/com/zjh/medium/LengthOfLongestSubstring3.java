package com.zjh.medium;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstring3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println(length);
    }

    public static int lengthOfLongestSubstring(String s) {
        List<Character> substring = new ArrayList<>();
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            Character target = s.charAt(i);
            if (substring.contains(target)) {
                int index = substring.indexOf(target);
                for (int j = 0; j <= index; j++) {
                    substring.remove(0);
                }
            }
            substring.add(target);
            if (substring.size() > maxLen) {
                maxLen = substring.size();
            }
        }
        return maxLen;
    }
}
