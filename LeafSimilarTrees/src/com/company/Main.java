package com.company;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        dfs(root1, list1);
        dfs(root2, list2);

        if (list1.size() != list2.size()) {
            return false;
        }
        boolean valid = true;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                valid = false;
                break;
            }
        }
        return valid;
    }

    public TreeNode mydfs(TreeNode node, List<Integer> list) {
        if (node == null) return null;
        TreeNode temp = mydfs(node.left, list);
        TreeNode temp2 = mydfs(node.right, list);
        if (temp == null && temp2 == null) {
            list.add(node.val);
        }
        return node;
    }

    public void  dfs(TreeNode node, List<Integer> list) {
        if (node != null) {
            if(node.left == null && node.right == null) {
                list.add(node.val);
            }
            dfs(node.left, list);
            dfs(node.right, list);
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
