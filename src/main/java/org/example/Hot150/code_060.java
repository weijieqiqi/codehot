package org.example.Hot150;


/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/6 11:20 //创建时间
 * @UpdateDate: 2024/3/6 11:20 //更新时间
 * @Version: 1.0    //版本号
 */
public class code_060 {
    public int numIslands(char[][] grid) {
        int numslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    numslands++;
                    dfs(grid, i, j);
                }
            }
        }
        return numslands;
    }

    public static void dfs(char[][] grid, int i, int j) {
        if (i == grid.length || i < 0 || j < 0 || j == grid[0].length || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}