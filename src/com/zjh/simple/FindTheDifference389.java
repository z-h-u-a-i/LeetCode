package com.zjh.simple;

import java.util.HashSet;

public class FindTheDifference389 {
    public static void main(String[] args) {
        char theDifference = new FindTheDifference389().findTheDifference("abb", "abbe");
        System.out.println(theDifference);
    }

    public char findTheDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        int sSum = 0;
        for (int i = 0; i < sChars.length; i  ++) {
            sSum += sChars[i];
        }
        char[] tChars = t.toCharArray();
        int tSum = 0;
        for (int i = 0; i < tChars.length; i  ++) {
            tSum += tChars[i];
        }
        return (char) (tSum - sSum);
    }
}
