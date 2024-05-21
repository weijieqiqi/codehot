package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/1 13:40 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/path-sum/solutions/319149/lu-jing-zong-he-de-si-chong-jie-fa-dfs-hui-su-bfs-/?envType=study-plan-v2&envId=top-interview-150
 * 路径总和
 */
public class code_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        return hasPathSum(root.left,targetSum - root.val )|| hasPathSum(root.right, targetSum - root.val);
    }
}