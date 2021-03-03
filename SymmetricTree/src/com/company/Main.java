package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }

        return isSymmetric(root.left,root.right);

    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(left == null || right == null) {
            return false;
        }
        if(left.val != right.val) {
            return false;
        }
        return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
    }

    public boolean isSymmetricIterative(TreeNode root) {
        if(root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        queue.add(root);

        while(!queue.isEmpty()) {

            TreeNode n1 = queue.poll();
            TreeNode n2 = queue.poll();

            if(n1 == null && n2 == null) {
                continue;
            }
            if(n1 == null || n2 == null) {
                return false;
            }
            if(n1.val != n2.val) {
                return false;
            }

            queue.add(n1.left);
            queue.add(n2.right);
            queue.add(n1.right);
            queue.add(n2.left);

        }

        return true;
    }
}

class TreeNode {
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
