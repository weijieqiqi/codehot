package org.example.Hot150;

import java.util.Scanner;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/11 15:24 //创建时间
 * @UpdateDate: 2024/3/11 15:24 //更新时间
 * @Version: 1.0    //版本号
 */
public class meituan_001 {
    public static int max_MT_count(int n, int k, String s) {
        int m_count = countOccurrences(s, 'M');
        int t_count = countOccurrences(s, 'T');
        int count = m_count+t_count;
        // 计算多余的字符数量
        int extra_chars = n - count;
        if (k >= extra_chars){
            return n;
        }else {
            return k + count;
        }
    }

    // 计算字符在字符串中出现的次数
    public static int countOccurrences(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine(); // 消耗换行符
        String s = scanner.nextLine();

        // 计算最多共有多少个'M'和'T'字符
        int result = max_MT_count(n, k, s);
        System.out.println(result);
    }
}