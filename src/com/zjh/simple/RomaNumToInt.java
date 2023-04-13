package com.zjh.simple;
/*
例如， 罗马数字 2 写做II，即为两个并列的 1 。12 写做XII，即为X+II。 27 写做XXVII, 即为XX+V+II。

通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边
，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为IX。这个特殊的规则只适用于以下六种情况：

I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
给定一个罗马数字，将其转换成整数
 */

import java.util.HashMap;
import java.util.Map;

public class RomaNumToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        hashMap.put('I', 1);
//        hashMap.put('V', 5);
//        hashMap.put('X', 10);
//        hashMap.put('L', 50);
//        hashMap.put('C', 100);
//        hashMap.put('D', 500);
//        hashMap.put('M', 1000);
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        char[] chars = s.toCharArray();
        int res = 0;//存答案
        for (int i = 0; i < chars.length; i++) {
            //如果当前项的value比下一项小，说明是特殊情况
            if (i != chars.length - 1 && hashMap.get(chars[i]) < hashMap.get(chars[i + 1])) {
                res -= hashMap.get(chars[i]);
            } else {//正常情况
                res += hashMap.get(chars[i]);
            }
        }
        return res;
    }
}
