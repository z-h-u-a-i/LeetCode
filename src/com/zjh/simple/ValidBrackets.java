package com.zjh.simple;

import java.awt.*;
import java.util.HashMap;
import java.util.Stack;

public class ValidBrackets {
    public static void main(String[] args) {
        String s = "[[[]";
        System.out.println(new ValidBrackets().isValid(s));
    }
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }
        HashMap<Character, Character> characterHashMap = new HashMap<>();
        characterHashMap.put('(', ')');
        characterHashMap.put('[', ']');
        characterHashMap.put('{', '}');
        //由于后遇到的括号需要先闭合，所以使用栈保存左括号
        Stack<Character> characters = new Stack<>();
        boolean flag = false;//判断是否有效
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {//左括号压入栈中
                characters.push(s.charAt(i));
            } else {//右括号判断栈顶是否与之配对
                if(!characters.isEmpty() && characterHashMap.get(characters.pop()) == s.charAt(i)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if(!(flag && characters.isEmpty())) {
            flag = false;
        }
        return flag;
    }
}
