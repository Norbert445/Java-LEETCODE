package com.company;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Inorder(root, list);

        TreeNode newTreeNode = new TreeNode(0);
        TreeNode curr = newTreeNode;

        for(int i = 0; i < list.size(); i++) {
            curr.right = new TreeNode(list.get(i));
            curr = curr.right;
        }

        return newTreeNode.right;

    }

    void Inorder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        Inorder(node.left, list);
        list.add(node.val);
        Inorder(node.right, list);
    }

    public class TreeNode {
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
