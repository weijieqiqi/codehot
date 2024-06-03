package org.example.hot100;

import java.util.LinkedList;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/30 10:11 //创建时间
 * @Version: 1.0    //版本号
 * 判断是否是完全二叉树
 */
public class BM35 {
    public boolean isCompleteTree1(TreeNode root) {
        if (root == null) return true;
        LinkedList<TreeNode> queue = new LinkedList<>();
        //判断是否遇到过左右两个孩子不双全的情况。
        boolean leaf = false;
        TreeNode left = null;
        TreeNode right = null;
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            left = root.left;
            right = root.right;
            //如果已经遇到了有双孩子不全的情况，但是后面的孩子不是叶子结点。就false,或者还没遇到双孩子不全的情况
            //但是遇到了左孩子为空，右孩子不为空的情况，也会fasls
            if (leaf && (left != null || right != null)
                    ||
                    (left == null && right != null)) {
                return false;
            }
            if (left != null) {
                queue.add(left);
            }
            if (right != null) {
                queue.add(right);
            }
            if (left == null || right == null) {
                leaf = true;
            }
        }
        return true;
    }

    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        LinkedList<TreeNode> queue = new LinkedList<>();
        boolean leaf = false;
        TreeNode left = null;
        TreeNode right = null;
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            left = root.left;
            right = root.right;
            if ((leaf && (left != null || right != null)) ||
                    (left == null && right != null)) {
                return false;
            }
            if (left != null) {
                queue.add(left);
            }
            if (right != null) {
                queue.add(right);
            }

            if (left == null || right == null) {
                leaf = true;
            }
        }
        return true;
    }
}