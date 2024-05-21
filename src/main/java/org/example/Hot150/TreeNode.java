package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/25 10:33 //创建时间
 * @Version: 1.0    //版本号
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}