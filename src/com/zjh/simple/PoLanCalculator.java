package com.zjh.simple;

import java.util.Stack;

public class PoLanCalculator {
    public static void main(String[] args) {
        String[] s = {"2","1","+","3","*"};
        System.out.println(new PoLanCalculator().evalRPN(s));
//        String s = "-11";
//        if(s.matches("")) {
//            System.out.println("true");
//        }

    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int num1;
        int num2;
        for (String s : tokens) {
            if(!s.matches("\\D")) { // \D: 如果不是数字就返回true, 负数也是数字
                //是整数，压入栈中
                stack.push(Integer.parseInt(s));
            } else {
                //运算符，从栈中pop出两个数进行运算
                num1 = stack.pop();
                num2 = stack.pop();
                switch (s) {
                    case "+":
                        stack.push(num2 + num1);
                        break;
                    case "-":
                        stack.push(num2 - num1);
                        break;
                    case "*":
                        stack.push(num2 * num1);
                        break;
                    case "/":
                        stack.push(num2 / num1);
                        break;
                }
            }
        }
        //栈中剩下的数据就是答案
        return stack.pop();
    }
}
