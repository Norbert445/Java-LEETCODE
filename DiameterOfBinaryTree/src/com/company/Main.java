package com.company;


public class Main {
    private int longestPath=0;
    public static void main(String[] args) {

    }

    public int diameterOfBinaryTree(TreeNode root) {
        longestPath(root);
        return longestPath;
    }

    public  int longestPath(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int leftHeight = longestPath(node.left);
        int rightHeight = longestPath(node.right);

        longestPath = Math.max(longestPath,leftHeight+rightHeight);
        return Math.max(leftHeight,rightHeight) + 1;

    }
}
