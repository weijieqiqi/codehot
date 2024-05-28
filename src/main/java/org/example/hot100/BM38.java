package org.example.hot100;

import java.util.*;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/27 10:24 //创建时间
 * @Version: 1.0    //版本号
 */
public class BM38 {
    public class Info {
        boolean o1;
        boolean o2;
        int value;

        public Info(boolean q1, boolean q2, int value) {
            this.o1 = q1;
            this.o2 = q2;
            this.value = value;
        }
    }

    public int lowestCommonAncestor(TreeNode root, int o1, int o2) {
        return process(root, o1, o2).value;
    }

    public Info process(TreeNode root, int o1, int o2) {
        if (root == null) return new Info(false, false, -1);
        Info left = process(root.left, o1, o2);
        Info right = process(root.right, o1, o2);
        boolean le = left.o1 || right.o1 || root.val == o1;
        boolean re = left.o2 || right.o2 || root.val == o2;
        int val = -1;
        if (le && re) {
            if (left.value != -1) {
                val = left.value;
            } else if (right.value != -1) {
                val = right.value;
            } else {
                val = root.val;
            }
        }
        return new Info(le, re, val);
    }

    public int lowestCommonAncestor2(TreeNode root, int o1, int o2) {
        HashMap<Integer, Integer> parents = new HashMap<>();//key为节点，value为其父节点
        Queue<TreeNode> queue = new LinkedList<>();//定义个队列
        parents.put(root.val, Integer.MIN_VALUE);//根节点没有父节点，给他默认一个值
        queue.add(root);
        while (!parents.containsKey(o1) && !parents.containsKey(o2)) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                parents.put(node.left.val, node.val);
                queue.add(node.left);
            }
            if (node.right != null) {
                parents.put(node.right.val, node.val);
                queue.add(node.right);
            }
        }

        HashSet<Integer> set = new HashSet<>();
        while (parents.containsKey(o1)) {
            set.add(o1);
            o1 = parents.get(o1);
        }

        while (!set.contains(o2)) {
            o2 = parents.get(o2);
        }
        return o2;
    }









        /*//记录遍历到的每个节点的父节点。
        Map<Integer, Integer> parent = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        parent.put(root.val, Integer.MIN_VALUE);//根节点没有父节点，给他默认一个值
        queue.add(root);
        //直到两个节点都找到为止。
        while (!parent.containsKey(o1) || !parent.containsKey(o2)) {
            //队列是一边进一边出，这里poll方法是出队，
            TreeNode node = queue.poll();
            if (node.left != null) {
                //左子节点不为空，记录下他的父节点
                parent.put(node.left.val, node.val);
                //左子节点不为空，把它加入到队列中
                queue.add(node.left);
            }
            //右节点同上
            if (node.right != null) {
                parent.put(node.right.val, node.val);
                queue.add(node.right);
            }
        }
        Set<Integer> ancestors = new HashSet<>();
        //记录下o1和他的祖先节点，从o1节点开始一直到根节点。
        while (parent.containsKey(o1)) {
            ancestors.add(o1);
            o1 = parent.get(o1);
        }
        //查看o1和他的祖先节点是否包含o2节点，如果不包含再看是否包含o2的父节点……
        while (!ancestors.contains(o2))
            o2 = parent.get(o2);
        return o2;
        }
        */


}