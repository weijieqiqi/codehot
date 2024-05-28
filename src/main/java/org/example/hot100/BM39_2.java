package org.example.hot100;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/27 9:48 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM39_2 {
    static String Serialize(TreeNode root) {
        StringBuilder builder = new StringBuilder();//存储序列化的
        if (root == null) {
            builder.append("null,");
            return builder.toString();
        } else {
            Queue<TreeNode> queue = new LinkedList<>();
            builder.append(root.val).append(",");
            queue.add(root);
            while (!queue.isEmpty()) {
                root = queue.poll();
                if (root.left != null) {
                    queue.add(root.left);
                    builder.append(root.left.val).append(",");
                } else {
                    builder.append("null,");
                }
                if (root.right != null) {
                    queue.add(root.right);
                    builder.append(root.right.val).append(",");
                } else {
                    builder.append("null,");
                }
            }
            return builder.toString();
        }
    }

    static TreeNode Deserialize(String str) {
        if (str.equals("null") || str.length() == 0) {
            return null;
        }
        String[] strings = str.split(",");
        Queue<String> treeNodes = new LinkedList<>();
        for (int i = 0; i < strings.length; i++) {
            treeNodes.add(strings[i]);
        }

        Queue<TreeNode> queue = new LinkedList<>();//同样使用队列来反序列化
        TreeNode head = generateNode(treeNodes.poll());
        if (head != null) {
            queue.add(head);
        }
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            node.left = generateNode(treeNodes.poll());
            node.right = generateNode(treeNodes.poll());
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return head;

    }

    public static TreeNode generateNode(String val) {
        if (val.equals("null")) {
            return null;
        }
        return new TreeNode(Integer.valueOf(val));
    }
}