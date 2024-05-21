package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/3 9:21 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/sum-root-to-leaf-numbers/?envType=study-plan-v2&envId=top-interview-150
 * 求根节点到叶节点数字之和
 * DFS
 */
public class code_129 {
    public int sumNumbers(TreeNode root) {
        return process(root,0);
    }

    public int process(TreeNode root, int pre){
        if (root == null){
            return 0;
        }
        int sum = pre * 10 + root.val;
        if (root.left == null && root.right == null){
           return sum;
        }
        return process(root.left,sum) + process(root.right,sum);
    }
}