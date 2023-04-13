package com.zjh.simple;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal94 {
    public static void main(String[] args) {
        TreeNode root = null;


        List<Integer> list = new InorderTraversal94().inorderTraversal(root);
        System.out.println(list);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        MidOrder(root, res);
        return res;
    }

    public void MidOrder(TreeNode node, List<Integer> res) {
        if (node.left != null) {
            MidOrder(node.left, res);
        }
        res.add(node.val);
        if (node.right != null) {
            MidOrder(node.right, res);
        }
    }

    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

