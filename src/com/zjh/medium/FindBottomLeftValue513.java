package com.zjh.medium;

public class FindBottomLeftValue513 {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.left.left = new TreeNode1(4);
        root.right = new TreeNode1(3);
        root.right.left = new TreeNode1(5);
        root.right.right = new TreeNode1(6);
        root.right.left.left = new TreeNode1(7);
//        TreeNode1 root = new TreeNode1(0);
//        root.right = new TreeNode1(-1);
        System.out.println(new FindBottomLeftValue513().findBottomLeftValue(root));
    }

    private TreeNode1 deepLeftNode;
    private int deepFloor = 0;

    public int findBottomLeftValue(TreeNode1 root) {
        deepLeftNode = root;
        infixOrder(root, 1);
        return deepLeftNode.val;
    }

    public void infixOrder(TreeNode1 node, int floor) {
        if (node.left != null) {
            if (floor > deepFloor) {
                deepLeftNode = node.left;
                deepFloor = floor;
            }
            infixOrder(node.left, floor + 1);
        }

        if (node.right != null) {
            if (floor > deepFloor) {
                deepLeftNode = node.right;
                deepFloor = floor;
            }
            infixOrder(node.right, floor + 1);
        }
    }
}

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1() {}
    TreeNode1(int val) { this.val = val; }
    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}