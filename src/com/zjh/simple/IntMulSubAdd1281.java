package com.zjh.simple;

public class IntMulSubAdd1281 {
    public static void main(String[] args) {
        System.out.println(new IntMulSubAdd1281().subtractProductAndSum(4421));
    }
    public int subtractProductAndSum(int n) {
        int mul = 1;
        int add = 0;
        while(n != 0) {
            mul *= n % 10;
            add += n % 10;
            n /= 10;
        }
        return mul - add;
    }
}
