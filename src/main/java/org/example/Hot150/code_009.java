package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/7 10:18 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_009 {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuffer buffer = new StringBuffer();
        buffer.append(x);
        return s.equals(buffer.reverse().toString());
    }
}