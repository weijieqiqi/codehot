package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/17 9:44 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_200 {
    public int numIslands(char[][] grid) {
        int numlans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    numlans++;
                    dfs(grid, i, j);
                }
            }
        }
        return numlans;
    }

    public void dfs(char[][] grid, int i, int j) {
        if (i == grid.length || j == grid[0].length || i < 0 || j < 0 || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}