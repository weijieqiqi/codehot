package org.example.Hot150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/3 10:48 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150
 * 二叉树
 */
public class code_236 {

    public class Info {
        boolean findA;
        boolean findB;
        public TreeNode ans;

        public Info(boolean findA, boolean findB, TreeNode ans) {
            this.findA = findA;
            this.findB = findB;
            this.ans = ans;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return process(root, p, q).ans;
    }

    public Info process(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return new Info(false, false, null);
        }
        Info left = process(root.left, p, q);
        Info right = process(root.right, p, q);
        boolean findA = (root == p) || left.findA || right.findA;
        boolean findB = (root == q) || left.findB || right.findB;

        TreeNode ans = null;
        if (left.ans != null) {
            ans = left.ans;
        } else if (right.ans != null) {
            ans = right.ans;
        } else {
            if (findA && findB) {
                ans = root;
            }
        }
        return new Info(findA, findB, ans);
    }


    //方法2：
    public static TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();//记录便利到每个节点的父节点
        LinkedList<TreeNode> queue = new LinkedList<>();
        parent.put(root,null);//根节点没有父节点，给他默认一个值
        queue.add(root);
        while (!parent.containsKey(p) || !parent.containsKey(q)){
            TreeNode node = queue.poll();
            if (node.left != null){
                parent.put(node.left,node);
                queue.add(node.left);
            }
            if (node.right != null){
                parent.put(node.right,node);
                queue.add(node.right);
            }
        }
        HashSet<TreeNode> treeNodes = new HashSet<>();
        while (parent.containsKey(p)){
            treeNodes.add(p);
            p = parent.get(p);
        }
        while (!treeNodes.contains(q)){
            q = parent.get(q);
        }
        return q;

    }

    public static void main(String[] args) {

    }
}