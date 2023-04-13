package com.zjh.medium;

import java.util.*;
import java.util.stream.Collectors;

public class LevelOrderBottom107 {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
        root.right.right = new  TreeNode(7);
        List<List<Integer>> lists = new LevelOrderBottom107().levelOrderBottom(root);
        System.out.println(lists);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<List<Integer>> resStack = new Stack<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return res;
        }
        queue.offer(root);
        TreeNode node;
        int layerSize;
        while (!queue.isEmpty()) {
            layerSize = queue.size();
            for (int i = 0; i < layerSize; i++) {
                node = queue.poll();
                cur.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            resStack.push(new ArrayList<>(cur));
            cur.clear();
        }
        while (!resStack.isEmpty()) {
            res.add(resStack.pop());
        }
        return res;
    }

    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
}