package com.zjh.medium;

public class SwapPairs24 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        ListNode listNode = swapPairs(head);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    /**
     * 递归
     */
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(head.next.next);
        next.next = head;
        return next;
    }

    /**
     * 迭代
     */
//    public static ListNode swapPairs(ListNode head) {
//        ListNode preHead = new ListNode();
//        ListNode result = preHead;
//        if (head == null || head.next == null) {
//           return head;
//        }
//        while (head != null && head.next != null) {
//            ListNode node = new ListNode(head.next.val);
//            node.next = new ListNode(head.val);
//            preHead.next = node;
//            head = head.next.next;
//            preHead = preHead.next.next;
//        }
//        if (head != null) {
//            preHead.next = head;
//        }
//        return result.next;
//    }
}
