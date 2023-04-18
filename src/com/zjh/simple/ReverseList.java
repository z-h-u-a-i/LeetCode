package com.zjh.simple;

import java.util.List;
import java.util.Stack;

public class ReverseList {

    public static void main(String[] args) {
        testData();
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void testData() {
        for (int i = 0; i < 100; i++) {
            ListNode tmp = new ListNode();
            ListNode head = tmp;
            for (int j = 0; j < i; j++) {
                tmp.next = new ListNode((int) (Math.random() * 20) + i - j);
                tmp = tmp.next;
            }
            System.out.print("反转前：");
            printList(head.next);
            System.out.println();

            head = reverseList(head.next);
            System.out.print("反转后：");
            printList(head);
            System.out.println();
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode temp = new ListNode();
        head = temp;
        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }
        temp.next = null;
        return head.next;
    }
}
