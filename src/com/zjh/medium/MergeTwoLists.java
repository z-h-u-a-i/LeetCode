package com.zjh.medium;

public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode1 list1 = new ListNode1(1);
        list1.next = new ListNode1(2);
        list1.next.next = new ListNode1(5);

        ListNode1 list2 = new ListNode1(1);
        list2.next = new ListNode1(3);
        list2.next.next = new ListNode1(4);

        ListNode1 listNode1 = mergeTwoLists(list1, list2);

        while (listNode1 != null) {
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
    }

    public static ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
        ListNode1 head = new ListNode1(-1);
        ListNode1 p = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                //p.next = new ListNode1(list1.val);
                p.next = list1;
                list1 = list1.next;
            } else {
                //p.next = new ListNode2(list2.val);
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        p.next = list1 == null ? list2 :list1;
        return head.next;
    }
}


class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }
}