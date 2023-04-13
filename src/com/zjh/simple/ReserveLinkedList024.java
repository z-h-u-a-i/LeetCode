package com.zjh.simple;

public class ReserveLinkedList024 {
    public static void main(String[] args) {

    }
    private int count = 0;
    private ListNode temp;
    ListNode newHead = new ListNode();
    public ListNode reverseList(ListNode head) {
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
