package com.zjh.simple;

public class ReverseString344 {
    public static void main(String[] args) {
        char[] c = {'h','e','l','l','o'};
        new ReverseString344().reverseString(c);
    }
    //递归解决
    private int index = 0;
    char temp = ' ';
    public void reverseString(char[] s) {
        if(index == s.length / 2) {
            System.out.println(s);
            return;
        }
        temp = s[index];
        s[index] = s[s.length - index - 1];
        s[s.length - index - 1] = temp;
        index++;
        reverseString(s);
    }

    //双指针
    public void doublePointer(char[] s) {
        char temp = ' ';
        for(int left = 0, right = s.length - 1; left < right; left++, right--) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
        System.out.println(s);
    }
}
