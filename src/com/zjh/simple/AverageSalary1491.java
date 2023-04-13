package com.zjh.simple;

import java.util.Arrays;

public class AverageSalary1491 {
    public static void main(String[] args) {
        int[] arr = {8000,9000,2000,3000,6000,1000};
        System.out.println(new AverageSalary1491().average(arr));
    }
    public double average(int[] salary) {
        Arrays.sort(salary);
        double add = 0;
        for(int i = 1; i < salary.length - 1; i++) {
            add+=salary[i];
        }
        return add/(salary.length - 2);
    }
}
