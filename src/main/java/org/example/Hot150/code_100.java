package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/25 10:37 //创建时间
 * @Version: 1.0    //版本号
 * 相同的树:https://leetcode.cn/problems/same-tree/submissions/390534535/?envType=study-plan-v2&envId=top-interview-150
 */
public class code_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (q.val != p.val){
            return false;
        }else {
            return  isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }
}