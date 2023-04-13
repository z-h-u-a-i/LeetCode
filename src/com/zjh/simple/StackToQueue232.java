package com.zjh.simple;

import java.util.Stack;

public class StackToQueue232 {
    public static void main(String[] args) {
        MyQueue myQuee = new MyQueue();
        myQuee.push(10);
        System.out.println(myQuee.peek());
        System.out.println(myQuee.pop());
        System.out.println(myQuee.pop());
    }
}

class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        //先让s1所有元素弹入s2,再将x push进s1, 最后让s2pop到s1
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        if(empty()) {
            throw new RuntimeException("栈空....");
        }
        return stack1.pop();
    }

    public int peek() {
        if(empty()) {
            throw new RuntimeException("栈空....");
        }
        return stack1.peek();
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}