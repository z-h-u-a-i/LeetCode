package com.zjh.simple;

public class IsSubsequence392 {
    public static void main(String[] args) {
        boolean subsequence = new IsSubsequence392().isSubsequence("axc", "ahbgdc");
        System.out.println(subsequence);
    }

    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (int k = 0; k < t.length(); k++) {
            if (i < s.length() && t.charAt(k) == s.charAt(i)) {
                i++;
            }
        }
        return i == s.length();
    }
}
