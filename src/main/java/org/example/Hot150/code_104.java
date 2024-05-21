package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/25 10:32 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_104 {
    class Info {
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
        Info leftheight = process(root.left);
        Info rightheight = process(root.right);
        int height = Math.max(leftheight.height, rightheight.height) + 1;
        return new Info(height);
    }
}