package org.example.hot100;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/27 9:41 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM39 {
    //序列化
    static String Serialize(TreeNode root) {
        StringBuilder builder = new StringBuilder();//用一个StringBuilder来存储我们序列化后的字符串
        if (root == null) {
            builder.append("null,");
            return builder.toString();
        } else {
            builder.append(root.val).append(",");
            Queue<TreeNode> queue = new LinkedList<>();//准备一个队列用于层次遍历
            queue.add(root);
            while (!queue.isEmpty()) {
                root = queue.poll();
                if (root.left != null) {
                    builder.append(root.left.val).append(",");
                    queue.add(root.left);
                } else {
                    builder.append("null,");
                }
                if (root.right != null) {
                    builder.append(root.right.val).append(",");
                    queue.add(root.right);
                } else {
                    builder.append("null,");
                }
            }
        }
        return builder.toString();
    }

    //反序列化
    static TreeNode Deserialize(String str) {
        if (str.equals("null") || str.length() == 0) {
            return null;
        }
        Queue<String> leavel = new LinkedList<>();//把String转换为队列，方便操作
        String[] words = str.split(",");
        for (String word : words) {
            leavel.offer(word);
        }
        Queue<TreeNode> queue = new LinkedList<>();//同样使用队列来反序列化
        TreeNode head = generateNode(leavel.poll());//头节点先存起来
        if (head != null) {
            queue.add(head);
        }
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            node.left = generateNode(leavel.poll());
            node.right = generateNode(leavel.poll());
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