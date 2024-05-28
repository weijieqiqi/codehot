package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/28 10:06 //创建时间
 * @Version: 1.0    //版本号
 * https://www.nowcoder.com/practice/d9820119321945f588ed6a26f0a6991f?tpId=295&tqId=2290592&ru=/exam/company&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Fcompany
 * 二叉搜索树的公共祖先
 */
public class BM37 {
    public int lowestCommonAncestor(TreeNode root, int p, int q) {
        if (root == null) return 0;
        if (p >= root.val && q <= root.val || p <= root.val && q >= root.val) {
            return root.val;
        }
        if (p >= root.val && q >= root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return lowestCommonAncestor(root.left, p, q);
        }

    }

}