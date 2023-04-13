package com.zjh.simple;

public class The1Quantity {
    public static void main(String[] args) {
        System.out.println(new The1Quantity().hammingWeight(00000000000000000000000010000000));
    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            //n & (n - 1)，其运算结果恰为把 n 的二进制位中的最低位的 1 变为 0 之后的结果
            n &= n - 1;
            count++;
        }
        return count;
    }
}
