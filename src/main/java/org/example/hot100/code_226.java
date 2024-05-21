package org.example.hot100;

import org.example.Hot150.TreeNode;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/24 11:01 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/invert-binary-tree/submissions/517893843/?envType=study-plan-v2&envId=top-100-liked
 * 翻转二叉树
 */
public class code_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        invertTree(root.left);
        invertTree(root.right);
        swap(root);
        return root;
    }
    public void swap(TreeNode treeNode){
        TreeNode temp = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = temp;
    }
}