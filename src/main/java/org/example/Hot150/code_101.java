package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/29 9:41 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/symmetric-tree/submissions/391285997/?envType=study-plan-v2&envId=top-interview-150
 * 对称二叉树
 */
public class code_101 {
    public boolean isSymmetric(TreeNode root) {
        return paper(root.left,root.right);
    }
    public boolean paper(TreeNode left, TreeNode right) {
        if(left == null && right != null) return false;
        if(left != null && right == null) return false;
        if(left == null && right == null) return true;
        if(left.val != right.val) return false;

        boolean p1 = paper(left.left,right.right);
        boolean p2 = paper(left.right,right.left);
        return p1&&p2;
    }
}