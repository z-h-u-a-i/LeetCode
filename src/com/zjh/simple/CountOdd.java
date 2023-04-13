package com.zjh.simple;

public class CountOdd {
    public static void main(String[] args) {
        System.out.println(new CountOdd().countOdds(3, 7));
    }
    public int countOdds(int low, int high) {
        if(low % 2 != 0 && high % 2 != 0) {
            return (high - low + 1) / 2 + 1;
        } else {
            return (high - low + 1) / 2;
        }
    }
}
