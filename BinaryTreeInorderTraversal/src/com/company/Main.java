package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null) {
            return list;
        }

        TreeNode current = root;

        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }

            TreeNode curr = stack.pop();
            list.add(curr.val);
            current = curr.right;
        }

        return list;
    }

    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        recursiveInOrder(list,root);
        return list;
    }

    public void recursiveInOrder(List<Integer> list, TreeNode node) {
        if(node == null) {
            return;
        }
        recursiveInOrder(list,node.left);
        list.add(node.val);
        recursiveInOrder(list,node.right);
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
