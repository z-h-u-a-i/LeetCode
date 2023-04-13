package com.zjh.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IsPalindrome234 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        boolean palindrome = new IsPalindrome234().isPalindrome(head);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        List<Integer> origin = new ArrayList<>(stack);
        List<Integer> rever = new ArrayList<>();

        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            rever.add(pop);
        }
        return origin.equals(rever);
    }
}
