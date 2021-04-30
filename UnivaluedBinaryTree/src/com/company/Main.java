package com.company;


import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public boolean isUnivalTree(TreeNode root) {

        boolean left = (root.left == null || (root.val == root.left.val && isUnivalTree(root.left)));
        boolean right = (root.right == null) || (root.val == root.right.val && isUnivalTree(root.right));

        return left && right;
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
