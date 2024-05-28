package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/28 10:56 //创建时间
 * @Version: 1.0    //版本号
 * 判断是否是二叉平衡树
 */
public class BM36 {
    class Info {
        int height;
        boolean isBalanced;

        public Info(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }

    public boolean IsBalanced_Solution(TreeNode pRoot) {
        // write code here
        return process(pRoot).isBalanced;
    }

    public Info process(TreeNode pRoot) {
        if (pRoot == null) return new Info(0, false);
        Info left = process(pRoot.left);
        Info right = process(pRoot.right);
        int height = Math.max(left.height, right.height) + 1;
        boolean isBalanced = true;
        if (!left.isBalanced) isBalanced = false;
        if (!right.isBalanced) isBalanced = false;
        if (Math.abs(left.height - right.height) > 1) isBalanced = false;
        return new Info(height, isBalanced);
    }
}