package org.example.Hot150;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/10 9:16 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String aiString = scanner.nextLine();
            String pattern = scanner.nextLine();
            System.out.println(calculateSimilarity(aiString, pattern));
        }
        scanner.close();
    }

    private static int calculateSimilarity(String aiString, String pattern) {
        int similarity = 0;

        if (aiString.length() == pattern.length()) {
            similarity++;
        }

        if (checkCharacterSet(aiString).equals(checkCharacterSet(pattern))) {
            similarity++;
        }

        return similarity;
    }

    private static Set<String> checkCharacterSet(String s) {
        Set<String> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                charSet.add("digit");
            } else if (Character.isLetter(c)) {
                charSet.add("letter");
            } else {
                charSet.add("other");
            }
        }
        return charSet;
    }
}
