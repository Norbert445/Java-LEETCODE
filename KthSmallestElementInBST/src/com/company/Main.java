package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }


    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        Collections.sort(list);
        return list.get(k - 1);
    }

    public void dfs(TreeNode node, List<Integer> list) {
        if(node == null) return;
        list.add(node.val);
        dfs(node.right,list);
        dfs(node.left,list);
    }

    public int kthSmallestOptimized(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();

        while(true) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if(--k == 0) return root.val;
            root = root.right;
        }
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
