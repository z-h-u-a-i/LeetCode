package com.zjh.medium;

public class Insert029 {
    public static void main(String[] args) {
        Node head = new Node(1);
        //head.next = head;
        head.next = new Node(3);
        head.next.next = new Node(3);
        head.next.next.next = head;
        Node insert = insert(head, 4);
        System.out.println(insert.val);
        System.out.println(insert.next.val);
        System.out.println(insert.next.next.val);
        System.out.println(insert.next.next.next.val);
        //System.out.println(insert.next.next.next.next.val);
    }

    public static Node insert(Node head, int insertVal) {
        Node node = new Node(insertVal);
        if (head == null) {
            node.next = node;
            return node;
        }
        if (head.next == head) {
            head.next = node;
            node.next = head;
            return head;
        }

        //先找出最大的那个节点
        Node max = head;
        Node temp = head.next;
        while (temp != head) {
            if (temp.val >= max.val) {
                max = temp;
            }
            temp = temp.next;
        }

        //最小的节点就是最大的下一个，因为是循环递增的
        if (insertVal > max.val || insertVal < max.next.val) {
            node.next = max.next;
            max.next = node;
            return head;
        }

        temp = head;
        while (true) {
            if (temp.val <= insertVal && temp.next.val >= insertVal) {
                node.next = temp.next;
                temp.next = node;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}

class Node {
    public int val;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
}