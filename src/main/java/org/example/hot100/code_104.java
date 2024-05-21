package org.example.hot100;

import org.example.Hot150.TreeNode;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/24 10:26 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_104 {

    public class Info {
        int height;

        public Info(int height) {
            this.height = height;
        }
    }

    public int maxDepth(TreeNode root) {
        return process(root).height;
    }

    public Info process(TreeNode root) {
        if (root == null) return new Info(0);
        Info left = process(root.left);
        Info right = process(root.right);
        int height = Math.max(left.height, right.height) + 1;
        return new Info(height);
    }
}