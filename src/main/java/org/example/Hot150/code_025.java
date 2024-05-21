package org.example.Hot150;

import java.util.Stack;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/1 10:11 //创建时间
 * @UpdateDate: 2024/3/1 10:11 //更新时间
 * @Version: 1.0    //版本号
 */
public class code_025 {
    public static boolean isPalindrome(String s) {
        // 将字符串转换为小写
        s = s.toLowerCase();

        // 去除非字母数字字符
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        String processedString = sb.toString();

        // 使用栈判断是否回文
        Stack<Character> stack = new Stack<>();
        for (char c : processedString.toCharArray()) {
            stack.push(c);
        }
        for (char c : processedString.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}