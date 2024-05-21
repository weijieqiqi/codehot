package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/25 14:21 //创建时间
 * @Version: 1.0    //版本号
 * 背包问题（经典dp）从左往右的测试模型
 */
public class codetest3 {
    public static int maxValue(int[] w, int[] v, int bag) {
        if (w == null || v == null || w.length != v.length || w.length == 0) {
            return 0;
        }
        return process(w, v, 0, bag);

    }

    public static int process(int[] w, int[] v, int index, int bag) {
        if (bag < 0) {//没容量了
            return -1;
        }
        if (index == w.length) {//到头了
            return 0;
        }
        //有货
        //1.不要当前的货
        int p2 = 0;
        int p1 = process(w, v, index + 1, bag);
        //2.要当前的货
        int next = process(w, v, index + 1, bag - w[index]);
        if (next != -1) {
            p2 = v[index] + next;
        }
        return Math.max(p1, p2);
    }

    //缓存方案

    public static int maxValue2(int[] w, int[] v, int bag) {
        if (w == null || v == null || w.length != v.length || w.length == 0) {
            return 0;
        }
        int N = w.length;
        int[][] dp = new int[N + 1][bag + 1];
        return process2(w, v, 0, bag, dp);
    }

    public static int process2(int[] w, int[] v, int index, int bag, int[][] dp) {
        if (bag < 0) {//没容量了
            return -1;
        }
        if (index == w.length) {//到头了
            return 0;
        }
        if (dp[index][bag] != 0) {
            return dp[index][bag];
        }

        //有货
        //1.不要当前的货
        int p2 = 0;
        int p1 = process2(w, v, index + 1, bag, dp);
        //2.要当前的货
        int next = process2(w, v, index + 1, bag - w[index], dp);
        if (next != -1) {
            p2 = v[index] + next;
        }
        int max = Math.max(p1, p2);
        dp[index][bag] = max;
        return max;
    }


    //dp
    public static int dp(int[] w, int[] v, int bag) {
        if (w == null || v == null || w.length != v.length || w.length == 0) {
            return 0;
        }
        int N = w.length;
        int[][] dp = new int[N + 1][bag + 1];
        for (int index = N - 1; index >= 0; index--) {
            for (int rest = 0; rest <= bag; rest++) {
                int p2 = 0;
                int p1 = dp[index + 1][rest];
                int next = rest - w[index] < 0 ? -1 : dp[index + 1][rest - w[index]];
                if (next != -1) {
                    p2 = v[index] + next;
                }
                dp[index][rest] = Math.max(p1, p2);
            }
        }


        return dp[0][bag];
    }


    public static void main(String[] args) {
        int[] weight = {3, 2, 4, 7, 3, 1, 7};
        int[] value = {5, 6, 3, 19, 12, 4, 2};
        int bag = 15;
        System.out.println(maxValue(weight, value, bag));
        System.out.println(maxValue2(weight, value, bag));
        System.out.println(dp(weight, value, bag));
    }

}