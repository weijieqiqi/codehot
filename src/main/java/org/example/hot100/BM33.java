package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/30 10:52 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM33 {
    public TreeNode Mirror(TreeNode pRoot) {
        if (pRoot == null) return null;
        TreeNode temp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = temp;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}