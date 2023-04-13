package com.zjh.simple;

import java.util.ArrayList;
import java.util.Arrays;

public class MatchString942 {
    public static void main(String[] args) {
        int[] res = diStringMatch("DDI");
        System.out.println(Arrays.toString(res));
    }

    public static int[] diStringMatch(String s) {
        int len = s.length();
        ArrayList<Integer> temp = new ArrayList<>();
        int[] res = new int[len + 1];
        for (int i = 0; i <= len; i++) {
            temp.add(i);
        }

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                res[i] = temp.get(0);
                temp.remove(0);
            } else {
                res[i] = temp.get(temp.size() - 1);
                temp.remove(temp.size() - 1);
            }
        }
        res[len] = temp.get(0);
        return res;
    }
}
