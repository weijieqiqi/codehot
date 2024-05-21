package org.example.Hot150;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/10 9:18 //创建时间
 * @Version: 1.0    //版本号
 */


public class code_test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // consume newline
        for (int i = 0; i < t; i++) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(calculateSimilarity(str1, str2));
        }
        scanner.close();
    }

    public static int calculateSimilarity(String str1, String str2) {
        int similarity = 0;

        // 如果字符串长度相同，则相似度加1
        if (str1.length() == str2.length()) {
            similarity++;
        }

        // 统计字符集
        HashMap<Character,Integer> charSet1 = new HashMap<>();
        HashMap<Character,Integer> charSet2 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            if (Character.isLetter(c)){
                charSet1.put(Character.toLowerCase(c),0);
            }else {
                charSet1.put(c,0);
            }
        }
        for (char c : str2.toCharArray()) {
            if (Character.isLetter(c)){
                char c1 = Character.toLowerCase(c);
                if (charSet1.containsKey(c1)){
                    similarity++;
                }
            }else {
                if (charSet1.containsKey(c)){
                    similarity++;
                }
            }
        }
        return similarity;
    }
}
