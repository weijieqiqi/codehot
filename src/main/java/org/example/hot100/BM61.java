package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/22 10:40 //创建时间
 * @Version: 1.0    //版本号
 * 矩阵最长递增路径
 */
public class BM61 {
    public int solve(int[][] matrix) {
        int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans = Math.max(ans, process(i, j, Integer.MIN_VALUE, matrix));
            }
        }
        return ans;
    }

    public int process(int i, int j, int value, int[][] matrix) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || value >= matrix[i][j]) {
            return 0;
        }

        int updown = Math.max(process(i + 1, j, matrix[i][j], matrix),
                process(i - 1, j, matrix[i][j], matrix));

        int leftright = Math.max(process(i, j - 1, matrix[i][j], matrix),
                process(i, j + 1, matrix[i][j], matrix));

        return Math.max(updown, leftright) + 1;//返回的是走的步数，所以+1
    }
}