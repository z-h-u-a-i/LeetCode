package com.zjh.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis22 {
    public static void main(String[] args) {
        List<String> result = generateParenthesis(10);
        result.forEach(System.out::println);

    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        flashBack(n, 0, 0, result, "");
        return result;
    }

    public static void flashBack(int n, int left, int right, List<String> result, String str) {
        if (left == right && right == n) {
            result.add(str);
            return;
        }
        if (left != n) {
            flashBack(n, left + 1, right, result, str + '(');
        }
        if (right < left) {
            flashBack(n, left, right + 1, result, str + ')');
        }
    }
}
