package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/22 10:01 //创建时间
 * @Version: 1.0    //版本号
 * 岛屿数量
 * https://www.nowcoder.com/practice/0c9664d1554e466aa107d899418e814e?tpId=295&tqId=1024684&ru=/exam/company&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Fcompany
 */
public class BM57 {
    public int solve(char[][] grid) {
        // write code here
        int nums = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    nums++;
                    dfs(grid, i, j);
                }
            }
        }
        return nums;
    }

    public void dfs(char[][] grid, int i, int j) {
        if (i == grid.length || j == grid[0].length || i < 0 || j < 0 || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}