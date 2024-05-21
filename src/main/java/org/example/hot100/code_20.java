package org.example.hot100;

import java.util.Stack;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/25 11:21 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.peek() != ch) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}