package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/1 9:34 //创建时间
 * @Version: 1.0    //版本号
 * 验证二叉搜索树
 * https://leetcode.cn/problems/validate-binary-search-tree/?envType=study-plan-v2&envId=top-interview-150
 */
public class code_098 {
    TreeNode pre = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        boolean left = isValidBST(root.left);
        if (pre != null && pre.val >= root.val) return false;
        pre = root;
        boolean right = isValidBST(root.right);
        return left && right;
    }
}