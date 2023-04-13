package com.zjh.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SplitDigitAdd2160 {
    public static void main(String[] args) {

    }

    public static int minimumSum(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(num % 10);
        list.add(num / 10 % 10);
        list.add(num / 100 % 10);
        list.add(num / 1000);
        Collections.sort(list);
        //三位数 + 一位数一定比二位数 + 二位数大，所以只用二位数 + 二位数
        //较小的两个数做十位，两个较大的做个位
        return 10 * list.get(0) + 10 * list.get(1) + list.get(2) + list.get(3);
    }
}
