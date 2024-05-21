package org.example.Hot150;

import java.util.HashMap;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/3 9:36 //创建时间
 * @Version: 1.0    //版本号
 * https://leetcode.cn/problems/binary-tree-maximum-path-sum/solutions/297005/er-cha-shu-zhong-de-zui-da-lu-jing-he-by-leetcode-/?envType=study-plan-v2&envId=top-interview-150
 * 二叉树中的最大路径和
 */
public class code_124 {
/*    int sum = Integer.MIN_VALUE;
    Map<TreeNode, Integer> cache = new HashMap<>();

    public int maxPathSum(TreeNode root) {
        process(root);
        return sum;
    }

    public int process(TreeNode root) {
        if (root == null) return 0;

        if (cache.containsKey(root)) {
            return cache.get(root);
        }
        int left = Math.max(process(root.left), 0);
        int right = Math.max(process(root.right), 0);

        int maxpath = root.val + left + right;

        sum = Math.max(sum, maxpath);

        int maxpathdata = root.val + Math.max(left, right);

        cache.put(root, maxpathdata);
        return maxpathdata;
    }*/

    int sum = Integer.MIN_VALUE;
    HashMap<TreeNode, Integer> cache = new HashMap<>();

    public int maxPathSum(TreeNode root) {
        process(root);
        return sum;
    }

    public int process(TreeNode root) {
        if (root == null) return 0;
        if (cache.containsKey(root)) {
            return cache.get(root);
        }

        int left = Math.max(process(root.left), 0);
        int right = Math.max(process(root.right), 0);

        int maxthong = root.val + left + right;
        sum = Math.max(sum, maxthong);
        int maxpathdata = root.val + Math.max(left, right);
        cache.put(root, maxpathdata);
        return maxpathdata;
    }

}