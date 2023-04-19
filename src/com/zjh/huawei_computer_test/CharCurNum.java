package com.zjh.huawei_computer_test;

import java.util.Scanner;

public class CharCurNum {
    public static String generateString(int len) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < len; j++) {
            sb.append((char) ((int) (Math.random() * 94 + 32)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String string = in.nextLine();
//        char target = in.next().charAt(0);
        for (int i = 0; i < 100; i++) {
            String string = generateString(i);
            System.out.print(string + "   ");
            String target = String.valueOf((char) (int) (Math.random() * 94 + 32));
            System.out.println(target);
            int count = 0;
            for (int j = 0; j < string.length(); j++) {
                String c = string.substring(j, j + 1);
                char charC = c.charAt(0);
                if (c.equals(target)) {
                    count++;
                } else if ((charC >= 65 & charC <= 90 || charC >= 97 && charC <= 122 ) && ( target.equals(c.toUpperCase()) || target.equals(c.toLowerCase()))) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
