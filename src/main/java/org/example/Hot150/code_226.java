package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/29 9:36 //创建时间
 * @Version: 1.0    //版本号
 * 翻转二叉树
 * https://leetcode.cn/problems/invert-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class code_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        invertTree(root.left);
        invertTree(root.right);
        swap(root);
        return root;
    }

    public void swap(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}