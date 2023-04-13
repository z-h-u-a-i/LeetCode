package com.zjh.simple;


import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class QueueToStack225 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }
}

class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        //让q1拿到x，再让q2中保存的所有数据poll出到q1，就会使后面进来的元素排在队列头
        //再让q1和q2互换地址，方便下一次加入以及将数据存储到q2
        queue1.offer(x);
        while(!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        if(queue2.isEmpty()) {
            throw new RuntimeException("栈空....");
        }
        return queue2.poll();
    }

    public int top() {
        if(queue2.isEmpty()) {
            throw new RuntimeException("栈空....");
        }
        return queue2.peek();
    }

    public boolean empty() {
        return queue2.isEmpty();
    }
}