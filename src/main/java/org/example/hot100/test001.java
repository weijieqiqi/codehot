package org.example.hot100;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/17 9:57 //创建时间
 * @Version: 1.0    //版本号
 */
public class test001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anInt = scanner.nextInt();//第一个值
        int[] ints = new int[anInt];
        for (int i = 0; i < anInt; i++) {
            ints[i] = scanner.nextInt();
        }

        HashSet<Integer> integers = new HashSet<>();
        for (int i : ints) {
            integers.add(i);
        }

        int count = 0;
        for (int i : ints) {
            if (integers.contains(i - 1)) {
                count++;
            }
            if (integers.contains(i + 1)) {
                count++;
            }
        }

        count /= 2;
        System.out.println(count);
    }
}