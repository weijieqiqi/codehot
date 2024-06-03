package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/30 10:42 //创建时间
 * @Version: 1.0    //版本号
 * 判断是不是二叉搜索树
 */
public class BM34 {
    int pre = Integer.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        // write code here
        if (root == null) return true;
        boolean left = isValidBST(root.left);
        if (!left) {
            return false;
        }
        if (root.val < pre) return false;
        pre = root.val;
        return isValidBST(root.right);

    }

}