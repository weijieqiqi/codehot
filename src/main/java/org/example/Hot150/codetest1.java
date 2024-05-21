package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/12 16:50 //创建时间
 * @UpdateDate: 2024/3/12 16:50 //更新时间
 * @Version: 1.0    //版本号
 * 从顶向下的动态规划
 */
public class codetest1 {

    public static int ways1(int N, int start, int aim, int K) {
        return process(start, K, aim, N);
    }

    // 当前cur
    // 剩余rest
    // 目标aim
    // 有哪些位置？1-N
    // 返回从cur出发走rest步，走到aim的方法数
    public static int process(int cur, int rest, int aim, int N) {
        if (rest == 0) { // 不需要走了，走完了
            return cur == aim ? 1 : 0;
        }
        // rest > 0 还有步数可以走
        if (cur == 1) {
            return process(2, rest - 1, aim, N);
        }
        if (cur == N) {
            return process(N - 1, rest - 1, aim, N);
        }
        //停到中间位置
        return process(cur - 1, rest - 1, aim, N) + process(cur + 1, rest - 1, aim, N);
    }


    public static int ways2(int N, int start, int aim, int K) {
        int[][] dp = new int[N + 1][K + 1];
        return process2(dp, start, K, aim, N);
    }

    public static int process2(int[][] dp, int cur, int rest, int aim, int N) {
        if (dp[cur][rest] != 0) {
            return dp[cur][rest];
        }
        int ans = 0;
        if (rest == 0) { // 不需要走了，走完了
            ans = cur == aim ? 1 : 0;
        } else if (cur == 1) {
            ans = process2(dp, 2, rest - 1, aim, N);
        } else if (cur == N) {
            ans = process2(dp, N - 1, rest - 1, aim, N);
        } else {
            ans = process2(dp, cur - 1, rest - 1, aim, N) + process2(dp, cur + 1, rest - 1, aim, N);
        }
        dp[cur][rest] = ans;
        return ans;
    }

    //cur 1-N,rest o->k
    public static int ways3(int N, int start, int aim, int K) {
        int[][] dp = new int[N + 1][K + 1];
        dp[aim][0] = 1;
        for (int i = 1; i <= K; i++) {//列
            for (int j = 1; j <= N; j++) {//行
                if (j == 1) {
                    dp[j][i] = dp[2][i - 1];
                } else if (j == N) {
                    dp[j][i] = dp[j - 1][i - 1];
                }else {
                    dp[j][i] = dp[j-1][i-1] + dp[j+1][i-1];
                }
            }
        }
        return dp[start][K];
    }


    public static void main(String[] args) {
        System.out.println(ways1(7, 3, 5, 10));
        System.out.println(ways2(7, 3, 5, 10));
        System.out.println(ways3(7, 3, 5, 10));
    }
}