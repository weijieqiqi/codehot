package org.example.Hot150;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/13 9:29 //创建时间
 * @UpdateDate: 2024/3/13 9:29 //更新时间
 * @Version: 1.0    //版本号
 */
public class LoveString {
    private static int findClosestIndex(List<Integer> lovesIndexes, int index) {
        int left = 0, right = lovesIndexes.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (lovesIndexes.get(mid) < index) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (right == -1) {
            return lovesIndexes.get(left);
        } else if (left == lovesIndexes.size()) {
            return lovesIndexes.get(right);
        } else {
            // Compare distances with left and right closest indexes
            int leftDistance = Math.abs(index - lovesIndexes.get(left));
            int rightDistance = Math.abs(index - lovesIndexes.get(right));
            if (leftDistance < rightDistance) {
                return lovesIndexes.get(left);
            } else {
                return lovesIndexes.get(right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//字符串长度
        int m = scanner.nextInt();//偏爱的字符串长度
        scanner.nextLine(); // 消耗换行符

        HashSet<String> loves = new HashSet<>();
        String[] lovesArray = scanner.nextLine().split(" ");
        for (String love : lovesArray) {
            loves.add(love);
        }

        String inputString = scanner.nextLine(); // 读取一行字符串并截取前n个字符
        String substring = inputString.substring(0, n);
        char[] input = substring.toCharArray();

        ArrayList<Integer> loveIndex = new ArrayList<>();//存储字符串中有偏爱支付的下标
        //找到所有偏爱字符串的下标
        for (int i = 0; i < input.length; i++) {
            if (loves.contains(Character.toString(input[i]))) {
                loveIndex.add(i);
            }
        }

        //开始替换
        for (int i = 0; i < input.length; i++) {
            if (!loves.contains(Character.toString(input[i]))) {
                int closestIndex = findClosestIndex(loveIndex, i);
                input[i] = input[closestIndex];
            }
        }
        System.out.println(new String(input));

    }
}