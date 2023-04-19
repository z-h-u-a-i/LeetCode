package com.zjh.huawei_computer_test;

import java.util.UUID;

public class LastLetterLen {
    public static String testData() {
        int len = (int)(Math.random() * 100);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            stringBuilder.append(UUID.randomUUID().toString().substring(0, (int)(Math.random() * 35)) + " ");
        }
        return stringBuilder.substring(0, stringBuilder.length() - 2);
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
        for (int i = 0; i < 100; i++) {
            String s = testData();
            System.out.println(s);
            String[] strings = s.split("\\s+");
            String end = strings[strings.length - 1];
            System.out.println(end.length());
        }
    }
}