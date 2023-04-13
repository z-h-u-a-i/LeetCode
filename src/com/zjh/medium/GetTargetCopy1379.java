package com.zjh.medium;

public class GetTargetCopy1379 {
    public static void main(String[] args) {
        TreeNode target = new TreeNode(4);

        TreeNode original = new TreeNode(7);
        original.left = target;
        original.right = new TreeNode(3);
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);



        TreeNode cloned = new TreeNode(7);
        cloned.left = target;
        cloned.right = new TreeNode(3);
        cloned.right.left = new TreeNode(6);
        cloned.right.right = new TreeNode(19);


        System.out.println(getTargetCopy(original, cloned, target));
    }

    public static TreeNode getTargetCopy(TreeNode original, TreeNode cloned, TreeNode target) {
        //判断当前节点是不是目标节点
        if (original == target) {
            return cloned;
        }
        TreeNode ans = null;
        //向左寻找，找不到不返回
        if (original.left != null) {
            ans = getTargetCopy(original.left, cloned.left, target);
        }
        //向左找不到再向右，再找不到就直接返回null了
        if (ans == null && original.right != null) {
            return getTargetCopy(original.right, cloned.right, target);
        }
        //向左找到了，直接返回
        return ans;

//        if (original.left != null) {
//            return getTargetCopy(original.left, cloned.left, target);
//        }
//
//        if (cloned.val == target.val) {
//            return cloned;
//        }
//
//        if (original.right != null) {
//            return getTargetCopy(original.right, cloned.right, target);
//        }
//        return null;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}