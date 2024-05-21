package org.example.hot100;

import org.example.Hot150.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/23 9:21 //创建时间
 * @Version: 1.0    //版本号
 */
public class code_094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        group(root, integers);
        return integers;
    }

    public void group(TreeNode root, List<Integer> integers) {
        if (root == null) {
            return;
        }
        group(root.left, integers);
        integers.add(root.val);
        group(root.right, integers);
    }

    public List<Integer> inorderTraversa2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode cur = root;
        while (cur != null && !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;
    }


}