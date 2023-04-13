package com.zjh.simple;

public class MaxNumFrom69_1323 {
    public static void main(String[] args) {
        int i = maximum69Number(9996);
        System.out.println(i);
    }

    public static int maximum69Number (int num) {
        String s = num + "";
        return Integer.parseInt(s.replaceFirst("6", "9"));
    }
}
