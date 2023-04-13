package com.zjh.medium;

public class The1To5Transition1To7 {
    public static void main(String[] args) {
        int[] count = new int[8];
        The1To5Transition1To7 the1To5Transition1To7 = new The1To5Transition1To7();
        for (int i = 0; i < 100000; i++) {
            count[the1To5Transition1To7.f3()]++;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "   execution result count:   " + count[i]);
        }
    }

    //return 1-7
    public int f3() {
        int i = f2() + (f2() << 1) + (f2() << 2);

        if (i == 0) {
            return f3();
        } else {
            return i;
        }
    }

    //1-2 return 0; 4-5 return 1;
    public int f2() {
        int i;
        do {
            i = f1();
        } while (i == 3);
        return i < 3 ? 0 : 1;
    }

    //return 1-5
    public int f1() {
        return (int) (Math.random()*5) + 1;
    }
}
